package Java.lab.demo08;
/*
基于Statement的JDBC的数据库访问程序--增删改查
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;

public class StatemenJDBC {
    static Connection con ;
    static Statement stat ;
    static ResultSet res;
    public Connection getConnection(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("数据库驱动加载成功！");
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }
        String url ="jdbc:mysql://localhost:3306/test?user=root&password=123456&serverTimezone=GMT";
        try{
            con = DriverManager.getConnection(url);
            System.out.println("数据库连接成功！");
        }catch (SQLException e){
            e.printStackTrace();
        }
        return con;
    }
    public static void main(String[] args) {
        StatemenJDBC jdbc = new StatemenJDBC();
        jdbc.getConnection();
        String id,name,age;     //student表 字段
        try{
            stat = con.createStatement();
            System.out.println("--------查询数据--------");
            res = stat.executeQuery("SELECT * FROM student");
            while (res.next()){
                id = res.getString("id");
                name = res.getString("name");
                age = res.getString("age");
                System.out.println("id:"+id+"\tname:"+name+"\tage:"+age);
            }
            System.out.println("--------添加数据--------");
            String sql = "insert into student(id,name,age) values(109,'hdoop',20)";
            int i = stat.executeUpdate(sql);
            System.out.println("成功添加"+i+"行");
            res = stat.executeQuery("select id,name,age from student where id = 109;");
            while (res.next()){
                id = res.getString("id");
                name = res.getString("name");
                age = res.getString("age");
                System.out.println("id:"+id+"\tname:"+name+"\tage:"+age);
            }

            System.out.println("--------删除数据--------");
            sql = "delete from student where id = 109";
            i = stat.executeUpdate(sql);
            System.out.println("成功删除"+i+"行");
            res = stat.executeQuery("SELECT * FROM student");
            while (res.next()){
                id = res.getString("id");
                name = res.getString("name");
                age = res.getString("age");
                System.out.println("id:"+id+"\tname:"+name+"\tage:"+age);
            }
            System.out.println("--------修改数据--------");
            sql = "update student set age = 16 where id = 106";
            i = stat.executeUpdate(sql);
            System.out.println("成功修改"+i+"行");
            res = stat.executeQuery("select id,name,age from student where id = 106;");
            while (res.next()){
                id = res.getString("id");
                name = res.getString("name");
                age = res.getString("age");
                System.out.println("id:"+id+"\tname:"+name+"\tage:"+age);
            }
        }catch (SQLException e){
            e.printStackTrace();
        }finally {
            try{
                if (res != null)
                    res.close();
                if (stat != null)
                    stat.close();
                if (con != null)
                    con.close();
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}
