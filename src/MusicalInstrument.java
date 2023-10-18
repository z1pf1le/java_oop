public class MusicalInstrument {
    private String name;
    private int type;
    private Dimensions dimensions;
    private double price;
    private int yearOfProduction;

    //конструктор c аргументом
    public MusicalInstrument(String name, int type, Dimensions dimensions, double price, int yearOfProduction) {
        this.name = name;
        this.type = type;
        this.dimensions = dimensions;
        this.price = price;
        this.yearOfProduction = yearOfProduction;
//        InstrumentStatistics.addInstrument(MusicalInstrument);

    }

    public String getName() {
        return name;
    }

    public int getType() {
        return type;
    }

    public Dimensions getDimensions() {
        return dimensions;
    }

    public double getPrice() {
        return price;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    public static class Dimensions {
        private int height;
        private int width;

        public Dimensions(int height, int width) {
            this.height = height;
            this.width = width;
        }

        public int getHeight() {
            return height;
        }

        public int getWidth() {
            return width;
        }
    }

    public static class InstrumentStatistics {
        private static int[] typeCount; // Массив для хранения количества объектов по типам инструментов

        static {
            typeCount = new int[10]; // Предполагаем, что у нас есть 10 типов инструментов, можете изменить по своему усмотрению
        }

        public static void addInstrument(MusicalInstrument instrument) {
            int type = instrument.getType();
            if (type >= 0 && type < typeCount.length) {
                typeCount[type]++;
            }
        }

        public static int getTypeCount(int type) {
            if (type >= 0 && type < typeCount.length) {
                return typeCount[type];
            }
            return 0;
        }
    }
}

