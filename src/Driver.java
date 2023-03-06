public abstract class Driver {
    private String name;
    private boolean driverLicense;
    private int experienceInYear;

    public Driver(String name, boolean driverLicense, int experienceInYear) {
        this.name = name;
        this.driverLicense = driverLicense;
        this.experienceInYear = experienceInYear;
    }

    public String getName() {
        return name;
    }

    public boolean isDriverLicense() {
        return driverLicense;
    }

    public int getExperienceInYear() {
        return experienceInYear;
    }

    public abstract void start();

    public abstract void finish();

    public abstract void filling();
}
