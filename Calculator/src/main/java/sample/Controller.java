package sample;


import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    @FXML
    private JFXTextField display;
    double n1, n2;
    int symbol;
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        n1 = n2 = 0;
        symbol = 0;

    }
    public void onDigit(javafx.event.ActionEvent e) {
        String s =((JFXButton)e.getSource()).getText();
        display.setText(display.getText()+s);
    }

    public void onMultiply(ActionEvent actionEvent) {
        n1 = Double.parseDouble(display.getText());
        display.setText("");
        symbol = 2;
    }

    public void onAdd(ActionEvent actionEvent) {
        n1 = Double.parseDouble(display.getText());
        display.setText("");
        symbol = 1;
    }

    public void onSubtract(ActionEvent actionEvent) {
        n1 = Double.parseDouble(display.getText());
        display.setText("");
        symbol = 3;
    }

    public void onDecimal(ActionEvent e) {
        String s =((JFXButton)e.getSource()).getText();
        display.setText(display.getText()+s);
    }

    public void onClear(ActionEvent actionEvent) {
        display.setText("");
    }

    public void onPercentage(ActionEvent actionEvent) {
        n1 = Double.parseDouble(display.getText());
        display.setText("");
        symbol = 4;
    }

    public void onBackspace(ActionEvent actionEvent) {
        display.setText(display.getText().substring(0,(display.getText().length()-1)));
    }

    public void onDivide(ActionEvent actionEvent) {
        n1 = Double.parseDouble(display.getText());
        display.setText("");
        symbol = 5;
    }
    public void onRemainder(ActionEvent actionEvent) {
        n1 = Double.parseDouble(display.getText());
        display.setText("");
        symbol = 6;
    }

    public void onEquals(ActionEvent actionEvent) {
        n2 = Double.parseDouble(display.getText());
        if (symbol == 1) {
            display.setText(Double.toString(n2 + n1));
        } else if (symbol == 3) {
            display.setText(Double.toString(n1 - n2));
        } else if (symbol == 2) {
            display.setText(Double.toString(n1 * n2));
        } else if (symbol == 5) {
            display.setText(Double.toString((double)(n1 / n2)));
        }else if (symbol == 4) {
            display.setText(Double.toString(((n1 / n2)*100)));
        }
        else if (symbol == 6) {
            display.setText(Double.toString(n1 % n2));
        }
    }


}
