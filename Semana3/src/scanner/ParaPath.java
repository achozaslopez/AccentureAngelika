package scanner;

import java.nio.file.Path;
import java.nio.file.Paths;

public class ParaPath {

	public static void main(String[] args) {
		Path dir = Paths.get("\\ParaPath.java").toAbsolutePath().normalize();
		System.out.println("getFileName \t" + dir.getFileName());
		System.out.println("getName(0) \t" + dir.getName(0));
		System.out.println("getName(1) \t" + dir.getName(1));
		System.out.println("getNameCount \t" + dir.getNameCount());
		System.out.println("getFileName(1) \t" + dir.getFileName());
	}

}
