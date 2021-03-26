package com.address.book.workshop;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class AddressBookFileIOService {
	public static String PAYROllFile = "payroll.txt";

	public long countEntries() {
		long entries = 0;
		try {
			entries = Files.lines(new File(PAYROllFile).toPath()).count();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return entries;
	}
}