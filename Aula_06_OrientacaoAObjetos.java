public class Aula_06_OrientacaoAObjetos {
    
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
        MinhaMoto.detalhesDaMoto();
        MinhaMoto.acelerar();
    }
}