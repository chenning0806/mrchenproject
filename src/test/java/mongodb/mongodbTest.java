package mongodb;

import com.chen.org.bean.UserPO;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by ChenNing on 16/12/12.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:config/mongodb/mongoConfig.xml"})
public class mongodbTest {


    @Resource
    MongoTemplate mongoTemplate;

    @Test
    public void testAdd() {
        //插入数据
        UserPO userPO = new UserPO();
        userPO.setUsername("cn");
        userPO.setPassword("123456");
        mongoTemplate.save(userPO,"test");
        //查询数据
        List<UserPO> u = mongoTemplate.find(new Query(Criteria.where("username").is("cn")), UserPO.class, "test");
        System.out.println(u.get(0).getUsername());
        System.out.println(u.get(0).getPassword());

    }
}
