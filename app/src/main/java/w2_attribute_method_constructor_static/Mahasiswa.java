package w2_attribute_method_constructor_static;

public class Mahasiswa {
    String nim; 
    String nama; 
    Boolean status;

    public Mahasiswa(String nim, String nama, Boolean status) {
        this.nim = nim;
        this.nama = nama;
        this.status = status;
    }

    public String getNim() {
        return nim;
    }

    public String getNama() {
        return nama;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }    
}
