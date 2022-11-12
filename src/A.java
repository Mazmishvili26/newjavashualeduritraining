import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class A implements NumberInterface {

    int myArr [] = new int[15];

    int a,b;

    public void generateNumber() {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter first number : ");
        a = sc.nextInt();
        System.out.println("enter second number : ");
        b = sc.nextInt();

        Random rd = new Random();

        for (int i = 0 ; i < myArr.length; i++){
            myArr[i] = rd.nextInt(a,b);
            System.out.println("myArray -> " +myArr[i]);
        }
    }


    public void arraySum() {
        int sum = 0 ;

        for(int i = 0 ; i < myArr.length; i++){
            if(i > myArr[i]){
                sum = sum + myArr[i];
            }
        }

        System.out.println("jami -> " +sum);

    }


    public void arrayMultiplication () {
        int multiply = 1;

        for (int i = 0 ; i < myArr.length; i++){
            if(myArr[i] > i){
                multiply = multiply * myArr[i];
            }
        }

        System.out.println("namravli -> " + multiply);

    }

    public void evenArray() {
        for (int i = 0 ; i < myArr.length; i++){
            if (myArr[i] % 2 == 0){
                System.out.println("luwebi -> " + myArr[i]);
            }
        }
    }

}
