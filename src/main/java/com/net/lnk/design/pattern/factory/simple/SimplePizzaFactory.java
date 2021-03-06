package com.net.lnk.design.pattern.factory.simple;

import com.net.lnk.design.pattern.factory.CheesePizza;
import com.net.lnk.design.pattern.factory.ClamPizza;
import com.net.lnk.design.pattern.factory.PepperoniPizza;
import com.net.lnk.design.pattern.factory.Pizza;
import com.net.lnk.design.pattern.factory.VeggiePizza;

/**
 * @tag
 *
 * @author Ben
 * @memo 2016年9月28日
 */
public class SimplePizzaFactory {

	public Pizza createPizza(String type) {
		Pizza pizza = null;
		if ("cheese".equals(type)) {
			pizza = new CheesePizza();
		} else if ("veggie".equals(type)) {
			pizza = new VeggiePizza();
		} else if ("clam".equals(type)) {
			pizza = new ClamPizza();
		} else if ("pepperoni".equals(type)) {
			pizza = new PepperoniPizza();
		}

		return pizza;
	}

}
