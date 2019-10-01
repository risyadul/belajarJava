package com.belajar;

import java.util.*;

public class TestParam {
	private String nama;
	private String alamat;
	private Integer umur;
	private String tempatLahir;
	private Date tglLahir;
	
	public TestParam(String nama, String alamat, Integer umur, String tempatLahir, Date tglLahir) {
		this.nama = nama;
		this.alamat = alamat;
		this.umur = umur;
		this.tempatLahir = tempatLahir;
		this.tglLahir = tglLahir;
	}
	
	public String printAttributes() {
		return "Nama : "+nama+"\n"+
				"alamat : "+alamat+"\n"+
				"umur : "+umur+"\n"+
				"alamat : "+alamat+"\n"+
				"Templat Lahir : "+tempatLahir+"\n"+
				"Tanggal Lahir : "+tglLahir+"\n";
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
	public Integer getUmur() {
		return umur;
	}
	public void setUmur(Integer umur) {
		this.umur = umur;
	}
	public String getTempatLahir() {
		return tempatLahir;
	}
	public void setTempatLahir(String tempatLahir) {
		this.tempatLahir = tempatLahir;
	}
	public Date getTglLahir() {
		return tglLahir;
	}
	public void setTglLahir(Date tglLahir) {
		this.tglLahir = tglLahir;
	}
	
	
}
