package com.net.lnk.design.pattern.command;

/**
 * @tag 回滚删除页面的命令
 *
 * @author Ben
 * @memo 2017年3月27日
 */
public class CancelDeletePageCommand extends Command {

	public void execute() {
		pg.rollBack();
	}

}
