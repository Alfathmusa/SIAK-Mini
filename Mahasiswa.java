public class Mahasiswa {
    private String nama;
    private Dosen dosen;

    public Mahasiswa(String nama) {
        this.nama = nama;
    }

    public void setPembimbing(Dosen dosen) {
        this.dosen = dosen;
    }

    public void lihatDosen() {
        System.out.println(nama + " dibimbing oleh " + dosen.getNama());
    }

    public String getNama() {
        return nama;
    }
}
