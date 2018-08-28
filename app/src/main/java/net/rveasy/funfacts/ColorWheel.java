package net.rveasy.funfacts;

import android.graphics.Color;

import java.util.Random;

public class ColorWheel {
    // Field or Member Variables - Properties about the object

    String[] colors = {
            "#39add1", // light blue
            "#3079ab", // dark blue
            "#c25975", // red
            "#e15258", // orange
            "#f9845b", // orange
            "#838cc7", // lavender
            "#7d669e", // purple
            "#53bbb4", // aqua
            "#51b46d", // green
            "#e0ab18", // mustard
            "#637a91", // dark gray
            "#f092b0", // pink
            "#b7c0c7" // light gray
    };

    // Methods - Actions the object can take

    public int getColor(){
        // Randomly select a fact
        Random randomGenerator = new Random();
        int randomNumber = randomGenerator.nextInt(colors.length);
        return Color.parseColor(colors[randomNumber]);
    }
}
