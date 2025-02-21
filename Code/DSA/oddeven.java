public class OddEven {

    public static String findOddEven(int num) {
        if (num == 0) {
            return "even";
        } else if (num == 1) {
            return "odd";
        } else {
            return findOddEven(num - 2);
        }
    }
    public static void main(String[] args) {
        int num=17232122;
        String result = findOddEven(num);
        System.out.println(num + " is " + result);
    }
}
