package Projet.Main;

import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;

import Views.ViewMain;

public class main {

	@SuppressWarnings("unused")
	public static void main(String[] args) throws UnsupportedLookAndFeelException {
		UIManager.setLookAndFeel(new NimbusLookAndFeel());
		//creation d'un constricteur de type view
		//qui permete d'ouvre la fenetre princepale ViewMain
		ViewMain man = new ViewMain() ;
	}
}
