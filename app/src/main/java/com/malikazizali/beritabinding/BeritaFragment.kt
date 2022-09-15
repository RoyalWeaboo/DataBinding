package com.malikazizali.beritabinding

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
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
            Berita(R.drawable.news1, "Kesal, Raja Charles III Ngomel-ngomel Gegara Pena Bocor!", "Novi Christiastuti - detikNews", "Rabu, 14 Sep 2022 14:11 WIB", "London - Raja Inggris Charles III meluapkan kekesalannya saat mendapati pena yang digunakan untuk menandatangani buku pengunjung bocor dan tintanya menempel di jarinya. Momen kekesalan Raja baru Inggris ini terekam kamera.\n" +
                    "Seperti dilansir Insider, Rabu (14/9/2022), momen itu terjadi saat Raja Charles III dan istrinya, Permaisuri Camilla, mengunjungi Kastil Hillsborough, Irlandia Utara, pada Selasa (13/9) waktu setempat. Kunjungan itu merupakan bagian dari prosesi menjelang pemakaman Ratu Elizabeth II, ibunda Raja Charles III.\n" +
                    "Sebuah video yang dirilis media terkemuka CBS News menunjukkan momen tersebut. \n Ketika menandatangani buku pengunjung, Raja Charles III tampak mengalami beberapa masalah. Pertama, dia menuliskan tanggal yang salah dalam buku pengunjung Kastil Hillsborough itu. Kedua, pena yang digunakannya ternyata bocor hingga tintanya menempel pada jarinya.\n" +
                    "Situasi itu membuat Raja Charles III tidak bisa menahan kekesalannya.\n \"Ya Tuhan, saya benci ini,\" ucap Raja Charles III dengan raut wajah kesal, sembari melihat ke jarinya yang terkena tinta.\n" +
                    "Dia lalu berdiri dan menyerahkan pena itu kepada Permaisuri Camilla, yang menyadari ada sesuatu yang salah.\n Seorang ajudan bergegas mengambil pena itu dari tangan Permaisuri Camilla, ketika Raja Charles III berusaha membersihkan noda tinta di tangannya dengan sapu tangan yang diambil dari kantong celana.\n" +
                    "\"Saya tidak tahan dengan benda sialan ini!\" ucap Raja Charles III lagi meluapkan rasa frustrasi dan kekesalan dengan insiden itu. \"Apa yang mereka lakukan, setiap waktu,\" imbuhnya.\n" +
                    "Permaisuri Camilla kemudian menandatangani buku pengunjung itu dengan pena baru, sementara Raja Charles III berjalan keluar ruangan.\n" +
                    "\"Oh lihat, itu mengalir ke mana-mana,\" ujar Permaisuri Camilla merujuk pada pena yang tintanya bocor.\n"),

            Berita(R.drawable.news2, "3 Petunjuk Identitas Hacker Bjorka, Apa Saja?", "CNN Indonesia", "Rabu, 14 Sep 2022 13:20 WIB", "Jakarta, CNN Indonesia -- Bjorka sudah \"bermain\" di ruang digital Indonesia selama beberapa pekan, dan sejauh ini baru tiga petunjuk yang dapat menjelaskan sosok peretas ini.\n" +
                    "Bjorka sendiri populer lewat serangkaian aksinya di ruang digital Indonesia, mulai dari kebocoran data Indihome, kebocoran 1,3 miliar data registrasi SIM Card, doxing pada sejumlah pejabat publik, hingga komentar-komentar lewat akun Twitter dan Telegramnya.\n" +
                    "Hacker tersebut antara lain sudah meretas data pribadi milik Menkominfo, Johnny G. Plate; Ketua DPR, Puan Maharani; Menko Maritim dan Investasi, Luhut Binsar Pandjaitan; Menkopolhukam, Mahfud MD; dan Gubernur DKI Jakarta, Anies Baswedan. Selain itu ada pula data milik dua aktivis politik media sosial, Denny Siregar dan Abu Janda alias Permadi Arya yang menjadi sasarannya.\n" +
                    "Terkait motif, Bjorka menulis \n" +
                    "this is a new era to demonstrate differently. nothing would change if fools were still given enormous power. the supreme leader in technology should be assigned to someone who understands, not a politician and not someone from the armed forces. because they are just stupid people,\" kicau Bjorka.\n" +
                    "(ini adalah era baru untuk berdemo dengan cara berbeda. Tidak ada yang akan berubah jika orang bodoh masih diberi kekuatan yang sangat besar. Pemimpin tertinggi dalam teknologi harus ditugaskan kepada seseorang yang mengerti, bukan politisi dan bukan seseorang dari angkatan bersenjata. karena mereka hanyalah orang-orang bodoh, red).\n" +
                    "\n" +
                    "1. Mengaku Berbasis di Polandia\n" +
                    "Petunjuk pertama mengarah pada tempat Bjorka berasal. Dia mengklaim dirinya berbasis dari Warsawa, Polandia.\n" +
                    "Akun Twitter milik Bjorka yang kini sudah ditangguhkan menampilkan informasi pada profil berupa frasa \"yea catch me if you can. email: god@bjork.ai\".\n" +
                    "Ia tercatat bergabung pada September 2022 dengan lokasi Warsaw, Polandia. Cuma mengikuti satu akun, ia punya lebih dari 183 ribu followers.\n" +
                    "Meski demikian, lokasi tersebut hanya sebatas klaim dari Bjorka sang pembuat akun, sehingga belum dapat dikonfirmasi.\n" +
                    "Bjorka pun di grup Telegramnya sedang mencari penerjemah yang bisa berbahasa Polandia, Inggris, dan Indonesia.\n" +
                    "\n" +
                    "2. Baru Sebulan di Breach Forum\n" +
                    "Kemudian petunjuk kedua berada di situs breached.to atau breach forum yang menunjukkan Bjorka baru bergabung ke situs tersebut selama satu bulan.\n" +
                    "Bjorka, dengan status gender undisclosed (rahasia), baru bergabung di situs ini 9 Agustus 2022. Waktu online-nya tercatat hanya 1 hari, 15 jam, 49 menit, per Rabu (14/9) siang.\n" +
                    "Baru dua bulan bergabung, reputasinya sudah mencapai 573 dan mendapat bintang enam. Di forum tersebut, Bjorka antara lain sudah membocorkan data pelanggan Tokopedia, SIM Card, dan pelanggan Wattpad. \n" +
                    "\n" +
                    "3. Punya Teman Asal Indonesia \n" +
                    "Lebih lanjut, petunjuk ketiga menunjukkan Bjorka memiliki teman asal Indonesia. Hal ini juga yang disebutnya sebagai salah satu alasan menyerang ruang digital Indonesia.\n" +
                    "Dalam akun Twitter pertamanya @bjorkanisme, yang kini sudah di-suspend, Bjorka sempat mengakui hubungan emosional dengan Indonesia lantaran seorang teman di Polandia yang jadi korban kebijakan RI di masa lalu.\n" +
                    "\n" +
                    "\"i have a good indonesian friend in warsaw, and he told me a lot about how messed up indonesia is. i did this for him (Saya punya teman orang indonesia yang baik di warsawa, dan dia bercerita banyak tentang betapa kacaunya Indonesia. saya melakukan ini untuknya, red),\" ujarnya.\n" +
                    "\n" +
                    "\"yea don't try to track him down from the foreign ministry. because you won't find anything. he is no longer recognized by indonesia as a citizen because of the 1965 policy. even though he is a very smart old man,\" tambah Bjorka. (ya, jangan coba melacaknya dari kementerian luar negeri karena Anda tidak akan menemukan apa pun. Dia tidak lagi diakui oleh Indonesia sebagai warga negara karena kebijakan 1965, meskipun dia pria tua yang sangat pintar).\n"),



            Berita(R.drawable.news3, "Mahfud MD: Sosok Bjorka Teridentifikasi", "CNN Indonesia", "Rabu, 14 Sep 2022 11:14 WIB", "Jakarta, CNN Indonesia -- Menteri Koordinator Bidang Politik Hukum dan Keamanan (Menkopolhukam) Mahfud MD menyatakan gambaran mengenai hacker dengan nama alias Bjorka sudah diidentifikasi oleh Badan Intelijen Negara (BIN) dan Polri.\n" +
                "Namun, Mahfud mengatakan pihaknya belum dapat mengumumkan siapa sosok di balik Bjorka yang selama ini menjadi perbincangan.\n" +
                "\"Kita terus menyelidiki karena sampai sekarang ini memang gambaran pelakunya sudah teridentifikasi dengan baik oleh BIN dan Polri, tetapi belum bisa diumumkan,\" kata Mahfud MD dalam konferensi pers, Rabu (14/9).\n" +
                "Mahfud juga menjelaskan motif di balik aksi peretasan yang dilakukan Bjorka tidak berbahaya, lantaran hanya berkaitan dengan motif ekonomi hingga jual beli.\n" +
                "\"Motifnya kan ternyata juga gado-gado. Ada yang motif politik, motif ekonomi, motif jual beli dan sebagainya,\" ucap Mahfud.\n" +
                "\"Sehingga juga ya motif-motif kayak gitu itu sebenarnya tidak ada yang terlalu membahayakan,\" katanya.\n" +
                "Sebelumnya, hacker bernama Bjorka menyerang sejumlah situs pemerintahan dengan menjual data hasil pembobolan sejumlah situs pemerintah di internet.\n" +
                "Salah satu data yang diklaim bobol adalah surat dari BIN ke Presiden Jokowi. Bjorka menyebut dokumen-dokumen tersebut rahasia.\n" +
                "\"Berisi transaksi surat tahun 2019-2021 serta dokumen yang dikirimkan kepada Presiden termasuk kumpulan surat yang dikirim oleh Badan Intelijen Negara yang diberi label rahasia,\" ucap Bjorka di situs situsbreached.to, Jumat (9/9).\n" +
                "Masalah kemudian membesar ketika data pribadi sejumlah menteri Jokowi dan pejabat lain dibocorkan Bjorka.\n" +
                "Pemerintah kemudian merespons dengan menggelar rapat antara Presiden RI Joko Widodo (Jokowi) dan sejumlah menteri di Istana Kepresidenan, Jakarta, Senin (12/9).\n"),

            Berita(R.drawable.news4, "Suciwati Buka Suara Usai Hacker Bjorka Ungkap Pembunuh Munir", "CNN Indonesia", "Rabu, 14 Sep 2022 10:22 WIB", "Jakarta, CNN Indonesia -- Istri aktivis hak asasi manusia (HAM) Munir Said Thalib, Suciwati menilai tindakan hacker Bjorka yang membeberkan pelaku pembunuhan suaminya merupakan pesan penting.\n" +
                "Suci berpendapat aksi Bjorka itu memperlihatkan bahwa masyarakat masih berharap kasus pembunuhan yang terjadi 18 tahun lalu itu bisa dibongkar.\n" +
                "\"Dengan adanya bocoran yang sedang ramai hari ini menurut saya justru sebetulnya ini pesan penting, orang masih terus kok bertanya tentang kasus Munir,\" kata Suci di kantor KontraS, Jakarta, Selasa (13/9).\n" +
                "Suci mengatakan sampai hari ini pembunuh suaminya masih menjadi misteri yang belum terjawab. Ia menilai pemerintah banyak berdalih dalam upaya membongkar dalang kasus tersebut. Salah satunya dengan menyebut dokumen Tim Pencari Fakta (TPF) hilang.\n" +
                "Kendati demikian, Suci menilai pembentukan tim ad hoc penyelidikan dugaan pelanggaran HAM berat terkait pembunuhan Munir oleh Komnas HAM dinilai penting.\n" +
                "\"Untuk next siapa sebenarnya dalang pembunuhan Munir,\" ucap Suci.\n" +
                "Ketua Badan Pengurus Centra Initiative Al Araf juga berpendapat serupa. Menurutnya, peretasan Bjorka mempertegas bahwa pengungkapan kasus Munir adalah kepentingan publik.\n" +
                "\"Publik masih melihat bahwa penyelesaian kasus Munir belum selesai,\" ujarnya.\n" +
                "Al Araf pun meminta Komnas HAM melakukan penyelidikan dugaan pelanggaran HAM berat pembunuhan Munir secara konsisten. Ia berharap pergantian komisioner Komnas HAM baru pada November mendatang tidak akan mengganggu jalannya proses projustitia.\n" +
                "Kasus pembunuhan Munir berusia 18 tahun. Kasusnya terancam kedaluwarsa karena berdasarkan Pasal 78 ayat (1) butir 3 KUHP, penuntutan pidana hapus setelah 18 tahun untuk kejahatan yang diancam pidana mati atau seumur hidup, seperti pembunuhan berencana.\n" +
                "Sementara itu, jika ditetapkan sebagai pelanggaran HAM berat, kasus Munir tak akan kedaluwarsa. Penyelidikan akan dilakukan sesuai mekanisme UU Nomor 26 Tahun 2000 tentang Pengadilan HAM.\n" +
                "Saat ini, kasus pembunuhan Munir baru mulai ditangani oleh Komnas HAM dengan membentuk tim ad hoc penyelidikan dugaan pelanggaran HAM berat.\n" +
                "Adapun Bjorka baru baru ini mengeluarkan sebuah tulisan \"Who Killed Munir\". Bjorka mengungkapkan kronologi dan beberapa orang yang terlibat dalam pembunuhan aktivis tersebut."),

            Berita(R.drawable.news5, "PDIP Tegaskan Effendi Simbolon Dilindungi UU Terkait Pernyataannya soal TNI", "Nahda Rizki Utami - detikNews", "Rabu, 14 Sep 2022 14:55 WIB", "Jakarta - Anggota Komisi I DPR RI Fraksi PDIP Effendi Simbolon dilaporkan ke Mahkamah Kehormatan Dewan (MKD) DPR atas ucapan 'TNI seperti gerombolan'. Fraksi PDIP bicara anggota DPR dilindungi haknya saat mengungkapkan pendapat di forum resmi DPR.\n" +
                "\"Tetapi, kalau ke MKD, saya belum dapat. Tetapi, juga kami punya di sana sahabat, dan Pak Effendi ketika bicara kapasitasnya sebagai anggota Dewan. Ketika bicara ruang, dalam rapat kerja, teman-teman ini dilindungi haknya,\" kata Ketua Fraksi PDIP DPR RI Utut Adianto saat jumpa pers di kompleks parlemen, Senayan, Jakarta, Rabu (12/9/2022).\n" +
                "Effendi Simbolon diketahui bicara soal 'TNI seperti gerombolan' hingga ormas saat rapat Komisi I DPR RI dengan Kementerian Pertahanan (Kemhan), Panglima TNI, dan kepala staf TNI pada Senin (5/9) lalu. Perlu diketahui, anggota DPR RI dilindungi UU tentang MPR, DPR, DPD, dan DPRD (MD3) saat berbicara.\n" +
                "\"Jadi, nanti kita akan komunikasi dengan teman-teman MKD. Nanti, kalau nggak satu ruang, nggak ada yang berani ngomong lagi, kalau setiap semua orang ngomong di-MKD-in,\" ujarnya.\n" +
                "Sementara itu, MKD DPR memutuskan bakal memanggil Effendi Simbolon terkait adanya laporan dugaan pelanggar kode etik menyebut 'TNI seperti gerombolan'. MKD bakal memanggil Effendi besok, Kamis (15/9).\n" +
                "\"MKD DPR sudah rapat pimpinan kami memutuskan untuk memanggil saudara Effendi Simbolon karena sudah diadukan juga oleh dua pengadu yang satu perseorangan yang satu atas nama Pemuda Panca Marga soal rapat di Komisi I,\" kata Wakil Ketua MKD Habiburokhman kepada wartawan di kompleks parlemen, Senayan, Jakarta, Rabu (14/9).\n" +
                "Waketum Partai Gerindra itu mengatakan pihaknya juga memanggil pengadu terlebih dahulu. Selanjutnya, MKD bakal memanggil Effendi Simbolon besok siang.\n" +
                "\"Kami panggil pengaruhnya dulu pagi besok jam 11.00 ada dua pengadu kami panggil, lalu siangnya kami akan panggil Effendi Simbolon,\" jelas Habiburokhman."),

            Berita(R.drawable.news6, "Jokowi Akan Pimpin Sidang Tim Penilai Akhir Pj Gubernur Pengganti Anies", "Tiara Aliya Azzahra - detikNews", "Rabu, 14 Sep 2022 14:08 WIB", "Jakarta - Ketua DPRD DKI Jakarta Prasetyo Edi Marsudi telah menyerahkan tiga nama calon Pj Gubernur pengganti Anies Baswedan kepada Kemendagri. Ketiga nama itu akan dibahas dalam sidang tim penilai akhir (TPA) untuk menentukan Pj Gubernur DKI Jakarta.\n" +
                "\"Saya menyerahkan berkas yang kemarin sudah saya bahas tiga nama itu hari ini sudah diterima, ini tanda terimanya. Saya jelaskan, saya serahkan untuk ditindaklanjuti,\" kata Prasetyo di kantor Kemendagri, Jl Medan Merdeka Utara, Jakarta Pusat, Rabu (14/9/2022).\n" +
                "\"Pak Sekjen menyerahkan kepada Pak Mendagri Mendagri karena (saat ini) Mendagri sedang ada rapat keluar ya, tinggal urusan Pak Mendagri ke Pak Presiden,\" ujarnya.\n" +
                "Staf Khusus Mendagri, Kastorius Sinaga, menjelaskan pihaknya akan melakukan verifikasi terlebih dahulu terhadap ketiga nama kandidat Pj Gubernur usulan DPRD. Setelah itu, nama-nama tersebut bersama nama usulan Kemendagri akan dibawa ke dalam Sidang TPA yang dipimpin oleh Presiden Joko Widodo bersama lembaga terkait.\n" +
                "\"Kita tampung karena mekanismenya nanti ini akan semuanya diverifikasi dahulu persyaratan formilnya, administrasinya, lalu nanti akan dibawakan Bapak Mendagri diusulkan ke Presiden,\" jelasnya.\n" +
                "\"Di mekanisme yang ada nanti, Bapak Presiden memimpin langsung pembahasan bersama lembaga atau kementerian terkait untuk diputuskan karena kewenangannya ada di Presiden,\" tambahnya.\n" +
                "Sebelumnya, DPRD DKI Jakarta menyepakati tiga nama calon Pj Gubernur DKI Jakarta pengganti Anies Baswedan, yaitu Kasetpres Heru Budi, Sekda DKI Jakarta Marullah Matali, serta Dirjen Politik dan Pemerintahan Umum (Polpum) Kemendagri Bahtiar.\n" +
                "Masa jabatan Anies Baswedan sebagai Gubernur DKI Jakarta akan berakhir pada 16 Oktober 2022. Anies menyatakan dirinya akan bekerja seperti biasa hingga akhir jabatannya."),

            Berita(R.drawable.news7, "Pengecatan Lapisan Antilicin di Kota Tua Jakarta Hampir Tuntas", "Mulia Budi - detikNews", "Rabu, 14 Sep 2022 14:58 WIB\n", "Jakarta - Pengerjaan penambahan lapisan anti-skid agar pemotor tak lagi jatuh tergelincir di Jl Pintu Besar Utara, kawasan Kota Tua, Jakarta Barat (Jakbar), hampir tuntas. Pemberian lapisan anti-skid itu selesai pada Minggu (11/9/2022) lalu.\n" +
                "\"Jadi yang anti-skid itu kan yang utamanya itu selesai hari Minggu, nah kalau yang finishing pengecatan warna abu-abunya hari Jumat, kalau nggak Sabtu,\" kata pelaksana tugas Jalanan Kawasan Kota Tua, Deni, saat dihubungi, Rabu (14/9/2022).\n" +
                "Deni mengatakan pengerjaan penambahan lapisan anti-skid itu dalam tahap finishing. Jalan itu akan dilapisi cat berwarna abu-abu menyerupai warna trotoar di area tersebut.\n" +
                "\"Kalau anti-skid-nya udah dipasang, tinggal pengecatan warna abu-abu yang menyamai warna trotoarnya,\" ujarnya.\n" +
                "Warga sekitar berinisial B mengaku pelapisan jalan dengan anti-skid sudah selesai. Namun, karena belum ada hujan lebat, kemampuan laporan antilicin itu belum teruji.\n" +
                "\"Udah nggak ada, tapi nggak tahu kalau hujan ya, ini kan belum hujan. Kalau hujan ya nggak tahu ya, ini kan kemarin nggak hujan,\" kata B.\n" +
                "Pemotor Dijamin Tak Lagi Tergelincir\n" +
                "Sebelumnya, proses pengerjaan penambahan lapisan anti-skid pada tikungan rawan pemotor tergelincir di kawasan Kota Tua, Jakarta Barat (Jakbar), dilakukan. Setelah pelapisan anti-skid, pemotor disebut tidak akan lagi tergelincir saat melintas di jalan tersebut.\n" +
                "\"Nanti, kalau (jalan) sudah dikasih anti-skid, saya yakin pasti motor-motor jatuh itu udah nggak ada lagi,\" kata aplikator marka jalan, Annie Sri Cahyani, saat ditemui di Kota Tua, Jakarta Barat, Sabtu (10/9)."),

            Berita(R.drawable.news8, "Pengakuan Pelaku Tawuran yang Tewaskan Pelajar di Depok: Niatnya 'Kenalan'", "Dwi Rahmawati - detikNews", "Rabu, 14 Sep 2022 14:56 WIB", "Depok - Polisi menangkap pelaku tawuran pelajar yang menewaskan satu orang. Pria berinisial IB (19) mengaku menjalankan aksinya sebagai bentuk 'perkenalan' dengan korban.\n" +
                "\"Nggak (punya niat membunuh), cuma kenalan,\" ujar IB dalam jumpa pers yang digelar Polresta Depok, Rabu (14/9/2022).\n" +
                "Ia lantas menyampaikan permohonan maaf kepada keluarga korban. IB mengakui sudah melakukan tawuran selama dua kali, salah satunya di wilayah Bojonggede, Bogor.\n" +
                "\"Dua, (pertama) di Bojonggede,\" kata IB.\n" +
                "Saat dimintai konfirmasi apakah melakukan pembacokan untuk meninggal jejak, IB terlihat mengangguk dan membenarkan.\n" +
                "Untuk diketahui, tawuran remaja di kawasan Grand Depok City (GDC), Sukmajaya, Depok, memakan korban jiwa. Seorang pemuda berinisial AZ (20), yang berstatus pelajar, tewas akibat tawuran tersebut.\n" +
                "Kapolres Metro Depok Kombes Imran Edwin Siregar mengatakan tawuran maut itu terjadi di Jl Boulevard, GDC, Depok, Senin (12/9) pukul 21.00 WIB.\n" +
                "Dua kelompok yang tawuran berawal dari saling tantang di media sosial.\n" +
                "\"Kasus penganiayaan yang menyebabkan meninggal dunia pada tanggal 12 September jam 21.00 WIB di wilayah Sukmajaya. Antara pelaku dan korban, ini ada dua kelompok yang berawal melakukan janjian melalui media sosial,\" ujar Imran dalam konferensi pers di Polres Metro Depok, Rabu (14/9/2022).\n" +
                "Imran mengatakan pelaku IB (19) membacok korban AZ (20) dua kali di bagian ketiak sebelah kanan dan bahu kanan. Korban meninggal dunia di rumah sakit."),

            Berita(R.drawable.news9, "Hakim Perintahkan Kabareskrim-Bharada E Hadir Sidang Gugatan Eks Pengacara", "Wilda Hayatun Nufus - detikNews", "Rabu, 14 Sep 2022 14:53 WIB", "Jakarta - Majelis hakim melanjutkan sidang gugatan pencabutan kuasa mantan pengacara Bharada Richard Eliezer atau Bharada E, Deolipa Yumara dan Muhammad Boerhanuddin. Majelis hakim memerintahkan Kabareskrim, Bharada E, maupun pengacara Bharada E, Ronny Talapessy, hadir di persidangan selanjutnya.\n" +
                "\"Kami akan melakukan pemanggilan terhadap para tergugat dengan alamat yang baru,\" kata hakim ketua Siti Hamidah saat sidang di Pengadilan Negeri Jakarta Selatan, Jalan Ampera Raya, Jakarta Selatan, Rabu (14/9/2022).\n" +
                "Bukan hanya memerintahkan Kabareskrim dan Bharada E, hakim juga memerintahkan para penggugat hadir kembali pada sidang yang akan datang. Sidang ditunda dan akan kembali digelar pada Rabu 21 September mendatang.\n" +
                "\"Untuk itu, kami memerlukan waktu dan sidang ditunda satu minggu dari sekarang, yaitu hari Rabu, tanggal 21 September 2022, dan memerintahkan penggugat untuk hadir pada hari sidang dan memerintahkan untuk melakukan pemanggilan kepada para tergugat. Sidang selesai dan ditutup,\" kata hakim.\n" +
                "Diketahui, gugatan ini dilayangkan oleh Deolipa dan Boerhanuddin dengan tergugat Kabareskrim, Bharada E, dan Ronny Talapessy selaku pengacara baru Bharada E. Sidang gugatan digelar di PN Jaksel.\n" +
                "Dalam gugatan ini, Deolipa meminta PN Jaksel menjatuhkan hukuman membayar fee pengacara senilai Rp 15 miliar.\n" +
                "\"Menghukum Tergugat I, Tergugat II, dan Tergugat III secara tanggung renteng untuk membayar biaya fee pengacara kepada para penggugat sebesar Rp 15 miliar,\" kata Deolipa di Pengadilan Negeri Jakarta Selatan, Jalan Ampera Raya, Jaksel, Senin (15/8).\n" +
                "Deolipa mengatakan pihaknya juga menuntut supaya dia dan Boerhanuddin tetap menjadi penasihat hukum Bharada E yang sah dalam kasus pembunuhan Brigadir J. Tak hanya itu, dia juga menuntut agar mempunyai hak membela Bharada E sampai di pengadilan.\n" +
                "\"Menyatakan para penggugat adalah penasihat hukum Tergugat I yang sah. Penggugat itu adalah saya, Deolipa, dan Boerhanuddin adalah penasihat hukum Saudara Richard yang sah dan mempunyai hak untuk melakukan pembelaan sampai pada persidangan,\" tutur dia."),

            Berita(R.drawable.news10, "TNI AD: Jend Dudung Minta Prajurit Tak Berlebihan Respons Effendi Simbolon", "Tim detikcom - detikNews", "Rabu, 14 Sep 2022 14:15 WIB", "Jakarta - Video sejumlah prajurit TNI memprotes ucapan Effendi Simbolon beredar di media sosial. Menurut Kepala Dinas Penerangan TNI AD (Kadispenad) Brigjen Hamim Tohari, video tersebut adalah reaksi spontan terhadap ucapan anggota Komisi I DPR RI Effendi Simbolon tentang TNI seperti gerombolan.\n" +
                "\"Video dari prajurit maupun masyarakat yang beredar, mungkin saja terjadi sebagai reaksi spontan atas pernyataan seorang tokoh di ruang publik yang dianggap memancing kegaduhan,\" kata Hamim dalam keterangan tertulisnya, Rabu (14/9/2022).\n" +
                "Hamim lalu mengatakan Kepala Staf Angkatan Darat (KSAD) Jenderal Dudung Abdurachman meminta peristiwa tersebut menjadi pembelajaran setiap orang dalam bersikap dan berucap.\n" +
                "\"Peristiwa ini menjadi pembelajaran bagi kita semua. Saat ini setiap orang bisa menyampaikan dan mengakses informasi melalui media sosial secara langsung dan cepat, sehingga banyak hal yang terekspos di media sosial, kemudian langsung dilihat dan direspons oleh orang lain,\" ujarnya.\n" +
                "Hamim menyebut tindakan yang dilakukan Effendi Simbolon merupakan sikap individu dan tidak mewakili DPR atau partai politik.\n" +
                "\"Kepala Staf Angkatan Darat menyadari sepenuhnya bahwa itu bukanlah tindakan yang mewakili institusi DPR atau partai politik, melainkan sikap individu seseorang. Oleh karenanya, secara internal Kepala Staf Angkatan Darat juga menghimbau para prajurit untuk tidak bereaksi berlebihan,\" kata dia\n" +
                "Selain itu, Hamim merespons permintaan maaf yang disampaikan Effendi Simbolon terkait ucapannya tersebut. Dia meminta semua pihak saling menghormati terkait hal tersebut.\n" +
                "Sebelumnya, Dudung mengarahkan jajaran TNI AD untuk merespons pernyataan anggota Komisi I DPR RI Effendi Simbolon soal 'gerombolan'. Arahan Dudung terekam dalam video berdurasi 2 menit 50 detik.\n" +
                "Berdasarkan video yang diterima detikcom dari seorang anggota DPR RI hari ini, perekam video tampak merekam arahan Dudung yang disiarkan di layar TV. Dudung terlihat sedang video conference dengan jajaran didampingi Wakil Kepala Staf Angkatan Darat (Wakasad) Letjen TNI Agus Subiyanto.\n" +
                "Dudung lalu mempersilakan jajarannya bergerak merespons hal yang dinilainya menginjak harga diri TNI AD. Dudung juga meminta jajarannya memberdayakan organisasi-organisasi di luar TNI AD memprotes Effendi Simbolon secara masif.\n" +
                "\"Silakan kalian bergerak, berdayakan FKPPI dan segala macam untuk tidak menerima penyampaian Effendi Simbolon, masif, lakukan. Nggak usah ada yang takut ya. Nggak usah takut kalian dicopot segala macam, saya tanggung jawab,\" tegas Dudung."),
        )



        binding.rvBerita.adapter = BeritaAdapter(listStudent)
        binding.rvBerita.layoutManager = LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)

    }

}