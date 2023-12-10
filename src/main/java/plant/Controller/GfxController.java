package plant.Controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import plant.entity.JavaBean.User;
import plant.service.GfxService;
import plant.util.Result;

@Controller
@RequestMapping("/Login")
@SessionAttributes(types = User.class)
public class GfxController {
    @Autowired
    private GfxService gfxService;

    @RequestMapping
    public String getLoginInfo(User user, Model model) {
        Result<User> us = gfxService.LoginStatus(user);
        User userinfo = us.getData();
        if (us.isSuccess()) {
            model.addAttribute("Userinfo",userinfo);

            //根据用户的role字段判断身份
            if (userinfo.getRole().equals("admin")){
                return "admin";
            }else if(userinfo.getRole().equals("manager")){
                return "manager";
            }else{
                return "staff";
            }
        } else {
            return "error";
        }
    }
}