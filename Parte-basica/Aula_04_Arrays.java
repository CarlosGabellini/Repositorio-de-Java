import java.util.Arrays;

public class Aula_04_Arrays {
    
    public static void main (String[] args) {

        //Vamos dar uma olhada como funciona Arrays em Java;

        int[] Array = {1, 2, 3, 4, 5};              //As chaves começam primeiro;
        int[] Array2 = new int[5];                  //Caso eu queira usar este array;
        int controle = 0;

        while (controle < 5) {

            Array2[controle] = controle * 14;
            System.out.printf("%d\n", Array2[controle]);

            controle++;
        }

        //Agora vamos fazer com for;

        for (int a = 0; a < 5; a++) {

            Array2[a] = a * 2;
            System.out.printf("%d\n", Array2[a]);
        }

        System.out.println(Arrays.toString(Array));         //Caso queira ver toda string;
    }
}