package study;

public class Application {

	public static void main(String[] args) {
		Editor editor = new Editor();

		editor.executeCommand(new WriteCommand(editor).addText("새로운 텍스트 입력"));
		editor.printText();
		editor.executeCommand(new CopyCommand(editor));
		editor.printText();
		editor.executeCommand(new PasteCommand(editor));
		editor.printText();
		editor.undo();
		editor.printText();
		editor.undo();
		editor.printText();
	}
}