package be.amolixs.frame;

import javax.swing.JFrame;

import be.amolixs.constante.ConstanteContainer;

/**
 * Classe qui permet de gérer la fenetre
 * @version 1.0
 * @author amolixs
 */

public class Frame extends JFrame {
	/**
	 * Titre de la fenetre
	 * @author amolixs
	 */
	private String title;
	
	/**
	 * Object permettant d'aller cherché toutes les constantes de mon programme.
	 * @author amolixs 
	 */
	private ConstanteContainer constanteContainer;
	
	/**
	 * Constructeur.
	 * @author amolixs
	 */
	public Frame(String title) {
		// Instance object
		this.constanteContainer = new ConstanteContainer();
		// Config frame
		this.title = title;
		this.setTitle(title);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setSize(constanteContainer.width, constanteContainer.height);
		this.setVisible(true);
	}
}
