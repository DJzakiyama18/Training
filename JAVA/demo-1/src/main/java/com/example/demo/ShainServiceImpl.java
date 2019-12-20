package com.example.demo;

public class ShainServiceImpl implements ShainService {

	@Override
	public String selectNumber(String number) {
		// TODO 自動生成されたメソッド・スタブ
		ShainRepository shainRepositoty = new ShainRepositoryImpl();
		String number1 = shainRepositoty.selectNumber(number);
		return number1;
	}

}
