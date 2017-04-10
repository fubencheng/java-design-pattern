package com.net.lnk.design.pattern.factory.abstrt;

import com.net.lnk.design.pattern.factory.AbstractPizza;
import com.net.lnk.design.pattern.factory.NYStyleCheesePizza;
import com.net.lnk.design.pattern.factory.NYStyleClamPizza;
import com.net.lnk.design.pattern.factory.NYStylePepperoniPizza;
import com.net.lnk.design.pattern.factory.NYStyleVeggiPizza;

/**
 * @tag
 *
 * @author Ben
 * @memo 2016年9月28日
 */
public class NYStylePizzaStore extends PizzaStore {

	public AbstractPizza createPizza(String style) {
		AbstractPizza pizza = null;
		if ("cheese".equals(style)) {
			pizza = new NYStyleCheesePizza();
		} else if ("veggi".equals(style)) {
			pizza = new NYStyleVeggiPizza();
		} else if ("clam".equals(style)) {
			pizza = new NYStyleClamPizza();
		} else if ("pepperoni".equals(style)) {
			pizza = new NYStylePepperoniPizza();
		}

		return pizza;
	}

}
