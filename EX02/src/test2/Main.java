package test2;

interface CarInfo {
    String carList();
}

class Car implements CarInfo {
    private String carName;
    private String carManufacturingCompany;
    private int carReleaseYear;
    private int carPrice;

    public Car(String carName, String carManufacturingCompany, int carReleaseYear, int carPrice) {
        this.carName = carName;
        this.carManufacturingCompany = carManufacturingCompany;
        this.carReleaseYear = carReleaseYear;
        this.carPrice = carPrice;
    }

    @Override
    public String carList() {
        return String.format("%s, %s, %d, %d", carName, carManufacturingCompany, carReleaseYear, carPrice);
    }
}

public class Main {
    public static void main(String[] args) {
        // 3개 이상의 자동차 객체 생성
        Car car1 = new Car("아반뗴 AD", "현대", 2015, 10000000);
        Car car2 = new Car("C-Class", "Mercedes-Benz", 2022, 55000);
        Car car3 = new Car("911", "Porsche", 2020, 100000);

        // 각 자동차 객체의 정보 출력
        System.out.println(car1.carList());
        System.out.println(car2.carList());
        System.out.println(car3.carList());
    }
}
