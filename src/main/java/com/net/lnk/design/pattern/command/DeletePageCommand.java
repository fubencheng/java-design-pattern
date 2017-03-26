package com.net.lnk.design.pattern.command;

/**
 * @tag 删除页面的命令
 *
 * @author Ben
 * @memo 2017年3月26日
 */
public class DeletePageCommand extends Command {

	public void execute() {
		pg.find();
		pg.delete();
		pg.plan();
	}

}
