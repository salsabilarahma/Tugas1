package com.example.user.contohfinalprojectkuis;

/**
 * Created by User on 28/08/2017.
 */

public class SoalPilihanGanda {

    //membuat array untuk pertanyaan
    public String pertanyaan[] = new String[]{
            "Siapa nama gubernur Jawa Tengah ?",

            "Ideologi dasar bagi negara Indonesia adalah ...",

            "Sila kelima adalah keadilan sosial bagi seluruh rakyat Indonesia dilambangkan dengan gambar ?",

            "Ibukota Provinsi Jawa Timur adalah ...",

            "Siapa nama Menteri dalam Negeri ?",

            "Saat masa penjajahan, senjata yang biasa digunakan oleh pahlawan Indonesia adalah ...",

            "Siapa yang menjahit bendera merah putih ?",

            "Teks yang dibacakan Ir. Soekarno yang menyatakan Indonesia merdeka dalah teks ...",

            "Pulau terbesar di Indonesia adalah ...",

            "Lambang Negara Republik Indonesia adalah ...",
    };


    //membuat array untuk pilihan jawaban
    private String pilihanJawaban[][] = {
            {"Bibit Waluyo", "Suwardi", "Ganjar Pranowo"},
            {"UUD 1945", "Pancasila", "Bhinneka Tunggal Ika"},
            {"Padi dan Kapas","Rantai","Kepala Banteng"},
            {"Semarang", "Surabaya", "Jakarta"},
            {"Jepang", "Belanda", "Malaysia"},
            {"Tjahjo Kumolo", "Gamawan Fauzi", "Mardiyanto"},
            {"Ir.Sukarno", "Fatmawati", "Sayuti Malik"},
            {"Proklamasi", "Pancasila", "Pembukaan UUD 1945"},
            {"Jawa", "Sumatera", "Kalimantan"},
            {"Burung Garuda","Garuda","Burung Gagak"}
    };

    //membuat array untuk jawaban benar
    private String jawabanBenar[] = {
            "foto_gubernur",

            "pancasila",

            "padi_kapas",

            "surabaya",

            "foto_menteri dalam negeri",

            "bambu_runcing",

            "fatmawati",

            "teks_proklamasi",

            "pulau_kalimantan",

            "lambang_negara"

    };

    //membuat getter untuk mengambil pertanyaan
    public String getpertanyaan(int x) {
        String soal = pertanyaan[x];
        return soal;
    }

    //membuat getter untuk mengambil pilihan jawaban 1
    public String getpilihanJawaban1(int x) {
        String jawaban1 = pilihanJawaban[x][0];
        return jawaban1;
    }

    //membuat getter untuk mengambil pilihan jawaban 2
    public String getpilihanJawaban2(int x) {
        String jawaban2 = pilihanJawaban[x] [1];
        return jawaban2;
    }

    //membuat getter untuk mengambil pilihan jawaban 3
    public String getpilihanJawaban3(int x) {
        String jawaban3 = pilihanJawaban[x][2];
        return jawaban3;
    }

    //membuat getter untuk mengambil jawaban benar
    public String getJawabanBenar(int x) {
        String jawaban = jawabanBenar[x];
        return jawaban;
    }
}