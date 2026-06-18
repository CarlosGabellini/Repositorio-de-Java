import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Aula_07_Arquivos {

	public static void main(String[] args) {

		try (BufferedWriter bw = new BufferedWriter(new FileWriter("arquivo.txt"))) {

			bw.write("Hello World!");
			bw.newLine();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}