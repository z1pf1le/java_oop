import java.awt.*;

public class Properties{

    private int lineThickness;
    private String lineType;
    private Color color;

    Properties(int lineThickness, String lineType, Color color) {
        this.lineThickness = lineThickness;
        this.lineType = lineType;
        this.color = color;
    }

    enum Color {
        red,
        green,
        blue;
    }
}
