package gr.aueb.cf.ch9;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

public class PrintStreamWithMethod {
    public static void main(String[] args) {

        try(PrintStream ps = new PrintStream(new FileOutputStream("C:\\Users\\User\\OneDrive\\Desktop\\Νέος φάκελος\\MyProjects.txt",true),
                true, StandardCharsets.UTF_8)){
            printMessage(ps, "Hello coding factory");
            printMessage(System.out, "Hello cf!");

        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public static void printMessage(PrintStream ps, String message){
        ps.println(message);
    }
}
