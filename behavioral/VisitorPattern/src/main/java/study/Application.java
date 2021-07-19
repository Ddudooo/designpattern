package study;

public class Application {

	public static void main(String[] args) {
		Directory root = new Directory("");
		Directory temp = new Directory("temp");
		root.add(temp);
		root.add(new File("파일1.file"));
		root.add(new File("파일2.file"));
		root.add(new File("파일3.file"));

		Directory workspace = new Directory("방문자패턴");
		temp.add(workspace);
		temp.add(new File("예제.file"));
		temp.add(new File("참고.file"));

		workspace.add(new File("Application.java"));

		Visitor visitor = new TreeViewer();

		visitor.visit(root);
		System.out.println("=============================================");
		visitor.visit(temp);
		System.out.println("=============================================");
		visitor.visit(workspace);
	}
}