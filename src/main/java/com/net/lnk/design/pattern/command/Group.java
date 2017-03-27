package com.net.lnk.design.pattern.command;

/**
 * @tag 工作组
 *
 * @author Ben
 * @memo 2017年3月26日
 */
public abstract class Group {

	// 找到工作组
	public abstract void find();

	// 被要求增加功能
	public abstract void add();

	// 被邀请删除功能
	public abstract void delete();

	// 被邀请改变功能
	public abstract void change();

	// 被要求给出所有的变更计划
	public abstract void plan();

	// 被要求回滚变更
	public abstract void rollBack();

}
