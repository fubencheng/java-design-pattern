package com.net.lnk.design.pattern.memo;

import java.util.Map;

/**
 * @author Ben
 * @memo 2017年4月10日
 */
public class MapMemo {

	private Map<String, Object> stateMap;

	public MapMemo(Map<String, Object> stateMap) {
		this.stateMap = stateMap;
	}

	public Map<String, Object> getStateMap() {
		return stateMap;
	}

	public void setStateMap(Map<String, Object> stateMap) {
		this.stateMap = stateMap;
	}

}
