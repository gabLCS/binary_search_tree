package ArvoreDeBuscaBinaria;

import java.awt.EventQueue;

import javax.swing.*;

import ArvoreDeBuscaBinaria.ViewMenu.ViewPrincipal;
public class main {
	
	
	private BST<String> a = new BST<String>();
	
	public static void main(String[] args) {
	final main app = new main();
	EventQueue.invokeLater(new Runnable() {
		public void run() {
			try {
				ViewPrincipal frame = new ViewPrincipal(app.a);
				frame.setVisible(true);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	});
}

}
