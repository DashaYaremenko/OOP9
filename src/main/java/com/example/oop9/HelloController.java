package com.example.oop9;

import com.example.oop9.lab4.Main;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.util.List;

public class HelloController {
    @FXML
    private TextField startF;
    @FXML
    private TextField finishF;
    @FXML
    private TextField stepF;
    @FXML
    private Label infL;
    @FXML
    private Label stepL;
    @FXML
    private Label maxL;
    @FXML
    private Label minL;
    @FXML
    private Label sumL;
    @FXML
    private Label arif_sumL;

    public void tabulation(){
        double start=Double.parseDouble(startF.getText());
        double finish=Double.parseDouble(finishF.getText());
        double step=Double.parseDouble(stepF.getText());
        Main main=new Main();
        double[] x = main.madeArrayOfX(start, finish, step);
        double[] y = main.madeArrayOfY(x);
        int maxNum = main.maxElement(y);
        int minNum = main.minElement(y);
        double summed = main.sumElements(y);
        double arifed = main.arifSumElements(y);
        int cS = main.сountSteps(start, finish, step);
        String text="Старт: ("+start+") Фініш: ("+finish+") Кроки: ("+step+")";
        infL.setText(text);
        String steps="Кількість Кроків: "+cS;
        stepL.setText(steps);
        String maxi="Найбільше значення: "+y[maxNum];
        maxL.setText(maxi);
        String mini="Найменьше значення: "+y[minNum];
        minL.setText(mini);
        String sum="Сума: "+summed;
        sumL.setText(sum);
        String arfSum="Середнє арифметичне: "+arifed;
        arif_sumL.setText(arfSum);

    }
}