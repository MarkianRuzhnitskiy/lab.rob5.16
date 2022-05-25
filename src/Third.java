public class Third {
    public static void main(String[] args) {
        double number = Math.round(Math.random() * 100);
        int num = (int)number;
        int x1;
        int x2;
        int x3;
        x1 = num / 100;
        x2 = (num % 100) / 10;
        x3 = num % 10;
        System.out.println("Число: " + num);
        if (x1 != 0){
            System.out.println("Кількість цифр: 3");
        }
        else if (x1 == 0 && x2 != 0){
            System.out.println("Кількість цифр: 2");
        }
        else if (x1 == 0 && x2 == 0 && x3 != 0){
            System.out.println("Кількість цифр: 1");
        }
        else if (x1 == 0 && x2 == 0 && x3 == 0){
            System.out.println("Кількість цифр: 0");
        }
    }
}
