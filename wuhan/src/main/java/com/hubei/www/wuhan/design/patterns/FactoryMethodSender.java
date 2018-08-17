package com.hubei.www.wuhan.design.patterns;

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
	}

}
