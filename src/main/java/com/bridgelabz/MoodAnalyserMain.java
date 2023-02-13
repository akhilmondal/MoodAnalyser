package com.bridgelabz;

public class MoodAnalyserMain {

    public static void main(String[] args) {

        MoodAnalyser moodAnalyser =  new MoodAnalyser();
        moodAnalyser.setMessage("Sad");
        String mood = moodAnalyser.analyseMood();
        System.out.println(mood);

    }
}
