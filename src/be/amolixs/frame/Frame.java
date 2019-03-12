package be.amolixs.frame;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

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
	 * Pannel principal.
	 * @author amolixs
	 */
	private JPanel mainPannel;
	
	/**
	 * Pannel button.
	 * @author amolixs
	 */
	private JPanel pannelButton;
	
	/**
	 * Label ou va etre affiché les resultat
	 * @author amolixs
	 */
	private JLabel labelResult;
	
	/**
	 * Constructeur.
	 * @author amolixs
	 * @param title
	 * 		Titre de la fenetre
	 */
	public Frame(String title) {
		// Instance object
		this.constanteContainer = new ConstanteContainer();
		init("*---CALCULATOR--*");
		initComponent();
		this.setVisible(true);
	}
	
	/**
	 * Méthode qui permet d'initialisé les composants de la fenetre
	 * @author amolixs
	 */
	void initComponent() {
		this.labelResult = new JLabel();
		this.labelResult.setText("0");
		this.mainPannel = new JPanel();
		this.mainPannel.add(this.labelResult);
		this.setContentPane(mainPannel);
	}
	
	/**
	 * Méthode qui permet d'initalisé la fenetre.
	 * @author amolixs
	 * @param title
	 * 		Titre de la fenetre
	 */
	void init(String title) {
		this.title = title;
		this.setTitle(title);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setSize(constanteContainer.width, constanteContainer.height);
	}
}
