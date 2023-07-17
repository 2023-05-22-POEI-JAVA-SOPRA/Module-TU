package service;

public class Nombre {

	public int value;
	
	
	
	public Nombre() {
		super();
	}

	public Nombre(int value) {
		super();
		this.value = value;
	}

	public int getValue() {
		return value;
	}
	
	public void setValue(int value) {
		this.value = value;
	}
	
	public Nombre add(Nombre n) {
		this.value = this.value + n.getValue();
		return this;
	}
	
	
	public Nombre multiply(Nombre n) {
		this.value = this.value * n.getValue();
		return this;
	}
	
	public Nombre substract(Nombre n) {
		this.value = this.value - n.getValue();
		return this;
	}
	
	public Nombre divide(Nombre n) {
		this.value = this.value / n.getValue();
		return this;
	}
	
	
}
