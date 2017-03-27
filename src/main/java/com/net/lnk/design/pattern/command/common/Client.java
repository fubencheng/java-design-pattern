package com.net.lnk.design.pattern.command.common;

/**
 * @tag 使用场景类
 *
 * @author Ben
 * @memo 2017年3月27日
 */
public class Client {

	public static void main(String[] args) {

		// 暴露 receiver的情况
		Receiver receiver = new ConcreteReceiver1();
		Command command = new ConcreteCommand1(receiver);
		Invoker invoker = new ConcreteInvoker(command);
		invoker.action();

		// 不暴露receiver的情况
		Invoker invoker1 = new ConcreteInvoker(new ConcreteCommand1());
		invoker1.action();
	}

}
