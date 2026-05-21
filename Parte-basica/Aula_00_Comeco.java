public class Aula_00_Comeco {

    public static void main (String[] args) {

        //Como declarar variaveis na linguagem Java? vamos aprender!

        //Tipo de dado + Identificacao + Valor Atribuido
        //Até agora igualzinho o C sem tirar e nem por;

        System.out.println("Hello World!\n");

        //String nome = "Felipe";
        //System.out.println(nome);                   //Aqui eh basicamente o printf do C;


        //Vamos dar uma olhada como sao os outros tipos, começando pelos inteiros;

        byte number1 = 14;                          //Vai de -128 até 127, foco em ser rapida, 1 byte;
        short small_number = 21;                    //Vai de -32768 até 32767, possui 2 bytes;
        int medium_number = 124;                    //Tem até 2 bilhoes (4 bytes);
        long hight_number = 1000L;                   //Muitos numeros pra usar (8 bytes de informacao);

        //O long prescisa de um "L" maiusculo no final;
        
        //Agora vamos para os decimais;

        float broken_number = 10.12f;                //4 bytes de informacao com 7 casas decimais;
        //float sempre coloca o f menor no final tambem;

        double broken2 = 12.4356;                   //8 bytes de informacao, 15 casas decimais;

        String qualquer = "Coisa";                  //Recebe textos, desde palavras até chaves;
        char letra = 'B';                           //Suporta somente um unico caractere;
        
        double conta = broken_number - number1;

        //Outras formas de declarar variavel (Esse eh um jeito "Antigo");

        var sobrenome = "Gabellini";
        var numero = 43;

        //Agora vamos para o boolean;

        boolean BotaoAtivado = true;                //Recebe um estado de verdadeiro ou falso;
        boolean BotaoDesativado = false;

        //Até aqui foram as variaveis de tipo primitivo, agora para as outras;

        /*Classes Wroppes

        As classes Wroppers usam o tipo primitivo mas o seu diferencial eh que elas sao maisculas;
        Variaveis turbinadas que usam tipo primitivo;

        Elas tem recursos extras, como:
        se eu colocar por exemplo abaixo:
        idade.(Aqui posso manipular ela melhor);
        */

        Byte idade = 15;
        Short aleatorio = 54;
        Integer valor1 = 100;                   //int aqui muda pra Integer;
        Long valor2 = 1032L;
        Float Yuan = 12.32f;
        Double Dolar = 4.98;

        Character MeuNumero = '2';
        Boolean ativado = true;
    }
}