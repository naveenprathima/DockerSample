import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
	public static void main(String[] args) {
		String filename="C://Users//nr18//JavaApp//file.txt";
		String data="Welcome to Docker Session";

		try(BufferedWriter writer=new BufferedWriter(new FileWriter(filename)))
		{
			writer.write(data);System.out.println("Data Writtern to file:"+filename);
		}catch(IOException e)
		{
			e.printStackTrace();
		}
		try(BufferedReader reader=new BufferedReader(new FileReader(filename)))
		{
			String line;
			while((line=reader.readLine())!=null)
			{
				System.out.println("Data read from file"+line);
			}
		}catch(IOException e)
		{
			e.printStackTrace();
		}

	}
}
