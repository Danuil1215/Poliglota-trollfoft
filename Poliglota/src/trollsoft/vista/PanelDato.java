/**
 * 
 */
package trollsoft.vista;

import java.awt.GridLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import trollsoft.mundo.Palabra;
import trollsoft.mundo.Traduccion;

/**
 * @author TrollSoft Team
 *
 */
public class PanelDato extends JPanel implements KeyListener{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private VentanaPoliglota ventanaPoliglota;
	private JLabel label;
	private JTextField textField;
	private JTextField textField1;
	private JTextField textField2;
	private JTextArea textArea;
	/**
	 * @param ventana
	 */
	public PanelDato(VentanaPoliglota ventanaPoliglota) {
		super();
		this.ventanaPoliglota = ventanaPoliglota;
		this.setLayout(new GridLayout(2, 1));
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(3, 2));
		label = new JLabel("Idioma");
		panel.add(label);
		textField = new JTextField("");
		textField.setEnabled(false);
		panel.add(textField);
		label = new JLabel("Palabra");
		textField1 = new JTextField();
		textField1.addKeyListener(this);
		panel.add(label);
		panel.add(textField1);
		label = new JLabel("Traduccion");
		textField2 = new JTextField();
		textField2.setEnabled(false);
		panel.add(label);
		panel.add(textField2);
		this.add(panel);
		panel = new JPanel(new GridLayout(2, 1));
		label = new JLabel("Significado");
		textArea = new JTextArea();
		textArea.setLineWrap(true);
		textArea.setWrapStyleWord(true);
		textArea.setEditable(false);
		panel.add(label);
		panel.add(textArea);
		this.add(panel);
	}
	
	public void actualizarDatos(Palabra palabra, String comando)
	{
		if(comando.equals(PanelBotones.ingresar)&& palabra!=null)
		{
			this.textField.setText(palabra.getIdioma());
			this.textField1.setText(palabra.getNombre());
			this.textArea.setText(palabra.getSignificado());
			this.validate();
		}
		else if(comando.equals(PanelBotones.ingles))
		{
			this.textField.setText(palabra.getIdioma());
			this.textField1.setText(palabra.getNombre());
			this.textArea.setText(palabra.getSignificado());
			for(Traduccion t: palabra.getTraducciones())
			{
				if(t.getIdioma().equals(PanelBotones.ingles))
				{
					textField2.setText(t.getNombre());
					this.textField.setText(t.getIdioma());
				}
			}
			this.validate();
		}
		else if(comando.equals(PanelBotones.aleman))
		{
			this.textField.setText(palabra.getIdioma());
			this.textField1.setText(palabra.getNombre());
			this.textArea.setText(palabra.getSignificado());
			for(Traduccion t: palabra.getTraducciones())
			{
				if(t.getIdioma().equals(PanelBotones.aleman))
				{
					textField2.setText(t.getNombre());
					this.textField.setText(t.getIdioma());
				}
			}
			this.validate();
		}
		else if(comando.equals(PanelBotones.frances))
		{
			this.textField.setText(palabra.getIdioma());
			this.textField1.setText(palabra.getNombre());
			this.textArea.setText(palabra.getSignificado());
			for(Traduccion t: palabra.getTraducciones())
			{
				if(t.getIdioma().equals(PanelBotones.frances))
				{
					textField2.setText(t.getNombre());
					this.textField.setText(t.getIdioma());
				}
			}
			this.validate();
		}
		else if(comando.equals(PanelBotones.italiano))
		{
			this.textField.setText(palabra.getIdioma());
			this.textField1.setText(palabra.getNombre());
			this.textArea.setText(palabra.getSignificado());
			for(Traduccion t: palabra.getTraducciones())
			{
				if(t.getIdioma().equals(PanelBotones.italiano))
				{
					textField2.setText(t.getNombre());
					this.textField.setText(t.getIdioma());
				}
			}
			this.validate();
		}
	}
	public String darNombre()
	{
		return textField1.getText();
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		if(KeyEvent.VK_ENTER == e.getKeyCode())
		{
			if(textField.getText().equals("ESP"))
			{
				ventanaPoliglota.traducir(PanelBotones.ingles);
			}
			else if(textField.getText().equals("ENG"))
			{
				ventanaPoliglota.traducir(PanelBotones.aleman);
			}
			else if(textField.getText().equals("GER"))
			{
				ventanaPoliglota.traducir(PanelBotones.frances);
			}
			else if(textField.getText().equals("FRA"))
			{
				ventanaPoliglota.traducir(PanelBotones.italiano);
			}
			else if(textField.getText().equals("ITA"))
			{
				ventanaPoliglota.traducir(PanelBotones.ingles);
			}
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		if(KeyEvent.VK_ENTER == e.getKeyCode())
		{
			if(textField.getText().equals("ESP"))
			{
				ventanaPoliglota.traducir(PanelBotones.ingles);
			}
			else if(textField.getText().equals("ENG"))
			{
				ventanaPoliglota.traducir(PanelBotones.aleman);
			}
			else if(textField.getText().equals("GER"))
			{
				ventanaPoliglota.traducir(PanelBotones.frances);
			}
			else if(textField.getText().equals("FRA"))
			{
				ventanaPoliglota.traducir(PanelBotones.italiano);
			}
			else if(textField.getText().equals("ITA"))
			{
				ventanaPoliglota.traducir(PanelBotones.ingles);
			}
		}
	}
	
}
