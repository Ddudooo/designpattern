package study;

public abstract class Command {

	protected final Editor editor;
	private String backup;

	protected Command(Editor editor) {
		this.editor = editor;
	}

	public void backup() {
		backup = editor.text;
	}

	public void undo() {
		editor.text = backup;
	}

	public abstract boolean execute();
}