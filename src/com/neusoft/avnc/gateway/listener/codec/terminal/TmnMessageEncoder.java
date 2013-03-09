/**
 * <p>项目名称: 通用网关</p>
 * <p>厂商: 东软集团股份有限公司</p>
 * <p>部门: AVNC&IS事业部</p>
 * <p>版权: Copyright(c) 2011</p>
 */
package com.neusoft.avnc.gateway.listener.codec.terminal;

import org.apache.mina.core.buffer.IoBuffer;
import org.apache.mina.core.session.IoSession;
import org.apache.mina.filter.codec.ProtocolEncoder;
import org.apache.mina.filter.codec.ProtocolEncoderOutput;

/**
 * 
 * <br>Title:终端消息编码器
 * <br>Description:对终端消息进行编码
 * <br>Author:曲锐(qur@neusoft.com)
 * <br>Date:2013-3-10
 */
public class TmnMessageEncoder implements ProtocolEncoder{
	/**
	 * 构造函数
	 */
	public  TmnMessageEncoder() {
	}
	/**
	 * 终端消息编码
	 * <br>Description:发送至中断的消息进行编码
	 * <br>Author:曲锐(qur@neusoft.com)
	 * <br>Date:2013-3-10
	 * @see org.apache.mina.filter.codec.ProtocolEncoder#encode(org.apache.mina.core.session.IoSession, java.lang.Object, org.apache.mina.filter.codec.ProtocolEncoderOutput)
	 */
	public void encode(IoSession session, Object message,
			ProtocolEncoderOutput out)
			throws Exception {
			IoBuffer buffer = 
					IoBuffer.allocate(1024).setAutoExpand(true);
			buffer.put((byte[]) message);
			buffer.flip();
			out.write(buffer);
	}
	public void dispose(IoSession arg0) throws Exception {
		
	}
}
