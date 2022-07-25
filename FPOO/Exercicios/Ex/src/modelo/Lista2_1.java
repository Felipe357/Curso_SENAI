package modelo;

import java.io.IOException;

public class Lista2_1 {
	
	public static void main(String[] args) throws IOException {
		mostra();

	}
	
	public static void mostra() {
		int[] nums = new int[5];
		
		nums[0] = 2;
		nums[1] = 4;
		nums[2] = 5;
		nums[3] = 6;
		nums[4] = 8;
		
		System.out.println("Índice\tValor");
		
		for (int i = 0; i < nums.length; i++) {
			System.out.println(i + "\t" + nums[i]);
		}
		
	}

}
