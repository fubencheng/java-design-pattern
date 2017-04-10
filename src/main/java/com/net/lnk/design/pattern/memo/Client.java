package com.net.lnk.design.pattern.memo;

/**
 * @author Ben
 * @memo 2017年4月10日
 */
public class Client {

	public static void main(String[] args) throws Exception {

		simpleOriginator();
		System.out.println("---------------------");
		multiStateOriginator();

	}

	private static void multiStateOriginator() throws Exception {
		Originator originator = new Originator();
		originator.setState1("China");
		originator.setState2("Japan");
		originator.setState3("America");

		MemoTaker memoTaker = new MemoTaker();

		System.out.println("初始状态：" + originator);

		// 创建一个备忘录
		memoTaker.setMapMemo(originator.createMemo());

		// 修改状态
		originator.setState1("Java");
		originator.setState2("PHP");
		originator.setState3("Python");

		System.out.println("修改后状态：" + originator);

		originator.restoreMemo(memoTaker.getMapMemo());

		System.out.println("恢复后状态：" + originator);

	}

	private static void simpleOriginator() {
		SimpleOriginator originator = new SimpleOriginator();
		originator.setState("初始状态...");
		System.out.println("初始状态是：" + originator.getState());

		// 建立备份
		originator.createMemo();

		// 修改状态
		originator.setState("修改后状态...");
		System.out.println("修改后状态是：" + originator.getState());

		// 恢复到原有状态
		originator.restoreMemo();
		System.out.println("恢复后状态是：" + originator.getState());
	}

}
