package JavaIO;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class EjercicioHimno implements HimnoAnalisis {

	public static void main(String[] args) throws IOException {
		File file = new File("C:\\Users\\curso\\Documents\\threads\\himno.txt");
		EjercicioHimno cj = new EjercicioHimno();

		Integer numeroCh = cj.countCharacters(file);
		System.out.println("Numero de caracteres: " + numeroCh);

		Integer numeroWo = cj.countWords(file);
		System.out.println("Numero de palabras " + numeroWo);

		Integer numeroLi = cj.countLines(file);
		System.out.println("Numero de lineas " + numeroLi);

		Integer numeroPa = cj.countParagraph(file);
		System.out.println("Numero de parrafos " + numeroPa);

		Integer numeroMe = cj.countMex(file);
		System.out.println("Numero de palabras que dicen mexicanos " + numeroMe);
	}

	@Override
	public Integer countCharacters(File file) throws IOException {
		Integer characterCount = 0;
		FileInputStream filestream = new FileInputStream(file);
		InputStreamReader inputstreamreader = new InputStreamReader(filestream);
		BufferedReader reader = new BufferedReader(inputstreamreader);

		file.getName();
		System.out.println(file.getName());

		try {

			String line = null;

			while ((line = reader.readLine()) != null) {
				characterCount += line.length();
			}

		} catch (FileNotFoundException e) {
			e.getStackTrace();
		}
		return characterCount;
	}

	@Override
	public Integer countWords(File file) throws IOException {
		int wordCount = 0;
		try {
			FileInputStream filestream = new FileInputStream(file);
			InputStreamReader inputstreamreader = new InputStreamReader(filestream);
			BufferedReader reader = new BufferedReader(inputstreamreader);

			String line = null;
			int i;
			while ((line = reader.readLine()) != null) {
				for (i = 0; i < line.length(); i++) {
					if (i == 0) {
						if (line.charAt(i) != ' ')
							wordCount++;
					} else {
						if (line.charAt(i - 1) == ' ')
							if (line.charAt(i) != ' ')
								wordCount++;
					}
				}
			}
		} catch (FileNotFoundException e) {
			e.getStackTrace();
		}

		return wordCount;
	}

	@Override
	public Integer countLines(File file) throws IOException {
		int lineCount = 0;
		try {
			FileInputStream filestream = new FileInputStream(file);
			InputStreamReader inputstreamreader = new InputStreamReader(filestream);
			BufferedReader reader = new BufferedReader(inputstreamreader);
			String line = null;
			int i;
			while ((line = reader.readLine()) != null) {
				lineCount++;
			}
		} catch (FileNotFoundException e) {
			e.getStackTrace();
		}
		return lineCount;
	}

	@Override
	public Integer countParagraph(File file) throws IOException {
		int paraCount = 0;
		try {
			FileInputStream filestream = new FileInputStream(file);
			InputStreamReader inputstreamreader = new InputStreamReader(filestream);
			BufferedReader reader = new BufferedReader(inputstreamreader);
			String line = null;
			while ((line = reader.readLine()) != null) {

				if (line.equalsIgnoreCase("I") || line.equalsIgnoreCase("II") || line.equalsIgnoreCase("III")
						|| line.equalsIgnoreCase("IV")) {
					paraCount++;
				}
			}
		} catch (FileNotFoundException e) {
			e.getStackTrace();
		}
		return paraCount + 1;
	}

	@Override
	public Integer countMex(File file) throws IOException {
		int mexicanoscount = 0;
		try {
			FileInputStream filestream = new FileInputStream(file);
			InputStreamReader inputstreamreader = new InputStreamReader(filestream);
			BufferedReader reader = new BufferedReader(inputstreamreader);
			String line = null;
			while ((line = reader.readLine()) != null) {

				if (line.equalsIgnoreCase("mexicanos") || line.equalsIgnoreCase("Mexicanos")) {
					mexicanoscount++;
				}
			}
		} catch (FileNotFoundException e) {
			e.getStackTrace();
		}
		return mexicanoscount;
	}

}
