/**
 * Create Date:2013-3-9
 */
package com.neusoft.avnc.gateway.db;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

/**
 * <br>Base Dao
 * <br>Description:实现基本且可复用的方法
 * <br>Author:曲锐(qur@neusoft.com)
 * <br>Date:2013-3-9
 */
public class BaseDao {
	
	protected JdbcTemplate jdbcTemplate;

	public void setDataSource(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}

	/**
	 * @return the jdbcTemplate
	 */
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	/**
	 * @param jdbcTemplate the jdbcTemplate to set
	 */
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	
}
