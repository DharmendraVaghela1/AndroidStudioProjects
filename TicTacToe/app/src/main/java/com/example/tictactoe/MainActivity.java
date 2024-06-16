package com.example.tictactoe;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    Button[] buttons = new Button[9];
    int flag = 0;
    int count = 0;
    String[] board = new String[9];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    public void init() {
        for (int i = 0; i < 9; i++) {
            String buttonID = "btn" + (i + 1);
            int resID = getResources().getIdentifier(buttonID, "id", getPackageName());
            buttons[i] = findViewById(resID);
            buttons[i].setOnClickListener(this::check);
            board[i] = "";
        }
    }

    public void newGame() {
        for (int i = 0; i < 9; i++) {
            board[i] = "";
            buttons[i].setText("");
        }
        flag = 0;
        count = 0;
    }

    public void check(View view) {
        Button btnCurr = (Button) view;
        int index = Integer.parseInt(btnCurr.getTag().toString());

        if (board[index].equals("")) {
            if (flag == 0) {
                btnCurr.setText("X");
                board[index] = "X";
                flag = 1;
                count++;
            } else {
                btnCurr.setText("O");
                board[index] = "O";
                count++;
                flag = 0;
            }

            if (count >= 5) {
                checkForWinner();
            }
        }
    }

    private void checkForWinner() {
        // Your existing winner checking logic
    }

    public void resetGame(View view) {
        newGame();
        Toast.makeText(this, "Game Reset", Toast.LENGTH_SHORT).show();
    }
}
