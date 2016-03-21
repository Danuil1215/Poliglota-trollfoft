/**
 * 
 */
package trollsoft.mundo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Properties;
import java.util.StringTokenizer;

/**
 * @author usuario
 *
 */
public class Poliglota {

	private ArrayList<Palabra> palabras;

	/**
	 * @throws IOException 
	 * 
	 */
	public Poliglota() throws IOException {
		super();
		this.palabras = new ArrayList<Palabra>();
		File traducciones = new File("traducciones.csv");
		File descipciones = new File("descripciones.properties");
		FileReader fileReader = new FileReader(traducciones);
		BufferedReader bufferedReader = new BufferedReader(fileReader);
		Properties properties = new Properties();
		FileInputStream fileInputStream = new FileInputStream(descipciones);
		properties.load(fileInputStream);
		fileInputStream.close();
		String linea = bufferedReader.readLine();
		StringTokenizer tokenizer = new StringTokenizer(linea, ";");
		String id;
		tokenizer.nextToken();
		ArrayList<String> idiomas = new ArrayList<String>();
		while(tokenizer.hasMoreTokens())
		{
			idiomas.add(tokenizer.nextToken());
		}
		linea = bufferedReader.readLine();
		while(linea!=null)
		{
			tokenizer = new StringTokenizer(linea, ";");
			id = tokenizer.nextToken();
			Palabra palabra = new Palabra(id,idiomas.get(0) , tokenizer.nextToken(), properties.getProperty(id));
			for(int i=1;i<idiomas.size();i++)
			{
				palabra.agregarTraduccion(tokenizer.nextToken(), idiomas.get(i));
			}
			palabras.add(palabra);
			linea = bufferedReader.readLine();
		}
		
		bufferedReader.close();
		fileReader.close();
		
	}
	
	/**
	 * @return the palabras
	 */
	public ArrayList<Palabra> getPalabras() {
		return palabras;
	}

	public void agregarPalabra(String id, String nombre,String idioma,String significado)
	{
		palabras.add(new Palabra(id, idioma, nombre, significado));
	}
	
	public void agregarTraduccion(String id, String nombre, String idioma)
	{
		for(Palabra p:palabras)
		{
			if(p.getId().equals(id))
			{
				p.agregarTraduccion(nombre, idioma);
			}
		}
	}
	
	public Palabra buscarPalabra(String nombre)
	{
		for(Palabra p:palabras)
		{
			if(p.getNombre().equals(nombre))
			{
				return p;
			}
		}
		return null;
	}
	
	
}
