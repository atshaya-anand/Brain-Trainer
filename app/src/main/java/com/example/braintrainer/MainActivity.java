package com.example.braintrainer;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.GridLayout;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
//Declarations of necessary fields
    Button goButton;
    CountDownTimer cT1;
    CountDownTimer cT2;
    CountDownTimer cT3;
    ArrayList<Integer> answers = new ArrayList<Integer>();
    int locationOfCorrectAnswer;
    int level = 1;
    TextView resultTextView;
    int score = 0;
    int highScore = 0;
    int wrongAttempt = 0;
    int numberOfQuestions = 0;
    TextView scoreTextView;
    TextView sTextView;
    Button button0;
    Button button1;
    Button button2;
    Button button3;
    TextView sumTextView;
    TextView hsTextView;
    TextView timerTextView;
    Button playAgainButton;
    ConstraintLayout gameLayout;
    Button playNextLevelButton;
    Button playFinalLevelButton;

//Function for playing first level
    public void playAgain(View view) {
        wrongAttempt = 0;
        timerTextView.setVisibility(View.VISIBLE);
        sumTextView.setVisibility(View.VISIBLE);
        scoreTextView.setVisibility(View.VISIBLE);
        button0.setVisibility(View.VISIBLE);
        button1.setVisibility(View.VISIBLE);
        button2.setVisibility(View.VISIBLE);
        button3.setVisibility(View.VISIBLE);
        resultTextView.setVisibility(View.VISIBLE);
        score = 0;
        numberOfQuestions = 0;
        timerTextView.setText("30s");
        scoreTextView.setText(Integer.toString(score));
        newQuestion();
        playAgainButton.setVisibility(View.INVISIBLE);
        playNextLevelButton.setVisibility(View.INVISIBLE);
        playFinalLevelButton.setVisibility(View.INVISIBLE);
        sTextView.setVisibility(View.INVISIBLE);
        hsTextView.setVisibility(View.INVISIBLE);
        resultTextView.setText("");

        cT1 = new CountDownTimer(30100,1000) {

            @Override
            public void onTick(long l) {
                timerTextView.setText(String.valueOf(l / 1000) + "s");
            }

            @Override
            public void onFinish() {
                highScore = 20;
                timerTextView.setVisibility(View.INVISIBLE);
                sumTextView.setVisibility(View.INVISIBLE);
                scoreTextView.setVisibility(View.INVISIBLE);
                button0.setVisibility(View.INVISIBLE);
                button1.setVisibility(View.INVISIBLE);
                button2.setVisibility(View.INVISIBLE);
                button3.setVisibility(View.INVISIBLE);
                resultTextView.setVisibility(View.INVISIBLE);
                if(score < highScore) {
                    level = 1;
                    hsTextView.setVisibility(View.VISIBLE);
                    sTextView.setVisibility(View.VISIBLE);
                    sTextView.setText("Your Score is: " + Integer.toString(score));
                    hsTextView.setText("Minimum Score to reach next level: " + Integer.toString(highScore));
                    playAgainButton.setVisibility(View.VISIBLE);
                }else if(score >= highScore){
                    level = 2;
                    hsTextView.setVisibility(View.VISIBLE);
                    sTextView.setVisibility(View.VISIBLE);
                    sTextView.setText("Your Score is: " + Integer.toString(score));
                    hsTextView.setText("Yay! You have reached the next level");
                    playNextLevelButton.setVisibility(View.VISIBLE);
                }
            }
        }.start();
    }
