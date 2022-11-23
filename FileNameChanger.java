import java.io.*;

import java.util.*;
import java.util.stream.Stream;

public class FileLiner {

	public static void main(String[] args) throws IOException {
		File file = new File("C:\\Test");
		File[] fs = file.listFiles();
		String[] a;
		Stream<File> steam = Arrays.stream(fs);
		long count = steam.filter(x -> x.isDirectory() == false).count();
		Arrays.sort(fs);

		
		for (int i = 0; i < count; i++) {
			File oldFile = new File("C:\\Test");
			fs[i].renameTo(oldFile);
			a = fs[i].getName().split("\\.");
			System.out.println(a[0]);
			File newFile = new File("C:\\Test1\\" + "KHS_" + i + "." + a[1]);
			System.out.println(fs[i]);
			fs[i].renameTo(newFile);
		}
		System.out.println(count);
	}

}
