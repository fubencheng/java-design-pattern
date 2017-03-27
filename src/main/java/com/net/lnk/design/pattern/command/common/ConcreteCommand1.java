package com.net.lnk.design.pattern.command.common;

/**
 * @author Ben
 * @memo 2017年3月27日
 */
public class ConcreteCommand1 extends Command {

	// 声明自己为默认的命令接收者
	public ConcreteCommand1() {
		super(new ConcreteReceiver1());
	}

	// 设置新的接收者
	public ConcreteCommand1(Receiver receiver) {
		super(receiver);
	}

	public void execute() {
		receiver.doSomething();
	}

}
