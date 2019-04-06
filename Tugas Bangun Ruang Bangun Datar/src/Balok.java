
public class Balok extends PersegiPanjang {

	private int tinggi;
	
	public Balok(int panjang, int lebar, int tinggi) {
		super(panjang, lebar);
		this.tinggi = tinggi;
	}

	public int getTinggi() {
		return tinggi;
	}

	public void setTinggi(int tinggi) {
		this.tinggi = tinggi;
	}

	public void luas() {
		double luas = 2*panjang+2*lebar+2*tinggi;
		System.out.println("Luas : "+luas);
	}

	
	public void keliling() {
		double keliling = (panjang+lebar+tinggi)*4;
		System.out.println("Keliling : "+keliling);
	}
	void volume() {
		double volume = panjang*lebar*tinggi;
		System.out.println("Volume : "+volume);
	}

	public Balok() {
		
	}

}
