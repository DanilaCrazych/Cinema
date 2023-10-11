package com.example.cinema1;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.skin.ChoiceBoxSkin;

public class HelloController {
    boolean status = true;

    int[] mesta = new int[]{
            0, 0, 0, 0, 0,
            0, 0, 0, 0, 0,
            0, 0, 0, 0, 0, 0
    };

    String[] fio = new String[15];

    @FXML
    private Label welcomeText, Push, Status;

    @FXML
    private TextField TextFio;


    @FXML
    private Button m11, m12, m13, m14, m15, m21, m22, m23, m24, m25, m31, m32, m33, m34, m35, Bron, Debron;

    @FXML
    public void DeBron() {
        status = false;
        Status.setText("Статус: дебронирование");

    }

    @FXML
    public void Bron() {
        status = true;
        Status.setText("Статус: бронирование");
    }

    @FXML
    protected void Mm11() {
        if (status == true) {
            if (mesta[0] == 0) {

                fio[0] = TextFio.getText();
                if (TextFio.getText().equals("")) {
                    Push.setText("Введите фио!");
                } else {
                    mesta[0] = 1;
                    m11.setStyle("-fx-background-color: #c92727;");
                    m11.setText("Занято");
                    Push.setText("Место забронированно: " + fio[0]);
                }
            } else {
                Push.setText("Место занято!: " + fio[0]);
            }
        } else {
            if (mesta[0] == 1) {
                mesta[0] = 0;
                m11.setStyle("-fx-background-color: #008000;");
                m11.setText("Свободно");
                Push.setText("Бронь отменена!");
            } else {
                Push.setText("Место свободно!");
            }
        }
        TextFio.clear();
    }

    @FXML
    protected void Mm12() {
        if (status == true) {
            if (mesta[1] == 0) {

                fio[1] = TextFio.getText();
                if (TextFio.getText().equals("")) {
                    Push.setText("Введите фио!");
                } else {
                    mesta[1] = 1;
                    m12.setStyle("-fx-background-color: #c92727;");
                    m12.setText("Занято");
                    Push.setText("Место забронированно: " + fio[1]);
                }
            } else {
                Push.setText("Место занято!: " + fio[1]);
            }
        } else {
            if (mesta[1] == 1) {
                mesta[1] = 0;
                m12.setStyle("-fx-background-color: #008000;");
                m12.setText("Свободно");
                Push.setText("Бронь отменена!");
            } else {
                Push.setText("Место свободно!");
            }
        }
        TextFio.clear();
    }

    @FXML
    protected void Mm13() {
        if (status == true) {
            if (mesta[2] == 0) {
                fio[2] = TextFio.getText();
                if (TextFio.getText().equals("")) {
                    Push.setText("Введите фио!");
                } else {
                    mesta[2] = 1;
                    m13.setStyle("-fx-background-color: #c92727;");
                    m13.setText("Занято");
                    Push.setText("Место забронированно: " + fio[2]);
                }
            } else {
                Push.setText("Место занято!: " + fio[2]);
            }
        } else {
            if (mesta[2] == 1) {
                mesta[2] = 0;
                m13.setStyle("-fx-background-color: #008000;");
                m13.setText("Свободно");
                Push.setText("Бронь отменена!");
            } else {
                Push.setText("Место Свободно!");
            }
        }
    }

    @FXML
    protected void Mm14() {
        if (status == true) {
            if (mesta[3] == 0) {

                if (TextFio.getText().equals("")) {
                    Push.setText("Введите фио!");
                } else {
                    mesta[3] = 1;
                    fio[3] = TextFio.getText();
                    m14.setStyle("-fx-background-color: #c92727;");
                    m14.setText("Занято");
                    Push.setText("Место забронированно: " + fio[3]);
                }
            } else {
                Push.setText("Место занято!: " + fio[3]);
            }
        } else {
            if (mesta[3] == 1) {
                mesta[3] = 0;
                m14.setStyle("-fx-background-color: #008000;");
                m14.setText("Свободно");
                Push.setText("Бронь отменена!");
            } else {
                Push.setText("Место свободно!");
            }
        }
    }

