package com.net.lnk.design.pattern.command.common;

/**
 * @tag 抽象的命令类
 *
 * @author Ben
 * @memo 2017年3月27日
 */
public abstract class Command {

	// 定义一个子类共享变量
	protected final Receiver receiver;

	public Command(Receiver receiver) {
		this.receiver = receiver;
	}

	// 每个命令都有一个执行命令的方法
	public abstract void execute();

}
