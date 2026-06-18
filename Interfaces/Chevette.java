public class Chevette implements Veiculo {

	String Usuario;

	@Override								//Override nao eh obrigatorio, mas boa prática;
	public void acelerar() {
		System.out.printf("Vrum Vrum!");
	}

	@Override
	public void frear() {
		System.out.printf("Semáfaro vermelho!");
	}
}