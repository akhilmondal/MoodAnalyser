package com.bridgelabz;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MoodAnalyserTest {
    @Test
    void MoodAnalyserShouldGiveSadAsOutPut() {
        var moodTest = new MoodAnalyser();
        assertEquals("SAD",moodTest.analyseMood());
    }



}