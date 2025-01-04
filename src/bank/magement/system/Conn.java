package bank.magement.system;

import java.sql.*;
import javax.swing.*;

public class Conn {

    Connection c;
    Statement s;

    public Conn() {
        try {
            c = DriverManager.getConnection(
                    "jdbc:mysql://walkershive.com/walkers1_test",
                    "walkers1_apply_group_usr",
                    "NepaL1234%");
            s = c.createStatement();
        } catch (Exception e) {
            e.printStackTrace(); // Print the full error for debugging
        }
    }
}
