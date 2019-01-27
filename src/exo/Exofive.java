package exo.exofive;

import java.util.ArrayList;

public class Exofive {
    String[] words = { "aas", "ace", "alu", "are", "api", "ays", "bec",
            "bel", "bey", "ben", "boy", "deb", "des", "dom",
            "dot", "daw", "fax", "fan", "faq", "fob", "hem",
            "hop", "man", "mao", "mug","mus", "mie", "sur",
            "dey", "mur"
    };

    public ArrayList<String> usedWords = new ArrayList<>();

    public void getNeighbors (String compared)
    {
        for (String s: words)
        {
            if (getNumber(s, compared) < 2 && getNumber(s, compared) != 0 && usedWords.contains(s) == false) {
                usedWords.add(compared);
                getNeighbors(s);
            }
        }
    }

    public void goToWord(String from, String to)
    {
        getNeighbors(from);
        if (usedWords.indexOf(to) != -1)
            System.out.println("Il faut " + usedWords.indexOf(to) + " coups pour passer de \"" + from + "\" à \"" + to + "\"");
        else
        {
            System.out.println("Pas de possibilités de passer de \"" + from + "\" à \"" + to + "\"");
        }
    }

    public int getNumber(String arrayWord, String current)
    {
        int i = 0;
        int count = 0;
        while (i < current.length())
        {
            if (arrayWord.indexOf(current.charAt(i)) == -1)
                count++;
            i++;
        }
        return count;
    }

    public static void main(String[] args) {
        Exofive exoFive = new Exofive();
        exoFive.goToWord("bel", "bey");
        //exofive.getNeighbors("bel");
    }
}
