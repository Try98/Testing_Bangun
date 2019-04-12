import java.util.*;
public class Testing_bangun {

	public Testing_bangun() {
        
        Scanner input = new Scanner(System.in);
        Persegi P = new Persegi();
        PersegiPanjang PP = new PersegiPanjang();
        Segitiga S = new Segitiga();
        Lingkaran L = new Lingkaran();
        Kubus K = new Kubus();
        Balok B = new Balok();
        Bola BL = new Bola();
        int choice;
        do {
             System.out.print("1.Bangun Datar\r\n"
            		 		+ "2.Bangun Ruang\r\n"
            		 		+ "3.Exit\r\n"
            		 		+ "Choice : ");
             				choice = input.nextInt();input.nextLine();
             			if(choice == 1) {
             				do {
             					System.out.print("1.Persegi\r\n"
             								+ "2.Persegi Panjang\r\n"
             								+ "3.Segitiga\r\n"
             								+ "4.Lingkaran\r\n"
             								+ "5.Back to Menu\r\n"
             								+ "Choice : ");
             										choice = input.nextInt();input.nextLine();
             									if (choice == 1) {
             										int sisi;
             										System.out.print("Sisi :");
             										sisi=input.nextInt();input.nextLine();
             										P = new Persegi(sisi);
             										P.luas();
             										P.keliling();
             									}else if(choice == 2) {
             										int lebar,panjang;
             										System.out.print("Lebar :");
             										lebar=input.nextInt();input.nextLine();
             										System.out.print("Panjang :");
             										panjang=input.nextInt();input.nextLine();
             										PP = new PersegiPanjang(panjang, lebar);
             										PP.luas();
             										PP.keliling();
             									}else if(choice == 3) {
             										int tinggi,alas,sisi1,sisi2;
             										System.out.print("Tinggi :");
             										tinggi=input.nextInt();input.nextLine();
             										System.out.print("Alas :");
             										alas=input.nextInt();input.nextLine();
             										System.out.print("Sisi1 :");
             										sisi1=input.nextInt();input.nextLine();
             										System.out.print("Sisi2 :");
             										sisi2=input.nextInt();input.nextLine();
             										S = new Segitiga(tinggi, alas, sisi1, sisi2);
             										S.luas();
             										S.keliling();
             									}else if(choice == 4) {
             										int jarijari;
             										System.out.print("Jari - Jari :");
             										jarijari=input.nextInt();input.nextLine();
             										L = new Lingkaran(jarijari);
             										L.luas();
             										L.keliling();
             									}
             					} while (choice != 5);
                                                                  
                			}else if(choice == 2) {
                				do {
                					System.out.print("1.Kubus\r\n"
                					+ "2.Balok\r\n"
    									+ "3.Bola\r\n"
    									+ "4.Back to Menu\r\n"
    									+ "Choice : ");
                							choice = input.nextInt();input.nextLine();
                								if (choice == 1) {
                									int sisi;
                									System.out.print("Sisi :");
                									sisi=input.nextInt();input.nextLine();
                									K = new Kubus(sisi);
                									K.volume();
                									K.luas();
                									K.keliling();
                								}else if(choice == 2) {
                									int lebar,panjang,tinggi;
                									System.out.print("Lebar :");
                									lebar=input.nextInt();input.nextLine();
                									System.out.print("Panjang :");
                									panjang=input.nextInt();input.nextLine();
                									System.out.print("Tinggi :");
                									tinggi=input.nextInt();input.nextLine();
                									B = new Balok(panjang, lebar, tinggi);
                									B.volume();
                									B.luas();
                									B.keliling();
                								}else if(choice == 3) {
                									int jarijari;
             										System.out.print("Jari - Jari :");
             										jarijari=input.nextInt();input.nextLine();
             										BL = new Bola(jarijari);
             										BL.volume();
             										BL.luas();
             										BL.keliling();
    	                    	        		}
                				} while (choice != 4); 
                			}   				        	   
        	} while (choice != 3);

	}

	public static void main(String[] args) {
		new Testing_bangun();
		/*
		 * int tinggi,alas; 
		 * Samakaki SK = new Samakaki(); 
		 * Scanner input = new Scanner(System.in); 
		 * System.out.print("Tinggi : "); 
		 * tinggi = input.nextInt();input.nextLine(); 
		 * System.out.print("Alas : "); 
		 * alas = input.nextInt();input.nextLine(); 
		 * SK = new Samakaki(tinggi, alas); 
		 * SK.luas();
		 * SK.keliling();
		 */
		
		
	}

}
