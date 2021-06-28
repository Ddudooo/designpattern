package study;

import java.util.Stack;

public class Editor {

	protected String text;
	protected String clipboard;
	protected Stack<Command> history = new Stack<>();

	public String getText() {
		return text;
	}

	public String getClipboard() {
		return clipboard;
	}

	public void appendText(String text) {
		this.text += text;
	}

	public void changeClipboard(String clipboard) {
		this.clipboard = clipboard;
	}

	public void executeCommand(Command command) {
		if (command.execute()) {
			history.add(command);
		}
	}

	public void undo() {
		if (!history.isEmpty()) {
			Command latestCommand = history.pop();
			latestCommand.undo();
		}
	}

	public void printText() {
		System.out.printf("editor - %s\n", text);
	}
}