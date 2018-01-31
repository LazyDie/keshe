package com.lianyu.king.base.impl;

import java.util.List;

import com.ipower365.saas.basic.page.BasePage;
import com.lianyu.king.base.BaseDao;

public class BaseDaoImpl<T> extends GenericDaoImpl<T> implements BaseDao<T> {

    @Override
    public int insert(T record) {
        return super.insert(record);
    }

    @Override
    public int updateByPrimaryKey(T record) {
        return super.update(record);
    }

    @Override
    public int updateByPrimaryKeySelective(T record) {
        return super.updateDynamic(record);
    }

    @Override
    public T selectByPrimaryKey(Object id) {
        return super.selectOne("selectByPrimaryKey", id);
    }

    @Override
    public int deleteByPrimaryKey(Object id) {
        return super.delete(id);
    }

    @Override
    public int queryByCount(BasePage page) {
        return super.queryTotalCount("queryByCount", page);
    }

    @Override
    public List<T> queryByList(BasePage page) {
        return super.selectList("queryByList", page);
    }

}
