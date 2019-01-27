package exo.exothree;

public class Exothree {

    static int getAverage(String[] tab) throws NumberFormatException
    {
        int total = 0;
        int count = 0;
        while (count < tab.length) {
            try {
                total += Integer.parseInt(tab[count]);
                count++;
            }
            catch (NumberFormatException e){
                throw new RuntimeException("Function getAverage at index N°" + count + ", '" + tab[count] + "' is not an integer.");
            }
        }

        return (total / count);
    }

    public static void main(String[] args)
    {

        String[] tab = {"3", "2", "4"};
        int tabAverage;
        try {
            tabAverage = getAverage(tab);
            System.out.println("The average value of tab is " + tabAverage);
        }
        catch (RuntimeException e){
            System.out.println("Incorrect values, non integer number in tab. Error detected in 'getAverage'\n\n" + e);
        }

    }
}
