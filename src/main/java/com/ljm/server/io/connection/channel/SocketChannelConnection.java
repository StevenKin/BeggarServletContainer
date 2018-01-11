package com.ljm.server.io.connection.channel;

import com.ljm.server.io.connection.Connection;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.channels.SocketChannel;

/**
 * @author 李佳明 https://github.com/pkpk1234
 * @date 2018-01-2018/1/10
 */
public class SocketChannelConnection implements Connection {

    private final SocketChannel socketChannel;

    public SocketChannelConnection(SocketChannel socketChannel) {
        this.socketChannel = socketChannel;
    }


    @Override
    public void write(byte[] bytes) throws IOException {
        
    }

    @Override
    public void write(byte[] bytes, int offset, int length) throws IOException {

    }

    @Override
    public int read(byte[] bytes) {
        return 0;
    }

    @Override
    public int read(byte[] bytes, int start, int end) {
        return 0;
    }
}
