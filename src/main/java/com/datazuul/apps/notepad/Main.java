package com.datazuul.apps.notepad;

import java.io.File;

import com.datazuul.apps.notepad.gui.MainWindow;

public class Main {
    public static final String PROGRAM_NAME = "Notepad";
    public static final String VERSION = "1.0";

    public static void main(String args[]) {
	MainWindow mainWindow = null;

	//	try {
	//	    String cn = UIManager.getSystemLookAndFeelClassName();
	//	    UIManager.setLookAndFeel(cn); // Use the native L&F
	//	} catch (Exception cnf) {
	//	}

	if (args.length > 0) {
	    mainWindow = new MainWindow(new File(args[0]));
	} else {
	    mainWindow = new MainWindow();
	}

	mainWindow.setVisible(true);
    }
}