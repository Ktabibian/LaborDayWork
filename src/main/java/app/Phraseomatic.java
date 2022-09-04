package app;

public class Phraseomatic {
    public static void main(String[] args) {

        String[] adjectiveOne = {"Busy", "Smelly", "Lazy", "Coked-out", "Stressful"};
        String[] adjectiveTwo = {"Tired", "Focused", "Confused"};
        String[] theGuy = {"Coder", "Student", "Shmuck", "Specialist"};

        int first = adjectiveOne.length;
        int second = adjectiveTwo.length;
        int third = theGuy.length;

        int rand1 = (int) (Math.random() * first);
        int rand2 = (int) (Math.random() * second);
        int rand3 = (int) (Math.random() * third);

        String phrase = adjectiveOne[rand1] + ", " + adjectiveTwo[rand2] + " " + theGuy[rand3] + ".";

        System.out.println("We're gonna need to call up a " + phrase);
    }
}
