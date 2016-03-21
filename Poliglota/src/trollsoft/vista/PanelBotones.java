/**
 * 
 */
package trollsoft.vista;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

/**
 * @author TrollSoft Team
 *
 */
public class PanelBotones extends JPanel implements ActionListener{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private VentanaPoliglota ventana;
	private JButton boton;
	public static final String ingresar ="INGRESAR";
	public static final String ingles ="ENG";
	public static final String aleman ="GER";
	public static final String frances ="FRA";
	public static final String italiano ="ITA";
	private String comando;
	
	/**
	 * @param ventana
	 */
	public PanelBotones(VentanaPoliglota ventana) {
		super();
		this.ventana = ventana;
		this.setLayout(new GridLayout(1,5));
		
		this.boton = new JButton("Ingresar Palabra");
		this.boton.setActionCommand("INGRESAR");
		this.boton.addActionListener(this);
		this.add(boton);
		
		this.boton = new JButton("Ingles");
		this.boton.setActionCommand("ENG");
		this.boton.addActionListener(this);
		this.add(boton);
		
		this.boton = new JButton("Aleman");
		this.boton.setActionCommand("GER");
		this.boton.addActionListener(this);
		this.add(boton);
		
		this.boton = new JButton("Frances");
		this.boton.setActionCommand("FRA");
		this.boton.addActionListener(this);
		this.add(boton);
		
		this.boton = new JButton("Italiano");
		this.boton.setActionCommand("ITA");
		this.boton.addActionListener(this);
		this.add(boton);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		comando = e.getActionCommand();
		if(comando.equals(ingresar))
		{
		    ventana.buscarPalabra();
		}
		else if(comando.equals(ingles))
		{
			ventana.traducir();
		}
		else if(comando.equals(aleman))
		{
			ventana.traducir();
		}
		else if(comando.equals(frances))
		{
			ventana.traducir();
		}
		else if(comando.equals(italiano))
		{
			ventana.traducir();
		}
	}
	
	public String darComando()
	{
		return comando;
	}

}
