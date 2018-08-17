package com.hubei.www.wuhan.design.patterns;

import com.hubei.www.wuhan.design.patterns.impl.MailProviderService;

/**
 * 抽象工厂模式
 */
public class AbstractFactorySender {
	public static void main(String[] args) {
		// 抽象工厂模式，创建多个工厂类，这样一旦需要增加新的功能，直接增加新的工厂类就可以了，不需要修改之前的代码。
		IProviderService aaa = new MailProviderService();
		ISenderService bbb = aaa.produce();
		bbb.send();
	}
}
