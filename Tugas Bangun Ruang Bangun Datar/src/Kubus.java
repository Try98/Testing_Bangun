
public class Kubus extends Persegi {
	
	public Kubus(int sisi) {
		super(sisi);
		
	}
	public void luas() {
		double luas = 6*(getSisi()*getSisi());
		System.out.println("Luas : "+luas);
	}

	public void keliling() {
		double keliling = getSisi()*12;
		System.out.println("Keliling : "+keliling);
	}

	void volume() {
		double volume = Math.pow(getSisi(), 3);
		System.out.println("Volume : "+volume);
	}
	public Kubus() {
		
	}

}
