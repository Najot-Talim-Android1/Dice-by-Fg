package com.example.dicefg;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button cellButton1, cellButton2, cellButton3, cellButton4, cellButton5;
    Button cellButton6, cellButton7, cellButton8, cellButton9;
    Button cell2Button1, cell2Button2, cell2Button3, cell2Button4, cell2Button5;
    Button cell2Button6, cell2Button7, cell2Button8, cell2Button9;
    Button startButton;

    TextView counterText;

    int counter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cellButton1 = findViewById(R.id.cell_1_button);
        cellButton2 = findViewById(R.id.cell_2_button);
        cellButton3 = findViewById(R.id.cell_3_button);
        cellButton4 = findViewById(R.id.cell_4_button);
        cellButton5 = findViewById(R.id.cell_5_button);
        cellButton6 = findViewById(R.id.cell_6_button);
        cellButton7 = findViewById(R.id.cell_7_button);
        cellButton8 = findViewById(R.id.cell_8_button);
        cellButton9 = findViewById(R.id.cell_9_button);

        cell2Button1 = findViewById(R.id.cell2_1_button);
        cell2Button2 = findViewById(R.id.cell2_2_button);
        cell2Button3 = findViewById(R.id.cell2_3_button);
        cell2Button4 = findViewById(R.id.cell2_4_button);
        cell2Button5 = findViewById(R.id.cell2_5_button);
        cell2Button6 = findViewById(R.id.cell2_6_button);
        cell2Button7 = findViewById(R.id.cell2_7_button);
        cell2Button8 = findViewById(R.id.cell2_8_button);
        cell2Button9 = findViewById(R.id.cell2_9_button);

        startButton = findViewById(R.id.start_button);

        counterText = findViewById(R.id.counter_text);

        startButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                cellButton1.setBackgroundResource(R.drawable.shape_buttons_white);
                cellButton2.setBackgroundResource(R.drawable.shape_buttons_white);
                cellButton3.setBackgroundResource(R.drawable.shape_buttons_white);
                cellButton4.setBackgroundResource(R.drawable.shape_buttons_white);
                cellButton5.setBackgroundResource(R.drawable.shape_buttons_white);
                cellButton6.setBackgroundResource(R.drawable.shape_buttons_white);
                cellButton7.setBackgroundResource(R.drawable.shape_buttons_white);
                cellButton8.setBackgroundResource(R.drawable.shape_buttons_white);
                cellButton9.setBackgroundResource(R.drawable.shape_buttons_white);

                cell2Button1.setBackgroundResource(R.drawable.shape_buttons_white);
                cell2Button2.setBackgroundResource(R.drawable.shape_buttons_white);
                cell2Button3.setBackgroundResource(R.drawable.shape_buttons_white);
                cell2Button4.setBackgroundResource(R.drawable.shape_buttons_white);
                cell2Button5.setBackgroundResource(R.drawable.shape_buttons_white);
                cell2Button6.setBackgroundResource(R.drawable.shape_buttons_white);
                cell2Button7.setBackgroundResource(R.drawable.shape_buttons_white);
                cell2Button8.setBackgroundResource(R.drawable.shape_buttons_white);
                cell2Button9.setBackgroundResource(R.drawable.shape_buttons_white);

                randomDice();
                counterText.setText(String.valueOf(counter));
                counter = 0;
            }
        });

    }

    public void randomDice() {

        int a = 1, b = 5;

        int random_number = a + (int) (Math.random() * b);
        int random_number2 = a + (int) (Math.random() * b);

        switch (random_number) {
            case 1:
                cellButton5.setBackgroundResource(R.drawable.shape_buttons_black);
                counter++;
                break;
            case 2:
                cellButton1.setBackgroundResource(R.drawable.shape_buttons_black);
                cellButton9.setBackgroundResource(R.drawable.shape_buttons_black);
                counter += 2;
                break;
            case 3:
                cellButton3.setBackgroundResource(R.drawable.shape_buttons_black);
                cellButton5.setBackgroundResource(R.drawable.shape_buttons_black);
                cellButton7.setBackgroundResource(R.drawable.shape_buttons_black);
                counter += 3;
                break;
            case 4:
                cellButton1.setBackgroundResource(R.drawable.shape_buttons_black);
                cellButton3.setBackgroundResource(R.drawable.shape_buttons_black);
                cellButton7.setBackgroundResource(R.drawable.shape_buttons_black);
                cellButton9.setBackgroundResource(R.drawable.shape_buttons_black);
                counter += 4;
                break;
            case 5:
                cellButton1.setBackgroundResource(R.drawable.shape_buttons_black);
                cellButton3.setBackgroundResource(R.drawable.shape_buttons_black);
                cellButton5.setBackgroundResource(R.drawable.shape_buttons_black);
                cellButton7.setBackgroundResource(R.drawable.shape_buttons_black);
                cellButton9.setBackgroundResource(R.drawable.shape_buttons_black);
                counter += 5;
                break;
            case 6:
                cellButton1.setBackgroundResource(R.drawable.shape_buttons_black);
                cellButton3.setBackgroundResource(R.drawable.shape_buttons_black);
                cellButton4.setBackgroundResource(R.drawable.shape_buttons_black);
                cellButton6.setBackgroundResource(R.drawable.shape_buttons_black);
                cellButton7.setBackgroundResource(R.drawable.shape_buttons_black);
                cellButton9.setBackgroundResource(R.drawable.shape_buttons_black);
                counter += 6;
                break;
        }
        switch (random_number2) {
            case 1:
                cell2Button5.setBackgroundResource(R.drawable.shape_buttons_black);
                counter++;
                break;
            case 2:
                cell2Button1.setBackgroundResource(R.drawable.shape_buttons_black);
                cell2Button9.setBackgroundResource(R.drawable.shape_buttons_black);
                counter += 2;
                break;
            case 3:
                cell2Button3.setBackgroundResource(R.drawable.shape_buttons_black);
                cell2Button5.setBackgroundResource(R.drawable.shape_buttons_black);
                cell2Button7.setBackgroundResource(R.drawable.shape_buttons_black);
                counter += 3;
                break;
            case 4:
                cell2Button1.setBackgroundResource(R.drawable.shape_buttons_black);
                cell2Button3.setBackgroundResource(R.drawable.shape_buttons_black);
                cell2Button7.setBackgroundResource(R.drawable.shape_buttons_black);
                cell2Button9.setBackgroundResource(R.drawable.shape_buttons_black);
                counter += 4;
                break;
            case 5:
                cell2Button1.setBackgroundResource(R.drawable.shape_buttons_black);
                cell2Button3.setBackgroundResource(R.drawable.shape_buttons_black);
                cell2Button5.setBackgroundResource(R.drawable.shape_buttons_black);
                cell2Button7.setBackgroundResource(R.drawable.shape_buttons_black);
                cell2Button9.setBackgroundResource(R.drawable.shape_buttons_black);
                counter += 5;
                break;
            case 6:
                cell2Button1.setBackgroundResource(R.drawable.shape_buttons_black);
                cell2Button3.setBackgroundResource(R.drawable.shape_buttons_black);
                cell2Button4.setBackgroundResource(R.drawable.shape_buttons_black);
                cell2Button6.setBackgroundResource(R.drawable.shape_buttons_black);
                cell2Button7.setBackgroundResource(R.drawable.shape_buttons_black);
                cell2Button9.setBackgroundResource(R.drawable.shape_buttons_black);
                counter += 6;
                break;
        }

    }

}
