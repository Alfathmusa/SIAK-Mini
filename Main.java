public class Main {
    public static void main(String[]args) {
        Dosen d = new Dosen("Pak Rudi");
        Mahasiswa m1 = new Mahasiswa("Budi");
        Mahasiswa m2 = new Mahasiswa("Sari");

        d.tambahMahasiswa(m1);
        d.tambahMahasiswa(m2);

        d.tampilkanMahasiswa();
        m1.lihatDosen();
        m2.lihatDosen();
    }
}