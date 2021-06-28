package study;

public class CopyCommand extends Command {

	protected CopyCommand(Editor editor) {
		super(editor);
	}

	@Override
	public boolean execute() {
		editor.changeClipboard(editor.text);
		return false;
	}
}