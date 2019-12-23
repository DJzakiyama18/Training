package com.example.demo;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest//テストする為のおまじない？
public class WebTest {

	private MockMvc mockMvc; //サーバーを起動しなくても使えるようになるクラス

	@Autowired
	ShainController target;	//ShainControllerをテストしたい時にはこのように書く

	@Before
	public void setup() {
		mockMvc = MockMvcBuilders.standaloneSetup(target).build();
	}

	@Test
	public void isStatusTest() throws Exception {
		// /inputでアクセスして、statusがOKになるかのテスト
		mockMvc.perform(get("/input")).andExpect(status().isOk());
	}
	@Test
	public void isStatusTest2() throws Exception {
		// /outputでアクセスして、statusがOKになるかのテスト
		mockMvc.perform(get("/output")).andExpect(status().isOk());
	}

}