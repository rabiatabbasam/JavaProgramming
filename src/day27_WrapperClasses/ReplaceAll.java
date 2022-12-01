package day27_WrapperClasses;

import java.util.Arrays;

public class ReplaceAll {

    public static void main(String[] args) {
        int[] arr = {10,10,20,30,40,30,30,30};
  //                  0  1  2  3  4  5  6   7
        arr = replaceAll(arr,30,300);

        System.out.println(Arrays.toString(arr));

    }




// replaces all the matching old values with the new value
    public static int[] replaceAll(int[] array,int oldValue,int newValue){

        for (int i = 0; i < array.length; i++) {

            if(array[i]==oldValue){// equal operator
                array[i]= newValue;//assignment operator
            }
        }
        return array;
    }


    // replaces all the matching old values with the new value
    public static double[] replaceAll(double[] array,double oldValue,double newValue){

        for (int i = 0; i < array.length; i++) {

            if(array[i]==oldValue){// equal operator
                array[i]= newValue;//assignment operator
            }
        }
        return array;
    }

    // replaces all the matching old values with the new value
    public static char[] replaceAll(char[] array,char oldValue,char newValue){

        for (int i = 0; i < array.length; i++) {

            if(array[i]==oldValue){// equal operator
                array[i]= newValue;//assignment operator
            }
        }
        return array;
    }

    // replaces all the matching old values with the new value
    public static String[] replaceAll(String[] array,String oldValue,String newValue){

        for (int i = 0; i < array.length; i++) {

            if(array[i].equals(oldValue)){// equal operator
                array[i]= newValue;//assignment operator
            }
        }
        return array;
    }





































}
