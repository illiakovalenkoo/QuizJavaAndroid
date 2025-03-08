package com.example.quiz;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private TextView question_label;
    private Button btn_next, btn_correct, btn_incorrect;
    private int question_index = 0, count_correct_answers = 0;

    private Question[] questions = new Question[] {
            new Question(true, R.string.question_1),
            new Question(false, R.string.question_2),
            new Question(true, R.string.question_3),
            new Question(false, R.string.question_4),
            new Question(true, R.string.question_5)

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        question_label = findViewById(R.id.question_label);
        btn_correct= findViewById(R.id.btn_correct);
        btn_incorrect = findViewById(R.id.btn_incorrect);
        btn_next = findViewById(R.id.btn_next);

        question_label.setText(questions[question_index].getQuestion());

        btn_correct.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkAnswer(true);
            }
        });

        btn_incorrect.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkAnswer(false);
            }
        });

        btn_next.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                if(question_index != questions.length - 1) {
                    question_index++;
                    question_label.setText(questions[question_index].getQuestion());
                    btn_correct.setVisibility(View.VISIBLE);
                    btn_incorrect.setVisibility(View.VISIBLE);
                    btn_next.setVisibility(View.INVISIBLE);
                } else {
                    question_label.setText("Congratulations! Your result: " + count_correct_answers + "/" + questions.length);
                    question_label.setTextColor(Color.GREEN);
                    btn_next.setVisibility(View.INVISIBLE);
                }
            }
        });
    }

    private void checkAnswer(boolean answer) {
        if(answer == questions[question_index].isCorrect()) {
            count_correct_answers++;
            Toast.makeText(this, "Great, your answer is correct", Toast.LENGTH_LONG).show();
        } else {
            Toast.makeText(this, "Your answer is incorrect", Toast.LENGTH_LONG).show();
        }

        btn_next.setVisibility(View.VISIBLE);
        btn_correct.setVisibility(View.INVISIBLE);
        btn_incorrect.setVisibility(View.INVISIBLE);
    }
}