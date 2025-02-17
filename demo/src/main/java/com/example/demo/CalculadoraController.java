package com.example.demo;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.event.ActionEvent;

public class CalculadoraController {
    @FXML
    private Label display;

    private double num1 = 0;
    private String operacion = "";
    private boolean start = true;
    private double memoria = 0;

    @FXML
    private void handleButton(ActionEvent event) {
        String value = ((Button) event.getSource()).getText();

        if ("0123456789".contains(value)) {
            if (start || display.getText().equals("0")) {
                display.setText(value);
                start = false;
            } else {
                display.setText(display.getText() + value);
            }
        } else if (value.equals("C")) {
            handleClear();
        } else if (value.equals("=")) {
            handleEqual(event);
        } else {
            num1 = Double.parseDouble(display.getText());
            operacion = value;
            start = true;
        }
    }

    @FXML
    private void handleMemoryAdd(ActionEvent event) {
        memoria += Double.parseDouble(display.getText());
    }

    @FXML
    private void handleMemoryClear(ActionEvent event) {
        memoria = 0;
    }

    @FXML
    private void handleMemoryRecall(ActionEvent event) {
        display.setText(String.valueOf(memoria));
        start = false;
    }

    @FXML
    private void handleChangeSign(ActionEvent event) {
        if (!display.getText().isEmpty() && !display.getText().equals("0")) {
            double valor = Double.parseDouble(display.getText());
            display.setText(String.valueOf(valor * -1));
        }
    }

    @FXML
    private void handleDecimal(ActionEvent event) {
        if (!display.getText().contains(".")) {
            display.setText(display.getText() + ".");
        }
    }

    @FXML
    private void handleDelete(ActionEvent event) {
        String text = display.getText();
        if (text.length() > 1) {
            display.setText(text.substring(0, text.length() - 1));
        } else {
            display.setText("0");
            start = true;
        }
    }

    @FXML
    private void handleClear() {
        display.setText("0");
        num1 = 0;
        operacion = "";
        start = true;
    }

    @FXML
    private void handleEqual(ActionEvent event) {
        if (operacion.isEmpty()) return;
        double num2 = Double.parseDouble(display.getText());
        double resultado = calcular(num1, num2, operacion);
        display.setText(String.valueOf(resultado));
        operacion = "";
        start = true;
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
