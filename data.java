import java.util.Scanner;
public class data {
    Scanner as = new Scanner(System.in);
    String nama,nik,alamat,telp;

    
    void isiData(String Nama_Warga,String Nik_Warga) {
        nama = Nama_Warga;
        nik = Nik_Warga;
    }
    String masukanNama(){
        return nama;
    }
    String masukanNik(){
        return nik;
    }
    String pekerjaan,kantor;
    String status,pasangan, jml;

    void info_warga(){
        parent a = new parent();
        System.out.println("--------------------oOo--------------------");
        System.out.println("***Data Warga *** ");
        System.out.println("Masukan nama = ");
        String nama = as.nextLine();
        System.out.println("Masukan NIK = ");
        String nik= as.nextLine();
        a.isiData(nama, nik);
        System.out.println("Masukan Alamat = ");
        String alamat = as.nextLine();
        System.out.println("Masukan No. Tlp = ");
        String telp = as.nextLine();
        System.out.println("--------------------oOo--------------------");
        System.out.println("*** Data Pekerjaan *** ");
        System.out.println("Masukan Pekerjaan = ");
        String pekerjaan = as.nextLine();
        System.out.println("Masukan Alamat Kantor = ");
        String kantor = as.nextLine();
        System.out.println("--------------------oOo--------------------");
        System.out.println("*** Data Status *** ");
        System.out.println("Masukan Status = ");
        String status = as.nextLine();
        System.out.println("Masukan Nama Suami/Istri = ");
        String pasangan = as.nextLine();
        System.out.println("Masukan Jumlah Anak = ");
        String jml = as.nextLine();

        System.out.println("Lanjutkan Bayar Iuran ? ");
        datab h2 = new datab();
        String Lanjut=as.nextLine();
        if (Lanjut.equals("ya")|| Lanjut.equals("Ya")|| Lanjut.equals("Y")|| Lanjut.equals("y")){
                h2.info_warga2();
        }
    }
}



