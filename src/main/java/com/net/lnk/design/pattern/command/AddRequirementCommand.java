package com.net.lnk.design.pattern.command;

/**
 * @tag 添加需求的命令
 *
 * @author Ben
 * @memo 2017年3月26日
 */
public class AddRequirementCommand extends Command {

	public void execute() {
		rg.find();
		rg.add();
		rg.plan();
	}

}
