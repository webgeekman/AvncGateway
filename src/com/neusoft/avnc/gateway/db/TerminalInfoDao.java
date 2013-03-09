/**
 * Create Date:2013-3-9
 */
package com.neusoft.avnc.gateway.db;

import com.neusoft.avnc.gateway.domain.Terminal;

/**
 * <br>Title:TODO 类标题
 * <br>Description:TODO 类功能描述
 * <br>Author:曲锐(qur@neusoft.com)
 * <br>Date:2013-3-9
 */
public interface TerminalInfoDao {
	/**
	 * 按Sim卡号取得终端信息
	 * <br>Description:按Sim卡号取得单一条终端信息
	 * <br>Author:曲锐(qur@neusoft.com)
	 * <br>Date:2013-3-9
	 * @param simCardNo
	 * @return TerminalInfo
	 */
	public Terminal getTerminalInfoBySimCardNo(Integer simCardNo);
}
