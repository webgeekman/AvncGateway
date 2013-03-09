/**
 * Create Date:2013-3-9
 */
package com.neusoft.avnc.gateway.listener.msgHandler;

import org.apache.mina.core.service.IoHandlerAdapter;
import org.apache.mina.core.session.IdleStatus;
import org.apache.mina.core.session.IoSession;

/**
 * <br>Title:消息处理类
 * <br>Description:对VG3版本协议的终端进行消息处理
 * <br>Author:曲锐(qur@neusoft.com)
 * <br>Date:2013-3-9
 */
public class Vg3MsgHandler extends IoHandlerAdapter{
	/**
	 * description: 当终端连接进入时被调用，在sessionCreated调用之后被执行
	 * @param session 当前的连接操作
	 * @throws Exception
	 */
	public void sessionOpened(IoSession session) throws Exception {
		
	}
	/**
	 * description: 当与一个终端连接关闭session终止（包括网络断开、终端离线、终端不在线）时被调用，用来释放连接资源
	 * @param session
	 * @throws Exception
	 */
	public void sessionClosed(IoSession session) throws Exception {
		
	}
	/**
	 * description: 当终端发送的报文到达时被调用，来实现报文分发、应答消息等具体实现业务的处理
	 * @param session 当前的连接操作
	 * @param message 接收到的终端报文对象
	 * @throws Exception
	 */
	public void messageReceived(IoSession session, Object message)
			throws Exception {
		
	}
	/**
	 * description: 当一个IO连接建立时被调用，这个方法在任何IO操作之前被调用，以便socket参数或session属性能够最先被设置
	 * @param session
	 * @throws Exception
	 */
	public void sessionCreated(IoSession session) throws Exception {
		
	}
	/**
	 * description: 在终端和终端服务器之间没有报文传输时被调用，即连接空闲时被触发。
	 * 使用IoSessionConfig中的setIdleTime(IdleStatus status, int
	 * idleTime)方法可以设置session的空闲时间。
	 * 如果该Session的空闲时间超过设置的值，该方法被触发，该函数用来判断出现坏连接而又不能自动抛出异常或断开时用该函数进行处理。
	 * 可以通过session.getIdleCount(status)来获取sessionIdle被触发的次数
	 * @param session 当前的连接操作
	 * @param idlestatus 描述session的空闲状态：1、session未写入任何数据 2、没有来自远程终端的数据 3、both
	 * @throws Exception
	 */
	public void sessionIdle(IoSession session, IdleStatus idlestatus)
			throws Exception {
		
	}
	/**
	 * description: 当消息被成功发送给终端后此方法被调用，即等消息真正发送出去之后再继续执行后续操作
	 * @param session 当前的连接操作
	 * @param obj 发送的消息对象
	 * @throws Exception
	 */
	public void messageSent(IoSession session, Object obj) throws Exception {
		
	}
	/**
	 * description: 当IoAcceptor 或IoHandler.中出现异常时被触发。可用来判断连接状态是否可以正常收发消息
	 * @param session
	 * @param cause
	 * @throws Exception
	 */
	public void exceptionCaught(IoSession session, Throwable cause)
			throws Exception {
		
	}
}
