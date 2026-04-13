import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        String line;
        
        while((line = reader.readLine()) != null) {
            writer.write(line);
            writer.newLine();
        }
        
        
        writer.flush();
        reader.close();
        
    }
}