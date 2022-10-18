package com.example.tugasrecyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.rv_kendaraan);

        String arrNama[]={
                "Mobil", "Motor", "Pesawat Terbang", "Kapal", "Sepeda"
        };

        String arrDesc[]={
                "Mobil adalah alat transportasi darat yang berfungsi untuk membawa barang, manusia atau yang lainnya agar lebih cepat sampai tujuan dan memudahkan pekerjaan manusia. Mobil di gerakan oleh tenaga mesin, yang menggunakan mesin pembakaran dalam yang menggunakan bahan bakar minyak ( bensin, solar ) untuk melakukan proses kerja mesin.",
                "Motor merupakan alat transportasi roda dua yang digerakkan dengan mesin. Jika diperhatikan, maka letak kedua roda ini sebaris lurus dan bisa bisa berjalan pada kecepatan tinggi yang disebabkan oleh gaya giroskopik (yang dapat diukur oleh giroskop). Motor ini pun juga bisa berjalan pada kecepatan rendah dimana keseimbangannya dipengaruhi oleh pengaturan setang pengendaranya.",
                "Pesawat terbang adalah pesawat udara yang lebih berat dari udara, bersayap tetap, dan dapat terbang dengan tenaga sendiri. Secara umum istilah pesawat terbang sering juga disebut dengan pesawat udara atau kapal terbang atau cukup pesawat dengan tujuan pendefenisian yang sama sebagai kendaraan yang mampu terbang di atmosfer atau udara. Namun dalam dunia penerbangan, istilah pesawat terbang berbeda dengan pesawat udara, istilah pesawat udara jauh lebih luas pengertiannya karena telah mencakup pesawat terbang dan helikopter.\n" +
                        "\n" +
                        "Ada dua klasifikasi pesawat terbang. Pertama, pesawat yang lebih berat daripada udara (aerodin). Pesawat yang termasuk jenis ini, yaitu autogiro, helikopter, dan pesawat bersayap tetap.\n" +
                        "\n" +
                        "Kedua, pesawat yang lebih ringan daripada udara (aerostat). Pesawat yang termasuk dalam jenis ini di antaranya kapal udara.",
                "Kapal adalah kendaraan pengangkut penumpang dan barang di laut\n" +
                        "(sungai dan sebagainya) seperti halnya sampan atau perahu yang lebih kecil.\n" +
                        "Kapal biasanya cukup besar untuk membawa perahu kecil seperti sekoci.\n" +
                        "Sedangkan dalam istilah inggris, dipisahkan antara ship yang lebih besar dan\n" +
                        "boat yang lebih kecil. Secara kebiasaannya kapal dapat membawa perahu\n" +
                        "tetapi perahu tidak dapat membawa kapal. Ukuran sebenarnya di mana sebuah\n" +
                        "perahu disebut kapal selalu ditetapkan oleh undang-undang dan peraturan atau\n" +
                        "kebiasaan setempat.",
                "Sepeda adalah alat tranportasi yang sangat umum dan luas penggunaannya\n" +
                        "di dunia yang digunakan oleh semua orang dari berbagai kalangan usia. Tidak\n" +
                        "hanya sebagai alat tranportasi sepeda juga menjadi salah satu hobi yang banyak\n" +
                        "diminati oleh masyarakat dan sudah merupakan gaya hidup bagi sebagian\n" +
                        "masyarakat kota. Sepeda juga di anggap sebagai rekreasi dan aktifitas olah raga\n" +
                        "yang populer (Ismunandar, 1996). Bayak komunitas-komunitas sepeda yang\n" +
                        "terbentuk, dan tidak sedikit pula komunitas-komunitas sepeda mengcustome\n" +
                        "sepedanya sesuai keinginan serta penggunaanya. Pengembangan dari sepeda\n" +
                        "menjadi berbagai macam desain, seperti sepeda gunung, sepeda balap, kemudian\n" +
                        "sepeda jenis hybrid, sepeda BMX atau Bicycle moto-cross (BMX dan sepeda\n" +
                        "angkut, serta sepeda lipat yang akrab disapa seli. Sepeda tersebut adalah sepeda\n" +
                        "standar pabrikan yang di sesuaikan dengan dimensi tubuh manusia serta dapat di\n" +
                        "setting sesuai keingian penggunya. Sepeda-sepeda tersebut masing-masing\n" +
                        "mempunyai fungsi dan kegunaan sesuai dengan jenisnya. "
        };

        int arrImage[]={
              R.drawable.img1, R.drawable.img2, R.drawable.img3, R.drawable.img4, R.drawable.img5
        };

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new KendaraanAdapter(this, arrNama, arrDesc, arrImage));
    }
}