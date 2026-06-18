public class Aula_01_Orientacao_a_Objetos {
    
    public static void main (String[] args) {

        //Acabou o tutorial, vamos lá;

        carro MeuCarro = new carro();

        MeuCarro.setCor("Vermelho");
        MeuCarro.setPlacaDoCarro("BV03K20");
        MeuCarro.setVelocidadeMaxima(143);          //Set para entrada de dados e get para recuperar o dado;

        System.out.printf("%s\n", MeuCarro.getPlacaDoCarro());      //Puxando os dados de volta para mim;
        System.out.printf("%s\n", MeuCarro.getCor());
        MeuCarro.acelerar();
        System.out.printf("%s Km/h\n", MeuCarro.getVelocidadeMaxima());

        System.out.printf("\n");

        //Agora vamos ver para moto e o metodo dos construtores;

        //Aqui ja podemos passar o parametro diretamente, diferente do get and setter;

        moto MinhaMoto = new moto("Vermelho", 2025, 140);
        moto.pais = "Japao";

        MinhaMoto.detalhesDaMoto();
        MinhaMoto.acelerar();

        //Vamos para a segunda moto;

        System.out.printf("\n");

        moto minhaSegundaMoto = new moto("Azul", 2023, 121);

        minhaSegundaMoto.detalhesDaMoto();;
        minhaSegundaMoto.acelerar();

        //Agora para a herança;

        caminhao meuPrimeiroCaminhao = new caminhao();

        caminhao.pais = "Alemanha";

        meuPrimeiroCaminhao.setAno(1992);
        meuPrimeiroCaminhao.setCor("Preto");
        meuPrimeiroCaminhao.setVelocidadeMaxima(130);
    }
}