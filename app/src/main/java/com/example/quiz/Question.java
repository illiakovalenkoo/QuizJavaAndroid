package com.example.quiz;

public class Question {

    private int question;
    private boolean isCorrect;

    public Question(boolean isCorrect, int question) {
        this.isCorrect = isCorrect;
        this.question = question;
    }

    public int getQuestion() {
        return question;
    }

    public void setQuestion(int question) {
        this.question = question;
    }

    public boolean isCorrect() {
        return isCorrect;
    }

    public void setCorrect(boolean correct) {
        isCorrect = correct;
    }
}
