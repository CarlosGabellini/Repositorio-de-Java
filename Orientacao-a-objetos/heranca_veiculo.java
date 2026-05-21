public class heranca_veiculo {
    
    //A herança serve justamente para economizar codigo e fazer com que classes tenham o mesmo metodo;

    //Por exemplo, todos os veiculos tem algo em comum, como placa, cor, velocidade maxima, etc

    String cor;
    int ano;
    double velocidadeMaxima;

    //Variavel de classe, onde ela eh imutavel;

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public double getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(double velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

    static String pais;                     //Usada pela palavra static;

    //O usuario atribui isso na Main, exemplo: Moto.pais = "Japao";

    public void detalhesDoVeiculo() {
        System.out.printf("O veiculo tem a cor: %s\n", cor);
        System.out.printf("O veiculo eh do ano %d\n", ano);
        System.out.printf("Velocidade maxima: %f\n", velocidadeMaxima);
        System.out.printf("Pais de origem: %s\n", heranca_veiculo.pais);
    }

    public void acelerar() {
        System.out.printf("O veiculo esta acelerando!\n");
    }

    public void frear() {
        System.out.printf("O veiculo esta freiando!\n");
    }
}