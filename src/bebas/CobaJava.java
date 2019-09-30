package bebas;

public class CobaJava {
	public static void main(String[] args) {
		int tglKembali = 12;
		
		if (tglKembali >= 11 || tglKembali <= 27) {
			System.out.println("Anda Mengembalikan Buku Tepat Waktu");
		}else if(tglKembali >= 28){
			System.out.println("Telat Mengembalikan Buku");
		}else{
			System.out.println("mana mungkin 5rb pergiga");
		}
}
}