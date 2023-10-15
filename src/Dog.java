public class Dog{

    private String name = "";
    private Foot foot = new Foot();
    private int id = -1;
    //инициализация
    {
        name = "";
        Stat.counter++;
        id = ++Stat.id;
    }
    //конструктор без аргумента
    Dog() {}
    //конструктор c аргументом
    Dog(String name) {
        this.name = name;
    }
    
    void run() { //метод
        foot.run();
    }

    class Foot { //внутренний класс
        void run() {
            System.out.println("dog " + name +" running");
        }
    }

    static class Stat {
        public static int counter = 0;
        private static int id = 0;
    }
}
