package com.demo.springbootquick;

import com.demo.springbootquick.bean.Person;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * SpringBoot单元测试
 *
 * 可以在测试期间很方便的类似编码一样进行自动注入等容器的
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootQuickApplicationTests {

    @Autowired
    Person person;

	@Test
	public void contextLoads() {
	    System.out.println(person);
	}

}
