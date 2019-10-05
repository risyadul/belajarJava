package com.belajar;

import java.util.Objects;

public class CobaFinal {
	private final Double phi = 3.14;
	private Double r;

	public CobaFinal(Double r) {
		super();
		this.r = r;
	}

	public Double getLuas() {
		Double l = phi * r * r;
		return l;
	}

	@Override
	public String toString() {
		return "CobaFinal [phi=" + phi + ", r=" + r + ", getLuas()=" + getLuas() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CobaFinal other = (CobaFinal) obj;
		if (phi == null) {
			if (other.phi != null)
				return false;
		} else if (!phi.equals(other.phi))
			return false;
		if (r == null) {
			if (other.r != null)
				return false;
		} else if (!r.equals(other.r))
			return false;
		return true;
	}

}
