package classes;

public class Bicycle {


    public void start() {
        System.out.println("Поехали!");
    }

    public class Beep { //нестатический вложенный класс

        public void beep() {
            System.out.println("BEEP");

        }
    }
}