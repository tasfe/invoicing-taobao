package com.taobao.page.dialect;

/**
 * ���ݿⷽ�Խӿ�
 * @author Jan
 *
 */
public interface Dialect {

		public static enum Type {
			MYSQL {
				public String getValue() {
					return "mysql";
				}
			},
			MSSQL {
				public String getValue() {
					return "sqlserver";
				}
			},
			ORACLE {
				public String getValue() {
					return "oracle";
				}
			}
		}

		/**
		 * @descrption ��ȡ��ҳSQL
		 * @author xdwang
		 * @create 2012-12-19����7:48:44
		 * @param sql
		 *            ԭʼ��ѯSQL
		 * @param offset
		 *            ��ʼ��¼���������㿪ʼ��
		 * @param limit
		 *            ÿҳ��¼��С
		 * @return �������ݿ���صķ�ҳSQL���
		 */
		public abstract String getPageSql(String sql, int offset, int limit);

}

