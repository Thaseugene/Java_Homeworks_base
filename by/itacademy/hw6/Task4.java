package by.itacademy.hw6;

public class Task4 {

    public static void main(String[] args) {
        int first = 3;
        int second = 56;
        StringBuilder str1 = new StringBuilder();
        StringBuilder str2 = new StringBuilder();
        StringBuilder str3 = new StringBuilder();

        str1.append(first).append(" + ").append(second).append(" = ").append(first+second);
        str2.append(first).append(" - ").append(second).append(" = ").append(first-second);
        str3.append(first).append(" * ").append(second).append(" = ").append(first*second);

        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);

        str1.replace(str1.indexOf("="),(str1.indexOf("=")+1),"equal");
        str2.replace(str2.indexOf("="),(str2.indexOf("=")+1),"equal");
        str3.replace(str3.indexOf("="),(str3.indexOf("=")+1),"equal");

        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
    }

}