//Function for playing the 2nd level
    public void playNext(View view) {
        wrongAttempt = 0;
        timerTextView.setVisibility(View.VISIBLE);
        sumTextView.setVisibility(View.VISIBLE);
        scoreTextView.setVisibility(View.VISIBLE);
        button0.setVisibility(View.VISIBLE);
        button1.setVisibility(View.VISIBLE);
        button2.setVisibility(View.VISIBLE);
        button3.setVisibility(View.VISIBLE);
        resultTextView.setVisibility(View.VISIBLE);
        score = 0;
        numberOfQuestions = 0;
        timerTextView.setText("30s");
        scoreTextView.setText(Integer.toString(score));
        newQuestion();
        playAgainButton.setVisibility(View.INVISIBLE);
        playNextLevelButton.setVisibility(View.INVISIBLE);
        playFinalLevelButton.setVisibility(View.INVISIBLE);
        sTextView.setVisibility(View.INVISIBLE);
        hsTextView.setVisibility(View.INVISIBLE);
        resultTextView.setText("");

        cT2 = new CountDownTimer(30100,1000) {

            @Override
            public void onTick(long l) {
                timerTextView.setText(String.valueOf(l / 1000) + "s");
            }

            @Override
            public void onFinish() {
                highScore = 28;
                timerTextView.setVisibility(View.INVISIBLE);
                sumTextView.setVisibility(View.INVISIBLE);
                scoreTextView.setVisibility(View.INVISIBLE);
                button0.setVisibility(View.INVISIBLE);
                button1.setVisibility(View.INVISIBLE);
                button2.setVisibility(View.INVISIBLE);
                button3.setVisibility(View.INVISIBLE);
                resultTextView.setVisibility(View.INVISIBLE);
                if(score < highScore) {
                    level = 2;
                    hsTextView.setVisibility(View.VISIBLE);
                    sTextView.setVisibility(View.VISIBLE);
                    sTextView.setText("Your Score is: " + Integer.toString(score));
                    hsTextView.setText("Minimum Score to reach next level: " + Integer.toString(highScore));
                    playNextLevelButton.setVisibility(View.VISIBLE);
                }else if(score >= highScore){
                    level = 3;
                    hsTextView.setVisibility(View.VISIBLE);
                    sTextView.setVisibility(View.VISIBLE);
                    sTextView.setText("Your Score is: " + Integer.toString(score));
                    hsTextView.setText("Yay! You have reached the next level");
                    playFinalLevelButton.setVisibility(View.VISIBLE);
                }
            }
        }.start();
    }

    //Function for playing the final level
    public void playFinal(View view) {
        wrongAttempt = 0;
        timerTextView.setVisibility(View.VISIBLE);
        sumTextView.setVisibility(View.VISIBLE);
        scoreTextView.setVisibility(View.VISIBLE);
        button0.setVisibility(View.VISIBLE);
        button1.setVisibility(View.VISIBLE);
        button2.setVisibility(View.VISIBLE);
        button3.setVisibility(View.VISIBLE);
        resultTextView.setVisibility(View.VISIBLE);
        score = 0;
        numberOfQuestions = 0;
        timerTextView.setText("30s");
        scoreTextView.setText(Integer.toString(score));
        newQuestion();
        playAgainButton.setVisibility(View.INVISIBLE);
        playNextLevelButton.setVisibility(View.INVISIBLE);
        playFinalLevelButton.setVisibility(View.INVISIBLE);
        sTextView.setVisibility(View.INVISIBLE);
        hsTextView.setVisibility(View.INVISIBLE);
        resultTextView.setText("");

        cT3 = new CountDownTimer(30100,1000) {

            @Override
            public void onTick(long l) {
                timerTextView.setText(String.valueOf(l / 1000) + "s");
            }

            @Override
            public void onFinish() {
                highScore = 35;
                timerTextView.setVisibility(View.INVISIBLE);
                sumTextView.setVisibility(View.INVISIBLE);
                scoreTextView.setVisibility(View.INVISIBLE);
                button0.setVisibility(View.INVISIBLE);
                button1.setVisibility(View.INVISIBLE);
                button2.setVisibility(View.INVISIBLE);
                button3.setVisibility(View.INVISIBLE);
                resultTextView.setVisibility(View.INVISIBLE);
                if(score < highScore) {
                    level = 3;
                    hsTextView.setVisibility(View.VISIBLE);
                    sTextView.setVisibility(View.VISIBLE);
                    sTextView.setText("Your Score is: " + Integer.toString(score));
                    hsTextView.setText("Minimum Score to Win: " + Integer.toString(highScore));
                    playFinalLevelButton.setVisibility(View.VISIBLE);
                }else if(score >= highScore){
                    hsTextView.setVisibility(View.VISIBLE);
                    sTextView.setVisibility(View.VISIBLE);
                    sTextView.setText("Your Score is: " + Integer.toString(score));
                    hsTextView.setText("Congratulations!! You made it!");
                }
            }
        }.start();
    }


    //Function for displaying the correct answer
    public void chooseAnswer(View view) {
        if (Integer.toString(locationOfCorrectAnswer).equals(view.getTag().toString())) {
            resultTextView.setText(" Correct! ");
            score++;
        } else {
            resultTextView.setText(" Oops! Wrong ");
            wrongAttempt++;
        }
        if(checkLimit(wrongAttempt)) {
            numberOfQuestions++;
            scoreTextView.setText(Integer.toString(score) + "/" + Integer.toString(numberOfQuestions));
            newQuestion();
        }else{
            if (level == 1){
                cT1.cancel();
                timerTextView.setVisibility(View.INVISIBLE);
                sumTextView.setVisibility(View.INVISIBLE);
                scoreTextView.setVisibility(View.INVISIBLE);
                button0.setVisibility(View.INVISIBLE);
                button1.setVisibility(View.INVISIBLE);
                button2.setVisibility(View.INVISIBLE);
                button3.setVisibility(View.INVISIBLE);
                resultTextView.setVisibility(View.INVISIBLE);
                sTextView.setVisibility(View.VISIBLE);
                sTextView.setText("You have crossed too many attempts! try again..");
                playAgainButton.setVisibility(View.VISIBLE);
            }else if(level == 2){
                cT2.cancel();
                timerTextView.setVisibility(View.INVISIBLE);
                sumTextView.setVisibility(View.INVISIBLE);
                scoreTextView.setVisibility(View.INVISIBLE);
                button0.setVisibility(View.INVISIBLE);
                button1.setVisibility(View.INVISIBLE);
                button2.setVisibility(View.INVISIBLE);
                button3.setVisibility(View.INVISIBLE);
                resultTextView.setVisibility(View.INVISIBLE);
                sTextView.setVisibility(View.VISIBLE);
                playNextLevelButton.setVisibility(View.VISIBLE);
                sTextView.setText("You have crossed too many attempts! try again..");
            }else{
                cT3.cancel();
                timerTextView.setVisibility(View.INVISIBLE);
                sumTextView.setVisibility(View.INVISIBLE);
                scoreTextView.setVisibility(View.INVISIBLE);
                button0.setVisibility(View.INVISIBLE);
                button1.setVisibility(View.INVISIBLE);
                button2.setVisibility(View.INVISIBLE);
                button3.setVisibility(View.INVISIBLE);
                resultTextView.setVisibility(View.INVISIBLE);
                sTextView.setVisibility(View.VISIBLE);
                playFinalLevelButton.setVisibility(View.VISIBLE);
                sTextView.setText("You have crossed too many attempts! try again..");
            }
        }

    }

    public boolean checkLimit(int wrngAtpt){
        if(wrngAtpt >= 8){
            return false;
        }else{
            return true;
        }
    }

