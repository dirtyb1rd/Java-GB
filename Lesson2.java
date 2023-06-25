public class Lesson2 {
    public static void main(String[] args) {
        String str = "qwe";
        StringBuilder sb = new StringBuilder(str);
        sb.append('A'); // add element to end of StringBuilder
        System.out.println(manySymbols(10, "d", "r"));
    }

    public static String manySymbols(int N, String c1, String c2) {
        StringBuilder symbolCreate = new StringBuilder();
        for (int i = 0; i <= N; i++) {
            if (i % 2 == 0) {
                symbolCreate.append(c1);
            } else {
                symbolCreate.append(c2);
            }
        }
        return symbolCreate.toString();
    }

    public static String StrComposer(String str) {
        if (str == " ") return str;
        String stroka = new String();
        stroka += str.charAt(0);
        int count = 1;
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == str.charAt(i - 1)) {
                count++;
            }
        }
        return str;
    }
}
