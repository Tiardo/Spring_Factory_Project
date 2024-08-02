package DBControl;
import DBControl.SqLite.Connect;

import java.sql.SQLException;

public class DatabaseProcessor {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Connect.Conn();
        Connect.CreateDB();
        Connect.WriteDB();
        Connect.ReadDB();
        Connect.CloseDB();
    }
}