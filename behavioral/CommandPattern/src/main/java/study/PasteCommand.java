package study;

public class PasteCommand extends Command {

	protected PasteCommand(Editor editor) {
		super(editor);
	}

	@Override
	public boolean execute() {
		if (editor.getClipboard() == null || editor.clipboard.isEmpty()) {
			return false;
		}
		backup();
		editor.appendText(editor.getClipboard());
		return true;
	}
}