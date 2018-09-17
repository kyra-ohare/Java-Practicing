package javaprogramming.chapter09Arrays;

public class ThreeDimensionalArray {

	public static void main(String[] args) {
		int quantity = 3;
		int[][][] array = new int[quantity][quantity][quantity];
		
		array[0][0][0] = 100; //1 array
		array[0][0][1] = 200; //2 arrays on
		array[0][0][2] = 250; //3 arrays
		array[0][1][0] = 300; //2 arrays on
		array[0][1][1] = 400; //2 arrays on
		array[0][1][2] = 425; //3 arrays
		array[0][2][0] = 450; //3 arrays
		array[0][2][1] = 475; //3 arrays
		array[0][2][2] = 4475; //3 arrays
		array[1][0][0] = 500; //2 arrays on
		array[1][0][1] = 600; //2 arrays on
		array[1][0][2] = 625; //3 arrays
		array[1][1][0] = 700; //2 arrays on
		array[1][1][1] = 800; //2 arrays on
		//array[][][] =
		
		for(int a = 0; a < array.length; a++) {
			for(int b = 0; b < array.length; b++) {
				for(int c = 0; c < array.length; c++) {
					System.out.print(a);
					System.out.print(" - " + b);
					System.out.print(" - " + c + " >>> " + array[a][b][c] + "\n");
				}
			}
		}
		
		
	}

}
