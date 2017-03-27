package com.net.lnk.design.pattern.command.common;

/**
 * @tag 调用者抽象类
 *
 * @author Ben
 * @memo 2017年3月27日
 */
public abstract class Invoker {

	protected Command command;

	public Invoker(Command command) {
		this.command = command;
	}

	protected abstract void action();

}
