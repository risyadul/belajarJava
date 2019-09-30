package HeroesObj;

public class Heroes {
	public String nama;
	public int hp;
	public int mana;
	
	public Heroes() {
		
	}
	
	public Heroes(String nama, Integer hp, Integer mana) {
		super();
		this.nama = nama;
		this.hp = hp;
		this.mana = mana;
	}

	public void setNama(String nama) {
		this.nama = nama;
	}
	public String getNama() {
		return this.nama;
	}
	public void setHp(Integer hp) {
		this.hp = hp;
	}
	public int getHp() {
		return this.hp;
	}
	public void setMana(Integer mana) {
		this.mana = mana;
	}
	public int getMana() {
		return this.mana;
	}
}
