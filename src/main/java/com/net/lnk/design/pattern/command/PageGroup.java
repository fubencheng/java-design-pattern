package com.net.lnk.design.pattern.command;

/**
 * @tag 美工组
 *
 * @author Ben
 * @memo 2017年3月26日
 */
public class PageGroup extends Group {

	public void find() {
		System.out.println("find page group ...");
	}

	public void add() {
		System.out.println("add a page ...");
	}

	public void delete() {
		System.out.println("delete a page ...");
	}

	public void change() {
		System.out.println("change a page ...");
	}

	public void plan() {
		System.out.println("give a page change plan ...");
	}

}
