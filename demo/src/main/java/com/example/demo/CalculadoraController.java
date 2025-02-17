package com.example.demo;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.Button;

public class CalculadoraController {
    @FXML
    private Label display;

    private double num1 = 0;
    private String operacion = "";
    private boolean start = true;

    @FXML
    private void handleButton(javafx.event.ActionEvent event) {
        String value = ((Button) event.getSource()).getText();

        if ("0123456789".contains(value)) {
            if (start) {
                display.setText(value);
                start = false;
            } else {
                display.setText(display.getText() + value);
            }
        } else if (value.equals("C")) {
            display.setText("0");
            num1 = 0;
            operacion = "";
            start = true;
        } else if (value.equals("=")) {
            if (operacion.isEmpty()) return;
            double num2 = Double.parseDouble(display.getText());
            double resultado = calcular(num1, num2, operacion);
            display.setText(String.valueOf(resultado));
            operacion = "";
            start = true;
        } else {
            num1 = Double.parseDouble(display.getText());
            operacion = value;
            start = true;
        }
    }

    private double calcular(double num1, double num2, String operacion) {
        switch (operacion) {
            case "+": return num1 + num2;
            case "-": return num1 - num2;
            case "*": return num1 * num2;
            case "/":
                if (num2 == 0) {
                    display.setText("Error");
                    return 0;
                }
                return num1 / num2;
            default: return 0;
        }
    }
}
