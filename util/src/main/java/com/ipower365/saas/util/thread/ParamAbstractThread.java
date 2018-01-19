package com.ipower365.saas.util.thread;

/**
 * 含参数的线程
 * @author anker
 *
 * @param <T>
 */
public abstract class ParamAbstractThread<T> extends AbstractThread {

    private T param; //传递的参数

    public ParamAbstractThread(T param) {
        this.param = param;
    }

    public T getParam() {
        return param;
    }

    public void setParam(T param) {
        this.param = param;
    }

}
