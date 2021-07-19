package study;

public class TreeViewer implements Visitor {

	private String path = "";

	@Override
	public void visit(File file) {
		System.out.println("[파일입니다!] " + path + "/" + file.getName());
	}

	@Override
	public void visit(Directory directory) {
		String prePath = path;
		path = path + "/" + directory.getName();
		System.out.println("[폴더입니다!] 하위 파일을 방문합니다 " + path);
		for (Element ele : directory.getSubElement()) {
			ele.accept(this);
		}
		path = prePath;
	}
}