package com.net.lnk.design.pattern.command;

/**
 * @tag 需求工作组
 *
 * @author Ben
 * @memo 2017年3月26日
 */
public class RequirementGroup extends Group {

	public void find() {
		System.out.println("find requirement group ...");
	}

	public void add() {
		System.out.println("add a requirement ...");
	}

	public void delete() {
		System.out.println("delete a requirement ...");
	}

	public void change() {
		System.out.println("change a requirement ...");
	}

	public void plan() {
		System.out.println("give a requirement change plan ...");
	}

	public void rollBack() {
		System.out.println("rollback requirement change ...");
	}

}
