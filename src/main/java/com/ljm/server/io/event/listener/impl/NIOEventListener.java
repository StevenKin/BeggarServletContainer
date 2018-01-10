package com.ljm.server.io.event.listener.impl;

import com.ljm.server.event.listener.AbstractEventListener;
import com.ljm.server.event.handler.EventHandler;

import java.nio.channels.SelectionKey;

/**
 * @author 李佳明 https://github.com/pkpk1234
 * @date 2018-01-2018/1/10
 */
public class NIOEventListener extends AbstractEventListener<SelectionKey> {
    private final EventHandler<SelectionKey> eventHandler;

    public NIOEventListener(EventHandler<SelectionKey> eventHandler) {
        this.eventHandler = eventHandler;
    }

    @Override
    protected EventHandler<SelectionKey> getEventHandler(SelectionKey event) {
        return this.eventHandler;
    }
}
