package Java.lab.demo08;

import java.sql.*;

public class PreparedStatementJDBC {
    private static final String url ="jdbc:mysql://localhost:3306/test?user=root&password=123456&serverTimezone=GMT";
    static {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("数据库驱动加载成功！");
        }catch (ClassNotFoundException e){
            System.out.println("数据库驱动加载失败！");
            e.printStackTrace();
        }
    }
    public static void main(String[] args)  {
        String id,name,age;     //student表 字段
        String sql;             //sql语句
        Connection conn = null;
        PreparedStatement ppstat = null;
        ResultSet res = null;
        try{
            conn = DriverManager.getConnection(url);
            System.out.println("数据库连接成功！");
            /*
            对数据库进行操作
             */
            System.out.println("--------查询数据--------");
            sql = "select * from student";
            ppstat = conn.prepareStatement(sql);
            res = ppstat.executeQuery();
            while(res.next()){
                id = res.getString("id");
                name = res.getString("name");
                age = res.getString("age");
                System.out.println("id:"+id+"\tname:"+name+"\tage:"+age);
            }

            System.out.println("--------添加数据--------");
            sql = "insert into student(id,name,age) values(?,?,?)";
            ppstat = conn.prepareStatement(sql);
            ppstat.setInt(1,107);
            ppstat.setString(2,"python");
            ppstat.setInt(3,20);
            int i = ppstat.executeUpdate();
            System.out.println("成功添加"+i+"行");
            res = ppstat.executeQuery("select id,name,age from student where id = 107");
            while(res.next()){
                id = res.getString("id");
                name = res.getString("name");
                age = res.getString("age");
                System.out.println("id:"+id+"\tname:"+name+"\tage:"+age);
            }

            System.out.println("--------更新数据--------");
            sql = "update student set name = ? where id = 103";
            ppstat = conn.prepareStatement(sql);
            ppstat.setString(1,"java");
            i = ppstat.executeUpdate();
            System.out.println("成功更新"+i+"行");
            res = ppstat.executeQuery("select id,name,age from student where id = 106");
            while(res.next()){
                id = res.getString("id");
                name = res.getString("name");
                age = res.getString("age");
                System.out.println("id:"+id+"\tname:"+name+"\tage:"+age);
            }

            System.out.println("--------删除数据--------");
            sql = "delete from student where id = ?";
            ppstat = conn.prepareStatement(sql);
            ppstat.setInt(1,107);
            i = ppstat.executeUpdate();
            System.out.println("成功删除"+i+"行");
//            res = ppstat.executeQuery("select * from student");
//            while (res.next()){
//                id = res.getString("id");
//                name = res.getString("name");
//                age = res.getString("age");
//                System.out.println("id:"+id+"\tname:"+name+"\tage:"+age);
//            }
        }catch (SQLException e){
            e.printStackTrace();
        }finally {
            try {
                if (res != null)
                    res.close();
                if (ppstat != null)
                    ppstat.close();
                if (conn != null)
                    conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

    }
}
