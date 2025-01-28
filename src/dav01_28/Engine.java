package dav01_28;

public class Engine
{
    private String type ;
    private int number;
    private double volume;

    public Engine(String type, int number, double v) {
        this.type = type;
        this.number = number;
        this.volume = v ;
    }

    public String getType() {
        return type;
    }

    public int getNumber(){
        return number;
    }

    public double getVolume() {
        return volume;
    }

    @Override
    public String toString() {
        return type +","+number+"," +  volume+",";
    }

}
