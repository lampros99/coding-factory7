package gr.aueb.cf.ch7;

public class StrConcatApp {
    public static void main(String[] args) {
    String s1 = "Coding";
    String s2 = "Factory";


    String s3 = s1 + s2;   //is Overloaded
    String s4 = s1.concat(s2);

    String s5 = s1 + " " + s2;

    String s6 = s1.concat(" ").concat(s2); //Method chaining


    }

}