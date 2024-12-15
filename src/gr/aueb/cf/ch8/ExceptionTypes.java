package gr.aueb.cf.ch8;

import java.io.IOException;

public class ExceptionTypes {
    public static void main(String[] args) {

    }

    public static char readOneChar() throws IOException {
        return (char) System.in.read();
    }

    public static char readAnotherChar() {
        try{
            return (char) System.in.read();
        } catch (IOException e){
            System.err.println(e.getMessage());
            return ' ' ;
        }
    }

    public static char readAnotherOneChar() throws IOException{
        try{
            return (char) System.in.read();
        } catch (IOException e){
            System.err.println(e.getMessage());
            throw e;
        }
    }

    public static char readAgainOneChar(char ch) throws IOException{
        try {
            char inputChar = (char) System.in.read();
            if (inputChar != ch) throw new IllegalArgumentException("Char not fit");
            return inputChar;
        } catch (IOException | IllegalArgumentException e){
            e.printStackTrace();
            System.err.println(e.getMessage());
            throw e;
        }

//        } catch (IllegalArgumentException x1){
//            x1.printStackTrace();
//            System.err.println(x1.getMessage());
//            throw x1;
//        }catch (IOException x2){
//            x2.printStackTrace();
//            System.err.println(x2.getMessage());
//            throw x2;
//        }
//
    }
}
