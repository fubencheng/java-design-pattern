package com.net.lnk.design.pattern.command.common;

/**
 * @author Ben
 * @memo 2017年3月27日
 */
public class ConcreteInvoker extends Invoker {

	public ConcreteInvoker(Command command) {
		super(command);
	}

	protected void action() {
		command.execute();
	}

}
