/**
 * Create Date:2013-3-9
 */
package com.neusoft.avnc.gateway.db.impl;


import com.neusoft.avnc.gateway.db.BaseDao;
import com.neusoft.avnc.gateway.db.TerminalInfoDao;
import com.neusoft.avnc.gateway.domain.Terminal;

/**
 * <br>Title:终端信息Dao
 * <br>Description:增删改查终端信息
 * <br>Author:曲锐(qur@neusoft.com)
 * <br>Date:2013-3-9
 */
public class TerminalInfoDaoImpl extends BaseDao implements TerminalInfoDao{
	
	/**
	 * <br>Description:按Sim卡号取得终端信息
	 * <br>Author:曲锐(qur@neusoft.com)
	 * <br>Date:2013-3-9
	 * @see com.neusoft.avnc.gateway.db.TerminalInfoDao#getTerminalInfoBySimCardNo(java.lang.Integer)
	 */
	@Override
	public Terminal getTerminalInfoBySimCardNo(Integer simCardNo) {
		jdbcTemplate.execute("insert into t_terminal_info (sim_card_no,is_actived) values ('1','0')");
		return null;
	}

}
