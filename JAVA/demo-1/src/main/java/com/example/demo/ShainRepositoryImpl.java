package com.example.demo;

public class ShainRepositoryImpl implements ShainRepository {

	@Override
	public String selectNumber(String number) {
		String number1;
		switch(number) {
		case "100":
			number1 = "090-0000-0000";
			break;
		case "101":
			number1 = "080-0000-0000";
			break;
		default:
			number1 = "未登録";
			break;
		}
		return number1;
	}

}
