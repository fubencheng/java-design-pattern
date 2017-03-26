package com.net.lnk.design.pattern.command;

/**
 * @tag 命令
 *
 * @author Ben
 * @memo 2017年3月26日
 */
public abstract class Command {

	protected RequirementGroup rg = new RequirementGroup();
	protected PageGroup pg = new PageGroup();
	protected CodeGroup cg = new CodeGroup();

	public abstract void execute();

}
