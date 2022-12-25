package day42_Exceptions;

public class MorningWorkOut {

    public static void main(String[] args) throws InterruptedException {


        System.out.println("------------Push up started----------------");

        for (int i = 1; i <=30 ; i++) {
            System.out.println("\rPush up 1"+i);

            sleep(1.5);

        }


        System.out.println("\n------------Push ups Completed--------------------------");

        System.out.println("------------Pull up started----------------");

        for (int i = 1; i <=20 ; i++) {
            System.out.println("\rPull up 1"+i);

                sleep(2.5);

        }

        System.out.println("\n------------Pull ups Completed--------------------------");
    }
    public static void sleep(double seconds){
        try {
            Thread.sleep((long) (seconds * 1000) );
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }









}
