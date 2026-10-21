
<img width="1105" height="806" alt="Screenshot 2026-10-21 002629" src="https://github.com/user-attachments/assets/361cba9b-c2e7-437f-988b-a8e475d32ad8" />
<img width="1101" height="943" alt="Screenshot 2026-10-21 004121" src="https://github.com/user-attachments/assets/3315b318-c26c-4240-b9cf-032b43ecc193" />

1.Mengapa Warna Disimpan di AppTheme?
jwb:Warna disimpan di AppTheme karena warna merupakan bagian dari tampilan aplikasi, bukan data utama karakter. Jika warna diletakkan di class Character, class model akan bergantung pada kebutuhan visual antarmuka. Dengan memusatkan warna di AppTheme, perubahan tema dapat dilakukan di satu tempat tanpa mengubah class Character. Pemisahan ini membuat kode lebih terstruktur, mudah dirawat, dan sesuai dengan pemisahan tanggung jawab antara layer Model dan View
2.Dua Properti Tambahan dan Alasannya
1. Tooltip detail karakter
Setiap kartu karakter menampilkan tooltip yang berisi informasi HP, ATK, mana, level, dan role ketika kursor diarahkan ke kartu. Properti ini membantu pengguna melihat detail karakter tanpa membuat tampilan utama terlalu penuh.
2. Border kartu berdasarkan role
Setiap role, yaitu WARRIOR, MAGE, ARCHER, dan HEALER, memiliki warna border yang berbeda. Properti ini memudahkan pengguna membedakan jenis karakter secara visual dan membuat tampilan kartu lebih informatif.

https://docs.google.com/document/d/1Ae24Qe-mdm-QX66V7TuVpmcLjVM-nJauDNHYF5Ktllc/edit?usp=sharing
