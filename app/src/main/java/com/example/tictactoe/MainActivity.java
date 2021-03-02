package com.example.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public int turns = 0;
    public int score1 = 0;
    public int score2 = 0;
    public int player = 1;
    public boolean win = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        int[] squares = {0, 0, 0, 0, 0, 0, 0, 0, 0};

        final Button top1 = findViewById(R.id.top1);
        top1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                TextView header = findViewById(R.id.textView);
                if (!win && squares[0] == 0) {
                    if (player == 1) {
                        squares[0] = player;
                        top1.setText("X");
                    } else {
                        squares[0] = player;
                        top1.setText("O");
                    }
                    if (player == squares[1] && player == squares[2]) {
                        win = true;
                    } else if (player == squares[3] && player == squares[6]) {
                        win = true;
                    } else if (player == squares[4] && player == squares[8]) {
                        win = true;
                    }
                    if (win) {
                        String message = "Player " + player + " Wins!";
                        header.setText(message);
                        if (player == 1) {
                            score1++;
                            TextView score = findViewById(R.id.score1);
                            score.setText(Integer.toString(score1));
                        } else {
                            score2++;
                            TextView score = findViewById(R.id.score2);
                            score.setText(Integer.toString(score2));
                        }
                    }
                    turns++;
                    if (!win && turns == 9) {
                        String message = "Draw Game!";
                        header.setText(message);
                    }
                    if (player == 1) {
                        player = 2;
                    } else {
                        player = 1;
                    }
                }
            }
        });

        final Button top2 =  findViewById(R.id.top2);
        top2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                TextView header = findViewById(R.id.textView);
                if (!win && squares[1] == 0) {
                    if (player == 1) {
                        squares[1] = player;
                        top2.setText("X");
                    } else {
                        squares[1] = player;
                        top2.setText("O");
                    }
                    if (player == squares[0] && player == squares[2]) {
                        win = true;
                    } else if (player == squares[4] && player == squares[7]) {
                        win = true;
                    }
                    if (win) {
                        String message = "Player " + player + " Wins!";
                        header.setText(message);
                        if (player == 1) {
                            score1++;
                            TextView score = findViewById(R.id.score1);
                            score.setText(Integer.toString(score1));
                        } else {
                            score2++;
                            TextView score = findViewById(R.id.score2);
                            score.setText(Integer.toString(score2));
                        }
                    }
                    turns++;
                    if (!win && turns == 9) {
                        String message = "Draw Game!";
                        header.setText(message);
                    }
                    if (player == 1) {
                        player = 2;
                    } else {
                        player = 1;
                    }
                }
            }
        });

        final Button top3 =  findViewById(R.id.top3);
        top3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                TextView header = findViewById(R.id.textView);
                if (!win && squares[2] == 0) {
                    if (player == 1) {
                        squares[2] = player;
                        top3.setText("X");
                    } else {
                        squares[2] = player;
                        top3.setText("O");
                    }
                    if (player == squares[0] && player == squares[1]) {
                        win = true;
                    } else if (player == squares[5] && player == squares[8]) {
                        win = true;
                    } else if (player == squares[4] && player == squares[6]) {
                        win = true;
                    }
                    if (win) {
                        String message = "Player " + player + " Wins!";
                        header.setText(message);
                        if (player == 1) {
                            score1++;
                            TextView score = findViewById(R.id.score1);
                            score.setText(Integer.toString(score1));
                        } else {
                            score2++;
                            TextView score = findViewById(R.id.score2);
                            score.setText(Integer.toString(score2));
                        }
                    }
                    turns++;
                    if (!win && turns == 9) {
                        String message = "Draw Game!";
                        header.setText(message);
                    }
                    if (player == 1) {
                        player = 2;
                    } else {
                        player = 1;
                    }
                }
            }
        });

        final Button mid1 =  findViewById(R.id.mid1);
        mid1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                TextView header = findViewById(R.id.textView);
                if (!win && squares[3] == 0) {
                    if (player == 1) {
                        squares[3] = player;
                        mid1.setText("X");
                    } else {
                        squares[3] = player;
                        mid1.setText("O");
                    }
                    if (player == squares[4] && player == squares[5]) {
                        win = true;
                    } else if (player == squares[0] && player == squares[6]) {
                        win = true;
                    }
                    if (win) {
                        String message = "Player " + player + " Wins!";
                        header.setText(message);
                        if (player == 1) {
                            score1++;
                            TextView score = findViewById(R.id.score1);
                            score.setText(Integer.toString(score1));
                        } else {
                            score2++;
                            TextView score = findViewById(R.id.score2);
                            score.setText(Integer.toString(score2));
                        }
                    }
                    turns++;
                    if (!win && turns == 9) {
                        String message = "Draw Game!";
                        header.setText(message);
                    }
                    if (player == 1) {
                        player = 2;
                    } else {
                        player = 1;
                    }
                }
            }
        });

        final Button mid2 =  findViewById(R.id.mid2);
        mid2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                TextView header = findViewById(R.id.textView);
                if (!win && squares[4] == 0) {
                    if (player == 1) {
                        squares[4] = player;
                        mid2.setText("X");
                    } else {
                        squares[4] = player;
                        mid2.setText("O");
                    }
                    if (player == squares[3] && player == squares[5]) {
                        win = true;
                    } else if (player == squares[1] && player == squares[7]) {
                        win = true;
                    } else if (player == squares[0] && player == squares[8]) {
                        win = true;
                    } else if (player == squares[2] && player == squares[6]) {
                        win = true;
                    }
                    if (win) {
                        String message = "Player " + player + " Wins!";
                        header.setText(message);
                        if (player == 1) {
                            score1++;
                            TextView score = findViewById(R.id.score1);
                            score.setText(Integer.toString(score1));
                        } else {
                            score2++;
                            TextView score = findViewById(R.id.score2);
                            score.setText(Integer.toString(score2));
                        }
                    }
                    turns++;
                    if (!win && turns == 9) {
                        String message = "Draw Game!";
                        header.setText(message);
                    }
                    if (player == 1) {
                        player = 2;
                    } else {
                        player = 1;
                    }
                }
            }
        });

        final Button mid3 =  findViewById(R.id.mid3);
        mid3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                TextView header = findViewById(R.id.textView);
                if (!win && squares[5] == 0) {
                    if (player == 1) {
                        squares[5] = player;
                        mid3.setText("X");
                    } else {
                        squares[5] = player;
                        mid3.setText("O");
                    }
                    if (player == squares[3] && player == squares[4]) {
                        win = true;
                    } else if (player == squares[2] && player == squares[8]) {
                        win = true;
                    }
                    if (win) {
                        String message = "Player " + player + " Wins!";
                        header.setText(message);
                        if (player == 1) {
                            score1++;
                            TextView score = findViewById(R.id.score1);
                            score.setText(Integer.toString(score1));
                        } else {
                            score2++;
                            TextView score = findViewById(R.id.score2);
                            score.setText(Integer.toString(score2));
                        }
                    }
                    turns++;
                    if (!win && turns == 9) {
                        String message = "Draw Game!";
                        header.setText(message);
                    }
                    if (player == 1) {
                        player = 2;
                    } else {
                        player = 1;
                    }
                }
            }
        });

        final Button bot1 =  findViewById(R.id.bot1);
        bot1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                TextView header = findViewById(R.id.textView);
                if (!win && squares[6] == 0) {
                    if (player == 1) {
                        squares[6] = player;
                        bot1.setText("X");
                    } else {
                        squares[6] = player;
                        bot1.setText("O");
                    }
                    if (player == squares[7] && player == squares[8]) {
                        win = true;
                    } else if (player == squares[3] && player == squares[0]) {
                        win = true;
                    } else if (player == squares[4] && player == squares[2]) {
                        win = true;
                    }
                    if (win) {
                        String message = "Player " + player + " Wins!";
                        header.setText(message);
                        if (player == 1) {
                            score1++;
                            TextView score = findViewById(R.id.score1);
                            score.setText(Integer.toString(score1));
                        } else {
                            score2++;
                            TextView score = findViewById(R.id.score2);
                            score.setText(Integer.toString(score2));
                        }
                    }
                    turns++;
                    if (!win && turns == 9) {
                        String message = "Draw Game!";
                        header.setText(message);
                    }
                    if (player == 1) {
                        player = 2;
                    } else {
                        player = 1;
                    }
                }
            }
        });

        final Button bot2 =  findViewById(R.id.bot2);
        bot2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                TextView header = findViewById(R.id.textView);
                if (!win && squares[7] == 0) {
                    if (player == 1) {
                        squares[7] = player;
                        bot2.setText("X");
                    } else {
                        squares[7] = player;
                        bot2.setText("O");
                    }
                    if (player == squares[6] && player == squares[8]) {
                        win = true;
                    } else if (player == squares[4] && player == squares[1]) {
                        win = true;
                    }
                    if (win) {
                        String message = "Player " + player + " Wins!";
                        header.setText(message);
                        if (player == 1) {
                            score1++;
                            TextView score = findViewById(R.id.score1);
                            score.setText(Integer.toString(score1));
                        } else {
                            score2++;
                            TextView score = findViewById(R.id.score2);
                            score.setText(Integer.toString(score2));
                        }
                    }
                    turns++;
                    if (!win && turns == 9) {
                        String message = "Draw Game!";
                        header.setText(message);
                    }
                    if (player == 1) {
                        player = 2;
                    } else {
                        player = 1;
                    }
                }
            }
        });

        final Button bot3 =  findViewById(R.id.bot3);
        bot3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                TextView header = findViewById(R.id.textView);
                if (!win && squares[8] == 0) {
                    if (player == 1) {
                        squares[8] = player;
                        bot3.setText("X");
                    } else {
                        squares[8] = player;
                        bot3.setText("O");
                    }
                    if (player == squares[7] && player == squares[6]) {
                        win = true;
                    } else if (player == squares[5] && player == squares[2]) {
                        win = true;
                    } else if (player == squares[4] && player == squares[0]) {
                        win = true;
                    }
                    if (win) {
                        String message = "Player " + player + " Wins!";
                        header.setText(message);
                        if (player == 1) {
                            score1++;
                            TextView score = findViewById(R.id.score1);
                            score.setText(Integer.toString(score1));
                        } else {
                            score2++;
                            TextView score = findViewById(R.id.score2);
                            score.setText(Integer.toString(score2));
                        }
                    }
                    turns++;
                    if (!win && turns == 9) {
                        String message = "Draw Game!";
                        header.setText(message);
                    }
                    if (player == 1) {
                        player = 2;
                    } else {
                        player = 1;
                    }
                }
            }
        });

        final Button reset =  findViewById(R.id.reset);
        reset.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                for (int i = 0; i < 9; i++) {
                    squares[i] = 0;
                }
                top1.setText("");
                top2.setText("");
                top3.setText("");
                mid1.setText("");
                mid2.setText("");
                mid3.setText("");
                bot1.setText("");
                bot2.setText("");
                bot3.setText("");
                turns = 0;
                win = false;
                TextView name = findViewById(R.id.textView);
                name.setText("TicTacToe!");
            }
        });
    }
}