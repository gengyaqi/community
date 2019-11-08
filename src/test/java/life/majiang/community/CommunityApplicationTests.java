package life.majiang.community;

import life.majiang.community.mapper.UserMapper;
import life.majiang.community.model.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = CommunityApplication.class, webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
public class CommunityApplicationTests {

//    @Autowired
//    private User user;
//
    @Autowired
    private UserMapper userMapper;

    @Test
    public void contextLoads() {
        User user = new User();
        user.setToken("1");
        user.setName("1");
        user.setAccountId("1");
        user.setGmtCreat(System.currentTimeMillis());
        user.setGmtModified(System.currentTimeMillis());
        userMapper.insert(user);
        System.out.println("插入成功");
    }

}
