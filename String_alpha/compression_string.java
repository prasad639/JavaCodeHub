
public class compression_string {
    public static String compression(String str) {
        Integer count = 1;
        String new_str = "";
        for (int i = 0; i < str.length(); i++) {
            while (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) { // aaabbbcd
                count++;
                i++;

            }
            new_str = new_str + str.charAt(i);

            if (count > 1) {
                new_str += count.toString();
            }
            count = 1;

        }
        return new_str;
    }

    public static void main(String args[]) {

        String str = "abcdaa";

        System.out.println(compression(str));

    }

}
