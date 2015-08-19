package br.ufc.great.catchml.ui.utils;

import java.io.PrintStream;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.console.ConsolePlugin;
import org.eclipse.ui.console.IConsole;
import org.eclipse.ui.console.IConsoleManager;
import org.eclipse.ui.console.MessageConsole;
import org.eclipse.ui.console.MessageConsoleStream;

public class CatchMLConsoleUtils {

	public static final String CATCHML_CONSOLE = "CatchML Console";

	public static MessageConsole getCatchMLConsole() {
		IConsoleManager consoleManager = ConsolePlugin.getDefault().getConsoleManager();
		IConsole[] existing = consoleManager.getConsoles();

		for(int i = 0; i < existing.length; i++)
			if(CATCHML_CONSOLE.equals(existing[i].getName()))
				return (MessageConsole) existing[i];

		// no console found, so create a new one
		MessageConsole mydslConsole = new MessageConsole(CATCHML_CONSOLE, null);		
		consoleManager.addConsoles(new IConsole[] { mydslConsole });
		return mydslConsole;
	}

	public static PrintStream getConsoleErrorStream(MessageConsole console) {
		MessageConsoleStream stream = console.newMessageStream();
		Display display = PlatformUI.getWorkbench().getDisplay();
		stream.setColor(display.getSystemColor(SWT.COLOR_RED));
		return new PrintStream(stream);
	}

	public static PrintStream getConsoleOutputStream(MessageConsole console) {
		MessageConsoleStream stream = console.newMessageStream();		
		return new PrintStream(stream);
	}

}