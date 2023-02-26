import java.util.Objects;

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

    @Override
    public String toString () {
        return "Водитель: " + getName() + " " + isDriverLicense() + " " + getExperienceInYear();
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Driver driver = (Driver) o;
        return Objects.equals(getName(), driver.getName()) && Objects.equals(isDriverLicense(), driver.isDriverLicense()) && Objects.equals(getExperienceInYear(), driver.getExperienceInYear());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), isDriverLicense(), getExperienceInYear());
    }
}
