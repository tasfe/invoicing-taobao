package com.taobao.page.dialect;

/**
 * MySQL���ݿ�ʵ��
 * 
 * @author Jan
 * 
 */
public class MySql5Dialect implements Dialect {
	protected static final String SQL_END_DELIMITER = ";";

	public String getPageSql(String sql, boolean hasOffset) {
		return MySql5PageHepler.getPageSql(sql, -1, -1);
	}

	public String getPageSql(String sql, int offset, int limit) {
		return MySql5PageHepler.getPageSql(sql, offset, limit);
	}

	public boolean supportsLimit() {
		return true;
	}
}
