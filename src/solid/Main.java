package solid;


public class Main {
    public static void main (String[] args) {

        Computer computer = new Computer("anus", 1488);
        SaveComputer saver = new SaveComputer();
        saver.saveToFile("out.dat", computer);

    }
}
//https://www.youtube.com/watch?v=uX8Ot1u3YV0




