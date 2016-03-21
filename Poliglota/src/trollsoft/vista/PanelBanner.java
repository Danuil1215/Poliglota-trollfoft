/**
 * 
 */
package trollsoft.vista;

import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * @author TrollSoft Team
 *
 */
public class PanelBanner extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JLabel imagen;
	/**
	 * 
	 */
	public PanelBanner() {
		super();
		this.setLayout(new GridLayout(1, 1));
		this.imagen = new JLabel();
		imagen.setIcon(new ImageIcon("TrollSoftBanner.png"));
		this.setPreferredSize(new Dimension(imagen.getIcon().getIconWidth(), imagen.getIcon().getIconHeight()-100));
		this.add(imagen);
	}
	
	

}
