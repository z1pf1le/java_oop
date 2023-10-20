package solid;

public class SaveComputerToFile implements SaveInterface{
    public void saveToFile (String path, Computer cmp){
        System.out.println("saving to file" + path + " " + cmp);
    }
    public void saveToDB(String path, Computer cmp){
        System.out.println("saving to DB" + path + " " + cmp);
    }
}
