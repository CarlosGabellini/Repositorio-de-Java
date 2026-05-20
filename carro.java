public class carro {
    //Propriedades(Atributos) | Atributos | Campos | Variáveis de instância

    String cor;
    private String PlacaDoCarro;
    
    //Métodos - Comportamento do objeto, ações;

    public void acelerar() {
        System.out.printf("O carro esta em movimento...\n");
    }

    public void frear() {
        System.out.printf("A velocidade do carro foi reduzida!\n");
    }

    public void abastecer() {
        System.out.printf("O carro esta sendo abastecido com gasolina.\n");
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    //Outra variavel;

    public String getPlacaDoCarro() {
        return PlacaDoCarro;
    }

    public void setPlacaDoCarro(String placaDoCarro) {
        PlacaDoCarro = placaDoCarro;
    }
}