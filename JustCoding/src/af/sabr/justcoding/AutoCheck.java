package af.sabr.justcoding;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class AutoCheck {

	String getAnswer(String word) throws FileNotFoundException, IOException {
		String answer = "Отсутсвует";
		try(BufferedReader reader = new BufferedReader(
				new FileReader("C:\\numbers.txt"))) {
			String line;
			while((line = reader.readLine()) != null) {
				String[] strings = line.split(" ");
				if(strings[2].equals(word)) {
					answer = strings[3] + " " + strings[4] + " " + strings[5] + " " + strings[6] + " " + strings[7] + " " + strings[8];
					reader.close();
					return answer;
				}
			}
			reader.close();
			return answer;
		}
	}
}
