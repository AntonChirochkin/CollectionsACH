import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Mechanic mechanic1 = new Mechanic("Иванов Андрей Петрович", "Гаечный ключ");
        Mechanic mechanic2 = new Mechanic("Сидоров Юрий Иванович", "Колесо");
        Mechanic mechanic3 = new Mechanic("Петров Михаил Борисович", "Бора");



        DriverB driverB1 = new DriverB("Иван cat. B ", true, 5);
        DriverB driverB2 = new DriverB("Владимир cat. B ", true, 5);
        DriverB driverB3 = new DriverB("Сергей cat. B ", true, 5);

        Car car = new Car("Audi", "SQ8", 435.0, driverB1, Bodytape.COUPE,(List<Mechanic>) mechanic1);
        Car car2 = new Car("BMV", "X7", 530, driverB2, Bodytape.UNIVERSAL,(List<Mechanic>) mechanic2);
        Car car3 = new Car("Mersedes", "GLS", 612, driverB3, Bodytape.JEEP, (List<Mechanic>) mechanic3);


        DriverD driverD1 = new DriverD("Кирилл cat. D ", true, 10);
        DriverD driverD2 = new DriverD("Александр cat. D ", true, 10);
        DriverD driverD3 = new DriverD("Михаил cat. D ", true, 10);

        Bus bus = new Bus("Лиаз", "667", 175, driverD1, Size.S,(List<Mechanic>) mechanic1);
        Bus bus2 = new Bus("ЛАЗ", "695", 150, driverD2, Size.XS,(List<Mechanic>) mechanic2);
        Bus bus3 = new Bus("Икарус", "250 SL", 258, driverD3, Size.XL,(List<Mechanic>) mechanic3);


        DriverC driverC1 = new DriverC("Борис cat. C ", true, 7);
        DriverC driverC2 = new DriverC("Илья cat. C ", true, 7);
        DriverC driverC3 = new DriverC("Тимур cat. C ", true, 7);

        Lorry lorry = new Lorry("Камаз", "5490", 428, driverC1, LoadСapacity.N1,(List<Mechanic>) mechanic1);
        Lorry lorry2 = new Lorry("Scania", "R", 730, driverC2, LoadСapacity.N2,(List<Mechanic>) mechanic2);
        Lorry lorry3 = new Lorry("Iveco", "S-Way", 400, driverC3, LoadСapacity.N3,(List<Mechanic>) mechanic3);

        List<Transport> list = new ArrayList<>();
        list.add(car);
        list.add(car2);
        list.add(car3);
        list.add(bus);
        list.add(bus2);
        list.add(bus3);
        list.add(lorry);
        list.add(lorry2);
        list.add(lorry3);

        car.mechanicList.add(mechanic1);
        car.mechanicList.add(mechanic2);
        car.mechanicList.add(mechanic3);

        bus.mechanicList.add(mechanic3);
        bus2.mechanicList.add(mechanic3);
        bus3.mechanicList.add(mechanic3);

        lorry.mechanicList.add(mechanic3);
        lorry2.mechanicList.add(mechanic3);
        lorry3.mechanicList.add(mechanic3);


    }

}