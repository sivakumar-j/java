package com.leveltwo.files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class N2_FileReadRunner {
	public static void main(String[] args) throws IOException {
		Path pathFileToRead = Paths.get("./src/resources/data.txt");
		// Files.walk(pathFileToRead, 2).forEach(System.out::println);
		List<String> lines = Files.readAllLines(pathFileToRead);
		System.out.println("***Read One***");
		System.out.println(lines);

		System.out.println("***Read Two***");
		Files.lines(pathFileToRead).forEach(System.out::println);
		System.out.println("***Read Three***");
		Files.lines(pathFileToRead).map(String::toLowerCase).forEach(System.out::println);

		System.out.println("***Read Four***");
		Files.lines(pathFileToRead).map(String::toLowerCase).filter(str -> str.contains("our"))
		.forEach(System.out::println);
	}

}
