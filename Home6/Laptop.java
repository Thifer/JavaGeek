package Home6;

public class Laptop {
    private final int ram;
    private final int HDD;
    private final String os;
    private final String color;

    public Laptop(int ram,int HDD,String os,String color){
        this.ram = ram;
        this.HDD = HDD;
        this.os = os;
        this.color = color;
    }

    public int getHDD() {
        return HDD;
    }

    public int getRam() {
        return ram;
    }

    public String getColor() {
        return color;
    }

    public String getOs() {
        return os;
    }
    @Override
    public String toString(){
        return "ram: " + ram + "GB, HDD: " + HDD + "GB, OS: " + os + ", color: " + color;
    }
}
