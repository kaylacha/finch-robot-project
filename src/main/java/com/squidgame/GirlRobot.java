package com.squidgame;

import com.birdbrain.Finch;

public class GirlRobot {
    public static void main(String[] args) {
        Finch bird = new Finch();


        // Plays song before dancing
    
        bird.playNote(60, 2);
        bird.pause(2);
        bird.playNote(40, 2);
        bird.pause(2);
        bird.playNote(100, 2);
        bird.pause(2);


        


        /* 
         * Moves bird back and forth
         * 4 times w/ blue light
         */
        int i = 0;
        while(i < 2) {
            
            bird.setBeak(0, 80, 0);
            bird.pause(2);
            bird.setBeak(0, 0, 0);
            
            bird.setMove("F", 5, 100);
            bird.setMove("B", 5, 100);
            i++;
        }

        // Plays musical notes
        bird.playNote(60, 2);
        bird.pause(2);
        bird.playNote(40, 2);
        bird.pause(2);

        // Moves the bird 180 degrees
        bird.setTurn("R", 180, 100);

        /*
         * Moves bird back and forth
         * 4 times with red light
         */
        int a = 0;
        while(a < 2) {
            
            bird.setBeak(100, 0, 0);
            bird.pause(2);
            bird.setBeak(0, 0, 0);
            
            bird.setMove("F", 5, 100);
            bird.setMove("B", 5, 100);
            a++;
        }

        // Plays musical notes
        bird.playNote(60, 2);
        bird.pause(2);
        bird.playNote(100, 2);
        bird.pause(2);

        // Bird does a turn dance for 2 counts
        int c = 0;
        while(c < 2) {
            bird.setTurn("L" , 360, 100);
            bird.setTurn("R" , 360, 100);
            c++;
        }
        



        bird.stop();
        bird.disconnect();



    }
}