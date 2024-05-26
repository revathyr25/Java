package Files;

import java.io.*;

public class FileReadWrite {
    public static void main(String[] args) {
        try {
            BufferedWriter writer=new BufferedWriter(new FileWriter("file.txt"));
            writer.write("We have so many varieties of fruits around the world.");
            writer.write("Most of which we haven't seen or eaten.");
            writer.write("\nSome of the most common fruits are given below.");
            String[] fruits={"Apple","Orange","Grapes","PineApple"};
            for(String fruit:fruits){
                writer.write("\n"+fruit);
            }
            writer.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try {
            BufferedReader reader=new BufferedReader(new FileReader("file.txt"));
            String line;
            while ((line=reader.readLine())!=null){
                System.out.println(line);
            }
            reader.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
