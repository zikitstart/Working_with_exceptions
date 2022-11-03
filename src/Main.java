import Driver.CategoryB;
import Driver.CategoryC;
import Driver.CategoryD;
import Transport.Bus;
import Transport.Car;
import Transport.Transport;
import Transport.Trucks;

public class Main {
    public static void main(String[] args) {

        boolean success = Data.validate("pogoro","123456123","123456123");

        System.out.println(success);
        System.out.println("##################");

        Car car1 = new Car("Audi","A8 50 L TDI quattro",3.0);
        Car car2 = new Car("BMW","Z8",3.0);
        Car car3 = new Car("Kia","Sportage 4",2.4);
        Car car4 = new Car("Hyundai","Avante",1.6);

        Trucks trucks1 = new Trucks ("Mercedes-Benz","B-901" , 6.6);
        Trucks trucks2 = new Trucks("Nissan", "399", 6.2);
        Trucks trucks3 = new Trucks("Chevrolet","M700", 7.5);
        Trucks trucks4 = new Trucks("Scania","T540", 8.7);

        Bus bus1 = new Bus("Hyundai","Н350",5.5);
        Bus bus2 = new Bus("Kia","Н508",4.6);
        Bus bus3 = new Bus("Икарус","399",4.8);
        Bus bus4 = new Bus("Iveco","320",5.1);

        CategoryB<Car> driverB = new CategoryB<>("Сергей", true, 2);
        CategoryC<Trucks> driverC = new CategoryC<>("Григорий", true, 4);
        CategoryD<Bus> driverD = new CategoryD<>("Станислав", true, 1);

        service(car1,car2,car3,car4,
                trucks1,trucks2,trucks3,trucks4,
                bus1,bus2,bus3,bus4);

        driverB.race(car2);
        driverC.race(trucks3);
        driverD.race(bus3);
    }
    private static void service(Transport... transports) {
        for (Transport transport : transports) {
            serviceTransport(transport);
        }
    }
    private static void serviceTransport(Transport transport) {
        try {
            if (!transport.passDiagnostics()){
                throw new RuntimeException("Автомобиль: " + transport.getBrand() + " " + transport.getModel() + " не прошёл диагностику.");
            }
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }
}