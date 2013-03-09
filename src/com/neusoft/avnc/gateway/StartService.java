package com.neusoft.avnc.gateway;


import java.io.IOException;

import org.apache.log4j.Logger;

import com.neusoft.avnc.gateway.db.TerminalInfoDao;
import com.neusoft.avnc.gateway.listener.Vg3Listener;
import com.neusoft.avnc.gateway.listener.VgListener;
import com.neusoft.avnc.gateway.util.SpringContextLoader;
/**
 * Create Date:2013-3-8
 */

/**
 * <br>Title:网关服务启动
 * <br>Description:网关启动操作类
 * <br>Author:曲锐(qur@neusoft.com)
 * <br>Date:2013-3-8
 */
public class StartService {
	
	/**
	 * Spring context
	 */
	static SpringContextLoader context = new SpringContextLoader();
	/**
	 * 网关服务启动方法
	 * <br>Description:启动网关服务
	 * <br>Author:曲锐(qur@neusoft.com)
	 * <br>Date:2013-3-8
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String args[]){
		Logger logger = Logger.getLogger("default");
		logger.info("[------------------------网关初始化......------------------------]");
		//启动Vg协议版本的监听器
		VgListener vgListener = new VgListener();
		boolean vgStarted = vgListener.start(8801);
		
		//启动Vg3协议版本的监听器
		Vg3Listener vg3Listener = new Vg3Listener();
		boolean vg3Started = vg3Listener.start(8802);
		
		@SuppressWarnings("static-access")
		TerminalInfoDao terminalInfoDao = (TerminalInfoDao)context.getContext().getBean("TerminalInfoDao");
		terminalInfoDao.getTerminalInfoBySimCardNo(8801);
		
		if (vgStarted == false){
			logger.info("[##########Listener Vg 启动失败##########]");
		}
		if (vg3Started == false){
			logger.info("[##########Listener Vg3 启动失败##########]");
		}
		if (vgStarted == true && vg3Started==true){
			logger.info("[------------------------网关已启动------------------------]");
		}else{
			logger.info("[------------------------网关启动失败------------------------]");
		}
	}
}
