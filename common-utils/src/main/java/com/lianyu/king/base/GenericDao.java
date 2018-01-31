package com.lianyu.king.base;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.ResultHandler;
import org.apache.ibatis.session.RowBounds;

/**
 * dao基类 <br>
 * 绑定泛型后，缺省namespace=T.getName(),T对应的mapper文件中的namespace须配置为T的全类名
 * 
 * @author kevin
 *
 * @param <T>
 */
public interface GenericDao<T> {

	// 数据状态：1有效；0无效
	public final static int ROWSTATUS_VALID = 1;
	public final static int ROWSTATUS_INVALID = 0;
	public final static String UPDATE_SELECTIVE = "updateByPrimaryKeySelective";

	/**
	 * 返回单一记录
	 * 
	 * @param statement
	 *            缺省：namespace.selectByPrimaryKey
	 * @return
	 */
	<E> E selectOne(String statement);

	/**
	 * 返回单一记录
	 * 
	 * @param statement
	 *            缺省：namespace.selectByPrimaryKey
	 * @return
	 */
	<E> E selectOne(String statement, Object parameter);

	/**
	 * 返回单一记录 statement 缺省：namespace.selectByPrimaryKey
	 * 
	 * @return
	 */
	@SuppressWarnings("hiding")
	<T> T selectOne(Object parameter);

	/**
	 * 查询列表
	 * 
	 * @param statement
	 * @return
	 */
	<E> List<E> selectList(String statement);

	/**
	 * 查询列表
	 * 
	 * @param statement
	 * @return
	 */
	<E> List<E> selectList(String statement, Object parameter);

	/**
	 * 查询列表
	 * 
	 * @param statement
	 * @return
	 */
	@SuppressWarnings("hiding")
	<T> List<T> selectList(Object parameter);

	/**
	 * Retrieve a list of mapped objects from the statement key and parameter,
	 * within the specified row bounds.
	 * 
	 * @param <E>
	 *            the returned list element type
	 * @param statement
	 *            Unique identifier matching the statement to use.
	 * @param parameter
	 *            A parameter object to pass to the statement.
	 * @param rowBounds
	 *            Bounds to limit object retrieval
	 * @return List of mapped object
	 */
	<E> List<E> selectList(String statement, Object parameter, RowBounds rowBounds);

	/**
	 * The selectMap is a special case in that it is designed to convert a list
	 * of results into a Map based on one of the properties in the resulting
	 * objects. Eg. Return a of Map[Integer,Author] for
	 * selectMap("selectAuthors","id")
	 * 
	 * @param <K>
	 *            the returned Map keys type
	 * @param <V>
	 *            the returned Map values type
	 * @param statement
	 *            Unique identifier matching the statement to use.
	 * @param mapKey
	 *            The property to use as key for each value in the list.
	 * @return Map containing key pair data.
	 */
	<K, V> Map<K, V> selectMap(String statement, String mapKey);

	/**
	 * The selectMap is a special case in that it is designed to convert a list
	 * of results into a Map based on one of the properties in the resulting
	 * objects.
	 * 
	 * @param <K>
	 *            the returned Map keys type
	 * @param <V>
	 *            the returned Map values type
	 * @param statement
	 *            Unique identifier matching the statement to use.
	 * @param parameter
	 *            A parameter object to pass to the statement.
	 * @param mapKey
	 *            The property to use as key for each value in the list.
	 * @return Map containing key pair data.
	 */
	<K, V> Map<K, V> selectMap(String statement, Object parameter, String mapKey);

	/**
	 * The selectMap is a special case in that it is designed to convert a list
	 * of results into a Map based on one of the properties in the resulting
	 * objects.
	 * 
	 * @param <K>
	 *            the returned Map keys type
	 * @param <V>
	 *            the returned Map values type
	 * @param statement
	 *            Unique identifier matching the statement to use.
	 * @param parameter
	 *            A parameter object to pass to the statement.
	 * @param mapKey
	 *            The property to use as key for each value in the list.
	 * @param rowBounds
	 *            Bounds to limit object retrieval
	 * @return Map containing key pair data.
	 */
	<K, V> Map<K, V> selectMap(String statement, Object parameter, String mapKey, RowBounds rowBounds);

	/**
	 * Retrieve a single row mapped from the statement key and parameter using a
	 * {@code ResultHandler}.
	 * 
	 * @param statement
	 *            Unique identifier matching the statement to use.
	 * @param parameter
	 *            A parameter object to pass to the statement.
	 * @param handler
	 *            ResultHandler that will handle each retrieved row
	 * @return Mapped object
	 */
	@SuppressWarnings("rawtypes")
	void select(String statement, Object parameter, ResultHandler handler);

	/**
	 * Retrieve a single row mapped from the statement using a
	 * {@code ResultHandler}.
	 * 
	 * @param statement
	 *            Unique identifier matching the statement to use.
	 * @param handler
	 *            ResultHandler that will handle each retrieved row
	 * @return Mapped object
	 */
	@SuppressWarnings("rawtypes")
	void select(String statement, ResultHandler handler);

