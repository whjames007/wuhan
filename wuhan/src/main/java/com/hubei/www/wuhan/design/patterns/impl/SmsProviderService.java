package com.hubei.www.wuhan.design.patterns.impl;

import com.hubei.www.wuhan.design.patterns.IProviderService;
import com.hubei.www.wuhan.design.patterns.ISenderService;

public class SmsProviderService implements IProviderService {

	@Override
	public ISenderService produce() {
		// TODO Auto-generated method stub
		return new SmsSenderService();
	}

}
