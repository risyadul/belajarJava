package com.belajar;

public class Heroes implements HitAble {
	private String name;
	private Integer hp;
	private Integer mana;
	private Integer baseDamage;
	
	public Heroes(String name, Integer hp, Integer mana, Integer baseDamage) {
		super();
		this.name = name;
		this.hp = hp;
		this.mana = mana;
		this.baseDamage = baseDamage;
	}

	public void attack(HitAble hitAble) {
		hitAble.getHit(this.baseDamage);
	}
	
	@Override
	public void getHit(Integer damage) {
		this.hp = this.hp-damage;
	}
	
	public String print() {
		return "Heroes{"+"hp="+hp+", mana="+mana+", baseDamage="+baseDamage+"}";
	}
}
