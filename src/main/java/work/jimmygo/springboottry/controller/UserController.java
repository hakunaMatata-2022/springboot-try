package work.jimmygo.springboottry.controller;

import com.github.pagehelper.Page;
import com.github.pagehelper.page.PageMethod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import work.jimmygo.springboottry.mapper.UserMapper;
import work.jimmygo.springboottry.model.UserModel;

import java.util.List;

/**
 * 功能描述
 *
 * @author shenzui5233
 * @since 2023-09-24
 */
@RestController
public class UserController {
    @Autowired
    private UserMapper userMapper;

    @GetMapping("/queryUsers")
    public List<UserModel> queryUsers(int pageNum, int size) {
        Page page = PageMethod.startPage(pageNum, size);
        List<UserModel> users = userMapper.queryUserList();
        System.out.println("totalCount:" + page.getTotal() + ", curtPage:" + page.getPageNum() + ", pageSize:" + page.getPageSize());
        return users;
    }
}
