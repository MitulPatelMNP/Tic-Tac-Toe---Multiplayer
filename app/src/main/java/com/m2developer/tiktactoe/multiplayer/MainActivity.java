package com.m2developer.tiktactoe.multiplayer;

import android.annotation.SuppressLint;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button refresh, bt1, bt2, bt3, bt4, bt5, bt6, bt7, bt8, bt9;
    TextView tvX, tvO, turn;
    public static boolean setText = true;
    String X, O;
    public static int XX = 0;
    public static int OO = 0;

    public static boolean button1 = true;
    public static boolean button2 = true;
    public static boolean button3 = true;
    public static boolean button4 = true;
    public static boolean button5 = true;
    public static boolean button6 = true;
    public static boolean button7 = true;
    public static boolean button8 = true;
    public static boolean button9 = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        try {
            init();
        } catch (Exception e) {
            e.getMessage();
        }
    }

    private void init() {
        try {
            tvX = findViewById(R.id.tvX);
            tvO = findViewById(R.id.tv0);
            turn = findViewById(R.id.turn);

            refresh = findViewById(R.id.refresh);
            bt1 = findViewById(R.id.bt1);
            bt2 = findViewById(R.id.bt2);
            bt3 = findViewById(R.id.bt3);
            bt4 = findViewById(R.id.bt4);
            bt5 = findViewById(R.id.bt5);
            bt6 = findViewById(R.id.bt6);
            bt7 = findViewById(R.id.bt7);
            bt8 = findViewById(R.id.bt8);
            bt9 = findViewById(R.id.bt9);


            bt1.setOnClickListener(this);
            bt2.setOnClickListener(this);
            bt3.setOnClickListener(this);
            bt4.setOnClickListener(this);
            bt5.setOnClickListener(this);
            bt6.setOnClickListener(this);
            bt7.setOnClickListener(this);
            bt8.setOnClickListener(this);
            bt9.setOnClickListener(this);
            refresh.setOnClickListener(this);
        } catch (Exception e) {
            e.getMessage();
        }
    }

    @SuppressLint("ResourceAsColor")
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.bt1:
                try {
                    if (button1) {
                        button1 = false;
                        if (setText) {
                            bt1.setText("O");
                            setText = false;
                            turn.setText("Turn: X-player");
                        } else {
                            bt1.setText("X");
                            setText = true;
                            turn.setText("Turn: O-player");
                        }

                        if (bt1.getText().equals(bt2.getText()) && bt1.getText().equals(bt3.getText())) {

                            bt1.setBackgroundColor(ContextCompat.getColor(this, android.R.color.holo_green_light));
                            bt2.setBackgroundColor(ContextCompat.getColor(this, android.R.color.holo_green_light));
                            bt3.setBackgroundColor(ContextCompat.getColor(this, android.R.color.holo_green_light));

                            stop();
                            if (bt1.getText().equals("X")) {
                                X = String.valueOf(Integer.parseInt(tvX.getText().toString()) + 1);
                                tvX.setText(X);
                                setText = true;
                                turn.setText("X - Win");
                            } else {
                                O = String.valueOf(Integer.parseInt(tvO.getText().toString()) + 1);
                                tvO.setText(O);
                                setText = true;
                                turn.setText("O - Win");
                            }
                        } else if (bt1.getText().equals(bt4.getText()) && bt1.getText().equals(bt7.getText())) {
                            bt1.setBackgroundColor(ContextCompat.getColor(this, android.R.color.holo_green_light));
                            bt4.setBackgroundColor(ContextCompat.getColor(this, android.R.color.holo_green_light));
                            bt7.setBackgroundColor(ContextCompat.getColor(this, android.R.color.holo_green_light));

                            stop();
                            if (bt1.getText().equals("X")) {
                                X = String.valueOf(Integer.parseInt(tvX.getText().toString()) + 1);
                                tvX.setText(X);
                                setText = true;
                                turn.setText("X - Win");
                            } else {
                                O = String.valueOf(Integer.parseInt(tvO.getText().toString()) + 1);
                                tvO.setText(O);
                                setText = true;
                                turn.setText("O - Win");
                            }
                        } else if (bt1.getText().equals(bt5.getText()) && bt1.getText().equals(bt9.getText())) {
                            bt1.setBackgroundColor(ContextCompat.getColor(this, android.R.color.holo_green_light));
                            bt5.setBackgroundColor(ContextCompat.getColor(this, android.R.color.holo_green_light));
                            bt9.setBackgroundColor(ContextCompat.getColor(this, android.R.color.holo_green_light));
                            stop();
                            if (bt1.getText().equals("X")) {
                                X = String.valueOf(Integer.parseInt(tvX.getText().toString()) + 1);
                                tvX.setText(X);
                                setText = true;
                                turn.setText("X - Win");
                            } else {
                                O = String.valueOf(Integer.parseInt(tvO.getText().toString()) + 1);
                                tvO.setText(O);
                                setText = true;
                                turn.setText("O - Win");
                            }
                        } else {
                            CheckTik();
                        }
                    }
                } catch (Exception e) {
                    e.getMessage();
                }
                break;
            case R.id.bt2:
                try {
                    if (button2) {
                        button2 = false;
                        if (setText) {
                            bt2.setText("O");
                            setText = false;
                            turn.setText("Turn: X-player");
                        } else {
                            bt2.setText("X");
                            setText = true;
                            turn.setText("Turn: O-player");
                        }

                        if (bt2.getText().equals(bt1.getText()) && bt2.getText().equals(bt3.getText())) {
                            bt1.setBackgroundColor(ContextCompat.getColor(this, android.R.color.holo_green_light));
                            bt2.setBackgroundColor(ContextCompat.getColor(this, android.R.color.holo_green_light));
                            bt3.setBackgroundColor(ContextCompat.getColor(this, android.R.color.holo_green_light));
                            stop();
                            if (bt2.getText().equals("X")) {
                                X = String.valueOf(Integer.parseInt(tvX.getText().toString()) + 1);
                                tvX.setText(X);
                                setText = true;
                                turn.setText("X - Win");
                            } else {
                                O = String.valueOf(Integer.parseInt(tvO.getText().toString()) + 1);
                                tvO.setText(O);
                                setText = true;
                                turn.setText("O - Win");
                            }
                        } else if (bt2.getText().equals(bt5.getText()) && bt2.getText().equals(bt8.getText())) {
                            bt5.setBackgroundColor(ContextCompat.getColor(this, android.R.color.holo_green_light));
                            bt2.setBackgroundColor(ContextCompat.getColor(this, android.R.color.holo_green_light));
                            bt8.setBackgroundColor(ContextCompat.getColor(this, android.R.color.holo_green_light));
                            stop();
                            if (bt2.getText().equals("X")) {
                                X = String.valueOf(Integer.parseInt(tvX.getText().toString()) + 1);
                                tvX.setText(X);
                                setText = true;
                                turn.setText("X - Win");
                            } else {
                                O = String.valueOf(Integer.parseInt(tvO.getText().toString()) + 1);
                                tvO.setText(O);
                                setText = true;
                                turn.setText("O - Win");
                            }
                        } else {
                            CheckTik();
                        }
                    }
                } catch (Exception e) {
                    e.getMessage();
                }
                break;
            case R.id.bt3:
                try {
                    if (button3) {
                        button3 = false;
                        if (setText) {
                            bt3.setText("O");
                            setText = false;
                            turn.setText("Turn: X-player");
                        } else {
                            bt3.setText("X");
                            setText = true;
                            turn.setText("Turn: O-player");
                        }

                        if (bt3.getText().equals(bt1.getText()) && bt3.getText().equals(bt2.getText())) {
                            bt1.setBackgroundColor(ContextCompat.getColor(this, android.R.color.holo_green_light));
                            bt2.setBackgroundColor(ContextCompat.getColor(this, android.R.color.holo_green_light));
                            bt3.setBackgroundColor(ContextCompat.getColor(this, android.R.color.holo_green_light));
                            stop();
                            if (bt3.getText().equals("X")) {
                                X = String.valueOf(Integer.parseInt(tvX.getText().toString()) + 1);
                                tvX.setText(X);
                                setText = true;
                                turn.setText("X - Win");
                            } else {
                                O = String.valueOf(Integer.parseInt(tvO.getText().toString()) + 1);
                                tvO.setText(O);
                                setText = true;
                                turn.setText("O - Win");
                            }
                        } else if (bt3.getText().equals(bt6.getText()) && bt3.getText().equals(bt9.getText())) {
                            bt9.setBackgroundColor(ContextCompat.getColor(this, android.R.color.holo_green_light));
                            bt6.setBackgroundColor(ContextCompat.getColor(this, android.R.color.holo_green_light));
                            bt3.setBackgroundColor(ContextCompat.getColor(this, android.R.color.holo_green_light));
                            stop();
                            if (bt3.getText().equals("X")) {
                                X = String.valueOf(Integer.parseInt(tvX.getText().toString()) + 1);
                                tvX.setText(X);
                                setText = true;
                                turn.setText("X - Win");
                            } else {
                                O = String.valueOf(Integer.parseInt(tvO.getText().toString()) + 1);
                                tvO.setText(O);
                                setText = true;
                                turn.setText("O - Win");
                            }
                        } else if (bt3.getText().equals(bt5.getText()) && bt3.getText().equals(bt7.getText())) {
                            bt7.setBackgroundColor(ContextCompat.getColor(this, android.R.color.holo_green_light));
                            bt5.setBackgroundColor(ContextCompat.getColor(this, android.R.color.holo_green_light));
                            bt3.setBackgroundColor(ContextCompat.getColor(this, android.R.color.holo_green_light));
                            stop();
                            if (bt3.getText().equals("X")) {
                                X = String.valueOf(Integer.parseInt(tvX.getText().toString()) + 1);
                                tvX.setText(X);
                                setText = true;
                                turn.setText("X - Win");
                            } else {
                                O = String.valueOf(Integer.parseInt(tvO.getText().toString()) + 1);
                                tvO.setText(O);
                                setText = true;
                                turn.setText("O - Win");
                            }
                        } else {
                            CheckTik();
                        }

                    }
                } catch (Exception e) {
                    e.getMessage();
                }
                break;
            case R.id.bt4:
                try {
                    if (button4) {
                        button4 = false;
                        if (setText) {
                            bt4.setText("O");
                            setText = false;
                            turn.setText("Turn: X-player");
                        } else {
                            bt4.setText("X");
                            setText = true;
                            turn.setText("Turn: O-player");
                        }

                        if (bt4.getText().equals(bt5.getText()) && bt4.getText().equals(bt6.getText())) {
                            bt4.setBackgroundColor(ContextCompat.getColor(this, android.R.color.holo_green_light));
                            bt5.setBackgroundColor(ContextCompat.getColor(this, android.R.color.holo_green_light));
                            bt6.setBackgroundColor(ContextCompat.getColor(this, android.R.color.holo_green_light));
                            stop();
                            if (bt4.getText().equals("X")) {
                                X = String.valueOf(Integer.parseInt(tvX.getText().toString()) + 1);
                                tvX.setText(X);
                                setText = true;
                                turn.setText("X - Win");
                            } else {
                                O = String.valueOf(Integer.parseInt(tvO.getText().toString()) + 1);
                                tvO.setText(O);
                                setText = true;
                                turn.setText("O - Win");
                            }
                        } else if (bt4.getText().equals(bt1.getText()) && bt4.getText().equals(bt7.getText())) {
                            bt1.setBackgroundColor(ContextCompat.getColor(this, android.R.color.holo_green_light));
                            bt4.setBackgroundColor(ContextCompat.getColor(this, android.R.color.holo_green_light));
                            bt7.setBackgroundColor(ContextCompat.getColor(this, android.R.color.holo_green_light));
                            stop();
                            if (bt4.getText().equals("X")) {
                                X = String.valueOf(Integer.parseInt(tvX.getText().toString()) + 1);
                                tvX.setText(X);
                                setText = true;
                                turn.setText("X - Win");
                            } else {
                                O = String.valueOf(Integer.parseInt(tvO.getText().toString()) + 1);
                                tvO.setText(O);
                                setText = true;
                                turn.setText("O - Win");
                            }
                        } else {
                            CheckTik();
                        }

                    }
                } catch (Exception e) {
                    e.getMessage();
                }
                break;
            case R.id.bt5:
                try {
                    if (button5) {
                        button5 = false;
                        if (setText) {
                            bt5.setText("O");
                            setText = false;
                            turn.setText("Turn: X-player");
                        } else {
                            bt5.setText("X");
                            setText = true;
                            turn.setText("Turn: O-player");
                        }

                        if (bt5.getText().equals(bt4.getText()) && bt5.getText().equals(bt6.getText())) {
                            bt5.setBackgroundColor(ContextCompat.getColor(this, android.R.color.holo_green_light));
                            bt4.setBackgroundColor(ContextCompat.getColor(this, android.R.color.holo_green_light));
                            bt6.setBackgroundColor(ContextCompat.getColor(this, android.R.color.holo_green_light));
                            stop();
                            if (bt5.getText().equals("X")) {
                                X = String.valueOf(Integer.parseInt(tvX.getText().toString()) + 1);
                                tvX.setText(X);
                                setText = true;
                                turn.setText("X - Win");
                            } else {
                                O = String.valueOf(Integer.parseInt(tvO.getText().toString()) + 1);
                                tvO.setText(O);
                                setText = true;
                                turn.setText("O - Win");
                            }
                        } else if (bt5.getText().equals(bt2.getText()) && bt5.getText().equals(bt8.getText())) {
                            bt5.setBackgroundColor(ContextCompat.getColor(this, android.R.color.holo_green_light));
                            bt2.setBackgroundColor(ContextCompat.getColor(this, android.R.color.holo_green_light));
                            bt8.setBackgroundColor(ContextCompat.getColor(this, android.R.color.holo_green_light));
                            stop();
                            if (bt5.getText().equals("X")) {
                                X = String.valueOf(Integer.parseInt(tvX.getText().toString()) + 1);
                                tvX.setText(X);
                                setText = true;
                                turn.setText("X - Win");
                            } else {
                                O = String.valueOf(Integer.parseInt(tvO.getText().toString()) + 1);
                                tvO.setText(O);
                                setText = true;
                                turn.setText("O - Win");
                            }
                        } else if (bt5.getText().equals(bt7.getText()) && bt5.getText().equals(bt3.getText())) {
                            bt5.setBackgroundColor(ContextCompat.getColor(this, android.R.color.holo_green_light));
                            bt7.setBackgroundColor(ContextCompat.getColor(this, android.R.color.holo_green_light));
                            bt3.setBackgroundColor(ContextCompat.getColor(this, android.R.color.holo_green_light));
                            stop();
                            if (bt5.getText().equals("X")) {
                                X = String.valueOf(Integer.parseInt(tvX.getText().toString()) + 1);
                                tvX.setText(X);
                                setText = true;
                                turn.setText("X - Win");
                            } else {
                                O = String.valueOf(Integer.parseInt(tvO.getText().toString()) + 1);
                                tvO.setText(O);
                                setText = true;
                                turn.setText("O - Win");
                            }
                        } else if (bt5.getText().equals(bt9.getText()) && bt5.getText().equals(bt1.getText())) {
                            bt1.setBackgroundColor(ContextCompat.getColor(this, android.R.color.holo_green_light));
                            bt5.setBackgroundColor(ContextCompat.getColor(this, android.R.color.holo_green_light));
                            bt9.setBackgroundColor(ContextCompat.getColor(this, android.R.color.holo_green_light));
                            stop();
                            if (bt5.getText().equals("X")) {
                                X = String.valueOf(Integer.parseInt(tvX.getText().toString()) + 1);
                                tvX.setText(X);
                                setText = true;
                                turn.setText("X - Win");
                            } else {
                                O = String.valueOf(Integer.parseInt(tvO.getText().toString()) + 1);
                                tvO.setText(O);
                                setText = true;
                                turn.setText("O - Win");
                            }
                        } else {
                            CheckTik();
                        }

                    }
                } catch (Exception e) {
                    e.getMessage();
                }
                break;
            case R.id.bt6:
                try {
                    if (button6) {
                        button6 = false;
                        if (setText) {
                            bt6.setText("O");
                            setText = false;
                            turn.setText("Turn: X-player");
                        } else {
                            bt6.setText("X");
                            setText = true;
                            turn.setText("Turn: O-player");
                        }

                        if (bt6.getText().equals(bt3.getText()) && bt6.getText().equals(bt9.getText())) {
                            bt9.setBackgroundColor(ContextCompat.getColor(this, android.R.color.holo_green_light));
                            bt6.setBackgroundColor(ContextCompat.getColor(this, android.R.color.holo_green_light));
                            bt3.setBackgroundColor(ContextCompat.getColor(this, android.R.color.holo_green_light));
                            stop();
                            if (bt6.getText().equals("X")) {
                                X = String.valueOf(Integer.parseInt(tvX.getText().toString()) + 1);
                                tvX.setText(X);
                                setText = true;
                                turn.setText("X - Win");
                            } else {
                                O = String.valueOf(Integer.parseInt(tvO.getText().toString()) + 1);
                                tvO.setText(O);
                                setText = true;
                                turn.setText("O - Win");
                            }
                        } else if (bt6.getText().equals(bt5.getText()) && bt6.getText().equals(bt4.getText())) {
                            bt6.setBackgroundColor(ContextCompat.getColor(this, android.R.color.holo_green_light));
                            bt5.setBackgroundColor(ContextCompat.getColor(this, android.R.color.holo_green_light));
                            bt4.setBackgroundColor(ContextCompat.getColor(this, android.R.color.holo_green_light));
                            stop();
                            if (bt6.getText().equals("X")) {
                                X = String.valueOf(Integer.parseInt(tvX.getText().toString()) + 1);
                                tvX.setText(X);
                                setText = true;
                                turn.setText("X - Win");
                            } else {
                                O = String.valueOf(Integer.parseInt(tvO.getText().toString()) + 1);
                                tvO.setText(O);
                                setText = true;
                                turn.setText("O - Win");
                            }
                        } else {
                            CheckTik();
                        }
                    }
                } catch (Exception e) {
                    e.getMessage();
                }
                break;
            case R.id.bt7:
                try {
                    if (button7) {
                        button7 = false;
                        if (setText) {
                            bt7.setText("O");
                            setText = false;
                            turn.setText("Turn: X-player");
                        } else {
                            bt7.setText("X");
                            setText = true;
                            turn.setText("Turn: O-player");
                        }

                        if (bt7.getText().equals(bt1.getText()) && bt7.getText().equals(bt4.getText())) {
                            bt1.setBackgroundColor(ContextCompat.getColor(this, android.R.color.holo_green_light));
                            bt7.setBackgroundColor(ContextCompat.getColor(this, android.R.color.holo_green_light));
                            bt4.setBackgroundColor(ContextCompat.getColor(this, android.R.color.holo_green_light));
                            stop();
                            if (bt7.getText().equals("X")) {
                                X = String.valueOf(Integer.parseInt(tvX.getText().toString()) + 1);
                                tvX.setText(X);
                                setText = true;
                                turn.setText("X - Win");
                            } else {
                                O = String.valueOf(Integer.parseInt(tvO.getText().toString()) + 1);
                                tvO.setText(O);
                                setText = true;
                                turn.setText("O - Win");
                            }
                        } else if (bt7.getText().equals(bt8.getText()) && bt7.getText().equals(bt9.getText())) {
                            bt7.setBackgroundColor(ContextCompat.getColor(this, android.R.color.holo_green_light));
                            bt8.setBackgroundColor(ContextCompat.getColor(this, android.R.color.holo_green_light));
                            bt9.setBackgroundColor(ContextCompat.getColor(this, android.R.color.holo_green_light));
                            stop();
                            if (bt7.getText().equals("X")) {
                                X = String.valueOf(Integer.parseInt(tvX.getText().toString()) + 1);
                                tvX.setText(X);
                                setText = true;
                                turn.setText("X - Win");
                            } else {
                                O = String.valueOf(Integer.parseInt(tvO.getText().toString()) + 1);
                                tvO.setText(O);
                                setText = true;
                                turn.setText("O - Win");
                            }
                        } else if (bt7.getText().equals(bt5.getText()) && bt7.getText().equals(bt3.getText())) {
                            bt7.setBackgroundColor(ContextCompat.getColor(this, android.R.color.holo_green_light));
                            bt5.setBackgroundColor(ContextCompat.getColor(this, android.R.color.holo_green_light));
                            bt3.setBackgroundColor(ContextCompat.getColor(this, android.R.color.holo_green_light));
                            stop();
                            if (bt7.getText().equals("X")) {
                                X = String.valueOf(Integer.parseInt(tvX.getText().toString()) + 1);
                                tvX.setText(X);
                                setText = true;
                                turn.setText("X - Win");
                            } else {
                                O = String.valueOf(Integer.parseInt(tvO.getText().toString()) + 1);
                                tvO.setText(O);
                                setText = true;
                                turn.setText("O - Win");
                            }
                        } else {
                            CheckTik();
                        }
                    }
                } catch (Exception e) {
                    e.getMessage();
                }
                break;
            case R.id.bt8:
                try {
                    if (button8) {
                        button8 = false;
                        if (setText) {
                            bt8.setText("O");
                            setText = false;
                            turn.setText("Turn: X-player");
                        } else {
                            bt8.setText("X");
                            setText = true;
                            turn.setText("Turn: O-player");
                        }

                        if (bt8.getText().equals(bt9.getText()) && bt8.getText().equals(bt7.getText())) {
                            bt8.setBackgroundColor(ContextCompat.getColor(this, android.R.color.holo_green_light));
                            bt9.setBackgroundColor(ContextCompat.getColor(this, android.R.color.holo_green_light));
                            bt7.setBackgroundColor(ContextCompat.getColor(this, android.R.color.holo_green_light));
                            stop();
                            if (bt8.getText().equals("X")) {
                                X = String.valueOf(Integer.parseInt(tvX.getText().toString()) + 1);
                                tvX.setText(X);
                                setText = true;
                                turn.setText("X - Win");
                            } else {
                                O = String.valueOf(Integer.parseInt(tvO.getText().toString()) + 1);
                                tvO.setText(O);
                                setText = true;
                                turn.setText("O - Win");
                            }
                        } else if (bt8.getText().equals(bt5.getText()) && bt8.getText().equals(bt2.getText())) {
                            bt8.setBackgroundColor(ContextCompat.getColor(this, android.R.color.holo_green_light));
                            bt2.setBackgroundColor(ContextCompat.getColor(this, android.R.color.holo_green_light));
                            bt5.setBackgroundColor(ContextCompat.getColor(this, android.R.color.holo_green_light));
                            stop();
                            if (bt8.getText().equals("X")) {
                                X = String.valueOf(Integer.parseInt(tvX.getText().toString()) + 1);
                                tvX.setText(X);
                                setText = true;
                                turn.setText("X - Win");
                            } else {
                                O = String.valueOf(Integer.parseInt(tvO.getText().toString()) + 1);
                                tvO.setText(O);
                                setText = true;
                                turn.setText("O - Win");
                            }
                        } else {
                            CheckTik();
                        }
                    }
                } catch (Exception e) {
                    e.getMessage();
                }
                break;
            case R.id.bt9:
                try {
                    if (button9) {
                        button9 = false;
                        if (setText) {
                            bt9.setText("O");
                            setText = false;
                            turn.setText("Turn: X-player");
                        } else {
                            bt9.setText("X");
                            setText = true;
                            turn.setText("Turn: O-player");
                        }

                        if (bt9.getText().equals(bt6.getText()) && bt9.getText().equals(bt3.getText())) {
                            bt9.setBackgroundColor(ContextCompat.getColor(this, android.R.color.holo_green_light));
                            bt6.setBackgroundColor(ContextCompat.getColor(this, android.R.color.holo_green_light));
                            bt3.setBackgroundColor(ContextCompat.getColor(this, android.R.color.holo_green_light));
                            stop();
                            if (bt9.getText().equals("X")) {
                                X = String.valueOf(Integer.parseInt(tvX.getText().toString()) + 1);
                                tvX.setText(X);
                                setText = true;
                                turn.setText("X - Win");
                            } else {
                                O = String.valueOf(Integer.parseInt(tvO.getText().toString()) + 1);
                                tvO.setText(O);
                                setText = true;
                                turn.setText("O - Win");
                            }
                        } else if (bt9.getText().equals(bt7.getText()) && bt9.getText().equals(bt8.getText())) {
                            bt9.setBackgroundColor(ContextCompat.getColor(this, android.R.color.holo_green_light));
                            bt7.setBackgroundColor(ContextCompat.getColor(this, android.R.color.holo_green_light));
                            bt8.setBackgroundColor(ContextCompat.getColor(this, android.R.color.holo_green_light));
                            stop();
                            if (bt9.getText().equals("X")) {
                                X = String.valueOf(Integer.parseInt(tvX.getText().toString()) + 1);
                                tvX.setText(X);
                                setText = true;
                                turn.setText("X - Win");
                            } else {
                                O = String.valueOf(Integer.parseInt(tvO.getText().toString()) + 1);
                                tvO.setText(O);
                                setText = true;
                                turn.setText("O - Win");
                            }
                        } else if (bt9.getText().equals(bt5.getText()) && bt9.getText().equals(bt1.getText())) {
                            bt1.setBackgroundColor(ContextCompat.getColor(this, android.R.color.holo_green_light));
                            bt9.setBackgroundColor(ContextCompat.getColor(this, android.R.color.holo_green_light));
                            bt5.setBackgroundColor(ContextCompat.getColor(this, android.R.color.holo_green_light));
                            stop();
                            if (bt9.getText().equals("X")) {
                                X = String.valueOf(Integer.parseInt(tvX.getText().toString()) + 1);
                                tvX.setText(X);
                                setText = true;
                                turn.setText("X - Win");
                            } else {
                                O = String.valueOf(Integer.parseInt(tvO.getText().toString()) + 1);
                                tvO.setText(O);
                                setText = true;
                                turn.setText("O - Win");
                            }
                        } else {
                            CheckTik();
                        }
                    }
                } catch (Exception e) {
                    e.getMessage();
                }
                break;
            case R.id.refresh:
                try {
                    SetBlank();
                } catch (Exception e) {
                    e.getMessage();
                }
                break;
        }
    }


    @Override
    public void onBackPressed() {
        super.onBackPressed();
        try {
            SetBlank();

            tvX.setText("0");
            tvO.setText("0");
        } catch (Exception e) {
            e.getMessage();
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        try {
            SetBlank();

            tvX.setText("0");
            tvO.setText("0");
        } catch (Exception e) {
            e.getMessage();
        }
    }

    public void CheckTik(){
        if (!bt1.getText().equals("") && !bt2.getText().equals("") && !bt3.getText().equals("") && !bt4.getText().equals("") && !bt5.getText().equals("") && !bt6.getText().equals("") && !bt7.getText().equals("") && !bt8.getText().equals("") && !bt9.getText().equals("")){
            turn.setText("Draw");
        }
    }

    @SuppressLint("ResourceAsColor")
    public void SetBlank() {
        try {
            setText = true;
            turn.setText("Turn: O-player");

            bt1.setText("");
            bt2.setText("");
            bt3.setText("");
            bt4.setText("");
            bt5.setText("");
            bt6.setText("");
            bt7.setText("");
            bt8.setText("");
            bt9.setText("");

            button1 = true;
            button2 = true;
            button3 = true;
            button4 = true;
            button5 = true;
            button6 = true;
            button7 = true;
            button8 = true;
            button9 = true;

            bt1.setBackgroundColor(ContextCompat.getColor(this, R.color.buttonColor));
            bt2.setBackgroundColor(ContextCompat.getColor(this, R.color.buttonColor));
            bt3.setBackgroundColor(ContextCompat.getColor(this, R.color.buttonColor));
            bt4.setBackgroundColor(ContextCompat.getColor(this, R.color.buttonColor));
            bt5.setBackgroundColor(ContextCompat.getColor(this, R.color.buttonColor));
            bt6.setBackgroundColor(ContextCompat.getColor(this, R.color.buttonColor));
            bt7.setBackgroundColor(ContextCompat.getColor(this, R.color.buttonColor));
            bt8.setBackgroundColor(ContextCompat.getColor(this, R.color.buttonColor));
            bt9.setBackgroundColor(ContextCompat.getColor(this, R.color.buttonColor));
        } catch (Exception e) {
            e.getMessage();
        }
    }

    public void stop() {
        try {
            button1 = false;
            button2 = false;
            button3 = false;
            button4 = false;
            button5 = false;
            button6 = false;
            button7 = false;
            button8 = false;
            button9 = false;
        } catch (Exception e) {
            e.getMessage();
        }
    }
}
