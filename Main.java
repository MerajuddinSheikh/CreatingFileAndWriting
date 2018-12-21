package filewrite;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class Main {

    public static void main(String[] args) throws Exception {
        try {
            File textFile = new File("f:\\the.txt");

            if (!textFile.exists()) {

                textFile.createNewFile();


                PrintWriter pw = new PrintWriter(textFile);
                pw.println("creating the new file and writing on it");
                pw.close();
            }


        } catch (IOException e) {
            e.printStackTrace();

        }

    }
}









