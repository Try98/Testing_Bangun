
public class Samakaki extends BangunDatar {

	private int tinggi,alas;
	
	
	
	public Samakaki(int tinggi, int alas) {
		super();
		this.tinggi = tinggi;
		this.alas = alas;
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

	public Samakaki() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void luas() {
		double luas = 0.5*tinggi*alas;
		System.out.println("Luas : "+luas);
	}

	@Override
	public void keliling() {
		double kaki = Math.sqrt(Math.pow(alas/2, 2)+Math.pow(tinggi, 2));
		double keliling = kaki+kaki+alas;
		System.out.println("Keliling : "+keliling);	
	}

}
