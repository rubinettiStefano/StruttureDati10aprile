package libreria;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Classe per generare oggetti che leggeranno da file. <br />
 * Un FileReader � uno strumento per leggere da file, cos� come Console � uno strumento che legge da Console.
 * @author FP80
 *
 */
public class FileReader 
{
	String filename;
	private Scanner reader;
	
	/**
	 * creo uno strumento per leggere da file. 
	 * @param filename il file da cui leggere
	 */
	public FileReader(String filename)
	{
		try 
		{
			this.filename = filename;
			reader = new Scanner(new File(filename));
		} 
		catch (FileNotFoundException e) 
		{
			throw new RuntimeException("File "+filename+" non trovato! Verificare il percorso.\n E s�, HO RAGIONE IO!Non � vero che c'�!");
		}
	}

	public boolean hasNextLine()
	{
		return reader.hasNextLine();
	}
	/**
	 * Sottoprogramma per leggere un intero da file. Permette di leggere SOLO numeri interi
	 * @return un numero intero
	 */
	public int readInt() 
	{
		return Integer.parseInt(readString());
	}

	/**
	 * Sottoprogramma per leggere una riga da file.
	 * @return
	 */
	public String readString() 
	{
		return reader.nextLine();
	}

	/**
	 * Sottoprogramma per leggere un numero qualunque, anche con la virgola, da file. Usare il punto invece della virgola!
	 * @return
	 */
	public double readDouble() 
	{
		return Double.parseDouble(readString());
	}
}