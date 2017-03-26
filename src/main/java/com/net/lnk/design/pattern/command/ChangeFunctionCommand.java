package com.net.lnk.design.pattern.command;

/**
 * @tag 改变功能的命令
 *
 * @author Ben
 * @memo 2017年3月26日
 */
public class ChangeFunctionCommand extends Command {

	public void execute() {
		cg.find();
		cg.change();
		cg.plan();
	}

}
