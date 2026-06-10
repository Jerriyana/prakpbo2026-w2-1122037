package w2_attribute_method_constructor_static;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        List<Mahasiswa> listMahasiswa = new ArrayList<>();
        List<MataKuliah> listMataKuliah = new ArrayList<>();
        List<KRS> listKrs = new ArrayList<>();

        Mahasiswa mhs1 = new Mahasiswa("1122037", "Gregorius", true);
        Mahasiswa mhs2 = new Mahasiswa("1122038", "Jon", false);
        MataKuliah matkul1 = new MataKuliah("111", "Pbo", true);
        MataKuliah matkul2 = new MataKuliah("112", "Prak Pbo", false);
        listMahasiswa.add(mhs1);
        listMahasiswa.add(mhs2);
        listMataKuliah.add(matkul1);
        listMataKuliah.add(matkul2);
        listKrs.add(new KRS(mhs1, matkul1, 70));
        listKrs.add(new KRS(mhs1, matkul2, 67));
        listKrs.add(new KRS(mhs2, matkul1, 80));
        listKrs.add(new KRS(mhs2, matkul2, 73));

        Scanner scan = new Scanner(System.in);
        int pilihMenu = -1;
        while (pilihMenu != 0) {
            System.out.println("Menu");
            System.out.println("1. Mata Kuliah");
            System.out.println("2. Mahasiswa");
            System.out.println("3. Kartu Rencana Studi");
            System.out.println("4. List Mahasiswa by Matakuliah");
            System.out.println("5. List Matakuliah by Mahasiswa");
            System.out.println("Pilih: ");
            pilihMenu = scan.nextInt();
            switch (pilihMenu) {
                case 1: {
                    System.out.println("1. Tambah");
                    System.out.println("2. Edit");
                    int pilihSubMenu = scan.nextInt();
                    switch (pilihSubMenu) {
                        case 1: {
                            scan.nextLine();
                            System.out.print("Kode Matkul : ");
                            String kodeMatkul = scan.nextLine();
                            System.out.print("Nama Matkul : ");
                            String namaMatkul = scan.nextLine();
                            System.out.print("Status Aktif (true/false): ");
                            Boolean status = scan.nextBoolean();
                            listMataKuliah.add(new MataKuliah(kodeMatkul, namaMatkul, status));
                            break;
                        }
                        case 2: {
                            scan.nextLine();
                            for (int i = 0; i < listMataKuliah.size(); i++) {
                                System.out.print(i + 1 + ". ");
                                System.out.print(listMataKuliah.get(i).getKode() + ", ");
                                System.out.print(listMataKuliah.get(i).getNama() + ", ");
                                System.out.println(listMataKuliah.get(i).getStatus());
                            }
                            System.out.print("pilih mata kuliah : ");
                            int pilihMatkul = scan.nextInt();
                            int indeksMataKuliah = pilihMatkul - 1;
                            if (indeksMataKuliah >= 0 && indeksMataKuliah < listMataKuliah.size()) {
                                scan.nextLine();
                                System.out.print("Kode Matkul : ");
                                String kodeMatkul = scan.nextLine();
                                System.out.print("Nama Matkul : ");
                                String namaMatkul = scan.nextLine();
                                System.out.print("Status Aktif (true/false): ");
                                Boolean status = scan.nextBoolean();
                                listMataKuliah.get(indeksMataKuliah).setKode(kodeMatkul);
                                listMataKuliah.get(indeksMataKuliah).setNama(namaMatkul);
                                listMataKuliah.get(indeksMataKuliah).setStatus(status);
                                System.out.println("Mata Kuliah berhasil diperbaharui");
                                System.out.println("======================");
                                System.out.println("Hasil Edit Mata Kuliah ");
                                System.out.println("Kode : " + listMataKuliah.get(indeksMataKuliah).getKode());
                                System.out.println("Nama : " + listMataKuliah.get(indeksMataKuliah).getNama());
                                System.out.println("Status : " + listMataKuliah.get(indeksMataKuliah).getStatus());
                            } else {
                                System.out.println("Mata Kuliah yang dipilih tidak ada");
                            }
                            break;
                        }
                    }
                    break;
                }
                case 2: {
                    System.out.println("1. Tambah");
                    System.out.println("2. Edit");
                    int pilihSubMenu = scan.nextInt();
                    switch (pilihSubMenu) {
                        case 1: {
                            scan.nextLine();
                            System.out.print("Nim : ");
                            String nim = scan.nextLine();
                            System.out.print("Nama Mahasiswa: ");
                            String namaMahasiswa = scan.nextLine();
                            System.out.print("Status Aktif (true/false): ");
                            Boolean status = scan.nextBoolean();
                            listMahasiswa.add(new Mahasiswa(nim, namaMahasiswa, status));
                            break;
                        }
                        case 2: {
                            scan.nextLine();
                            for (int i = 0; i < listMahasiswa.size(); i++) {
                                System.out.print(i + 1 + ". ");
                                System.out.print(listMahasiswa.get(i).getNim() + ", ");
                                System.out.print(listMahasiswa.get(i).getNama() + ", ");
                                System.out.println(listMahasiswa.get(i).getStatus());
                            }
                            System.out.print("pilih mahasiswa : ");
                            int pilihMahasiswa = scan.nextInt();
                            int indeksMahasiswa = pilihMahasiswa - 1;
                            if (indeksMahasiswa >= 0 && indeksMahasiswa < listMahasiswa.size()) {
                                scan.nextLine();
                                System.out.print("Nim : ");
                                String nim = scan.nextLine();
                                System.out.print("Nama Mahasiswa : ");
                                String namaMahasiswa = scan.nextLine();
                                System.out.print("Status Aktif (true/false): ");
                                Boolean status = scan.nextBoolean();
                                listMahasiswa.get(indeksMahasiswa).setNim(nim);
                                listMahasiswa.get(indeksMahasiswa).setNama(namaMahasiswa);
                                listMahasiswa.get(indeksMahasiswa).setStatus(status);
                                System.out.println("Mahasiswa berhasil diperbaharui");
                                System.out.println("======================");
                                System.out.println("Hasil Edit Mahasiswa ");
                                System.out.println("Nim : " + listMahasiswa.get(indeksMahasiswa).getNim());
                                System.out.println("Nama : " + listMahasiswa.get(indeksMahasiswa).getNama());
                                System.out.println("Status : " + listMahasiswa.get(indeksMahasiswa).getStatus());
                            } else {
                                System.out.println("Mahasiswa yang dipilih tidak ada");
                            }
                            break;
                        }
                    }
                    break;
                }
                case 3: {
                    System.out.println("1. Tambah");
                    System.out.println("2. Edit");
                    int pilih = scan.nextInt();
                    switch (pilih) {
                        case 1: {
                            System.out.println("Daftar Mahasiswa");
                            for (int i = 0; i < listMahasiswa.size(); i++) {
                                System.out.print(i + 1 + ". ");
                                System.out.print(listMahasiswa.get(i).getNim() + ", ");
                                System.out.print(listMahasiswa.get(i).getNama() + ", ");
                                System.out.println(listMahasiswa.get(i).getStatus());
                            }
                            System.out.print("pilih mahasiswa : ");
                            int pilihMahasiswa = scan.nextInt();
                            int indeksMahasiswa = pilihMahasiswa - 1;
                            Mahasiswa mahasiswaDipilih = listMahasiswa.get(indeksMahasiswa);
                            if (mahasiswaDipilih.getStatus() == false) {
                                System.out.println("Mahasiswa tidak aktif");
                                break;
                            }

                            System.out.println("Daftar Matakuliah");
                            for (int i = 0; i < listMataKuliah.size(); i++) {
                                System.out.print(i + 1 + ". ");
                                System.out.print(listMataKuliah.get(i).getKode() + ", ");
                                System.out.print(listMataKuliah.get(i).getNama() + ", ");
                                System.out.println(listMataKuliah.get(i).getStatus());
                            }
                            System.out.print("pilih mata kuliah : ");
                            int pilihMatkul = scan.nextInt();
                            int indeksMataKuliah = pilihMatkul - 1;
                            MataKuliah mataKuliahDipilih = listMataKuliah.get(indeksMataKuliah);
                            if (mataKuliahDipilih.getStatus() == false) {
                                System.out.println("Matakuliah tidak aktif");
                                break;
                            }

                            boolean sudahAmbil = false;
                            for (int i = 0; i < listKrs.size(); i++) {
                                if (listKrs.get(i).getMahasiswa().getNim().equals(mahasiswaDipilih.getNim()) &&
                                    listKrs.get(i).getMatakuliah().getKode().equals(mataKuliahDipilih.getKode())) {
                                    sudahAmbil = true;
                                    break;
                                }
                            }

                            if (sudahAmbil == true) {
                                System.out.println("Mata kuliah sudah diambil");
                                break;
                            }

                            System.out.print("Input Nilai : ");
                            float nilai = scan.nextFloat();

                            listKrs.add(new KRS(mahasiswaDipilih, mataKuliahDipilih, nilai));
                            break;
                        }
                        case 2: {
                            System.out.println("1. Drop matakuliah");
                            System.out.println("2. Ubah nilai");
                            int pilihSubMenu = scan.nextInt();
                            System.out.println("Daftar Mahasiswa dan Mata Kuliah");
                            for (int i = 0; i < listKrs.size(); i++) {
                                System.out.println(i + 1 + ". " + listKrs.get(i).getMahasiswa().getNim() + " - "
                                        + listKrs.get(i).getMahasiswa().getNama() + " - "
                                        + listKrs.get(i).getMahasiswa().getStatus() + " -> "
                                        + listKrs.get(i).getMatakuliah().getKode() + " - "
                                        + listKrs.get(i).getMatakuliah().getNama() + " - "
                                        + listKrs.get(i).getMatakuliah().getStatus());
                            }
                            switch (pilihSubMenu) {
                                case 1: {
                                    System.out.print("Mahasiswa - Matkul yang mau di drop :  ");
                                    int pilihKrs = scan.nextInt();                                    
                                    int indeksKrs = pilihKrs - 1;
                                    listKrs.remove(indeksKrs);
                                    break;
                                }
                                case 2: {
                                    System.out.print("Pilih KRS yang mau diubah nilainya :  ");
                                    int pilihKrs = scan.nextInt();                                    
                                    int indeksKrs = pilihKrs - 1;
                                    System.out.print("Input Nilai Baru : ");
                                    float nilaiBaru = scan.nextFloat();
                                    listKrs.get(indeksKrs).setNilai(nilaiBaru);
                                    break;
                                }
                            }
                            break;
                        }
                    }
                    break;
                }
                case 4: {
                    System.out.println("Daftar Matakuliah");
                    for (int i = 0; i < listMataKuliah.size(); i++) {
                        System.out.print(i + 1 + ". ");
                        System.out.print(listMataKuliah.get(i).getKode() + ", ");
                        System.out.print(listMataKuliah.get(i).getNama() + ", ");
                        System.out.println(listMataKuliah.get(i).getStatus());
                    }
                    System.out.print("Pilih Matakuliah : ");
                    int pilihMatkul = scan.nextInt();
                    int indeksMataKuliah = pilihMatkul - 1;
                    MataKuliah matkulDipilih = listMataKuliah.get(indeksMataKuliah);
                    for (int i = 0; i < listKrs.size(); i++) {
                        if (listKrs.get(i).getMatakuliah().getKode().equals(matkulDipilih.getKode())) {
                            listKrs.get(i).printFormatNama();
                        }
                    }
                    break;
                }
                case 5: {
                    System.out.println("Daftar Mahasiswa");
                    for (int i = 0; i < listMahasiswa.size(); i++) {
                        System.out.print(i + 1 + ". ");
                        System.out.print(listMahasiswa.get(i).getNim() + ", ");
                        System.out.print(listMahasiswa.get(i).getNama() + ", ");
                        System.out.println(listMahasiswa.get(i).getStatus());
                    }
                    System.out.print("Pilih Mahasiswa: ");
                    int pilihMahasiswa = scan.nextInt();
                    int indeksMahasiswa = pilihMahasiswa - 1;
                    Mahasiswa mhsDipilih = listMahasiswa.get(indeksMahasiswa);
                    for (int i = 0; i < listKrs.size(); i++) {
                        if (listKrs.get(i).getMahasiswa().getNim().equals(mhsDipilih.getNim())) {
                            listKrs.get(i).printFormatKode();
                        }
                    }
                    break;
                }
                case 0: {
                    System.exit(0);
                }
                default: {
                    break;
                }
            }
        }
    }
}