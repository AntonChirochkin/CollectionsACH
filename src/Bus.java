import java.util.List;

public class Bus extends Transport<DriverD> {

    Size size;
    public Bus(String brand, String model, double engineVolume, DriverD driver, Size size, List<Mechanic> mechanicList) {
        super(brand, model, engineVolume, driver, mechanicList);
        this.size = size;
    }

    Size getSize() {
        return size;
    }

    @Override
    public void start() {
        System.out.println("Автобус марки " + getBrand() + " начал движение.");
    }

    @Override
    public void finish() {
        System.out.println("Автобус марки " + getBrand() + " закончил движение.");
    }



    @Override
    public void pitStop() {
        System.out.println("Пит-стоп автобуса");
    }

    @Override
    public void BestLapTimes() {
        int minVolumeMin = 6;
        int maxVolumeMin = 14;
        int bestLapTimesMin = (int) (maxVolumeMin + (maxVolumeMin - minVolumeMin) * Math.random()); // в данной строке мы привели значения к переменной int и создали формулу лучшего времени круга в минутах для автобусов
        System.out.println("Лучшее время круга для автобуса " + bestLapTimesMin +" минут.");
    }

    @Override
    public void maxSpeed() {
        int minVolume = 60;
        int maxVolume = 170;
        int maxSpeed = (int) (maxVolume + (maxVolume - minVolume) * Math.random()); // в данной строке мы привели значения к переменной int и создали формулу выборы случайного значения скорости в диапазоне от 100 до 200
        System.out.println("Максимальная скорость автобуса " + maxSpeed);
    }
    @Override
    public String toString () {
        return "Transport: " +
                "Марка - " + getBrand() + "," +
                " Модель - " + getModel() + "," +
                " Мощность двигателя - " + getEngineVolume() + "," +
                " водитель - " + getDriver().getName() +
                " Вместительностью салона - " + size + " " + getMechanicList();
    }
    @Override
    public Type getType() {
        return Type.BUS;
    }
    @Override
    public void printTipe() {
        System.out.println(getBrand() + " " + getModel() + " " + size);
    }

    //    @Override
//    public boolean diagnostics() throws TransportTypeException {
//        throw new TransportTypeException("");
//    }
    @Override
    public boolean passDiagnostics() throws TransportTypeException {
        throw new TransportTypeException("Автобусы диагностику проходить не должны");
    }
}

enum Size{
    XS (0,10),
    S(11,25),
    M(26,50),
    L(51,80),
    XL(81,120);

    private int min;
    private int max;

    Size(int min, int max) {
        this.min = min;
        this.max = max;
    }

    Size() {
    }
    public int getMin() {
        return min;
    }

    public int getMax() {
        return max;
    }

    @Override
    public String toString() {
        return " от " +
                min +
                ", до " + max;
    }
}
