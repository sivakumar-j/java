package com.leveltwo.files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class N3_FilewriteRunner {
	public static void main(String[] args) throws IOException {
		Path pathFileToWrite = Paths.get("./src/resources/file-write.txt");
		List<String> list = List.of("Apple", "Boy", "Cat", "Dog", "Elephant");
		Files.write(pathFileToWrite, list);
	}
}
