import java.util.Scanner;

public class Aula_02_Concatenacao {
    
    public static void main (String[] args) {

        String nome;
        Byte idade;
        String profissao;

        //Aqui fizemos uma concatenacao com string;

        //Vamos dar uma olhada no Scanner;

        Scanner EntradaUsuario = new Scanner(System.in);            //Literal o Scanf;

        System.out.printf("Qual a sua idade?");
        idade = EntradaUsuario.nextByte();

        EntradaUsuario.nextLine();                  //Consome o \n deixado;

        System.out.printf("Qual o seu nome?");
        nome = EntradaUsuario.nextLine();

        System.out.printf("Qual a sua profissao?");
        profissao = EntradaUsuario.nextLine();

        System.out.printf("Sua idade: %d, Seu nome: %s e sua profissao: %s\n", idade, nome, profissao);

        EntradaUsuario.close();
    }
}
