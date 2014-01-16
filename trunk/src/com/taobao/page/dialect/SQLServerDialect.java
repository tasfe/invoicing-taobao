package com.taobao.page.dialect;

/**
 * 
 * 
 * @description SQLServer���ݿ�ʵ��
 * 
 */
public class SQLServerDialect implements Dialect {

	public String getPageSql(String sql, int offset, int limit) {
		sql = sql.trim();
		StringBuffer pageSql = new StringBuffer(sql.length() + 100);
		// ��ʵ���ﻹ����һ������ģ������������⣬ָ�����ˣ��н�����ṩһ�£��ȸ�ϰ��Hibernate����Hibernat�ڲ������ʵ�ֵġ�
		pageSql.append("select * from(select a.*,row_number() over (order by id desc) rownum from( ");
		pageSql.append(sql);
		pageSql.append(") a )b where rownum> " + offset + " and rownum <= " + (offset + limit));
		return pageSql.toString();
	}

}


