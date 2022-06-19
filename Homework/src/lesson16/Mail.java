package lesson16;

public class Mail {
    public void email2(String str) {
        int start, protoEnd, end = 0;
        while (end < str.length() - 1) {
            start = str.indexOf('@',end);
            protoEnd = str.indexOf('.',end);
            end = str.indexOf(';',end+1);
            System.out.println(str.substring(start+1,protoEnd));
        }
    }


    public void email(String str) {
        int countSymbol = searchCountSymbol('@', str);

        int indexDog = str.indexOf('@');
        int indexDot = str.indexOf('.');

        while (countSymbol > 0) {

            int i = indexDog + 1;

            for (; i < indexDot; i++) {
                System.out.print(str.charAt(i));
            }
            System.out.println();
            indexDog = str.indexOf('@', i);
            indexDot = str.indexOf('.', i + 1);

            countSymbol--;
        }
    }

    private int searchCountSymbol(char symbol, String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i) == '@') {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Mail mail = new Mail();
        mail.email("ya@yak.com; ka@kai.ru;    lo@golij.lo;");
        System.out.println();
        mail.email2("ya@yak.com; ka@kai.ru;    lo@golij.lo;");

    }
}
