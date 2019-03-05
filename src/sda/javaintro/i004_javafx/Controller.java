package sda.javaintro.i004_javafx;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TextField;

public class  Controller {

    public Label label1;
    public TextField textField1;
    public TableColumn tableColumn1;


    public void pressButton(ActionEvent event){
        //System.out.println("TEST");
        String copy = textField1.getText();
        System.out.println(copy);
        label1.setText(copy);
    }




}
