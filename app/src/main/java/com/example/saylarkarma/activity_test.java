package com.example.saylarkarma;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.res.Resources;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
public class activity_test extends AppCompatActivity {
    private TextView tvText,tvSayac;
    private Button btnCevap1, btnCevap2, btnCevap3, btnCevap4, btnSayac;
    private List<Integer> opList = new ArrayList<>();
    private List<Button> buttonList = new ArrayList<>();
    Random random;
    String question = "";
    int answer;
    int op;
    int index = 1;
    int correct = 0;
    int wrong = 0;
    int pratice = 1;
    int sayac;
    int test=1;
    MediaPlayer mediaPlayer,hata;
    CountDownTimer countDownTimer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Intent intent = getIntent();
        pratice = intent.getIntExtra("test", 1);
        setTheme(R.style.Theme);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);
        findView();
        setQuestion();
        setTvSayac();

        final MediaPlayer mediaPlayer=MediaPlayer.create(activity_test.this,R.raw.dogru);
        final MediaPlayer hata = MediaPlayer.create(activity_test.this, R.raw.wrong);


        btnCevap1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (btnCevap1.getText().toString().equals(String.valueOf(answer))) {
                    btnCevap1.setBackgroundResource(R.drawable.bg_selector_yesil);
                    tvText.setBackgroundResource(R.drawable.bg_selector_yesil);
                    mediaPlayer.start();
                    countDownTimer.cancel();
                    new Handler().postDelayed(new Runnable() {
                        @Override
                        public void run() {

                            index++;
                            correct++;
                            setQuestion();
                            setTvSayac();
                            setButtonList();
                        }
                    }, 1500);

                } else {
                    btnCevap1.setBackgroundResource(R.drawable.bg_selector);
                    buttonList.get(op).setBackgroundResource(R.drawable.bg_selector_yesil);
                    hata.start();
                    countDownTimer.cancel();
                    new Handler().postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            index++;
                            wrong++;
                            setQuestion();
                            setTvSayac();
                            setButtonList();
                        }
                    }, 1500);


                }


            }
        });
        btnCevap2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (btnCevap2.getText().toString().equals(String.valueOf(answer))) {
                    btnCevap2.setBackgroundResource(R.drawable.bg_selector_yesil);
                    tvText.setBackgroundResource(R.drawable.bg_selector_yesil);
                    mediaPlayer.start();
                    countDownTimer.cancel();
                    new Handler().postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            index++;
                            correct++;
                            setQuestion();
                            setTvSayac();
                            setButtonList();
                        }
                    }, 1500);


                } else {
                    btnCevap2.setBackgroundResource(R.drawable.bg_selector);
                    buttonList.get(op).setBackgroundResource(R.drawable.bg_selector_yesil);
                    hata.start();
                    countDownTimer.cancel();
                    new Handler().postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            index++;
                            wrong++;
                            setQuestion();
                            setTvSayac();
                            setButtonList();
                        }
                    }, 1500);


                }

            }
        });
        btnCevap3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (btnCevap3.getText().toString().equals(String.valueOf(answer))) {
                    btnCevap3.setBackgroundResource(R.drawable.bg_selector_yesil);
                    tvText.setBackgroundResource(R.drawable.bg_selector_yesil);
                    mediaPlayer.start();
                    countDownTimer.cancel();
                    new Handler().postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            index++;
                            correct++;
                            setQuestion();
                            setTvSayac();
                            setButtonList();
                        }
                    }, 1500);


                } else {
                    btnCevap3.setBackgroundResource(R.drawable.bg_selector);
                    buttonList.get(op).setBackgroundResource(R.drawable.bg_selector_yesil);
                    hata.start();
                    countDownTimer.cancel();
                    new Handler().postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            index++;
                            wrong++;
                            setQuestion();
                            setTvSayac();
                            setButtonList();
                        }
                    }, 1500);


                }


            }
        });
        btnCevap4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (btnCevap4.getText().toString().equals(String.valueOf(answer))) {
                    btnCevap4.setBackgroundResource(R.drawable.bg_selector_yesil);
                    tvText.setBackgroundResource(R.drawable.bg_selector_yesil);
                    mediaPlayer.start();
                    countDownTimer.cancel();
                    new Handler().postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            index++;
                            correct++;
                            setQuestion();
                            setTvSayac();
                            setButtonList();
                        }
                    }, 1500);


                } else {
                    btnCevap4.setBackgroundResource(R.drawable.bg_selector);
                    buttonList.get(op).setBackgroundResource(R.drawable.bg_selector_yesil);
                    hata.start();
                    countDownTimer.cancel();
                    new Handler().postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            index++;
                            wrong++;
                            setQuestion();
                            setTvSayac();
                            setButtonList();
                        }
                    }, 1500);


                }


            }
        });


    }


    public void setButtonList() {
        for (int i = 0; i < 4; i++) {
            buttonList.get(i).setBackgroundResource(R.drawable.bg_cevap_selector);
        }
    }

    public void onLeftClick(View view) {
        onBackPressed();
    }

    public void setTvSayac(){
        countDownTimer=new CountDownTimer(15000, 1000) {

            public void onTick(long millisUntilFinished) {
                tvSayac.setText(" " + millisUntilFinished / 1000);
            }

            public void onFinish() {
                index++;
                correct++;
                wrong++;
                setQuestion();
                countDownTimer.start();
            }
        }.start();

    }
    public void setQuestion() {

        if (index > 15 &  sayac==15  ) {
            Utility.showMessage(this,"Oyun Bitti",true);
            Intent intent = new Intent(activity_test.this, MainActivity.class);
            startActivity(intent);
            countDownTimer.cancel();
        }
        int number1=random.nextInt(10)+1;
        int number2=random.nextInt(10)+1;
        question=(number1*number2)+" "+"/"+" "+number1+" "+"= ?";
        answer=number2;
        tvText.setText(question);
        setOpList();
        sayac++;
        btnSayac.setText(sayac+"/15");
        tvText.setBackgroundResource(R.drawable.bg_cevap_selector);

    }

    public void setOpList() {
        opList.clear();
        opList.add(0);
        opList.add(1);
        opList.add(2);
        opList.add(3);
        op = random.nextInt(4);
        opList.remove(op);
        buttonList.get(op).setText("" + answer);
        buttonList.get(opList.get(0)).setText("" + (answer - 1));
        buttonList.get(opList.get(1)).setText("" + (answer + 1));
        buttonList.get(opList.get(2)).setText("" + (answer + 2));

    }

    private void findView() {
        tvText = findViewById(R.id.tvText);
        btnCevap1 = findViewById(R.id.btnCevap1);
        btnCevap2 = findViewById(R.id.btnCevap2);
        btnCevap3 = findViewById(R.id.btnCevap3);
        btnCevap4 = findViewById(R.id.btnCevap4);
        btnSayac = findViewById(R.id.btnSayac);
        tvSayac=findViewById(R.id.tvSayac);
        random = new Random();
        buttonList.add(btnCevap1);
        buttonList.add(btnCevap2);
        buttonList.add(btnCevap3);
        buttonList.add(btnCevap4);
    }
}