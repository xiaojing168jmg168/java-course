public class TwoDArray {
    public static void main(String[] args) {
        String[][] cars = {
                {"Camaro", "Corvette", "Silverado"},
                {"Mustang", "Ranger", "F-150"},
                {"Ferrari", "Lambo", "Tesla"}
        };
        for (int i = 0; i < cars.length; i++) {
            System.out.println();
            for (int j = 0; j < cars[i].length; j++) {
                System.out.println(cars[i][j] + " ");
            }
        }

    }
}