public interface Veiculo {

	/*Em interface, eh um pouco diferente, é quase igual aos arquivos headers (.h) do C, onde definimos
	um contrato e outro arquivo usa este contrato e monta ele, para usar esta interface, utilizamos o seguinte
	parametro:

	public class Algo implements Veiculo;

	basicamente utilizamos a palavra implements para o compilador fazer o que queremos;
	*/
	
	void acelerar();
	void frear();
}