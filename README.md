
<img width="1105" height="806" alt="Screenshot 2026-10-21 002629" src="https://github.com/user-attachments/assets/361cba9b-c2e7-437f-988b-a8e475d32ad8" />
<img width="1101" height="943" alt="Screenshot 2026-10-21 004121" src="https://github.com/user-attachments/assets/3315b318-c26c-4240-b9cf-032b43ecc193" />

1.Mengapa Warna Disimpan di AppTheme?

jwb:Warna disimpan di AppTheme karena warna merupakan bagian dari tampilan aplikasi, bukan data utama karakter. Jika warna diletakkan di class Character, class model akan bergantung pada kebutuhan visual antarmuka. Dengan memusatkan warna di AppTheme, perubahan tema dapat dilakukan di satu tempat tanpa mengubah class Character. Pemisahan ini membuat kode lebih terstruktur, mudah dirawat, dan sesuai dengan pemisahan tanggung jawab antara layer Model dan View

2.Dua Properti Tambahan dan Alasannya

1.HitPoints (HP): Digunakan untuk menyimpan jumlah darah karakter sehingga kondisi karakter dapat diketahui. Jika HP mencapai nol, karakter dapat dianggap kalah atau tidak dapat melanjutkan pertarungan.

2.Mana: Digunakan untuk menyimpan energi sihir karakter, khususnya role MAGE. Properti ini membantu membedakan kebutuhan karakter penyihir dari role lain dan dapat digunakan untuk mengembangkan fitur kemampuan sihir pada tahap berikutnya.

https://docs.google.com/document/d/1Ae24Qe-mdm-QX66V7TuVpmcLjVM-nJauDNHYF5Ktllc/edit?usp=sharing
