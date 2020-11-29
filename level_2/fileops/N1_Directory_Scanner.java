package com.leveltwo.files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class N1_Directory_Scanner {

	public static void main(String[] args) throws IOException {
		System.out.println("***Files***");
		Path currentDirectory = Paths.get(".");
		//Files.list(currentDirectory).forEach(System.out::println);
		Files.walk(currentDirectory, 2).forEach(System.out::println);

		Path currentDirectory2 = Paths.get(".");

		Predicate<? super Path> predicate = Path -> String.valueOf(Path).contains(".java");

		// Files.walk(currentDirectory, 4).forEach(System.out::println);
		System.out.println("***Predicate***");
		Files.walk(currentDirectory2, 4).filter(predicate).forEach(System.out::println);

		BiPredicate<Path, BasicFileAttributes> matcher = (path, attributes) -> String.valueOf(path).contains(".class");
		System.out.println("***Matcher***");
		Files.find(currentDirectory, 4, matcher).forEach(System.out::println);

		System.out.println("***Dir matcher***");
		BiPredicate<Path, BasicFileAttributes> directoryMatcher = (path, attributes) -> attributes.isDirectory();
		Files.find(currentDirectory, 4, directoryMatcher);

	}
}
