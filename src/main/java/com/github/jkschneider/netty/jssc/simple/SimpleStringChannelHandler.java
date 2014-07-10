package com.github.jkschneider.netty.jssc.simple;

import io.netty.channel.ChannelHandlerContext;

public interface SimpleStringChannelHandler {
	void channelRead(ChannelHandlerContext ctx, String msg) throws Exception;
}
