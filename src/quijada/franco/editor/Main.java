package quijada.franco.editor;

import javax.swing.*;

public class Main {
	public static void main(String[] args) {
		Marco marco = new Marco();
		marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		marco.setVisible(true);
		
		
	}
}


class Marco extends JFrame{
	
	public Marco() {
		
		setBounds(300, 300, 300, 300);
		setTitle("Text Editor");
		
		add(new Panel());
	}
}

class Panel extends JPanel {
	
	public Panel() {
		
		//	Text Area	//
		tabbedPanel= new JTabbedPane();
		
		//----------//
		PanelCreator();
		
		add(tabbedPanel);
	}
	
	//	Container	//
	public void PanelCreator() {
		window = new JPanel();
		textArea = new JTextPane();
		
		window.add(textArea);
		
		tabbedPanel.addTab("Title",window);
	}
	
	//	Inicialization	//
	private JTabbedPane tabbedPanel;
	private JPanel window;
	private JTextPane textArea;
	private JMenuBar menu;
	private JMenu archivo, editar, seleccion, ver, apariencia;
	
	
}