//Function to start the game!
    public void start(View view) {
        goButton.setVisibility(View.INVISIBLE);
        gameLayout.setVisibility(View.VISIBLE);
        playAgain(findViewById(R.id.timerTextView));
    }

 //Generates a new question in the first level of game
    public void newQuestion() {
        Random rand = new Random();

        int a = rand.nextInt(21);
        int b = rand.nextInt(21);

        sumTextView.setText(Integer.toString(a) + " + " + Integer.toString(b));

        locationOfCorrectAnswer = rand.nextInt(4);

        answers.clear();

        for (int i=0; i<4; i++) {
            if (i == locationOfCorrectAnswer) {
                answers.add(a+b);
            } else {
                int wrongAnswer = rand.nextInt(41);

                while (wrongAnswer == a+b) {
                    wrongAnswer = rand.nextInt(41);
                }

                answers.add(wrongAnswer);
            }

        }

        button0.setText(Integer.toString(answers.get(0)));
        button1.setText(Integer.toString(answers.get(1)));
        button2.setText(Integer.toString(answers.get(2)));
        button3.setText(Integer.toString(answers.get(3)));
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sumTextView = findViewById(R.id.sumTextView);
        button0 = findViewById(R.id.button0);
        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        resultTextView = findViewById(R.id.resultTextView);
        scoreTextView = findViewById(R.id.scoreTextView);
        timerTextView = findViewById(R.id.timerTextView);
        playAgainButton = findViewById(R.id.playAgainButton);
        gameLayout = findViewById(R.id.gameLayout);
        goButton = findViewById(R.id.goButton);
        sTextView = findViewById(R.id.sTextView);
        hsTextView = findViewById(R.id.hsTextView);
        playNextLevelButton = findViewById(R.id.playNextLevelButton);
        playFinalLevelButton = findViewById(R.id.playFinalLevelButton);


        goButton.setVisibility(View.VISIBLE);
        gameLayout.setVisibility(View.INVISIBLE);
    }
}
