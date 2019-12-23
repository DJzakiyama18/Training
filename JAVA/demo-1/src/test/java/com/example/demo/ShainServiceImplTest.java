package com.example.demo;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;
import static org.mockito.Mockito.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
public class ShainServiceImplTest {

	@MockBean
	private ShainRepository shainRepository;

	@Test
	public void selectNumber() throws Exception {
		//shainRepositoryをモックにして、selectNumberが機能するか？のテスト
		when(shainRepository.selectNumber("100")).thenReturn("090-0000-0000");
		ShainService shainService = new ShainServiceImpl();
		String repository = shainService.selectNumber("100");
		assertThat(repository, is("090-0000-0000"));
	}

}