    @FXML
    protected void Mm15() {
        if (status == true) {
            if (mesta[4] == 0) {
                if (TextFio.getText().equals("")) {
                } else {
                    mesta[4] = 1;
                    fio[4] = TextFio.getText();
                    m15.setStyle("-fx-background-color: #c92727;");
                    m15.setText("Занято");
                    Push.setText("Место забронированно: " + fio[4]);
                }
            } else {
                Push.setText("Место занято!: " + fio[4]);
            }
        } else {
            if (mesta[4] == 1) {
                mesta[4] = 0;
                m15.setStyle("-fx-background-color: #008000;");
                m15.setText("Свободно");
                Push.setText("Бронь отменена!");
            } else {
                Push.setText("Место свободно!");
            }
        }
    }

    @FXML
    protected void Mm21() {
        if (status == true) {
            if (mesta[5] == 0) {

                if (TextFio.getText().equals("")) {
                    Push.setText("Введите фио!");
                } else {
                    mesta[5] = 1;
                    fio[5] = TextFio.getText();
                    m21.setStyle("-fx-background-color: #c92727;");
                    m21.setText("Занято");
                    Push.setText("Место забронированно: " + fio[5]);
                }
            } else {
                Push.setText("Место занято!: " + fio[5]);
            }
        } else {
            if (mesta[5] == 1) {
                mesta[5] = 0;
                m21.setStyle("-fx-background-color: #008000;");
                m21.setText("Свободно");
                Push.setText("Бронь отменена!");
            } else {
                Push.setText("Место свободно!");
            }
        }
    }

    @FXML
    protected void Mm22() {
        if (status == true) {
            if (mesta[6] == 0) {

                if (TextFio.getText().equals("")) {
                    Push.setText("Введите фио!");
                } else {
                    mesta[6] = 1;
                    fio[6] = TextFio.getText();
                    m22.setStyle("-fx-background-color: #c92727;");
                    m22.setText("Занято");
                    Push.setText("Место забронированно: " + fio[6]);
                }
            } else {
                Push.setText("Место занято!: " + fio[6]);
            }
        } else {
            if (mesta[6] == 1) {
                mesta[6] = 0;
                m22.setStyle("-fx-background-color: #008000;");
                m22.setText("Свободно");
                Push.setText("Бронь отменена!");
            } else {
                Push.setText("Место свободно!");
            }
        }
    }

    @FXML
    protected void Mm23() {
        if (status == true) {
            if (mesta[7] == 0) {

                if (TextFio.getText().equals("")) {
                    Push.setText("Введите фио!");
                } else {
                    mesta[7] = 1;
                    fio[7] = TextFio.getText();
                    m23.setStyle("-fx-background-color: #c92727;");
                    m23.setText("Занято");
                    Push.setText("Место забронированно: " + fio[7]);
                }
            } else {
                Push.setText("Место занято!: " + fio[7]);
            }
        } else {
            if (mesta[7] == 1) {

                if (TextFio.getText().equals("")) {
                    Push.setText("Введите фио!");
                } else {
                    mesta[7] = 0;
                    m23.setStyle("-fx-background-color: #008000;");
                    m23.setText("Свободно");
                    Push.setText("Бронь отменена!");
                }
            } else {
                Push.setText("Место свободно!");
            }
        }
    }

    @FXML
    protected void Mm24() {
        if (status == true) {
            if (mesta[8] == 0) {

                if (TextFio.getText().equals("")) {
                    Push.setText("Введите фио!");
                } else {
                    mesta[8] = 1;
                    fio[8] = TextFio.getText();
                    m24.setStyle("-fx-background-color: #c92727;");
                    m24.setText("Занято");
                    Push.setText("Место забронированно: " + fio[8]);
                }
            } else {
                Push.setText("Место занято!: " + fio[8]);
            }
        } else {
            if (mesta[8] == 1) {
                mesta[8] = 0;
                m24.setStyle("-fx-background-color: #008000;");
                m24.setText("Свободно");
                Push.setText("Бронь отменена!");
            } else {
                Push.setText("Место свободно!");
            }
        }
    }

    @FXML
    protected void Mm25() {
        if (status == true) {
            if (mesta[9] == 0) {

                if (TextFio.getText().equals("")) {
                } else {
                    mesta[9] = 1;
                    fio[9] = TextFio.getText();
                    m25.setStyle("-fx-background-color: #c92727;");
                    m25.setText("Занято");
                    Push.setText("Место забронированно: " + fio[9]);
                }
            } else {
                Push.setText("Место занято!: " + fio[9]);
            }
        } else {
            if (mesta[9] == 1) {
                mesta[9] = 0;
                m25.setStyle("-fx-background-color: #008000;");
                m25.setText("Свободно");
                Push.setText("Бронь отменена!");
            } else {
                Push.setText("Место свободно!");
            }
        }
    }

