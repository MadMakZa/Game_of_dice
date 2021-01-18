package com.example.gameofdice;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.content.Intent;
import android.media.Image;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import static com.example.gameofdice.Bets.doubleTheRate;
import static com.example.gameofdice.Bets.getPlayerBet;
import static com.example.gameofdice.Bets.putFifty;
import static com.example.gameofdice.Bets.putFive;
import static com.example.gameofdice.Bets.putFiveHundred;
import static com.example.gameofdice.Bets.putOne;
import static com.example.gameofdice.Bets.putOneHundred;
import static com.example.gameofdice.Bets.putOneThousand;
import static com.example.gameofdice.Bets.putTen;
import static com.example.gameofdice.Bets.putTwentyFive;
import static com.example.gameofdice.Bets.putTwoHundredAndFifty;
import static com.example.gameofdice.Bets.removeBet;

/**
 * Dice 21 Points game
 */
public class MainActivity extends AppCompatActivity {

    private ImageView cubeImageView1;
    private ImageView cubeImageView2;
    private ImageView cubeImageView3;
    private ImageView cubeImageView4;
    private ImageView cubeImageView5;
    private ImageView cubeImageView6;
    private TextView scoreRound;
    private TextView scorePlayer;
    private TextView scoreComp;
    private TextView bet;
    private TextView bankDepo;

    public TextView getBankDepo() {
        return bankDepo;
    }
    public void setBankDepo(TextView bankDepo) {
        this.bankDepo = bankDepo;
    }
    public TextView getBet() {
        return bet;
    }
    public void setBet(TextView bet) {
        this.bet = bet;
    }


    public ImageView getCubeImageView1() {
        return cubeImageView1;
    }
    public void setCubeImageView1(ImageView cubeImageView1) {
        this.cubeImageView1 = cubeImageView1;
    }
    public ImageView getCubeImageView2() {
        return cubeImageView2;
    }
    public void setCubeImageView2(ImageView cubeImageView2) {
        this.cubeImageView2 = cubeImageView2;
    }
    public ImageView getCubeImageView3() {
        return cubeImageView3;
    }
    public void setCubeImageView3(ImageView cubeImageView3) {
        this.cubeImageView3 = cubeImageView3;
    }
    public ImageView getCubeImageView4() {
        return cubeImageView4;
    }

    public void setCubeImageView4(ImageView cubeImageView4) {
        this.cubeImageView4 = cubeImageView4;
    }

    public ImageView getCubeImageView5() {
        return cubeImageView5;
    }

    public void setCubeImageView5(ImageView cubeImageView5) {
        this.cubeImageView5 = cubeImageView5;
    }

    public ImageView getCubeImageView6() {
        return cubeImageView6;
    }

    public void setCubeImageView6(ImageView cubeImageView6) {
        this.cubeImageView6 = cubeImageView6;
    }
    public TextView getScoreRound() {
        return scoreRound;
    }
    public void setScoreRound(TextView scoreRound) {
        this.scoreRound = scoreRound;
    }
    public TextView getScorePlayer() {
        return scorePlayer;
    }
    public void setScorePlayer(TextView scorePlayer) {
        this.scorePlayer = scorePlayer;
    }
    public TextView getScoreComp() {
        return scoreComp;
    }
    public void setScoreComp(TextView scoreComp) {
        this.scoreComp = scoreComp;
    }


    //getter instance
    private static MainActivity instance;
    public static MainActivity getInstance(){
        return instance;
    }

    public void init() {
        //присвоение переменным местоположение на экране
        cubeImageView1 = (ImageView) findViewById(R.id.cube_1);
        cubeImageView2 = (ImageView) findViewById(R.id.cube_2);
        cubeImageView3 = (ImageView) findViewById(R.id.cube_3);
        cubeImageView4 = (ImageView) findViewById(R.id.cube_black1);
        cubeImageView5 = (ImageView) findViewById(R.id.cube_black2);
        cubeImageView6 = (ImageView) findViewById(R.id.cube_black3);
        scoreRound = (TextView) findViewById(R.id.score_round);
        scorePlayer = (TextView) findViewById(R.id.playerPoints);
        scoreComp = (TextView) findViewById(R.id.compPoints);
        bankDepo = (TextView) findViewById(R.id.tv_bank_deposit);



    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        instance = this;
        init();

        //запуск стартового окна
        startDialog();


    }
    //нажатие на игровое поле
    public void onClickPlayerField(View view) throws InterruptedException {
//        winnerDialog();
        startDialog();
    }


