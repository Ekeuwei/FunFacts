package net.rveasy.funfacts;

import java.util.Random;

public class FactBook {
    // Field or Member Variables - Properties about the object

    String[] facts = {
            "Ants stretch when they wake up in the morning.",
            "Ostriches can run faster that horses",
            "Olympic gold medals are actually made mostly of silver",
            "It takes about 8 minutes fro light from the sun to reach the earth",
            "Some bamboo plants can grow almost a meter in just one day",
            "The state of Florida is bigger than England",
            "Some penguins can leap 2-3 meters out of the water",
            "On average, it takes 66 days to form a new habit",
            "Mammoths still walked the earth when the Great Pyramid was being built",
            "Team Treehouse is not actually in a tree"
    };

    // Methods - Actions the object can take

    public String getFact(){
        // Randomly select a fact
        Random randomGenerator = new Random();
        int randomNumber = randomGenerator.nextInt(facts.length);
        return facts[randomNumber];
    }
}
