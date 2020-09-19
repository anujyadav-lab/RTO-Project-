/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package licensetest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 *
 * @author aaaaaaaa
 */


public class ConClass {
Statement st;
    public Statement GiveCon()
{
    try
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/RTODB","root","manager");
            st=con.createStatement();
            
        }catch(Exception ex){ex.printStackTrace();}
    return st;
}
}
