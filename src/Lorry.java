import java.util.List;

public class Lorry extends Transport<DriverC> {

    LoadСapacity loadСapacity;

    public Lorry(String brand, String model, double engineVolume, DriverC driver, LoadСapacity loadСapacity, List<Mechanic> mechanicList) {
        super(brand, model, engineVolume, driver, mechanicList);
        this.loadСapacity = loadСapacity;
    }

    LoadСapacity getLoadСapacity() {
        return loadСapacity;
    }

    @Override
    public void start() {
        System.out.println("Грузовик марки " + getBrand() + " начал движение.");
    }

    @Override
    public void finish() {
        System.out.println("Грузовик марки " + getBrand() + " закончил движение.");
    }

    @Override
    public void pitStop() {
        System.out.println("Пит-стоп грузовика");
    }

    @Override
    public void BestLapTimes() {
        int minVolumeMin = 9;
        int maxVolumeMin = 16;
        int bestLapTimesMin = (int) (maxVolumeMin + (maxVolumeMin - minVolumeMin) * Math.random()); // в данной строке мы привели значения к переменной int и создали формулу лучшего времени круга в минутах для грузовика
        System.out.println("Лучшее время круга для грузовика " + bestLapTimesMin + " минут.");
    }

    @Override
    public void maxSpeed() {
        int minVolume = 90;
        int maxVolume = 170;
        int maxSpeed = (int) (maxVolume + (maxVolume - minVolume) * Math.random()); // в данной строке мы привели значения к переменной int и создали формулу выборы случайного значения скорости в диапазоне от 100 до 200
        System.out.println("Максимальная скорость грузовика " + maxSpeed);
    }

    @Override
    public String toString () {
        return "Transport: " +
                "Марка - " + getBrand() + "," +
                " Модель - " + getModel() + "," +
                " Мощность двигателя - " + getEngineVolume() + "," +
                " водитель - " + getDriver().getName() +
                " Грузоподъемностью - " + loadСapacity;
    }
    @Override
    public Type getType() {
        return Type.LORRY;
    }
    @Override
    public void printTipe() {
        System.out.println(getBrand() + " " + getModel() + " " + loadСapacity);
    }
    @Override
    public boolean passDiagnostics() {
        return this.isDiagnosticsPassed();
    }
}

enum LoadСapacity {
    N1(0f, 3.5f),
    N2(3.6f, 12f),
    N3(12.1f, 100f);
    private Float loadMin;
    private Float loadMax;

    LoadСapacity(Float loadMin, Float loadMax) {
        this.loadMin = loadMin;
        this.loadMax = loadMax;
    }

    LoadСapacity() {
    }

    public float getLoadMin() {
        return loadMin;
    }
    public float getLoadMax() {
        return loadMax;
    }

//    public static LoadCapacity getValue(Float value) {
//        for (LoadСapacity e : LoadСapacity.values()) {
//            if (value >= e.getLoadMin() && value <= e.getLoadMax()) {
//                return e;
//            }
//        }
//        return null;
//    }

    @Override
    public String toString() {
        return  " от " + loadMin +
                ", до " + loadMax + " " + super.toString();
    }
}