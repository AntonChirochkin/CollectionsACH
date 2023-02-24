public class DriverB extends Driver {
    public DriverB(String name, boolean driverLicense, int experienceInYear) {
        super(name, driverLicense, experienceInYear);
    }

    @Override
    public void start() {
        System.out.println("Водитель категории B " + getName() + " начал движение.");
    }

    @Override
    public void finish() {
        System.out.println("Водитель категории B " + getName() + " закончил движение.");
    }

    @Override
    public void filling() {
        System.out.println("Водитель категории B " + getName() + " заправляет автомобиль.");

    }
}
