package study;

public class WriteCommand extends Command {

	private StringBuilder buffer = new StringBuilder();

	protected WriteCommand(Editor editor) {
		super(editor);
	}

	public WriteCommand addText(String newText) {
		buffer.append(newText);
		return this;
	}

	@Override
	public boolean execute() {
		backup();
		editor.text = buffer.toString();
		return true;
	}
}