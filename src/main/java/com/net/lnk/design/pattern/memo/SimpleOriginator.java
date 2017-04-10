package com.net.lnk.design.pattern.memo;

/**
 * @author Ben
 * @memo 2017年4月10日
 */
public class SimpleOriginator implements Cloneable {

	private SimpleOriginator backup;

	private String state = "";

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public void createMemo() {
		backup = clone();
	}

	public void restoreMemo() {
		if (backup != null) {
			this.setState(backup.getState());
		}
	}

	protected SimpleOriginator clone() {
		try {
			// 浅复制
			return (SimpleOriginator) super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}

		return null;
	}

}
