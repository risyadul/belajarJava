package bebas;

public class IntegerPositif {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = {4, 5, 2, 1, 6};
		
		int i = 1;
		while (i <= numbers.length) {
			if (numbers[i] - numbers[i-1] == 1) {
			}else {
				System.out.println("Angka yang Hilang adalah "+ (numbers[i-1]+2));
			}
			i++;
		}

	}

}
