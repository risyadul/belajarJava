package TugasKeenam;

public class LahanParkir {
	private int slotParkir;
	private String[] nomorPolice = new String[10];
	
	public int getSlotParkir() {
		return slotParkir;
	}
	public void setSlotParkir(int slotParkir) {
		this.slotParkir = slotParkir;
	}
	
	public String[] getNomorPolice() {
		return nomorPolice;
	}
	
	public void setNomorPolice(String nomorPolice, int i) {
		this.nomorPolice[i] = nomorPolice;
	}
	
}
