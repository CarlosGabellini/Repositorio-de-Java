public class Aula_06_OrientacaoAObjetos {
    
    public static void main (String[] args) {

        //Acabou o tutorial, vamos lá;

        carro MeuCarro = new carro();

        MeuCarro.setCor("Vermelho");
        MeuCarro.setPlacaDoCarro("BV03K20");

        MeuCarro.acelerar();

        System.out.printf("%s\n", MeuCarro.getPlacaDoCarro());
        System.out.printf("%s\n", MeuCarro.getCor());
    }
}