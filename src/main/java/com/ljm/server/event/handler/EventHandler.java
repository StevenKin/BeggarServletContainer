package com.ljm.server.event.handler;

/**
 * @author 李佳明 https://github.com/pkpk1234
 * @date 2018-01-2018/1/8
 */
public interface EventHandler<T> {
    void handle(T obj) throws HandlerException;
}
