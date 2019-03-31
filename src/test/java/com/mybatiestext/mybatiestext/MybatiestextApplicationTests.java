package com.mybatiestext.mybatiestext;

import com.mybatiestext.dao.UserTMapper;
import com.mybatiestext.entity.User;
import com.mybatiestext.entity.UserTExample;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MybatiestextApplicationTests {

	@Resource
	private UserTMapper userMapper;
	private UserTMapper userMapper1;

	@Test
	public void getUserById(){
//		User user = userMapper.selectByPrimaryKey(20);
		List<User> users = userMapper.selectByExample(new UserTExample());
		for (User user : users) {
			System.out.println(user);
		}
	}

	@Test
	public void insert(){
		User user = new User();
		user.setUsername("aaaaa");
		user.setPassword("六六qijiu");
		user.setAge(12443345);
		int insert = userMapper.insert(user);
		System.out.println(insert+"成功了");
	}
	@Test
	public void delete(){
		int i = userMapper.deleteByPrimaryKey(50);
		System.out.println(i);
	}
	@Test
	public void update(){
		User user = userMapper.selectByPrimaryKey(40);
		user.setUsername("我靠");
		int i = userMapper.updateByPrimaryKey(user);
		System.out.println(i);
	}
}
