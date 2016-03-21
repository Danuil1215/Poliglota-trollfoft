/**
 * 
 */
package trollsoft.mundo;

import java.util.ArrayList;

/**
 * @author TrollSoft Team
 *
 */
public class Palabra {

	private String id;
	private String nombre;
	private String idioma;
	private String significado;
	private ArrayList<Traduccion> traducciones;
	
	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}
	
	/**
	 * @return the idioma
	 */
	public String getIdioma() {
		return idioma;
	}
	
	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * @return the significado
	 */
	public String getSignificado() {
		return significado;
	}
	/**
	 * @return the traducciones
	 */
	public ArrayList<Traduccion> getTraducciones() {
		return traducciones;
	}
	/**
	 * @param id
	 * @param nombre
	 * @param significado
	 */
	public Palabra(String id,String idioma, String nombre, String significado) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.idioma = idioma;
		this.significado = significado;
		this.traducciones = new ArrayList<Traduccion>();
	}
	
	public void agregarTraduccion(String nombre, String idioma)
	{
		this.traducciones.add(new Traduccion(nombre, idioma));
	}
	
	
}
