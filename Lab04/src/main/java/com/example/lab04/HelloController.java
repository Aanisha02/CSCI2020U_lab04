package com.example.lab04;

import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
        Label userName=new Label("Username: ");
        Label l1 = new Label(" ");

        //create password label
        Label password = new Label("Password: ");
        Label l2 = new Label(" ");

        //create full name label
        Label fullName = new Label("Full name: ");
        Label l3 = new Label(" ");

        //create email label
        Label email = new Label("E-mail: ");
        Label l4 = new Label(" ");

        //create phone label
        Label phone = new Label("Phone #: ");
        Label l5 = new Label(" ");

        //create DOB label
        Label DOB = new Label("Date of Birth: ");
        Label l6 = new Label(" ");

        //create textfields and user inputs
        TextField t1 = new TextField();
        PasswordField t2 = new PasswordField();
        TextField t3 = new TextField();
        TextField t4 = new TextField();
        //MaskFormatter fmt = new MaskFormatter("###-###-####");
        TextField t5 = new TextField();
        DatePicker date = new DatePicker();

        //add separators
        final Separator s1 = new Separator();
        final Separator s2 = new Separator();
        final Separator s3 = new Separator();
        final Separator s4 = new Separator();
        final Separator s5 = new Separator();

        //create a button
        Button btn = new Button("Register");

        btn.setOnAction(ActionEvent-> l1.setText(t1.getText()) );
        btn.setOnAction(ActionEvent-> l2.setText(t2.getText()));
        btn.setOnAction(ActionEvent-> l3.setText(t3.getText()));
        btn.setOnAction(ActionEvent-> l4.setText(t4.getText()));
        btn.setOnAction(ActionEvent-> l5.setText(t5.getText()));


        //create a grid pane
        GridPane row = new GridPane();
        row.addRow(1, userName, t1, l1);
        row.addRow(2,s1);
        row.addRow(3, password, t2, l2);
        row.addRow(4,s2 );
        row.addRow(5, fullName, t3, l3);
        row.addRow(6, s3 );
        row.addRow(7, email, t4, l4);
        row.addRow(8,s4 );
        row.addRow(9, phone, t5, l5);
        row.addRow(10,s5 );
        row.addRow(11, DOB, date);
        row.addRow(12 );
        row.addRow(13, btn);

    }
}