import net.sf.json.JSONObject;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @author 98267
 */
public class Weather extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("123123");
//        BaseConnection baseConnection=new BaseConnection("ofo");
//        Connection connection=baseConnection.getConnection();
//        try {
//            req.setCharacterEncoding("utf8");
//            String str=req.getParameter("info");
//            JSONObject jsonObject=JSONObject.fromObject(str);
//            String province=jsonObject.getString("province");
//            String city=jsonObject.getString("city");
//            String adcode=jsonObject.getString("adcode");
//            String weather=jsonObject.getString("weather");
//            String temperature=jsonObject.getString("temperature");
//            String windDirection=jsonObject.getString("windDirection");
//            String windPower=jsonObject.getString("windPower");
//            String humidity=jsonObject.getString("humidity");
//            String reportTime=jsonObject.getString("reportTime");
//            String sqlStr="insert into weather (province,city,adcode,weather,temperature,windDirection,windPower,humidity,reportTime) values (\""+province+"\",\""+city+"\",\""+adcode+"\",\""+weather+"\",\""+temperature+"\",\""+windDirection+"\",\""+windPower+"\",\""+humidity+"\",\""+reportTime+"\")";
//            System.out.println(sqlStr);
//            Statement statement=connection.createStatement();
//            statement.execute(sqlStr);
//            statement.close();
//            PrintWriter printWriter=resp.getWriter();
//            printWriter.print("success");
//            printWriter.close();
//        } catch (SQLException e) {
//            e.printStackTrace();
//        } finally {
//            baseConnection.closeConnection();
//        }
    }
}
