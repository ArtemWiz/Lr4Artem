public class Main {
    public static void main(String[] args)
    {
        //Number 1
        System.out.println(new StringBuffer("Hello").reverse());

        //Number 2

        String emoji2 = "\uD83C\uDF1F";
        String emoji3 = "\uD83C\uDF89";
        System.out.println(emoji2);
        System.out.println(emoji3);

        int unicodeCodePoint = 0x1F60A; // Код Unicode U+1F60A (😊)
        char[] emojiChars = Character.toChars(unicodeCodePoint);
        String emoji1 = new String(emojiChars);

        System.out.println(emoji1);

        //Number 3
        System.out.println(new StringBuffer("Java це краща мова для програмування").reverse());
    }
}