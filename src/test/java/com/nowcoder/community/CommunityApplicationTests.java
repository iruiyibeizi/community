package com.nowcoder.community;

import com.nowcoder.community.dao.UserMapper;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)

@ContextConfiguration(classes = CommunityApplication.class)
class CommunityApplicationTests {
@Autowired
private UserMapper userMapper;
    @Test
    void contextLoads() {
        System.out.println("1");
        System.out.println(userMapper);
        userMapper.selectByPrimaryKey(100);
    }

}
