public class Anus {
    int diameter;

    Srat srat = new Srat();

    Anus(int diameter) {
        this.diameter = diameter;
        }
    public int getSquare(){
        return diameter*diameter;
    }
    class Srat{
        void makeShit() {
            System.out.println("make " + diameter+ " shit");
        }
    }
}
