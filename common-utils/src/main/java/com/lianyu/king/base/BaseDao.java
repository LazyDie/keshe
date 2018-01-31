package com.lianyu.king.base;

import java.util.List;

import com.ipower365.saas.basic.page.BasePage;
import com.lianyu.king.base.GenericDao;

public interface BaseDao<T> extends GenericDao<T> {
    
    int insert(T record);

    int updateByPrimaryKey(T record);

    int updateByPrimaryKeySelective(T record);

    T selectByPrimaryKey(Object id);

    int deleteByPrimaryKey(Object id);

    public int queryByCount(BasePage page);

    public List<T> queryByList(BasePage page);

}
