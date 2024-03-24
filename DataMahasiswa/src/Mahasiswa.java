public class Mahasiswa {
    private String nim;
    private String nama;
    private String jenisKelamin;
    private String ipk;

    public Mahasiswa(String nim, String nama, String jenisKelamin, String ipk) {
        this.nim = nim;
        this.nama = nama;
        this.jenisKelamin = jenisKelamin;
        this.ipk = ipk;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setJenisKelamin(String jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }

    public void setIpk(String ipk){
        this.ipk = ipk;
    }

    public String getNim() {
        return this.nim;
    }

    public String getNama() {
        return this.nama;
    }

    public String getJenisKelamin() {
        return this.jenisKelamin;
    }

    public String getIpk(){
        return this.ipk;
    }
}
