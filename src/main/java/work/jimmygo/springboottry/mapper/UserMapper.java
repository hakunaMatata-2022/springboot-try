package work.jimmygo.springboottry.mapper;

import org.apache.ibatis.annotations.Mapper;
import work.jimmygo.springboottry.model.UserModel;

import java.util.List;

/**
 * UserMapper
 *
 * @author shenzui5233
 * @since 2023-09-24
 */
@Mapper
public interface UserMapper {
    List<UserModel> queryUserList();
}
