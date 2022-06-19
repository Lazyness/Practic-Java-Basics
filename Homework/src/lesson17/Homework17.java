package lesson17;

public class Homework17 {

    public static boolean ravenstvo(StringBuilder builder1, StringBuilder builder2) {
//        return builder1.toString().equals(builder2.toString());
//        return builder1.substring(0, builder1.length()).equals(builder2.substring(0, builder2.length()));
        if (builder1.length() == builder2.length()) {
            boolean flag = true;
            for (int i = 0; i < builder1.length(); i++) {
                if (builder1.charAt(i) != builder2.charAt(i)) {
                    flag = false;
                    break;
                }
            }
            return flag;
        } else return false;
    }

    public static void main(String[] args) {
        System.out.println(ravenstvo(new StringBuilder("Loi"), new StringBuilder("Loi")));
    }
}
