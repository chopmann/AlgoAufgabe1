package de.ostfalia.algo.aufgabe1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Aufgabe1 {

	private int max;
	private boolean firstRun = true;

	public void maximum(String dateiname) {
		try {
			File file = new File(dateiname);
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);
			int tmp = 0;
			String line;
			while ((line = br.readLine()) != null) {
				tmp = Integer.parseInt(line);
				check(tmp);
			}
			br.close();
			fr.close();
		} catch (NumberFormatException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

	public int getMax() {
		return max;
	}


	public void check(int zahl) {
		if (firstRun) {
			max = zahl;
			firstRun = false;
		} else {
			if (max < zahl) {
				max = zahl;
			}
		}
	}

}
