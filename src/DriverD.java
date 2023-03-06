public class DriverD extends Driver{
    public DriverD(String name, boolean driverLicense, int experienceInYear) {
        super(name, driverLicense, experienceInYear);
    }

    @Override
    public void start() {
        System.out.println("Водитель категории D " + getName() + " начал движение.");
    }

    @Override
    public void finish() {
        System.out.println("Водитель категории D " + getName() + " закончил движение.");
    }

    @Override
    public void filling() {
        System.out.println("Водитель категории D " + getName() + " заправляет автобус.");

    }
}
