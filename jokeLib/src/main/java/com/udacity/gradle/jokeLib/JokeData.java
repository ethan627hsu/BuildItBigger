package com.udacity.gradle.jokeLib;

public class JokeData {
    private static String[] jokes = new String[]{
            "Why did the fat turkey cross the road?\n" + "\n" + "To get hit by my car.",
            "Why did George W. Bush cross the road?\n" + "\n" + "To ask his dad how to run the presidency.",
            "Why did the gum cross the road? \n" + "\n" + "Because it was stuck to the chicken's foot.",
            "Why did the woman cross the road?\n" + "\n" + "I don't know, but where'd she get shoes and what is she doing out of the kitchen?",
            "Why did the calf cross the road?\n" + "\n" + "To get to the udder side.",
            "Why did the one-handed man cross the road?\n" + "\n" + "To get to the second hand shop.",
            "Why did the turkey cross the road?\n" + "\n" + "Because he wasn't a chicken.",
    };

    public static String[] getAllJokes() {
        return jokes;
    }

    public static String getJoke(int index) {
        return jokes[index];
    }

    public static String getRandomJoke() {
        double randomValue = Math.random();
        int length = jokes.length;
        double splitVal = ( (double) 1 / (double) length);

        double minDiff = 1;
        int minIndex = 0;
        for (int i = 0; i < length; i++) {
            double currentDiff = randomValue - (i * splitVal);
            if (Math.abs(currentDiff) < Math.abs(minDiff)) {
                minDiff = currentDiff;
                minIndex = i;
            }

        }
        return jokes[minIndex];
    }
}
