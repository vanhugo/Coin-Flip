package com.example.gui2;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.image.Image;


public class Controller {
    @FXML
    private Label Outcome;
    @FXML
    private ImageView CoinImage;
    Image Heads = new Image(getClass().getResourceAsStream("Heads.jpg"));
    Image Tails = new Image(getClass().getResourceAsStream("Tails.jpg"));
    int outCome;
    int wins = 0;
    String strWins = "0";
    int losses = 0;
    String strLosses = "0";
    @FXML
    private Label WinsCount;
    @FXML
    private Label LossesCount;

    @FXML
    protected void onHeadsButtonClick() {
        flip();
        if (outCome == 0) {
            Outcome.setText("You Win!");
            wins++;
            strWins = "" + wins;
            WinsCount.setText(strWins);
        } else {
            Outcome.setText("You Lose!");
            losses++;
            strLosses = "" + losses;
            LossesCount.setText(strLosses);
        }
    }
    @FXML
    protected void onTailsButtonClick() {
        flip();
        if (outCome == 1) {
            Outcome.setText("You Win!");
            wins++;
            strWins = "" + wins;
            WinsCount.setText(strWins);
        }
        else {
            Outcome.setText("You Lose!");
            losses++;
            strLosses = "" + losses;
            LossesCount.setText(strLosses);
        }
    }
    private void flip() {
        int random = (int) (Math.random() * 2);
        if (random < 1) {
            outCome = 0;
            CoinImage.setImage(Heads);
        }
        else {
            outCome = 1;
            CoinImage.setImage(Tails);
        }
    }
}