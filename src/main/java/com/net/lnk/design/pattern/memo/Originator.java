package com.net.lnk.design.pattern.memo;

import java.beans.PropertyDescriptor;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.beanutils.PropertyUtils;

/**
 * @author Ben
 * @memo 2017年4月10日
 */
public class Originator {

	private String state1 = "";
	private String state2 = "";
	private String state3 = "";

	public MapMemo createMemo() throws Exception {
		Map<String, Object> propsMap = new HashMap<String, Object>();
		PropertyDescriptor[] props = PropertyUtils.getPropertyDescriptors(this);
		for (PropertyDescriptor prop : props) {
			if (!"class".equals(prop.getName())) {
				propsMap.put(prop.getName(), prop.getReadMethod().invoke(this, new Object[] {}));
			}
		}

		// 创建一个备忘录
		return new MapMemo(propsMap);
	}

	public void restoreMemo(MapMemo mapMemo) throws Exception {
		Map<String, Object> propsMap = mapMemo.getStateMap();
		PropertyDescriptor[] propsDesc = PropertyUtils.getPropertyDescriptors(this);
		for (PropertyDescriptor prop : propsDesc) {
			if (propsMap.containsKey(prop.getName()) && !"class".equals(prop.getName())) {
				prop.getWriteMethod().invoke(this, new Object[] { propsMap.get(prop.getName()) });
			}
		}
	}

	public String getState1() {
		return state1;
	}

	public void setState1(String state1) {
		this.state1 = state1;
	}

	public String getState2() {
		return state2;
	}

	public void setState2(String state2) {
		this.state2 = state2;
	}

	public String getState3() {
		return state3;
	}

	public void setState3(String state3) {
		this.state3 = state3;
	}

	public String toString() {
		return "state1 = " + state1 + ", state2 = " + state2 + ", state3 = " + state3;
	}

}
