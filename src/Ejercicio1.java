import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean isNum;
        int digitNo = 0;
        int minRange = 0;
        int maxRange = 0;
        int randomNo;
        int triesNo = 0;
        int userNo=0;

        do{
            System.out.print("Introduce el número de digitos");
            isNum = input.hasNextInt();
            if(isNum){
                digitNo = input.nextInt();
            }
        }while(!isNum || digitNo < 1 || digitNo > 4);


        switch (digitNo){
            case 1: maxRange = 9;
                break;
            case 2: minRange = 10;
                maxRange = 99;
                break;
            case 3: minRange = 100;
                maxRange = 999;
                break;
            case 4: minRange = 1000;
                maxRange = 9999;
                break;
        }
        randomNo = (int)(minRange + Math.random()*(maxRange + 1 - minRange));

        for(int i = 1; i <= digitNo; i++){
            System.out.print("$");
        }
        System.out.println("");

        switch (digitNo){
            case 1: triesNo = 2;
                break;
            case 2:
            case 3: triesNo = 5;
                break;
            case 4: triesNo = 7;
                break;
        }

        do {
            System.out.print("adivina el número");
            isNum = input.hasNextInt();
            if(isNum) {
                userNo = input.nextInt();
                triesNo--;
            }else{
                input.next();
                System.out.println("Lo que has introducido no es un número");
            }
        }while(!isNum || (userNo != randomNo && triesNo > 0));
        if (userNo == randomNo){
            System.out.print("You win. El número secreto es "+randomNo);
        }else{
            System.out.print("You lose. El número secreto es "+randomNo);
        }
    }
}
