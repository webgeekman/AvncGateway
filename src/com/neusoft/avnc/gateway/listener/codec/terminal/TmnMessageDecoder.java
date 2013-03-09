/**
 * <p>项目名称: 通用网关</p>
 * <p>厂商: 东软集团股份有限公司</p>
 * <p>部门: AVNC&IS事业部</p>
 * <p>版权: Copyright(c) 2011</p>
 */
package com.neusoft.avnc.gateway.listener.codec.terminal;

import org.apache.mina.core.buffer.IoBuffer;
import org.apache.mina.core.session.IoSession;
import org.apache.mina.filter.codec.CumulativeProtocolDecoder;
import org.apache.mina.filter.codec.ProtocolDecoderOutput;

/**
 * 
 * <br>Title:中断消息解码器
 * <br>Description:解码终端消息
 * <br>Author:曲锐(qur@neusoft.com)
 * <br>Date:2013-3-10
 */
public class TmnMessageDecoder extends CumulativeProtocolDecoder {
	/**
	 * 构造函数
	 * 
	 */
	public TmnMessageDecoder() {
	}

	@Override
	protected boolean doDecode(IoSession session, IoBuffer in,ProtocolDecoderOutput out) 
		throws Exception {
        out.write(in.getHexDump().replace(" ", ""));
        in.flip();
        return true;
    }
}
