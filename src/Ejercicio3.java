import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean isNum;
        int length = 0;
        String word = "";
        do {
            System.out.print("Introduce la longitud de la matriz ");
            isNum = input.hasNextInt();
            if (isNum) {
                length = input.nextInt();
            }
        } while (!isNum || length < 3 || length > 7 || (length % 2 == 0));
        char[][] array = new char[length][length];

        System.out.println("Introduce los "+length*length+" números de la matriz");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                int num = -1;
                do{
                    isNum = input.hasNextInt();
                    if (isNum) {
                        num = input.nextInt();
                    }
                }while (!isNum || num < 64 || (num > 91 && num < 96) || num > 123);
                array[i][j] = (char) num;

            }
        }
        for (int i=0; i < array.length; i++){
            for (int j=0; j < array[i].length; j++){
                System.out.print(array[i][j]);
                if (i == j){
                    word+= array[i][j];
                }
            }
            System.out.println();
        }
        System.out.println("la palabra clave es; "+word);
    }
}
