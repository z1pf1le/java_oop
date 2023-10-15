package testobject;

public class ShopItem{

    public int size, id;
    public int weight;
    public int price;
    public String name;
    public static int count=1;

    {
        id = count++;
    }

    public ShopItem(int size, int weight, int price, String name) { //перегрузка 1 конструктора
        this.size = size;
        this.weight = weight;
        this.price = price;
        this.name = name;
    }
    
}
