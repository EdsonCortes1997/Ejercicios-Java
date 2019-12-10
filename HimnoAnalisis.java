package JavaIO;

import java.io.File;
import java.io.IOException;

public interface HimnoAnalisis {
	public static void main(String[] args) {
		
	}
	
	public Integer countCharacters(File file) throws IOException;
	public Integer countWords(File file) throws IOException;
	public Integer countLines(File file) throws IOException;
	public Integer countParagraph(File file) throws IOException;
	public Integer countMex(File file) throws IOException;

}
