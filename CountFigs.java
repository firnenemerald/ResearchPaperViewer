import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;

public class  CountFigs {

	public static void main(String[] args) throws IOException {
	    
	    // an integer to store the number of figures
	    int countFigs = 0;
	    
	    // Load file into a string
	    String fileContent = readFile("legex.txt", Charset.defaultCharset());
		
		System.out.println(fileContent);
		// System.out.println((char)65);
		
		// Scan for figure A through Z
		for(int i=0; i<26; i++)
		{
			if(fileContent.indexOf(". (" + (char)(65+i) + ") ") > 0)
			{
				System.out.println("There exists figure " + (char)(65+i));
				countFigs++;
			}
		}
		
		System.out.println(countFigs);
	}
	
	static String readFile(String path, Charset encoding) throws IOException
	{
		byte[] encoded = Files.readAllBytes(Paths.get(path));
		return new String(encoded, encoding);
	}

}