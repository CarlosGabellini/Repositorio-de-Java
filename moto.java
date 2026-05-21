public class moto {

    //Aqui usamos construtores;

    String cor;
    int ano_da_moto;
    double velocidadeMaxima;

    public moto (String cor, int ano_da_moto, double velocidadeMaxima) {
        this.cor = cor;
        this.ano_da_moto = ano_da_moto;
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public void detalhesDaMoto() {
        System.out.printf("A moto tem a cor: %s\n", cor);
        System.out.printf("A moto eh do ano %d\n", ano_da_moto);
        System.out.printf("Velocidade maxima: %f\n", velocidadeMaxima);
    }

    public void acelerar() {
        System.out.printf("A moto esta acelerando!\n");
    }

    public void frear() {
        System.out.printf("A moto esta freiando!\n");
    }

    
    
}
