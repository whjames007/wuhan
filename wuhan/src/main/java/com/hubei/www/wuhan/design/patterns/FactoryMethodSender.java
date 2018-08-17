package com.hubei.www.wuhan.design.patterns;

import com.hubei.www.wuhan.design.patterns.impl.MailSenderService;
import com.hubei.www.wuhan.design.patterns.impl.SmsSenderService;

/**
 * 工厂方法模式
 */
public class FactoryMethodSender {
	/**
	 * 在工厂里生产邮件发送器
	 */
	public static ISenderService ProduceMailSender() {
		return new MailSenderService();
	}

	/**
	 * 在工厂里生产短信发送器
	 */
	public static ISenderService ProduceSmsSender() {
		return new SmsSenderService();
	}

	public static void main(String[] args) {
		ISenderService aaa = FactoryMethodSender.ProduceMailSender();
		ISenderService bbb = FactoryMethodSender.ProduceSmsSender();
		aaa.send();
		bbb.send();
		// 工厂方法模式有一个问题就是，类的创建依赖工厂类，也就是说，如果想要拓展程序，必须对工厂类进行修改，这违背了闭包原则
	}

}
