public class carro {

    //Aqui usamos get and setters;
    //Propriedades(Atributos) | Atributos | Campos | Variáveis de instância

    String cor;
    private String PlacaDoCarro;
    private int VelocidadeMaxima;
    
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

    //Aqui está o get and setter;

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

    public int getVelocidadeMaxima() {
        return VelocidadeMaxima;
    }

    public void setVelocidadeMaxima(int velocidadeMaxima) {
        
        if (velocidadeMaxima < 0) {
            this.VelocidadeMaxima = 0;
        }

        else if (velocidadeMaxima > 300) {
            this.VelocidadeMaxima = 300;
        }

        else {
            this.VelocidadeMaxima = velocidadeMaxima;
        }
    }
}