package testobject;

import java.util.Scanner;

public class Computer {

    private String name;
    private int ram;
    int hdd;
    double weight;

    public  Computer(){

    }
    public Computer(String name, int ram, int hdd, double weight){
        this.name = name;
        this.hdd = hdd;
        this.ram = ram;
        this.weight = weight;
    }


    public void on (){
        print ( "turned on " + name );
    }

    public void off (){
        print ( "turned off" );
    }

    public void load (){
        print ( "loading " + ram );
    }

    public void userInterface(){
        Scanner s = new Scanner(System.in);
        System.out.println("insert command");
        String string = s.nextLine();
        System.out.println("your command is "+string);
            if(Integer.parseInt(string)==1){
            on ();
            load();
        }
            else {off();}

    }


    protected void print (String str){
        System.out.println ( str );
    }


    public String getName (){
        return name;
    }

    public void setName (String newName){
        name = newName;
    }

    public int getRam (){
        return ram;
    }

    public void setRam (int newRam){
        if(newRam > 0) {
            ram = newRam;
        } else {
            System.out.println ( "value " + newRam + " can't be negative!" );
        }
    }
}