    @FXML
    protected void Mm31() {
        if (status == true) {
            if (mesta[10] == 0) {

                if (TextFio.getText().equals("")) {
                    Push.setText("Введите фио!");
                } else {
                    mesta[10] = 1;
                    fio[10] = TextFio.getText();
                    m31.setStyle("-fx-background-color: #c92727;");
                    m31.setText("Занято");
                    Push.setText("Место забронированно: " + fio[10]);
                }
            } else {
                Push.setText("Место занято!: " + fio[10]);
            }
        } else {
            if (mesta[10] == 1) {
                mesta[10] = 0;
                m31.setStyle("-fx-background-color: #008000;");
                m31.setText("Свободно");
                Push.setText("Бронь отменена!");
            } else {
                Push.setText("Место свободно!");
            }
        }
    }

    @FXML
    protected void Mm32() {
        if (status == true) {
            if (mesta[11] == 0) {
                if (TextFio.getText().equals("")) {
                    Push.setText("Введите фио!");
                } else {
                    mesta[11] = 1;
                    fio[11] = TextFio.getText();
                    m32.setStyle("-fx-background-color: #c92727;");
                    m32.setText("Занято");
                    Push.setText("Место забронированно: " + fio[11]);
                }
            } else {
                Push.setText("Место занято!: " + fio[11]);
            }
        } else {
            if (mesta[11] == 1) {
                mesta[11] = 0;
                m32.setStyle("-fx-background-color: #008000;");
                m32.setText("Свободно");
                Push.setText("Бронь отменена!");
            } else {
                Push.setText("Место свободно!");
            }
        }
    }

    @FXML
    protected void Mm33() {
        if (status == true) {
            if (mesta[12] == 0) {

                if (TextFio.getText().equals("")) {
                    Push.setText("Введите фио!");
                } else {
                    mesta[12] = 1;
                    fio[12] = TextFio.getText();
                    m33.setStyle("-fx-background-color: #c92727;");
                    m33.setText("Занято");
                    Push.setText("Место забронированно: " + fio[12]);
                }
            } else {
                Push.setText("Место занято!: " + fio[12]);
            }
        } else {
            if (mesta[12] == 1) {
                mesta[12] = 0;
                m33.setStyle("-fx-background-color: #008000;");
                m33.setText("Свободно");
                Push.setText("Бронь отменена!");
            } else {
                Push.setText("Место свободно!");
            }
        }
    }

    @FXML
    protected void Mm34() {
        if (status == true) {
            if (mesta[13] == 0) {

                if (TextFio.getText().equals("")) {
                    Push.setText("Введите фио!");
                } else {
                    mesta[13] = 1;
                    fio[13] = TextFio.getText();
                    m34.setStyle("-fx-background-color: #c92727;");
                    m34.setText("Занято");
                    Push.setText("Место забронированно: " + fio[13]);
                }
            } else {
                Push.setText("Место занято!: " + fio[13]);
            }
        } else {
            if (mesta[13] == 1) {
                mesta[13] = 0;
                m34.setStyle("-fx-background-color: #008000;");
                m34.setText("Свободно");
                Push.setText("Бронь отменена!");
            } else {
                Push.setText("Место свободно!");
            }
        }
    }

    @FXML
    protected void Mm35() {
        if (status == true) {
            if (mesta[14] == 0) {

                if (TextFio.getText().equals("")) {
                    Push.setText("Введите фио!");
                } else {
                    mesta[14] = 1;
                    fio[14] = TextFio.getText();
                    m35.setStyle("-fx-background-color: #c92727;");
                    m35.setText("Занято");
                    Push.setText("Место забронированно: " + fio[14]);
                }
            } else {
                Push.setText("Место занято!: " + fio[14]);
            }
        } else {
            if (mesta[14] == 1) {
                mesta[14] = 0;
                m35.setStyle("-fx-background-color: #008000;");
                m35.setText("Свободно");
                Push.setText("Бронь отменена!");
            } else {
                Push.setText("Место свободно!");
            }
        }
    }
}