package com.example.demo;

import org.springframework.stereotype.Service;

@Service//サービス層のDI化する時には必ず書く
public class ShainServiceImpl implements ShainService {

	private final ShainRepository shainRepository;

	//ShaShainRepositoryのDI化
	public ShainServiceImpl(ShainRepository shainRepository) {
		this.shainRepository = shainRepository;
	}

	@Override
	public String selectNumber(String number) {
		//リポジトリーから値を習得
		String number1 = shainRepository.selectNumber(number);
		return number1;
	}

}
