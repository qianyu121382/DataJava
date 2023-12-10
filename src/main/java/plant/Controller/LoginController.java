package plant.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import plant.util.PopWindow;
import plant.util.Result;

import java.io.UnsupportedEncodingException;

@Controller
@RequestMapping("Login")
public class LoginController
{
    @RequestMapping()
    public String toPrint() throws UnsupportedEncodingException
    {
        System.out.println(1111);
        PopWindow.getFrame(new Result());
        return "index";
    }
}
