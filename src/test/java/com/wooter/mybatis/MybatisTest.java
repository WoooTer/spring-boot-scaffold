package com.wooter.mybatis;

import com.wooter.Application;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;


@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = Application.class)
@Transactional
public class MybatisTest {

	@Autowired
	private UserMapper userMapper;

	@Test
//	@Rollback
	@Transactional
	public void findByName() throws Exception {
		int count = userMapper.insert("AAA", 20);
		Users u = userMapper.findByName("AAA");
		Users u2 = userMapper.findByName("c");
		Assert.assertEquals(20, u.getAge().intValue());
	}

}