package encapsulationAndCopyObject;

public class Main {
    public static void main(String[] args) {
        // Encapsulation = attributes of a class will be hidden or private
        //                  can be accessed only through methods (getters and setters)
        //                  You should make attributes private if you don't have a reason to make them public/protected

        Car car1 = new Car("Chevrolet", "Camaro", 2020);
        Car car2 = new Car("Ford", "Mustang", 2022);

        System.out.println(car1);
        System.out.println(car2);
        System.out.println();
        System.out.println(car1.getMake());
        System.out.println(car1.getModel());
        System.out.println(car1.getYear());
        System.out.println();
        System.out.println(car2.getMake());
        System.out.println(car2.getModel());
        System.out.println(car2.getYear());

        System.out.println("-----------------");
        // copy object
        car2.copy(car1);
        System.out.println(car1);
        System.out.println(car2);
        System.out.println();
        System.out.println(car1.getMake());
        System.out.println(car1.getModel());
        System.out.println(car1.getYear());
        System.out.println();
        System.out.println(car2.getMake());
        System.out.println(car2.getModel());
        System.out.println(car2.getYear());

        System.out.println("-------------");
        // use construct
        Car car3 = new Car(car2);
        System.out.println(car3.getMake());
        System.out.println(car3.getModel());
        System.out.println(car3.getYear());
    }



}
