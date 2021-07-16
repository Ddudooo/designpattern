package study;

import java.util.HashMap;
import java.util.Map;

public class Factory {

	private Map<String, SomeThing> pool = new HashMap<>();

	private static Factory instance = new Factory();

	public static Factory getInstance() {
		return instance;
	}

	public synchronized SomeThing getSomeThing(String data) {
		System.out.println("[ " + data + " ] 기존 생성된 풀에서 인스턴스를 찾아봅니다.");
		SomeThing find = pool.get(data);
		if (find == null) {
			System.out.println("[ " + data + " ] 생성되지 않아 추가");
			find = new SomeThing(data);
			pool.put(data, find);
		}
		return find;
	}
}