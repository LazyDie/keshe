package com.lianyu.king.base.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.ResultHandler;
import org.apache.ibatis.session.RowBounds;
import org.mybatis.spring.SqlSessionTemplate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Repository;

import com.lianyu.king.base.core.ContextHolder;
import com.lianyu.king.base.core.DaoEvent;
import com.lianyu.king.base.core.DaoEventFactory;
import com.lianyu.king.base.core.SqlSessionTemplateHolder;
import com.lianyu.king.base.GenericDao;
import com.ipower365.saas.util.CommonUtil;
import com.ipower365.saas.util.GenericsUtils;

@Repository
public class GenericDaoImpl<T> implements GenericDao<T> {
	// @Autowired
	// private SqlSessionTemplate sqlSessionTemplate;
	protected Class<T> clazz;
	/**
	 * T的类名
	 */
	protected String clazzName;
	protected static final String INSERT = "insert";
	protected static final String BATCH_INSERT = "batchInsert";
	protected static final String UPDATE = "update";
	protected static final String DELETE = "delete";
	protected static final String QUERY = "query";
	protected static final String SELECT = "select";
	protected static final String END = "ByPrimaryKey";
	protected static final String LOGIC_DELETE = "logicDelete";
	protected static final String SELECTIVE = "Selective";
	protected static final String UPDATE_DYNAMIC = "updateByPrimaryKeySelective";
	@Autowired
	private ApplicationEventPublisher publisher;
	/**
	 * 缺省nameSpace为T.getName();
	 */
	protected String defaultNameSpace;
	@Autowired
	private Map<String, SqlSessionTemplate> m;

	private static final String DEFAULT_SESSIONTEMPLATE = "sqlSessionTemplate";
	private Logger log = LoggerFactory.getLogger(getClass());

	public SqlSessionTemplate getSessionTemplate() {
		String sessionTemplate = SqlSessionTemplateHolder.get();
		if (CommonUtil.isEmpty(sessionTemplate))
			sessionTemplate = DEFAULT_SESSIONTEMPLATE;
		return m.get(sessionTemplate);
	}

	@SuppressWarnings("unchecked")
	public GenericDaoImpl() {
		clazz = GenericsUtils.getSuperClassGenricType(getClass());
		clazzName = clazz.getSimpleName();
		defaultNameSpace = clazz.getName();
	}

    public <E> E selectOne(String statement) {
        // TODO Auto-generated method stub
        return null;
    }

    public <E> E selectOne(String statement, Object parameter) {
        // TODO Auto-generated method stub
        return null;
    }

    public <T> T selectOne(Object parameter) {
        // TODO Auto-generated method stub
        return null;
    }

    public <E> List<E> selectList(String statement) {
        // TODO Auto-generated method stub
        return null;
    }

    public <E> List<E> selectList(String statement, Object parameter) {
        // TODO Auto-generated method stub
        return null;
    }

    public <T> List<T> selectList(Object parameter) {
        // TODO Auto-generated method stub
        return null;
    }

    public <E> List<E> selectList(String statement, Object parameter, RowBounds rowBounds) {
        // TODO Auto-generated method stub
        return null;
    }

    public <K, V> Map<K, V> selectMap(String statement, String mapKey) {
        // TODO Auto-generated method stub
        return null;
    }

    public <K, V> Map<K, V> selectMap(String statement, Object parameter, String mapKey) {
        // TODO Auto-generated method stub
        return null;
    }

    public <K, V> Map<K, V> selectMap(String statement, Object parameter, String mapKey, RowBounds rowBounds) {
        // TODO Auto-generated method stub
        return null;
    }

    public void select(String statement, Object parameter, ResultHandler handler) {
        // TODO Auto-generated method stub
        
    }

    public void select(String statement, ResultHandler handler) {
        // TODO Auto-generated method stub
        
    }

    public void select(String statement, Object parameter, RowBounds rowBounds, ResultHandler handler) {
        // TODO Auto-generated method stub
        
    }

    public int insert(String statement) {
        // TODO Auto-generated method stub
        return 0;
    }

    public int insert(String statement, Object parameter) {
        // TODO Auto-generated method stub
        return 0;
    }

    public int insert(T parameter) {
        // TODO Auto-generated method stub
        return 0;
    }

    public Integer batchInsert(List<T> l) {
        // TODO Auto-generated method stub
        return null;
    }

    public int update(String statement) {
        // TODO Auto-generated method stub
        return 0;
    }

    public int update(String statement, Object parameter) {
        // TODO Auto-generated method stub
        return 0;
    }

    public int update(T parameter) {
        // TODO Auto-generated method stub
        return 0;
    }

    public int updateDynamic(Object newObj) {
        // TODO Auto-generated method stub
        return 0;
    }

    public int delete(String statement) {
        // TODO Auto-generated method stub
        return 0;
    }

    public int delete(String statement, Object parameter) {
        // TODO Auto-generated method stub
        return 0;
    }

    public int delete(Object parameter) {
        // TODO Auto-generated method stub
        return 0;
    }

    public int logicDelete(Object parameter) {
        // TODO Auto-generated method stub
        return 0;
    }

    public <T> com.lianyu.king.base.GenericDao.PagePo<T> queryPage(Object parameter) {
        // TODO Auto-generated method stub
        return null;
    }

    public <E> com.lianyu.king.base.GenericDao.PagePo<E> queryPage(String pageStatement, String totalCountStatement, Object parameter) {
        // TODO Auto-generated method stub
        return null;
    }

    public int queryTotalCount(Object parameter) {
        // TODO Auto-generated method stub
        return 0;
    }

    public int queryTotalCount(String statement, Object parameter) {
        // TODO Auto-generated method stub
        return 0;
    }

	
}
