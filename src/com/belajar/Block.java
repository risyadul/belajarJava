package com.belajar;

public class Block extends Rectangle{
	
	private Double height;
	
	public Double getVolume(){
		return this.length*this.width*this.height;
	}
	
	public Block(Double length, Double width, Double height) {
		super(length,width);
		this.height=height;
	}
	
	@Override
	public Double getSurface() {
		return 2*(this.length*this.width)+
				2*(this.length*this.height)+
				2*(this.width*this.height);
				
	}
	
	public String print() {
		return "Block{length="+this.length+", width="+this.width+", height="+this.height+", surface="+getSurface()+", volume="+getRound()+"}";
	}
}
