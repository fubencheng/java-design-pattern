package com.net.lnk.design.pattern.factory.abstrt;

import com.net.lnk.design.pattern.factory.AbstractPizza;
import com.net.lnk.design.pattern.factory.ChicagoStyleCheesePizza;
import com.net.lnk.design.pattern.factory.ChicagoStyleClamPizza;
import com.net.lnk.design.pattern.factory.ChicagoStylePepperoniPizza;
import com.net.lnk.design.pattern.factory.ChicagoStyleVeggiPizza;

/**
 * @tag
 *
 * @author Ben
 * @memo 2016年9月28日
 */
public class ChicagoStylePizzaStore extends PizzaStore {

	public AbstractPizza createPizza(String style) {
		AbstractPizza pizza = null;
		if ("cheese".equals(style)) {
			pizza = new ChicagoStyleCheesePizza();
		} else if ("veggi".equals(style)) {
			pizza = new ChicagoStyleVeggiPizza();
		} else if ("clam".equals(style)) {
			pizza = new ChicagoStyleClamPizza();
		} else if ("pepperoni".equals(style)) {
			pizza = new ChicagoStylePepperoniPizza();
		}

		return pizza;
	}

}
