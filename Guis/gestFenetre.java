package Guis;

import java.awt.*;
import java.awt.event.*;

public class gestFenetre implements WindowListener {
	Frame Appli;

	gestFenetre(Frame app) {
		Appli = app;
	}

	public void windowClosing(WindowEvent e) {System.exit(0);}
	public void windowOpened(WindowEvent e) {}
	public void windowClosed(WindowEvent e) {}
	public void windowDeiconified(WindowEvent e) {}
	public void windowDeactivated(WindowEvent e) {}
	public void windowActivated(WindowEvent e) {}
	public void windowIconified(WindowEvent e) {}
}