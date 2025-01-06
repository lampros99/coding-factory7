package gr.aueb.cf.ch9;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class CitiesIOApp {
    public static void main(String[] args) throws IOException {
        String line;
        String[] cities;
        File dir = new File("C:\\Users\\User\\file\\io.txt");

        if(!dir.exists()){
            if(!dir.mkdirs()){
                System.err.println("Error in mkdir");
                System.exit(1);
            }
        }

        try(BufferedReader bf = new BufferedReader(new FileReader("C:\\Users\\User\\file\\io.txt"))) {
            File grFile, usaFile, deFile;

            while ((line = bf.readLine()) != null){
                cities = line.split(" +");
                switch (cities[0]){
                    case "Greece":
                        grFile = new File(dir + "/" + "gr.txt");
                        PrintStream gr = new PrintStream(grFile, StandardCharsets.UTF_8);
                        print(gr, "GR Cities");
                        print(gr, cities);
                        break;
                    case "USA":
                        usaFile = new File(dir + "/" + "usa.txt");
                        PrintStream usa = new PrintStream(usaFile, StandardCharsets.UTF_8);
                        print(usa, "USA Cities");
                        print(usa, cities);
                        break;
                    case "German":
                        deFile = new File(dir + "/" + "de.txt");
                        PrintStream de = new PrintStream(deFile, StandardCharsets.UTF_8);
                        print(de, "DE Cities");
                        print(de, cities);
                        break;
                    default:
                        System.out.println("Error in cities");
                }
            }
        }catch (IOException e){
            System.err.println("Error." + e.getMessage());
        }
    }

    public static void print(PrintStream ps, String[] tokens){
        for(int i = 1; i < tokens.length; i++){
            ps.print(tokens[i] + " ");
            
        }
    }

    public static void print(PrintStream ps, String message){
        ps.println(message);
    }
}
