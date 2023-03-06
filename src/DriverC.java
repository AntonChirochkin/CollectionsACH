public class DriverC extends Driver{
    public DriverC(String name, boolean driverLicense, int experienceInYear) {
        super(name, driverLicense, experienceInYear);
    }
    @Override
    public void start() {
        System.out.println("Водитель категории C " + getName() + " начал движение.");
    }

    @Override
    public void finish() {
        System.out.println("Водитель категории C " + getName() + " закончил движение.");
    }

    @Override
    public void filling() {
        System.out.println("Водитель категории C " + getName() + " заправляет грузовик.");

    }
}