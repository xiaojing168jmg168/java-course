package encapsulation;

public class Main {
    public static void main(String[] args) {
        // Encapsulation = attributes of a class will be hidden or private
        //                  can be accessed only through methods (getters and setters)
        //                  You should make attributes private if you don't have a reason to make them public/protected

        Car car = new Car("Chevrolet", "Camaro", 2020);
        System.out.println(car.getMake());
        car.setYear(2021);
        System.out.println(car.getModel() + " "+ car.getYear());
    }



}
