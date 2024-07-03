import java.sql.*;
import javax.swing.*;
public class test {
    public static void main(String[] args) {
        String n="samar";
        String emString="samar123@gmail.com";
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url="jdbc:mysql://localhost:3306/helpdesk";
            String user="root";
            String Password="Samarenter@12";
            Connection con=DriverManager.getConnection(url, user, Password);
    
            String query = "update user set  answer=? where Emailid=? ;";
            PreparedStatement st = con.prepareStatement(query);
            st.setString(1,"by using jtextarea");
            st.setString(2,"samar123@gmail.com");
    
            st.executeUpdate();
    
            JOptionPane.showMessageDialog(null, "DONE", "DONE",JOptionPane.OK_OPTION);
            con.close();
            }catch (Exception e){
                JOptionPane.showMessageDialog(null, e, "error",JOptionPane.OK_OPTION);
            }
    }
}
