import java.util.Scanner;

public class Second {
    public static void main(String[] args) {
        int array[] = new int[3];

        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 2; i++) {
            System.out.print("Вкажіть довжину  катета: ");
            int number = scanner.nextInt();
            array[i] = number;
        }

        array[2] = (int) Math.sqrt(Math.pow(array[0], 2) + Math.pow(array[1], 2));
        System.out.println("Площа: " + (array[0] * array[1] * 1/2));
        System.out.println("Периметир: " + (array[0] + array[1] + array[2]));
    }
}
