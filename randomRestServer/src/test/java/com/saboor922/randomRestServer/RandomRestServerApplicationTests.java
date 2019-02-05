package com.saboor922.randomRestServer;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@TestPropertySource(properties = { "randomUrl.path = http://randomUrl.com"})
public class RandomRestServerApplicationTests {

	@Test
	public void contextLoads() {
	}

}

