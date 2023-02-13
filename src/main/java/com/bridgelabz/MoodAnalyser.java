package com.bridgelabz;

public class MoodAnalyser {

    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
    public String analyseMood() {
        if (message.contains("Sad")){
            return "SAD";
        }
        else {
            return "HAPPY";
        }
    }
}