    //диалоговое окно ставок и броска кубиков
    @SuppressLint("SetTextI18n")
    public void startDialog(){
        final Dialog startDialog = new Dialog(this);
        startDialog.setContentView(R.layout.dialog_start);
        startDialog.setTitle("Start Dialog");
        startDialog.show();

        //текущая ставка
        bet = (TextView) startDialog.findViewById(R.id.bet);
        bet.setText(Integer.toString(Bets.getPlayerBet()));

        //кнопка откатить ставку
        ImageButton buttonBetRollBack = (ImageButton) startDialog.findViewById(R.id.btn_betRollBack);
        buttonBetRollBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "roll back!", Toast.LENGTH_SHORT).show();
                removeBet();
            }
        });
        //кнопка удвоить ставку
        ImageButton buttonDoubleTheRate = (ImageButton) startDialog.findViewById(R.id.btn_betX2);
        buttonDoubleTheRate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "bet x2!", Toast.LENGTH_SHORT).show();
                doubleTheRate();
            }
        });
        //кнопка ставки +1
        ImageButton buttonBet1 = (ImageButton) startDialog.findViewById(R.id.id_token1);
        buttonBet1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Bet 1!", Toast.LENGTH_SHORT).show();
                putOne();
            }
        });
        //кнопка ставки +5
        ImageButton buttonBet5 = (ImageButton) startDialog.findViewById(R.id.id_token5);
        buttonBet5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Bet 5!", Toast.LENGTH_SHORT).show();
                putFive();
            }
        });
        //кнопка ставки +10
        ImageButton buttonBet10 = (ImageButton) startDialog.findViewById(R.id.id_token10);
        buttonBet10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Bet 10!", Toast.LENGTH_SHORT).show();
                putTen();
            }
        });
        //кнопка ставки +25
        ImageButton buttonBet25 = (ImageButton) startDialog.findViewById(R.id.id_token25);
        buttonBet25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Bet 25!", Toast.LENGTH_SHORT).show();
                putTwentyFive();
            }
        });
        //кнопка ставки +50
        ImageButton buttonBet50 = (ImageButton) startDialog.findViewById(R.id.id_token50);
        buttonBet50.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Bet 50!", Toast.LENGTH_SHORT).show();
                putFifty();
            }
        });
        //кнопка ставки +100
        ImageButton buttonBet100 = (ImageButton) startDialog.findViewById(R.id.id_token100);
        buttonBet100.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Bet 100!", Toast.LENGTH_SHORT).show();
                putOneHundred();
            }
        });
        //кнопка ставки +250
        ImageButton buttonBet250 = (ImageButton) startDialog.findViewById(R.id.id_token250);
        buttonBet250.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Bet 250!", Toast.LENGTH_SHORT).show();
                putTwoHundredAndFifty();
            }
        });
        //кнопка ставки +500
        ImageButton buttonBet500 = (ImageButton) startDialog.findViewById(R.id.id_token500);
        buttonBet500.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Bet 500!", Toast.LENGTH_SHORT).show();
                putFiveHundred();
            }
        });
        //кнопка ставки +1000
        ImageButton buttonBet1000 = (ImageButton) startDialog.findViewById(R.id.id_token1000);
        buttonBet1000.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Bet 1000!", Toast.LENGTH_SHORT).show();
                putOneThousand();
            }
        });
        //кнопка бросить кубики
        Button roll = (Button) startDialog.findViewById(R.id.roll);
        roll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                StartGame startGame = new StartGame();
                startGame.CreatePlayer();
                startGame.CreateComputer();
                startGame.CompareResults();
                startDialog.dismiss();

            }
        }
        );

    }
    //диалог определяющий победителя
    public void winnerDialog() {
        final Dialog winnerDialog = new Dialog(this);
        winnerDialog.setContentView(R.layout.dialog_winner);
        winnerDialog.setTitle("Winner Dialog");
        winnerDialog.show();
    }
}