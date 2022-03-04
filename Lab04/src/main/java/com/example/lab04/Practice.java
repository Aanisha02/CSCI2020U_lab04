package com.example.lab04;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.geometry.*;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.event.ActionEvent;
import javafx.scene.layout.*;
import javafx.scene.control.Label;
import javafx.scene.text.*;
import javafx.stage.Stage;
import java.time.LocalDate;


public class Practice extends Application {


    @Override
    public void start(Stage s) throws Exception {
        final Separator s1 = new Separator();
        final Separator s2 = new Separator();
        final Separator s3 = new Separator();
        final Separator s4 = new Separator();
        final Separator s5 = new Separator();
        // set title for the stage
        // set title for the stage
        //create a label username
        Label l = new Label(" ");
        Label userName=new Label("Username: ");
        Label l1 = new Label(" ");

        //create a label password
        Label password = new Label("Password: ");
        Label l2 = new Label(" ");

        //create a label full name
        Label fullName = new Label("Full name: ");
        Label l3 = new Label(" ");

        //create a label email
        Label email = new Label("E-mail: ");
        Label l4 = new Label(" ");

        //create a label phone
        Label phone = new Label("Phone #: ");
        Label l5 = new Label(" ");

        //create a label email
        Label DOB = new Label("Date of Birth: ");
        Label l6 = new Label(" ");

        TextField t1=new TextField();
        PasswordField t2=new PasswordField();
        TextField t3=new TextField();
        TextField t4=new TextField();
        //MaskFormatter fmt = new MaskFormatter("###-###-####");
        TextField t5=new TextField();
        DatePicker date = new DatePicker();


        //create a button
        Button btn = new Button("Register");
//action to be performed
        btn.setOnAction(e->System.out.println("Username: "+ t1.getText()
                + "\nPassword: "+t2.getText() + "\nFull name: "+t3.getText()
                + "\nE-mail: "+t4.getText() + "\nPhone #: "+t5.getText()
                + "\nDate of Birth: "+ date.getValue()));
        btn.setOnAction(ActionEvent-> l1.setText(t1.getText()));
        btn.setOnAction(ActionEvent-> l2.setText(t2.getText()));
        btn.setOnAction(ActionEvent-> l3.setText(t3.getText()));
        btn.setOnAction(ActionEvent-> l4.setText(t4.getText()));
        btn.setOnAction(ActionEvent-> l5.setText(t5.getText()));

        //create a grid pane
        GridPane row = new GridPane();
        row.addRow(0, l);
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
//create scene
        Scene sc=new Scene(row,400,300);
//set the scene
        s.setScene(sc);
//set the title
        s.setTitle("Lab 04  Solution");
//display the result
        s.show();

    }

    public static void main(String args[])
    {
        // launch the application
        launch(args);
    }
}
