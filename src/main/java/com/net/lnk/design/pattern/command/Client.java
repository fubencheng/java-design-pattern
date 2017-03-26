package com.net.lnk.design.pattern.command;

/**
 * @tag 客户端
 *
 * @author Ben
 * @memo 2017年3月26日
 */
public class Client {

	public static void main(String[] args) {
		Invoker manager = new Invoker(new AddRequirementCommand());
		manager.action();

		manager = new Invoker(new DeletePageCommand());
		manager.action();

		manager = new Invoker(new ChangeFunctionCommand());
		manager.action();
	}

}
