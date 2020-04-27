import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        char y_t;
        Scanner input = new Scanner(System.in);
        float set_r, set_ts, set_sudut;
        int menu;
        Lingkaran lingkaran = new Lingkaran();
        Bola bola = new Bola();
        Silinder silinder = new Silinder();
        Kerucut kerucut = new Kerucut();
        KerucutTerpancung kt = new KerucutTerpancung();
        Juring juring = new Juring();

        do {
            System.out.println("================MENU================");
            System.out.println("1. Lingkaran");
            System.out.println("2. Juring dan Tembereng");
            System.out.println("3. Kerucut");
            System.out.println("4. Silinder");
            System.out.println("5. Bola");
            System.out.println("6. Exit");
            System.out.println("Pilih menu : ");
            menu = input.nextInt();

            switch (menu) {
                case 1:
                    System.out.println("===========LINGKARAN===========");
                    System.out.println("Masukkan ukuran jari-jari : ");
                    set_r = input.nextInt();
                    lingkaran.NilaiLingkaran(set_r);
                    System.out.println("Luas Lingkaran : " + lingkaran.getLuasLingkaran(set_r));
                    break;

                case 2:
                    System.out.println("===========JURING DAN TEMBERENG===========");
                    System.out.println("JURING");
                    System.out.println("Masukkan ukuran jari-jari : ");
                    set_r = input.nextInt();
                    System.out.println("Masukkan sudut sisi : ");
                    set_sudut = input.nextInt();
                    juring.nilaiSudut(set_sudut);
                    juring.panjangBusurJuring(set_r);
                    System.out.println("Panjang busur juring : " + juring.getNilaiPanjangBusur());
                    juring.KelilingJuring(set_r);
                    System.out.println("Keliling Juring : " + juring.getKelilingJuring());
                    juring.LuasJuring(set_r);
                    System.out.println("Luas Juring : " + juring.getLuasJuring());

                    System.out.println();

                    System.out.println("TEMBERENG");

                    break;

                case 3:
                    System.out.println("===========KERUCUT DAN KERUCUT TERPANCUNG===========");
                    System.out.println("Hitung " + kerucut.Cetak2());
                    System.out.println("Masukkan ukuran jari-jari : ");
                    set_r = input.nextInt();
                    System.out.println("Masukkan tinggi kerucut : ");
                    set_ts = input.nextInt();
                    kerucut.VolumeKerucut(set_r, set_ts);
                    System.out.println(kerucut.Cetak2() + kerucut.NilaiVolumeKerucut());
                    kerucut.LuasPermukaanKerucut(set_r, set_ts);
                    System.out.println("Luas Permukaan Kerucut : " + kerucut.NilaiLuasPermukaanKerucut());
                    System.out.println("Volume Kerucut Terpancung : ");
                    kt.VolumeKerucutTerpancung(set_r,set_ts);
                    System.out.println(kt.NilaiVolumeKerucutTerpancung());
                    kt.LuasPermukaanKerucutTerpancung(set_r, set_ts);
                    System.out.println("Luas Permukaan Kerucut Terpancung : ");
                    System.out.println(kt.NilaiLuasPermukaanKerucutTerpancung());
                    break;

                case 4:
                    System.out.println("===========SILINDER===========");
                    System.out.println("Hitung " + silinder.Cetak2());
                    System.out.println("Masukkan ukuran jari-jari : ");
                    set_r = input.nextInt();
                    System.out.println("Masukkan tinggi silinder : ");
                    set_ts = input.nextInt();
                    silinder.VolumeSilinder(set_r, set_ts);
                    System.out.println(silinder.Cetak2() + silinder.NilaiVolumeSilinder());
                    silinder.LuasPermukaanSilinder(set_r,set_ts);
                    System.out.println("Luas Permukaan Silinder : " + silinder.NilaiLuasPermukaanSilinder());
                    break;

                case 5:
                    System.out.println("Masukkan ukuran jari-jari : ");
                    set_r = input.nextInt();
                    bola.VolumeBola(set_r);
                    System.out.println("Volume Bola : " + bola.NilaiVolumeBola());
                    break;

                default:
                    break;

            }
            System.out.println("Pilih menu lagi?");
            y_t = input.next().charAt(0);
        } while (y_t == 'y' || y_t == 'Y');
    }

}
