package modelo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;

public class Arquivos {
	
	public void agrupar(ArrayList<Integer> info, String fileArq, boolean append) {
		
		try {
			FileWriter fw = new FileWriter(fileArq + ".txt", append);
			BufferedWriter bw = new BufferedWriter(fw);
			
			for (Integer rnad : info) {
				bw.write(rnad.intValue() + "\r\n");
			}
			
			bw.close();
			fw.close();
			
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}
	
	public ArrayList<Integer> ler (String fileName){
		ArrayList<Integer> dt = new ArrayList<Integer>();
		
		try {
			FileReader fr = new FileReader(fileName + ".txt");
			BufferedReader br = new BufferedReader(fr);
			
			String li = "";
			
			while((li = br.readLine()) != null) {
				dt.add(Integer.parseInt(li));
			}
			
			br.close();
			fr.close();
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		
		return dt;
	}

}
