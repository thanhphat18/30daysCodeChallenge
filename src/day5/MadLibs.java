package src.day5;

import java.util.Random;
import java.util.Scanner;

public class MadLibs {
    Scanner scanner = new Scanner(System.in);
    String story;
    String name;
    String adjective1;
    String adjective2;
    String noun1;
    String noun2;
    String noun3;
    String adverb;
    String randomNums;
    Random random = new Random();

    //getters
    public String getStory(){
        return story;
    }

    public String getName(){
        return name;
    }

    public String getAdjective1(){
        return adjective1;
    }

    public String getAdjective2(){
        return adjective2;
    }

    public String getNoun1(){
        return noun1;
    }

    public String getNoun2(){
        return noun2;
    }

    public String getNoun3(){
        return noun3;
    }

    public String getAdverb(){
        return adverb;
    }

    public String getRandomNums(){
        return randomNums;
    }

    //Setters
    public void setStory(String story){
        this.story = story;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setAdjective1(String adjective1){
        this.adjective1 = adjective1;
    }
    public void setAdjective2(String adjective2){
        this.adjective2 = adjective2;
    }
    public void setNoun1(String noun1){
        this.noun1 = noun1;
    }
    public void setNoun2(String noun2){
        this.noun2 = noun2;
    }
    public void setNoun3(String noun3){
        this.noun3 = noun3;
    }
    public void setAdverb(String adverb){
        this.adverb = adverb;
    }
    public void setRandomNums(){
        int num = Math.abs(random.nextInt())%100;
        int index = 0;
        int[] numberHolder = new int[3];
        while(index < numberHolder.length){
            numberHolder[index] = num + index;
            index++;
        }

        randomNums = " not " + numberHolder[0] + ", not" + numberHolder[1] + ", but " + numberHolder[2];
 
    }

    public void printInstruction(){
        System.out.println("Welcome to Mad Libs! If you type in "
                            + "words, we'll give you a story. Start by typing in a name.");
    }

    //get data from user
    public void enterName(){
        setName(scanner.nextLine());
    }

    public void enterNoun1(){
        System.out.println("Enter a noun:");
        setNoun1(scanner.nextLine());
    }

    public void enterNoun2(){
        System.out.println("Enter another noun:");
        setNoun2(scanner.nextLine());
    }
    public void enterNoun3(){
        System.out.println("Enter a third noun:");
        setNoun3(scanner.nextLine());
    }
    public void enterAdjective1(){
        System.out.println("Enter an adjective:");
        setAdjective1(scanner.nextLine());
    }
    public void enterAdjective2(){
        System.out.println("Enter another adjective:");
        setAdjective2(scanner.nextLine());
    }
    public void enterAdverb(){
        System.out.println("Enter an adverb:");
        setAdverb(scanner.nextLine());
    }

    public void putTogetherTheStory() {
        String story;
        int num = Math.abs(random.nextInt()) % 4; // Changed to %4 to support 3 different stories + default
        if (num == 0) {
            story = "Today " + getName() + " and a group of friends decided to visit a mysterious " 
                    + getNoun1() + ". "
                    + "They discovered a " + getAdjective1() + " treasure hidden inside. Suddenly, they "
                    + "ran " + getAdverb() + " away from a giant " + getNoun2() + ". "
                    + "Later, they solved " + getRandomNums() + " puzzles "
                    + "and celebrated with " + getAdjective2() + " cake at the " + getNoun3() + ".";
        } else if (num == 1) {
            story = getName() + " took a trip to the ancient " + getNoun1() + ". "
                    + "There, a " + getAdjective1() + " map led them to a secret door. "
                    + "They had to " + getAdverb() + " dodge the traps set by a massive " + getNoun2() + ". "
                    + "It took " + getRandomNums() + " attempts, but they finally escaped "
                    + "and found a " + getAdjective2() + " crown hidden behind the " + getNoun3() + ".";
        } else if (num == 2) {
            story = "During summer break, " + getName() + " explored the local " + getNoun1() + ". "
                    + "Inside, they uncovered a " + getAdjective1() + " portal. "
                    + "Before stepping through, they " + getAdverb() + " waved goodbye to a friendly " + getNoun2() + ". "
                    + "On the other side, they counted " + getRandomNums() + " magical islands "
                    + "and made a " + getAdjective2() + " raft out of pieces of the " + getNoun3() + ".";
        } else {
            story = getName() + " built a secret base inside an abandoned " + getNoun1() + ". "
                    + "With a " + getAdjective1() + " blueprint in hand, they " + getAdverb() 
                    + " worked alongside a robotic " + getNoun2() + ". "
                    + "After " + getRandomNums() + " days, they finished a " + getAdjective2() 
                    + " fortress protected by a giant " + getNoun3() + ".";
        }
        setStory(story);
    }
    

    public void play(){
        enterName();
        enterNoun1();
        enterNoun2();
        enterNoun3();
        enterAdjective1();
        enterAdjective2();
        enterAdverb();
        setRandomNums();
        putTogetherTheStory();
        System.out.println(getStory());
    }
    

    public static void main(String[] args) {
        MadLibs game = new MadLibs();
        game.printInstruction();
        game.play();
    }
}
