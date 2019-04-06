
public class Persegi extends BangunDatar{
	
	private int sisi;
	
	public Persegi(int sisi) {
		super();
		this.sisi = sisi;
	}
	
	public int getSisi() {
		return sisi;
	}

	public void luas() {
		double luas = Math.pow(sisi, 2);
		System.out.println("Luas : "+luas);
	}
	public void keliling() {
		double keliling = 4*sisi;
		System.out.println("Keliling : "+keliling);		
	}

	public Persegi() {
		
	}
}
