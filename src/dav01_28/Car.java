package dav01_28;

public class Car {
    private String make;
    private String model;
    private int release;
    private int mileAge;
    private Engine engine;
    Car(String make,String model,int release,int mileAge, Engine engine){
        this.make=make;
        this.model=model;
        this.release=release;
        this.mileAge=mileAge;
        this.engine=engine;
    }
    public int getRelease(){
        return release;
    }
    public int getMileAge(){
        return mileAge;
    }
    public Engine getEngine(){
        return engine;
    }
    @Override
    public String toString() {
        return  make+","+model+","+release+","+mileAge+","+engine;
    }
}


