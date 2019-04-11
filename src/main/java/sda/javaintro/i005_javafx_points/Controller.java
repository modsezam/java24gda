package sda.javaintro.i005_javafx_points;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class  Controller {

    public Label label1;
    public TextField textField1;
    public TextArea textArea1;

    private String copyText;

    public void pressButton(ActionEvent event){
        //System.out.println("TEST");
        copyText =  textField1.getText();


        System.out.println(copyText);

        label1.setText(copyText);
        textArea1.setText("TEST");
    }




}
