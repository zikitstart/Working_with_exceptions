package Transport;

public class Trucks extends Transport implements Competing {

    public Trucks(String brand, String model, double engineVolume) {
        super(brand, model, engineVolume);
    }

    @Override
    public void startMoving() {
        System.out.println("Грузовой автомобиль начал движение");
    }
    @Override
    public void finishTheMovement() {
        System.out.println("Грузовой автомобиль закончил движение");
    }

    @Override
    public boolean passDiagnostics() {
        return false;
    }

    @Override
    public double pitStop() {
        System.out.println("Пит-стоп.");
        return 0;
    }
    @Override
    public double bestLapTime() {
        System.out.println("Лучшее время круга.");
        return 0;
    }
    @Override
    public int maxSpeed() {
        System.out.println("Максимальная скорость.");
        return 0;
    }

    @Override
    public String toString() {
        return "{Брэнд: " + getBrand() +
                " / Модель: " + getModel() +
                " / Объем двигателя: " + getEngineVolume() + " литра}";
    }
}