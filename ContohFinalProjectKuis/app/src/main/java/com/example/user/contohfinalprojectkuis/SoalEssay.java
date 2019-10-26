package com.example.user.contohfinalprojectkuis;

/**
 * Created by ASUS on 20/08/2017.
 */

public class SoalEssay {

    //membuat array untuk pertanyaan

    public String pertanyaan[] = {

            "Siapa nama gubernur Jawa Tengah ?",

            "Ideologi dasar bagi negara Indonesia adalah ...",

            "Sila kelima adalah keadilan sosial bagi seluruh rakyat Indonesia dilambangkan dengan gambar ?",

            "Ibukota Provinsi Jawa Timur adalah ...",

            "Siapa nama Menteri dalam Negeri ?",

            "Saat masa penjajahan, senjata yang biasa digunakan oleh pahlawan Indonesia adalah ...",

            "Siapa yang menjahit bendera merah putih ?",

            "Teks yang dibacakan Ir. Soekarno yang menyatakan Indonesia merdeka dalah teks ...",

            "Pulau terbesar di Indonesia adalah ...",

            "Lambang Negara Republik Indonesia adalah ..."
    };

    //membuat array untuk set gambar (dari String diubah jadi ImageView)

    //pastikan yang tertulis disini sama dengan nama di drawable

    //lihat gambar penjelasan1

    private String image[] = {

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

    //membuat array jawaban benar
    private String jawabanBenar[] = {

            "Ganjar Pranowo",

            "Pancasila",

            "Padi dan Kapas",

            "Surabaya",

            "Tjahjo Kumolo",

            "Bambu runcing",

            "Fatmawati",

            "Proklamasi",

            "Kalimantan",

            "Burung Garuda"
    };

    //membuat getter untuk mengambil pertanyaan
    public String getPertanyaan(int x){
        String soal = pertanyaan[x];
        return soal;
    }

    //membuat getter untuk mengambil jawaban benar
    public String getStringGambar(int x){
        String gambar = image[x];
        return gambar;
    }

    //membuat getter untuk mengambil jawaban benar
    public String getJawabanBenar(int x){
        String jawaban = jawabanBenar[x];
        return jawaban;
    }
}