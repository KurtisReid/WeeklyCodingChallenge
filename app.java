import sun.misc.CharacterEncoder;

public class app {
    public static void main(String[] args) {
        /*


        The Atbash cipher is an encryption method in which each letter of a word is replaced with its "mirror" letter in the alphabet: A <=> Z; B <=> Y; C <=> X; etc.

Create a function that takes a string and applies the Atbash cipher to it.
         */
        System.out.println("hello");
        String s = "Hello world!";
        char[] art = s.toCharArray();
        String Ualphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        char Uarr[] = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();

        char arr[] = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        int front = 0;
        int flipped = 32;
        for (int i = 0; i < s.length(); i++)
        {
            if (art[i] == ' ')
            {

            }
            else if (!Character.isLetter(art[i]))
            {
                art[i] = art[i];
            }
            else if (Character.isLowerCase(art[i]))
            {
                art[i] = arr[25 - alphabet.indexOf(art[i])];
            }
            else if (!Character.isLowerCase(art[i]))
            {
                art[i] = Uarr[25 - Ualphabet.indexOf(art[i])];
            }
            System.out.println(art[i]);
        }
        System.out.println(art[0]);

    }
}
