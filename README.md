# RSA Calculator
Membantu pengguna untuk mengenkripsi sebuah pesan dan mendekripsikan sebuah pesan yang terenkripsi dengan RSA.

## Deskripsi Proyek
Pengguna dapat memasukkan bilangan prima p, q, m, e, dan n yang sudah dihasilkan oleh proses enkripsi dengan tipe data Big Integer ke dalam textfields. Calculator akan menghitung dekripsi dan output hasil ke layar.

## Fungsi Utama
1. **Enkripsi**
    - Pengguna dapat memasukkan sebuah pesan berupa teks.
    - Calculator akan menghasilkan nilai bilangan prima p dan q dengan tipe data Big Integer.
    - Calculator menghitung enkripsi dan output hasil enkripsi ke sebuah file output.txt.
2. **Dekripsi**
    - Pengguna dapat memasukkan bilangan prima p, q, m, e, dan n yang sudah dihasilkan oleh proses enkripsi dengan tipe data Big Integer ke dalam textfields.
    - Calculator akan menghitung dekripsi dan output hasil ke layar.

## Cara Menggunakan Proyek
1. Unduh atau salin kode proyek ini ke dalam lingkungan pengembangan Java yang telah terpasang.
2. Buka terminal atau command prompt, arahkan ke direktori tempat Anda menyimpan kode proyek.
3. Kompilasi file `Encryption.java` dengan perintah: `javac Encryption.java`.
4. Jalankan program dengan perintah: `java Encryption`.
5. Program akan meminta input teks yang akan dienkripsi. Pastikan panjang teks tidak melebihi 1024 karakter.
6. Setelah proses enkripsi selesai, program akan menghasilkan file `output.txt` yang berisi nilai ciphertext, nilai e, nilai n, dan nilai p setelah proses enkripsi selesai.

## Kontribusi
Anda diundang untuk berkontribusi pada proyek ini. Jika Anda menemukan masalah atau ingin menambahkan fitur baru, silakan buat pull request atau laporkan masalah di [tautan repository proyek].

## Lisensi
Proyek ini dilisensikan di bawah [jenis lisensi yang digunakan, misalnya MIT License]. Untuk detail lebih lanjut, lihat file [LICENCE] di repository proyek ini.
