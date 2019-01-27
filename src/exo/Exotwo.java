package exo.exotwo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;

public class Exotwo {

    ArrayList<Integer> listValue = new ArrayList<Integer>();
    ArrayList<String> listEmail = new ArrayList<String>();
    BufferedReader reader;
    String file;

    public Exotwo(String file)
    {
        this.file = file;
        try {
            this.reader = new BufferedReader(new FileReader(file));
            if (this.reader != null) {
                String line;

                while ((line = this.reader.readLine()) != null) {
                    this.listEmail.add(line.split(":")[0]);
                    this.listValue.add(Integer.parseInt(line.substring(line.indexOf(":") + 1)));
                }
            }
        }
        catch (IOException ex)
        {
            ex.printStackTrace();
        }
    }

    public void studentValue(String email)
    {
        System.out.println("Value of " + email + " is " + this.listValue.get(this.listEmail.indexOf(email)));
    }

    public void getAverage()
    {
        int i = 0;
        int sum = 0;
        while (i < this.listValue.size()){
            sum += this.listValue.get(i);
            i++;
        }
        System.out.println("Average = " + sum / this.listValue.size());
    }

    public void readTxtFile()
    {
        try {
            this.reader = new BufferedReader(new FileReader(this.file));
            if (this.reader != null) {
                String line;
                while ((line = this.reader.readLine()) != null) {
                    System.out.println(line);
                }
            }
        }
        catch (IOException ex)
        {
            ex.printStackTrace();
        }
    }

    public static void main(String[] args)
    {
        String file = "test.txt";
        Instant start = Instant.now();
        Exotwo exofile = new Exotwo(file);
        exofile.readTxtFile();
        exofile.getAverage();
        exofile.studentValue("arnde.mia@gmail.com");
        Duration duration = Duration.between(start, Instant.now());
        System.out.println("Done in " + duration);
    }
}
