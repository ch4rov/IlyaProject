package YouTubeLessons;
// youtu.be/FMf9ac790TE
public class TestJavaBean {
    private FrameCar frameCar;
    private Engine engine;
    private Vehicle vehicle;

    public void Car(){}

    public void TestJavaB7ean(FrameCar frameCar, Engine engine, Vehicle vehicle) {
        this.frameCar = frameCar;
        this.engine = engine;
        this.vehicle = vehicle;
    }

    public FrameCar getFrameCar() {
        return frameCar;
    }

    public void setFrameCar(FrameCar frameCar) {
        this.frameCar = frameCar;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }
}
