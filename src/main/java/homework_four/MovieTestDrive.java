package homework_four;

public class MovieTestDrive {
    public static void main(String[] args) {
        Movie one = new Movie("Gone with the stock", "Tragic", -2);

        Movie two = new Movie("Lost in cubicle Space", "Comedy", 5);
        two.playIt();

        Movie three = new Movie("Byte Club", "Tragic but ultimately uplifting", 127);
    }
}
