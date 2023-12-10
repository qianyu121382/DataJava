package plant.util;
import org.apache.ibatis.session.SqlSession;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.JOptionPane;
import java.awt.Component;
import java.awt.Frame;
import java.io.UnsupportedEncodingException;

public class PopWindow
{
    public static void getFrame(Result result) throws UnsupportedEncodingException
    {
        String str=result.isSuccess()?"操作成功":"操作失败";
        JOptionPane.showMessageDialog(new Frame(), result.getMessage(),str, JOptionPane.WARNING_MESSAGE);
    }
}
