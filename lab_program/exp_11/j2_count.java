package exp_11;// Java program to count t// number of lines, words, sentences,
// characters, and whitespaces in a file
import java.io.*;
import java.util.Scanner;

public class j2_count {
    public static void main(String[] args)
            throws IOException
    {
        String str = "lab_program//exp_11//" + args[0];
        File file = new File(str);
        FileInputStream fi= new FileInputStream(file);
        InputStreamReader ir = new InputStreamReader(fi);
        BufferedReader br = new BufferedReader(ir);

//        Scanner sc = new Scanner(file);
        String line;
        int word = 0;
        int chars = 0;
        int linec = 0;

        while ((line = br.readLine() )!=null) {
                chars += line.length();
                String[] words = line.split("\\s+");
                word+= words.length;


            linec+=1;
        }
        System.out.println("Total word count = "+ word);

        System.out.println("Total number of characters = "+ chars);
        System.out.println("Total number of lines = " + linec);
    }
}
