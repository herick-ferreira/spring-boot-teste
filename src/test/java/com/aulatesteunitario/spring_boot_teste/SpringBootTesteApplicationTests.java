package com.aulatesteunitario.spring_boot_teste;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringBootTesteApplicationTests {
	
	@Autowired
	private HomeController controller;

	@Test
	void contextLoads() {
		assertThat(controller).isNotNull();
	}

}
