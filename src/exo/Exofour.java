package exo.exofour;


import java.util.Arrays;

public class Exofour {

    private static void isInAlphabet(String alphabet, String string)
    {
        boolean bool;
        int i = 0;
        int j = 0;
        while (i < string.length())
        {
            bool = false;
            while (j < alphabet.length())
            {
                if (alphabet.charAt(j) == string.charAt(i)) {
                    bool = true;
                }
                j++;
            }
            if (!bool) {
                System.out.println(string.charAt(i) + "is not in alphabet");
            }
            i++;
        }
    }

    private static boolean isAnagram(String first, String second)
    {
        char tempFirst[] = first.toCharArray();
        char tempSecond[] = second.toCharArray();
        Arrays.sort(tempFirst);
        Arrays.sort(tempSecond);

        if (tempFirst == tempSecond)
        {
            return true;
        }
        return false;
    }

    private static void isContaining(String first, String second)
    {
        if (first.indexOf(second) == 0)
        {
            first = first.replace(second, "");
            System.out.println(first);
        }
    }

    public static void main(String[] args)
    {

    }
}
