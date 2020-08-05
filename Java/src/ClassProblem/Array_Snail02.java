package ClassProblem;

public class Array_Snail02 {
	public static void main(String[] args) {

		int length = 5;
		int output = length;
		
		int[][] array = new int[length][length];
		int SW = 1;
		int i = 0, j = -1;
		int count = 1;

		while (true) {

			for (int cnt = 0; cnt < length; cnt++) {
				j += SW;
				array[i][j] = cnt;
				cnt++;
			}

			length--;
			if (length == 0)
				break;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          
			for (int cnt = 0; cnt < length; cnt++) {
				i--;
				array[i][j] = cnt;
				cnt++;
			}

			SW *= (-1);
		}

		for (i = 0; i < output; i++) {
			for (j = 0; j < output; j++) {
				System.out.printf("%2d ", array[i][j]);
			}
			System.out.println();
		}
	}
}