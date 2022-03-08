package tasks;

public class Arrays {
    public static void main(String[] args) {
        int[] numbers = {40, 55, 63, 17, 22, 68, 89, 97, 89};
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();


        String[] cars = {"Subaru", "BMW", "Suzuki"};
        System.out.println(cars[2]);
        cars[2] = "Honda";
        System.out.println(cars.length);

        for (String car : cars) {
            System.out.println(car);
        }
    }
}
