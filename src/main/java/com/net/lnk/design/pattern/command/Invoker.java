package com.net.lnk.design.pattern.command;

/**
 * @tag 命令负责人
 *
 * @author Ben
 * @memo 2017年3月26日
 */
public class Invoker {

	private Command command;

	public Invoker(Command command) {
		this.command = command;
	}

	public void action() {
		command.execute();
	}

}
