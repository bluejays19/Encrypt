import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class DataWriter {

	public static void write(String stuff){
	
		try {
			BufferedWriter writer = new BufferedWriter(new FileWriter(new File ("output.txt")));
			
			writer.write(stuff);
			writer.flush();
			writer.close();
			System.out.println("Bye!");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}