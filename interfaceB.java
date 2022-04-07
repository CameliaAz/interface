package lat_interface;

public class interfaceB implements interfaceA{
    public void keliling_persegi(int s){
        int hasil = s * s;
        System.out.println("Hasil dari keliling persegi adalah "+hasil);
    }
    public void keliling_persegipanjang(int p, int l){
        int hasil = p * l;
        System.out.println("Hasil dari keliling persegi panjang adalah "+hasil);
    }
    public void keliling_segitiga(int a, int b, int c){
        int hasil = a + b + c;
        System.out.println("Hasil dari keliling segitiga adalah "+hasil);
    }
    public void keliling_lingkaran(int phi, int d){
        int hasil = phi * d;
        System.out.println("Hasil dari keliling lingkaran adalah "+hasil);
    }
}
