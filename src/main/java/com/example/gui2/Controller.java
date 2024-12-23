package com.example.gui2;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.image.Image;

public class Controller {

    // Label to display the result of the coin flip (Win/Lose)
    @FXML
    private Label Outcome;

    // ImageView to display the current side of the coin
    @FXML
    private ImageView CoinImage;

    // Labels to display the counts for wins and losses
    @FXML
    private Label WinsCount;
    @FXML
    private Label LossesCount;

    // Images representing the heads and tails sides of the coin
    Image Heads = new Image(getClass().getResourceAsStream("Heads.jpg"));
    Image Tails = new Image(getClass().getResourceAsStream("Tails.jpg"));

    // Variables to store the outcome of the coin flip and counts for wins and losses
    int outCome;
    int wins = 0;
    String strWins = "0";
    int losses = 0;
    String strLosses = "0";

    @FXML
    protected void onHeadsButtonClick() {
        // Simulate a coin flip
        flip();

        // Check if the outcome is heads
        if (outCome == 0) {
            // Update the outcome label to show a win
            Outcome.setText("You Win!");

            // Increment the win count and update the label
            wins++;
            strWins = "" + wins;
            WinsCount.setText(strWins);
        } else {
            // Update the outcome label to show a loss
            Outcome.setText("You Lose!");

            // Increment the loss count and update the label
            losses++;
            strLosses = "" + losses;
            LossesCount.setText(strLosses);
        }
    }

    @FXML
    protected void onTailsButtonClick() {
        // Simulate a coin flip
        flip();

        // Check if the outcome is tails
        if (outCome == 1) {
            // Update the outcome label to show a win
            Outcome.setText("You Win!");

            // Increment the win count and update the label
            wins++;
            strWins = "" + wins;
            WinsCount.setText(strWins);
        } else {
            // Update the outcome label to show a loss
            Outcome.setText("You Lose!");

            // Increment the loss count and update the label
            losses++;
            strLosses = "" + losses;
            LossesCount.setText(strLosses);
        }
    }

    private void flip() {
        // Generate a random number to determine the outcome
        int random = (int) (Math.random() * 2);

        // Check if the random number is less than 1 (heads) or 1 (tails)
        if (random < 1) {
            // Set the outcome to heads and update the coin image
            outCome = 0;
            CoinImage.setImage(Heads);
        } else {
            // Set the outcome to tails and update the coin image
            outCome = 1;
            CoinImage.setImage(Tails);
        }
    }
}
