import java.util.Scanner;
class Main {
    public static void main(String[] args) {
//          Task 1
        Scanner userInputNum = new Scanner(System.in);
//        Scanner userInputToAction = new Scanner(System.in);
        System.out.println("Введите число: ");
        int triangleNum = userInputNum.nextInt();
        int distSumNum = 0;
        int distMultNum = 1;
        for(int i = 1; i <= triangleNum; i++) {
            distSumNum += i;
            distMultNum *= i;
        }
        System.out.println("Сумма чисел от 1 до n: " + distSumNum + "\nПроизведение чисел от 1 до n: " + distMultNum);
//        Task 2
        System.out.println(getPrimes(1000));
//        Task 3
//        System.out.println("Выберите действие: +, -, *, /");
//        String userAction = userInputToAction.nextLine();
        System.out.println("Введите два числа: ");
        int userNum1 = userInputNum.nextInt();
        int userNum2 = userInputNum.nextInt();
        System.out.println("Сложение: " + (userNum1 + userNum2) + "\nВычитание: " + (userNum1 - userNum2) + "\nУмножение: " + (userNum1 * userNum2) + "\nДеление: " + (userNum1 / userNum2));
        }
//        Task 2
    public static boolean isPrime(int num) {
        for(int i = 2; i < num; i++) {
            if(num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static int[] getPrimes(int num) {
        int[] primeList = new int[num];
        for (int i = 2; i <= num; i++) {
            if (isPrime(i)) {
                primeList[primeList.length - 1] = i;
            }
        }
        return primeList;
    }
}
