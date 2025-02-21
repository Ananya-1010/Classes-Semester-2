

public class numericval {
    public static int sumofdigit(int value) {
        String st = Integer.toString(value);
        if (st.length() == 1) {
            return Character.getNumericValue(st.charAt(0));
        } else {
            return Character.getNumericValue(st.charAt(0)) + sumofdigit(Integer.parseInt(st.substring(1)));
        }
    }
    public static void main(String[] args) {
        System.out.println(sumofdigit(12345));
    }
}