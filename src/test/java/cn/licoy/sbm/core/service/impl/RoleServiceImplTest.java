package cn.licoy.sbm.core.service.impl;

import cn.licoy.sbm.core.entity.Role;
import cn.licoy.sbm.core.service.RoleService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;


/**
 * @author Licoy
 * @version 2018/4/20/16:26
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class RoleServiceImplTest {

    @Resource
    private RoleService roleService;

    @Test
    public void test(){
        Role role = Role.builder().name("1").build();
        roleService.insert(role);
    }

}