package Assign2;

public class Ques_two {

    public static void main(String[] args) {
        String str = "Sort the string";
        sort(str);

    }


    public static void sort(String str) {
        char[] chars = str.toCharArray();

        for (int i = 0; i < chars.length; i++) {

            for (int j = 0; j < chars.length; j++) {

                if (chars[i] < chars[j]) {
                    char l = chars[i];
                    chars[i] = chars[j];
                    chars[j] = l;
                }

            }

        }

        for (int k = 0; k < chars.length; k++) {
            System.out.println(chars[k]);
        }

    }
}
