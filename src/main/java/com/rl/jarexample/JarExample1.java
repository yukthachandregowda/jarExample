package com.rl.jarexample;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;

public class JarExample1 {
	public static void main(String[] args) throws IOException {

		try {
			File file = new File("test1.txt");
			FileOutputStream fout = new FileOutputStream(file);

			int i=100;
			fout.write(i);
			fout.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
