public class Laptop {
    private final String name;
    private final int ram;
    private final int hd;
    private final String os;
    private final String color;

    public Laptop(String name, int ram, int hd, String os, String color) {
        this.name = name;
        this.ram = ram;
        this.hd = hd;
        this.os = os;
        this.color = color;
    }

    public Laptop (String name, Integer ram, Integer hd, String os, String color){
        this.name = name;
        this.ram = ram;
        this.hd = hd;
        this.os = os;
        this.color = color;
    }

    @Override
    public String toString() {
        return name + "; " +
                "ОЗУ:" + ram +  "; " +
                "Диск: " + hd + "; " +
                "ОС: " + os + "; " +
                "цвет:" + color + "; ";
    }
}
