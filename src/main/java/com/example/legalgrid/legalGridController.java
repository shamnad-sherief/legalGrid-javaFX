package com.example.legalgrid;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import java.sql.Statement;
import java.sql.*;

public class legalGridController {

    private static Statement stmt;

    public static void initializeDB(){


        try {
// Load the JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");
//

            System.out.println("Driver loaded");
// Establish a connection
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/lega_grid", "root", "");
            System.out.println("Database connected");

            // Create a statement
            legalGridController.stmt =connection.createStatement();
        }

        catch (Exception ex) {
            ex.printStackTrace();
        }
    }


    @FXML
    private TextField textField;

    @FXML
    private Label label1;


    @FXML
    private void submitButton() {
        String keyword = textField.getText();


        try {

            String queryString = "SELECT description FROM lega_grid.legalgrid where keyword="+keyword;
            ResultSet rset = stmt.executeQuery(queryString);
            if (rset.next()) {

                String result = rset.getString(1);

// Display result in a label
                label1.setText(result);
            } else {
                label1.setText("Not found");
            }
        }
        catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}
