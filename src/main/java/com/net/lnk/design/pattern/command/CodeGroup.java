package com.net.lnk.design.pattern.command;

/**
 * @tag 编程组
 *
 * @author Ben
 * @memo 2017年3月26日
 */
public class CodeGroup extends Group {

	public void find() {
		System.out.println("find code group ...");
	}

	public void add() {
		System.out.println("add a function ....");
	}

	public void delete() {
		System.out.println("delete a function ...");
	}

	public void change() {
		System.out.println("change a function ...");
	}

	public void plan() {
		System.out.println("give a function change plan ...");
	}

	public void rollBack() {
		System.out.println("rollback function change ...");
	}

}
