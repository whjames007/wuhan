package com.hubei.www.wuhan.design.patterns;

/**
 * 提供者接口
 */
public interface IProviderService {
	/**
	 * 生产方法
	 */
	public ISenderService produce();
}
