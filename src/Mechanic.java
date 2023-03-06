public class Mechanic {
    private String nameMechanic;
    private String сompany;

    public Mechanic(String nameMechanic, String company) {
        this.nameMechanic = nameMechanic;
        this.сompany = company;
    }

    public String getNameMechanic() {
        return nameMechanic;
    }

    public String getСompany() {
        return сompany;
    }

    public void PerformMaintenance() {
        System.out.println("Провести техобслуживание автомобиля - ");
    }

    public void FixTheCar() {
        System.out.println("Починить машину - ");
    }
    @Override
    public String toString() {
        return "Механик " + nameMechanic + "," +
                " место работы компания - " + сompany;
    }
}

