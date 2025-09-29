public class VarArgs {
    public static void main(String... args) {
        String[] splitStrings = "Hello world again".split(" ");
        printText(splitStrings);
        System.out.println("_".repeat(20));
        printText("Hello");
        System.out.println("_".repeat(20));
        printText("Hello","World","Amigos");
        System.out.println("_".repeat(20));
        printText();
        String[] sArray = {"first","second","third","fourth","fifth"};
        System.out.println(String.join(",",sArray));
    }

    private static void printText(String... textList) {
        for (String t : textList) {
            System.out.println(t);
        }
    }
}
