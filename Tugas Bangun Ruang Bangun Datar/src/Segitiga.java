
public class Segitiga extends BangunDatar {

	private int tinggi,alas,sisi1,sisi2;
	


	public Segitiga(int tinggi, int alas, int sisi1, int sisi2) {
		super();
		this.tinggi = tinggi;
		this.alas = alas;
		this.sisi1 = sisi1;
		this.sisi2 = sisi2;
	}
	
	public int getTinggi() {
		return tinggi;
	}

	public void setTinggi(int tinggi) {
		this.tinggi = tinggi;
	}

	public int getAlas() {
		return alas;
	}

	public void setAlas(int alas) {
		this.alas = alas;
	}

	public int getSisi1() {
		return sisi1;
	}

	public void setSisiA(int sisi1) {
		this.sisi1 = sisi1;
	}

	public int getSisiB() {
		return sisi2;
	}

	public void setSisiB(int sisi2) {
		this.sisi2 = sisi2;
	}

	public void luas() {
		double luas = 0.5*tinggi*alas;
		System.out.println("Luas : "+luas);
	}
	
	public void keliling() {
		double keliling = sisi1+sisi2+alas;
		System.out.println("Keliling : "+keliling);		
	}
	
	public Segitiga() {
		
	}

}