	/**
	 * Retrieve a single row mapped from the statement key and parameter using a
	 * {@code ResultHandler} and {@code RowBounds}
	 * 
	 * @param statement
	 *            Unique identifier matching the statement to use.
	 * @param rowBounds
	 *            RowBound instance to limit the query results
	 * @param handler
	 *            ResultHandler that will handle each retrieved row
	 * @return Mapped object
	 */
	@SuppressWarnings("rawtypes")
	void select(String statement, Object parameter, RowBounds rowBounds, ResultHandler handler);

	/**
	 * 更新
	 * 
	 * @param statement
	 *            缺省值：namespace.insert
	 * @return
	 */
	int insert(String statement);

	/**
	 * 更新
	 * 
	 * @param statement
	 *            缺省值：namespace.insert
	 * @return
	 */
	int insert(String statement, Object parameter);

	/**
	 * 更新 statement 缺省值：namespace.insert
	 * 
	 * @return
	 */
	int insert(T parameter);

	Integer batchInsert(List<T> l);

	/**
	 * 更新
	 * 
	 * @param statement
	 *            缺省值：namespace.updateByPrimaryKey
	 * @return
	 */
	int update(String statement);

	/**
	 * 更新
	 * 
	 * @param statement
	 *            缺省值：namespace.updateByPrimaryKey
	 * @return
	 */
	int update(String statement, Object parameter);

	/**
	 * 更新
	 * 
	 * 缺省值：namespace.updateByPrimaryKey
	 * 
	 * @return
	 */
	int update(T parameter);
	
	/**
	 * 动态更新
	 * 缺省值：namespace.updateByPrimaryKeySelective
	 * @param newObj
	 * @return
	 */
	int updateDynamic(Object newObj);

	/**
	 * 删除
	 * 
	 * @param statement
	 *            缺省值：namespace.deleteByPrimaryKey
	 * @return
	 */
	int delete(String statement);

	/**
	 * 删除
	 * 
	 * @param statement
	 *            缺省值：namespace.deleteByPrimaryKey
	 * @return
	 */
	int delete(String statement, Object parameter);

	/**
	 * 删除
	 * 
	 * 缺省值：namespace.deleteByPrimaryKey
	 * 
	 * @return
	 */
	int delete(Object parameter);

	/**
	 * 逻辑删除
	 * 
	 * 缺省值：namespace.logicDelete
	 * 
	 * @return
	 */
	int logicDelete(Object parameter);

	/**
	 * 分页查询
	 * 
	 * <br>
	 * pageStatement 分页list statement
	 * 缺省值为：namespace.query+T.getSimpleName()+WithPage; <br>
	 * totalCountStatement 查询总条数 statement
	 * 缺省值为：namespace.query+T.getSimpleName() ()+TotalCount;
	 * 
	 * @param parameter
	 *            推荐使用 com.ipower365.saas.beans.query.CommonKey的子类来实现
	 * @return
	 */
	@SuppressWarnings("hiding")
	<T> PagePo<T> queryPage(Object parameter);

	/**
	 * 分页查询
	 * 
	 * @param pageStatement
	 *            分页list statement
	 *            缺省值为：namespace.query+T.getSimpleName()+WithPage;
	 * @param totalCountStatement
	 *            查询总条数 statement 缺省值为：namespace.query+T.getSimpleName()
	 *            ()+TotalCount;
	 * @param parameter
	 *            推荐使用 com.ipower365.saas.beans.query.CommonKey的子类来实现
	 * @return
	 */
	<E> PagePo<E> queryPage(String pageStatement, String totalCountStatement, Object parameter);

	/**
	 * 查询总条数
	 * 
	 * 
	 * <br>
	 * 缺省值为：namespace.query+T.getSimpleName() ()+TotalCount;
	 * 
	 * @param parameter
	 *            推荐使用 com.ipower365.saas.beans.query.CommonKey的子类来实现
	 * @return
	 */
	int queryTotalCount(Object parameter);

	/**
	 * 查询总条数
	 * 
	 * @param statement
	 *            缺省值为：namespace.query+T.getSimpleName() ()+TotalCount;
	 * @param key
	 *            推荐使用 com.ipower365.saas.beans.query.CommonKey的子类来实现
	 * @return
	 */
	int queryTotalCount(String statement, Object parameter);

	/**
	 * 分页包装基类
	 * 
	 * @author kevin
	 *
	 * @param <E>
	 */
	public class PagePo<E> {
		private int totalCount;
		private List<E> list;

		public int getTotalCount() {
			return totalCount;
		}

		public void setTotalCount(int totalCount) {
			this.totalCount = totalCount;
		}

		public List<E> getList() {
			return list;
		}

		public void setList(List<E> list) {
			this.list = list;
		}

		public PagePo() {

		}

		public PagePo(int totalCount, List<E> list) {
			this.totalCount = totalCount;
			this.list = list;
		}
	}
}
