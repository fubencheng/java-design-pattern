package com.net.lnk.design.pattern.command.common;

/**
 * @author Ben
 * @memo 2017年3月27日
 */
public class ConcreteCommand2 extends Command {

	// 声明自己是默认的命令接收者
	public ConcreteCommand2() {
		super(new ConcreteReceiver2());
	}

	// 设置新的命令接收者
	public ConcreteCommand2(Receiver receiver) {
		super(receiver);
	}

	public void execute() {
		receiver.doSomething();
	}

}
