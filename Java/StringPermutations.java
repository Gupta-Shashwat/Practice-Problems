public class StringPermutations {
    public static String[] arr = { ".", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };

    public static void printPermutations(String str, String permut) {
        if (str.length() == 0) {
            System.out.println(permut);
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            char currChar = str.charAt(i);
            String newPermut = permut + currChar;
            String newStr = str.substring(0, i) + str.substring(i + 1);
            printPermutations(newStr, newPermut);
        }
    }

    public static void main(String[] args) {
        String str = "asdfghjk";
        String permut = "";
        printPermutations(str, permut);
    }
}