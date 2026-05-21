public class Aula_01_VariavelMutavel {
    
    public static void main (String[] args)  {

        //Variaveis com mutabilidade;

        byte idade = 30;
        idade = 34;
        idade = 120;

        //Isso daqui eh uma variavel com mutabilidade;

        String nome = "Carlos";
        
        //Se quiser uma variavel que nunca muda tem que usar o final;

        final byte idade2 = 25;             //Nao muda mais;
        final String nome2 = "Maria";

        final float pi = 3.142191f;

        //O recomendavel eh colocar constantes em maisculas para diferenciar;

        System.out.printf("Seu nome eh %s e ele tem %d anos de idade.\n", nome, idade);
        System.out.printf("Seu nome eh %s e ela tem %d anos de idade.", nome2, idade2);

        System.out.printf("\nO numero pi equivale a: %.5f\n", pi);
    }
}