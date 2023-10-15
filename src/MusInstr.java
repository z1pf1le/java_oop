public class MusInstr{

    public int type;
    public String name;
//    private Stat stat =
    //инициализация
    {
        Stat.counter=10;
    }

    MusInstr(int type, String name){
        this.type = type;
        this.name = name;
    }

//    Stat stat = new Stat();

    static class Stat {

        Stat(int type){}
        public static int counter;
    }

}
