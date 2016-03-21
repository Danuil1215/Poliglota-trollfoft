/**
 * 
 */
package trollsoft.vista;

import java.awt.BorderLayout;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import trollsoft.mundo.Palabra;
import trollsoft.mundo.Poliglota;

/**
 * @author TrollSoft Team
 *
 */
public class VentanaPoliglota extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private PanelBanner panelBanner;
	private PanelDato panelDatos;
	private PanelBotones panelBotones;
	private Poliglota poliglota;
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VentanaPoliglota ventana=null;
		try {
			ventana= new VentanaPoliglota(new Poliglota());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			JOptionPane.showMessageDialog(ventana, "Ha ocurrido un error inesperado, favor ponerse en contacto su administrador","Error", JOptionPane.ERROR_MESSAGE);
		}
		
	}


	/**
	 * @throws IOException 
	 */
	public VentanaPoliglota(Poliglota poliglota){
		super();
		try {
			this.poliglota = poliglota;
			panelBanner = new PanelBanner();
			panelDatos = new PanelDato(this);
			panelBotones = new PanelBotones(this);
			this.setLayout(new BorderLayout());
			this.setTitle("TrollSoft Team - Poliglota");
			this.setSize(750, 500);
			this.add(panelBanner,BorderLayout.NORTH);
			this.add(panelDatos, BorderLayout.CENTER);
			this.add(panelBotones, BorderLayout.SOUTH);
			this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			this.setVisible(true);
		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public Palabra buscarPalabra(String nombre)
	{
		return poliglota.buscarPalabra(nombre);
	}
	
	public void buscarPalabra()
	{
		String nombre;
		nombre = JOptionPane.showInputDialog(this,"Ingrese la palabra a buscar");
		Palabra palabra =  buscarPalabra(nombre);
		if(palabra!=null)
		{
			panelDatos.actualizarDatos(palabra, panelBotones.darComando());
		}
		else
		{
			JOptionPane.showMessageDialog(this, "La palabra "+nombre+" no esta en el diccionario para traducciones","Error", JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void traducir()
	{
		String nombre = panelDatos.darNombre();
		Palabra palabra = buscarPalabra(nombre);
		if(palabra!=null)
		{
			panelDatos.actualizarDatos(palabra, panelBotones.darComando());
		}
		else
		{
			JOptionPane.showMessageDialog(this, "La palabra "+nombre+" no esta en el diccionario para traducciones","Error", JOptionPane.ERROR_MESSAGE);
		}
	}
	public void traducir(String idioma)
	{
		String nombre = panelDatos.darNombre();
		Palabra palabra = buscarPalabra(nombre);
		if(palabra!=null)
		{
			panelDatos.actualizarDatos(palabra, idioma);
		}
		else
		{
			JOptionPane.showMessageDialog(this, "La palabra "+nombre+" no esta en el diccionario para traducciones","Error", JOptionPane.ERROR_MESSAGE);
		}
	}
	

}
