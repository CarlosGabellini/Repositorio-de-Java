import java.util.Scanner;

public class Aula_03_Operadores {
    
     public static void main (String[] args) {

        //Vamos falar dos operadores, eh igualzinho ao C tambem;

        double numero1 = 2;
        double numero2 = 16;

        int numero3 = 2;

        System.out.println((numero2 / numero1) * numero3);

        //Agora vamos para os operadores relacionais e igualdade;

        //igualdade temos: ==, !=;
        //Operadores relacionais (>, >=, <, <=);

        System.out.printf("Eh igual? %s\n", numero1 == 2);

        System.out.printf("Qual a sua idade?");

        //Agora vamos para estruturas condicionais;

        int idade;

        Scanner EntradaUsuario = new Scanner(System.in);
        idade = EntradaUsuario.nextInt();

        System.out.printf("\n");

        if (idade < 18) {
            System.out.printf("Adolescente!\n");
        }

        else {            
            System.out.printf("Adulto!\n");
        }

        EntradaUsuario.close();
     }
}