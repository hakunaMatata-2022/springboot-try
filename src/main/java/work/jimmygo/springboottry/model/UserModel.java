package work.jimmygo.springboottry.model;

import lombok.Data;
import org.apache.ibatis.type.Alias;

/**
 * 用户模型
 *
 * @author shenzui5233
 * @since 2023-09-24
 */
@Data
@Alias("UserModel")
public class UserModel {
    private Long id;
    // 用户名
    private String username; // 密码
    private String password; // 姓名
    private String name;
}
