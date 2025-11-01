import java.util.ArrayList;
import java.util.List;

public class Dosen {
    private String nama;
    private List<Mahasiswa> daftarMhs;

    public Dosen(String nama) {
        this.nama = nama;
        daftarMhs = new ArrayList<>();
    }

    public void tambahMahasiswa(Mahasiswa mhs) {
        daftarMhs.add(mhs);
        mhs.setPembimbing(this);
    }

    public void tampilkanMahasiswa() {
        System.out.println("Mahasiswa bimbingan " + nama + ":");
        for (Mahasiswa m : daftarMhs) {
            System.out.println("- " + m.getNama());
        }
    }

    public String getNama() {
        return nama;
    }
}
