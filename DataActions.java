import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
public class DataActions {
    public static void main(String[] args) {
        Deque <String> deq1 = new ArrayDeque<>();
        Deque <String> deq2 = new ArrayDeque<>();
        deq1.add("12");
        deq1.add("3");
        deq1.add("13");
        deq1.add("-");
        deq2.add("14");
        deq2.add("15");
        deq2.add("41");
        deq2.add("-");
        StringBuilder sb1 = new StringBuilder();
        for (int i = deq1.size()-1; i >=0; i--) {
            sb1.append(deq1.pollLast());
        }
        StringBuilder sb2 = new StringBuilder();
        for (int i = deq2.size()-1; i >=0; i--) {
            sb2.append(deq2.pollLast());
        }
        String num1 = new StringBuilder(sb1).toString();
        String num2 = new StringBuilder(sb2).toString();
        int number1 = Integer.parseInt(num1);
        int number2 = Integer.parseInt(num2);
        int prod = number1*number2;
        int sum = number1+number2;
        System.out.println(sum);
        String prodStr = ""+prod;
        String sumStr = ""+sum;
        char[] chars = prodStr.toCharArray();
        LinkedList<Character> prodStrList = new LinkedList<>();
        for (int i = 0; i < chars.length; i++) {
            prodStrList.add(chars[i]);
        }
        System.out.println(prodStrList);
        char[] chars2 = sumStr.toCharArray();
        LinkedList<Character> sumStrList = new LinkedList<>();
        for (int i = 0; i < chars2.length; i++) {
            sumStrList.add(chars2[i]);
        }
        System.out.println(sumStrList);
    }
}
