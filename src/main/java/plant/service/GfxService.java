package plant.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import plant.dao.UserDao;
import plant.entity.JavaBean.User;
import plant.util.Result;

@Service
public class GfxService {
    @Qualifier("UserDao")
    @Autowired
    private UserDao userMapper;

    public Result<User> LoginStatus(User user) {
        if (userMapper.UserLoginStatus(user.getUsername(),user.getPassword()) == null) {
            return new Result<>(false,"信息不符");
        } else  {
            return new Result<>(true,user);
        }
    }
}