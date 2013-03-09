/**
 * Create Date:2013-3-9
 */
package com.neusoft.avnc.gateway.listener;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.apache.log4j.Logger;
import org.apache.mina.filter.codec.ProtocolCodecFilter;
import org.apache.mina.filter.executor.ExecutorFilter;
import org.apache.mina.transport.socket.DefaultDatagramSessionConfig;
import org.apache.mina.transport.socket.nio.NioDatagramAcceptor;

import com.neusoft.avnc.gateway.listener.codec.terminal.TerminalMessageCodecFactory;
import com.neusoft.avnc.gateway.listener.msgHandler.VgMsgHandler;


/**
 * <br>Title:VG 监听器
 * <br>Description:监听协议版本为vg的终端消息
 * <br>Author:曲锐(qur@neusoft.com)
 * <br>Date:2013-3-9
 */
public class VgListener {
	
	public boolean start(int port){
		Logger logger = Logger.getLogger("default");
		logger.info("[##########Listener Vg启动......##########]");
		NioDatagramAcceptor udpAcceptor = new NioDatagramAcceptor();
		//编码解码器
		udpAcceptor.getFilterChain().addLast("codec",new ProtocolCodecFilter(
						new TerminalMessageCodecFactory()));
		ExecutorService executor = Executors.newCachedThreadPool();
		udpAcceptor.getFilterChain().addLast("executor",new ExecutorFilter(executor));
		//设置句柄
		udpAcceptor.setHandler(new VgMsgHandler());
		DefaultDatagramSessionConfig config = 
				(DefaultDatagramSessionConfig) udpAcceptor.getSessionConfig();
		config.setReuseAddress(true);
		udpAcceptor.setCloseOnDeactivation(false);
		//设定缓冲区大小
		config.setReceiveBufferSize(1024*150);
		config.setReadBufferSize(1024*150);
		config.setSendBufferSize(1024*150);
		// 绑定端口并开启监听
		try {
			udpAcceptor.bind(new InetSocketAddress(port));
		} catch (IOException e) {
			logger.error(e.getMessage());
		}
		logger.info("[##########Listener Vg已启动##########]");
		return udpAcceptor.isActive();
	}
}
