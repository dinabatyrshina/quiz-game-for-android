package com.example.victorina;

public class TrueFalse {
    private int question;
    private boolean isTrueQuestion;

    public TrueFalse(int question, boolean isTrueQuestion){
        this.question = question;
        this.isTrueQuestion = isTrueQuestion;
    }

    public int getQuestion(){
        return question;
    }
    public void setQuestion(){
        this.question = question;
    }
    public boolean isTrueQuestion(){
        return isTrueQuestion;
    }
    public void setTrueQuestion(){
        this.isTrueQuestion = isTrueQuestion;
    }

}
