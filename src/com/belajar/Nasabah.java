package com.belajar;

public class Nasabah {
	private String nama, alamat, jenisKelamin;
	
	public Nasabah(String nama) {
		this.nama = nama;
	}
	
	public String getNama() {
		return nama;
	}
	public void setNama(String nama) {
		this.nama = nama;
	}
	public String getAlamat() {
		return alamat;
	}
	public void setAlamat(String alamat) {
		this.alamat = alamat;
	}
	public String getJenisKelamin() {
		return jenisKelamin;
	}
	public void setJenisKelamin(String jenisKelamin) {
		this.jenisKelamin = jenisKelamin;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((alamat == null) ? 0 : alamat.hashCode());
		result = prime * result + ((jenisKelamin == null) ? 0 : jenisKelamin.hashCode());
		result = prime * result + ((nama == null) ? 0 : nama.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Nasabah other = (Nasabah) obj;
		if (alamat == null) {
			if (other.alamat != null)
				return false;
		} else if (!alamat.equals(other.alamat))
			return false;
		if (jenisKelamin == null) {
			if (other.jenisKelamin != null)
				return false;
		} else if (!jenisKelamin.equals(other.jenisKelamin))
			return false;
		if (nama == null) {
			if (other.nama != null)
				return false;
		} else if (!nama.equals(other.nama))
			return false;
		return true;
	}
	
	 
	
	
}
