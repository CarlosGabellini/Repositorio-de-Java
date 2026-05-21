import java.util.Scanner;

public class Aula_05_Switch {
    
    public static void main (String[] args) {

        //Vamos para o comando switch;

        byte Opcoes = 0;
        Scanner EntradaUsuario = new Scanner(System.in);

        System.out.printf("Escolha uma opção!\n");
        System.out.printf("Opcao 1 - Ver fatura\n");
        System.out.printf("Opcao 2 - Saldo Corrente\n");
        System.out.printf("Opcao 3 - Poupança\n");

        Opcoes = EntradaUsuario.nextByte();

        switch (Opcoes) {

            case 1:
                System.out.printf("Ver fatura");
                break;

            case 2:
                System.out.printf("Saldo corrente");
                break;

            case 3:
                System.out.printf("Poupança colocada");
        
            default:
                break;
        }

        EntradaUsuario.close();
    }
}