public class Main {
    public static void main(String[] args) {
        Bicycle bicycle = new Bicycle("bmv", 2);
        Car car = new Car("bmv", 4);
        Truck truck = new Truck("truck", 6);

        ServiceStation station = new ServiceStation();
        station.check(bicycle, car, truck);
    }

}