package w2_attribute_method_constructor_static;

public class KRS {
    Mahasiswa mahasiswa; 
    MataKuliah matakuliah;
    float nilai;

    public KRS(Mahasiswa mahasiswa, MataKuliah matakuliah, float nilai) {
        this.mahasiswa = mahasiswa;
        this.matakuliah = matakuliah;
        this.nilai = nilai;
    }

    public Mahasiswa getMahasiswa() {
        return mahasiswa;
    }

    public void setMahasiswa(Mahasiswa mahasiswa) {
        this.mahasiswa = mahasiswa;
    }

    public MataKuliah getMatakuliah() {
        return matakuliah;
    }

    public void setMatakuliah(MataKuliah matakuliah) {
        this.matakuliah = matakuliah;
    }

    public float getNilai() {
        return nilai;
    }

    public void setNilai(float nilai) {
        this.nilai = nilai;
    }    

    public void printFormatNama() {
        System.out.println(mahasiswa.getNama() + " - " + matakuliah.getNama() + " - " + nilai);
    }

    public void printFormatKode() {
        System.out.println(mahasiswa.getNim() + " - " + matakuliah.getKode() + " - " + nilai);
    }
}