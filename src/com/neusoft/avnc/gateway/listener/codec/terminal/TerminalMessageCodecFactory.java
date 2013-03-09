package com.neusoft.avnc.gateway.listener.codec.terminal;

import org.apache.mina.core.session.IoSession;
import org.apache.mina.filter.codec.ProtocolCodecFactory;
import org.apache.mina.filter.codec.ProtocolDecoder;
import org.apache.mina.filter.codec.ProtocolEncoder;



public class TerminalMessageCodecFactory implements ProtocolCodecFactory{
	
	private final ProtocolEncoder encoder;
	private final ProtocolDecoder decoder;
	/**
	 * 构造函数
	 *
	 */
	public TerminalMessageCodecFactory() {
		encoder = new TmnMessageEncoder();
		decoder = new TmnMessageDecoder();
	}
	public ProtocolDecoder getDecoder(IoSession arg0) throws Exception {
		return decoder;
	}

	public ProtocolEncoder getEncoder(IoSession arg0) throws Exception {
		return encoder;
	}

}
