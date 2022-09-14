package com.malikazizali.beritabinding

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.recyclerview.widget.LinearLayoutManager
import com.malikazizali.beritabinding.databinding.FragmentBeritaBinding

class BeritaFragment : Fragment() {
    lateinit var binding : FragmentBeritaBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentBeritaBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val listStudent = arrayListOf(
            Berita("Kesal, Raja Charles III Ngomel-ngomel Gegara Pena Bocor!",
                "Rabu, 14 Sep 2022",
                R.drawable.news1,
                "Novi Christiastuti - detikNews",
                "London - Raja Inggris Charles III meluapkan kekesalannya saat mendapati pena yang digunakan untuk menandatangani buku pengunjung bocor dan tintanya menempel di jarinya. Momen kekesalan Raja baru Inggris ini terekam kamera.\n" +
                        "Seperti dilansir Insider, Rabu (14/9/2022), momen itu terjadi saat Raja Charles III dan istrinya, Permaisuri Camilla, mengunjungi Kastil Hillsborough, Irlandia Utara, pada Selasa (13/9) waktu setempat. Kunjungan itu merupakan bagian dari prosesi menjelang pemakaman Ratu Elizabeth II, ibunda Raja Charles III.\n" +
                        "Sebuah video yang dirilis media terkemuka CBS News menunjukkan momen tersebut. \n Ketika menandatangani buku pengunjung, Raja Charles III tampak mengalami beberapa masalah. Pertama, dia menuliskan tanggal yang salah dalam buku pengunjung Kastil Hillsborough itu. Kedua, pena yang digunakannya ternyata bocor hingga tintanya menempel pada jarinya.\n" +
                        "Situasi itu membuat Raja Charles III tidak bisa menahan kekesalannya.\n \"Ya Tuhan, saya benci ini,\" ucap Raja Charles III dengan raut wajah kesal, sembari melihat ke jarinya yang terkena tinta.\n" +
                        "Dia lalu berdiri dan menyerahkan pena itu kepada Permaisuri Camilla, yang menyadari ada sesuatu yang salah.\n Seorang ajudan bergegas mengambil pena itu dari tangan Permaisuri Camilla, ketika Raja Charles III berusaha membersihkan noda tinta di tangannya dengan sapu tangan yang diambil dari kantong celana.\n" +
                        "\"Saya tidak tahan dengan benda sialan ini!\" ucap Raja Charles III lagi meluapkan rasa frustrasi dan kekesalan dengan insiden itu. \"Apa yang mereka lakukan, setiap waktu,\" imbuhnya.\n" +
                        "Permaisuri Camilla kemudian menandatangani buku pengunjung itu dengan pena baru, sementara Raja Charles III berjalan keluar ruangan.\n" +
                        "\"Oh lihat, itu mengalir ke mana-mana,\" ujar Permaisuri Camilla merujuk pada pena yang tintanya bocor.\n"),

            Berita("Mahfud MD: Sosok Bjorka Teridentifikasi",
                "Rabu, 14 Sep 2022",
                R.drawable.news3,
                "CNN Indonesia",
                "Jakarta, CNN Indonesia -- Menteri Koordinator Bidang Politik Hukum dan Keamanan (Menkopolhukam) Mahfud MD menyatakan gambaran mengenai hacker dengan nama alias Bjorka sudah diidentifikasi oleh Badan Intelijen Negara (BIN) dan Polri.\n" +
                        "Namun, Mahfud mengatakan pihaknya belum dapat mengumumkan siapa sosok di balik Bjorka yang selama ini menjadi perbincangan.\n" +
                        "\"Kita terus menyelidiki karena sampai sekarang ini memang gambaran pelakunya sudah teridentifikasi dengan baik oleh BIN dan Polri, tetapi belum bisa diumumkan,\" kata Mahfud MD dalam konferensi pers, Rabu (14/9).\n" +
                        "Mahfud juga menjelaskan motif di balik aksi peretasan yang dilakukan Bjorka tidak berbahaya, lantaran hanya berkaitan dengan motif ekonomi hingga jual beli.\n" +
                        "\"Motifnya kan ternyata juga gado-gado. Ada yang motif politik, motif ekonomi, motif jual beli dan sebagainya,\" ucap Mahfud.\n" +
                        "\"Sehingga juga ya motif-motif kayak gitu itu sebenarnya tidak ada yang terlalu membahayakan,\" katanya.\n" +
                        "Sebelumnya, hacker bernama Bjorka menyerang sejumlah situs pemerintahan dengan menjual data hasil pembobolan sejumlah situs pemerintah di internet.\n" +
                        "Salah satu data yang diklaim bobol adalah surat dari BIN ke Presiden Jokowi. Bjorka menyebut dokumen-dokumen tersebut rahasia.\n" +
                        "\"Berisi transaksi surat tahun 2019-2021 serta dokumen yang dikirimkan kepada Presiden termasuk kumpulan surat yang dikirim oleh Badan Intelijen Negara yang diberi label rahasia,\" ucap Bjorka di situs situsbreached.to, Jumat (9/9).\n" +
                        "Masalah kemudian membesar ketika data pribadi sejumlah menteri Jokowi dan pejabat lain dibocorkan Bjorka.\n" +
                        "Pemerintah kemudian merespons dengan menggelar rapat antara Presiden RI Joko Widodo (Jokowi) dan sejumlah menteri di Istana Kepresidenan, Jakarta, Senin (12/9).\n")
        )

        binding.rvBerita.adapter = BeritaAdapter(listStudent)
        binding.rvBerita.layoutManager = LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)

    }

}