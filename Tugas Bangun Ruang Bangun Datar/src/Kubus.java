
public class Kubus extends Persegi {
	
	public Kubus(int sisi) {
		super(sisi);
		
	}
	public void luas() {
		super.luas();
	}

	public void keliling() {
		super.keliling();
	}

	void volume() {
		double volume = Math.pow(getSisi(), 3);
		System.out.println("Volume : "+volume);
	}
	public Kubus() {
		
	}

}
