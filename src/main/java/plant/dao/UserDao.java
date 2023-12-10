package plant.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import plant.entity.JavaBean.User;

@Repository("UserDao")
@Mapper
public interface UserDao
{
    User UserLoginStatus(@Param("username") String username, @Param("password") String password);
}
