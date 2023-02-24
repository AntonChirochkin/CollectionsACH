import java.util.List;

public class Car extends Transport<DriverB> {
    Bodytape bodyTape;

    public Car(String brand, String model, double engineVolume, DriverB driver, Bodytape bodyTape, List<Mechanic>mechanicList) {
        super(brand, model, engineVolume, driver, mechanicList);
        this.bodyTape = bodyTape;
    }


    @Override
    public void start() {
        System.out.println("Автомобиль марки " + getBrand() + " начал движение.");
    }

    @Override
    public void finish() {
        System.out.println("Автомобиль марки " + getBrand() + " закончил движение.");
    }

    @Override
    public void pitStop() {
        System.out.println("Пит-стоп автомобиля");
    }

    @Override
    public void BestLapTimes() {
        int minVolumeMin = 2;
        int maxVolumeMin = 7;
        int bestLapTimesMin = (int) (maxVolumeMin + (maxVolumeMin - minVolumeMin) * Math.random()); // в данной строке мы привели значения к переменной int и создали формулу лучшего времени круга в минутах для автобусов
        System.out.println("Лучшее время круга для автомобиля " + bestLapTimesMin + " минут.");
    }

    @Override
    public void maxSpeed() {
        int minVolume = 170;
        int maxVolume = 305;
        int maxSpeed = (int) (maxVolume + (maxVolume - minVolume) * Math.random()); // в данной строке мы привели значения к переменной int и создали формулу выборы случайного значения скорости в диапазоне от 100 до 200
        System.out.println("Максимальная скорость автомобиля " + maxSpeed);
    }

    @Override
    public String toString() {
        return "Transport: " +
                "Марка - " + getBrand() + "," +
                " Модель - " + getModel() + "," +
                " Мощность двигателя - " + getEngineVolume() + "," +
                " водитель - " + getDriver().getName() +
                " Тип кузова - " + bodyTape;
    }

    @Override
    public Type getType() {
        return Type.CAR;
    }

    @Override
    public void printTipe() {
        System.out.println(getBrand() + " " + getModel() + " " + bodyTape);
    }

    @Override
    public boolean passDiagnostics() {
        return this.isDiagnosticsPassed();
    }
}

enum Bodytape {
    SEDAN("СЕДАН"),
    HATBACK("ХЕТЧБЭК"),
    COUPE("КУПЕ"),
    UNIVERSAL("УНИВЕРСАЛ"),
    JEEP("ВНЕДОРОЖНИК"),
    CROSSOVER("КРОССОВЕР"),
    PICKUP("ПИКАП"),
    VAN("ФУРГОН"),
    MINIVAN("МИНИВЭН");
    String bodyTape;

    Bodytape(String bodyTape) {
        this.bodyTape = bodyTape;
    }

    public String getBodyTape() {
        return bodyTape;
    }

    @Override
    public String toString() {
        return bodyTape;
    }
}