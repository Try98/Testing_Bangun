
public class Bola extends Lingkaran {

	public Bola(int jarijari) {
		super(jarijari);
		
	}

	public void keliling() {
		double keliling = (4/3)*Math.PI*Math.pow(getJarijari(), 2);
		System.out.println("Keliling : "+keliling);	
	}

	public void luas() {
		double luas = 4*Math.PI*Math.pow(getJarijari(), 2);
		System.out.println("Luas : "+luas);
	}
	
	void volume() {
		double volume = (4/3)*Math.PI*Math.pow(getJarijari(), 3);
		System.out.println("Volume : "+volume);
	}

	public Bola() {
		
	}

}
