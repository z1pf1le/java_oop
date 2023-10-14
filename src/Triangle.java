public class Triangle{

    Point pt = new Point();
    public int x1, y1, x2, y2, x3, y3;
    Point pt1 = new Point(x1, y1);
    Point pt2 = new Point(x2, y2);
    Point pt3 = new Point(x3, y3);

    Triangle() {};

    Triangle (int x1, int y1, int x2, int y2, int x3, int y3) { //перегрузка 1 конструктора
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        this.x3 = x3;
        this.y3 = y3;
    }

}
