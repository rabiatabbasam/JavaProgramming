package day42_Exceptions;

class FadyException extends RuntimeException{//Custom unchecked exception

    public FadyException() {
        super("Time for short break");
    }
        public FadyException(String message){
        super(message);
    }
}

class NoBreakException extends Exception{// Custom Checked Exceptions

}




public class CustomExceptions {
    public static void main(String[] args) {
      //  throw new FadyException("Its time for lunch break");


        try {
            throw new NoBreakException();
        } catch (NoBreakException e) {
            e.printStackTrace();
        }
    }
}
