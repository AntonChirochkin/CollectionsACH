import static com.sun.tools.doclint.Entity.ge;

public class Mechanic {
    private String name;
    private String сompany;

    public Mechanic(String name, String company) {
        this.name = name;
        this.сompany = company;
    }

    public void PerformMaintenance() {
        System.out.println("Провести техобслуживание автомобиля - ");
    }

    public void FixTheCar() {
        System.out.println("Починить машину - ");
    }
}

