# Sistem Perpustakaan Digital 📚

Proyek ini adalah implementasi dasar dari sistem perpustakaan berbasis Java dengan pendekatan **Object-Oriented Programming (OOP)**. Program ini memungkinkan pengguna untuk memasukkan data buku dari berbagai jenis (buku umum, fiksi, fantasi) dan menampilkannya kembali.

## 🔧 Fitur Utama
- Input buku berdasarkan jenis (Umum, Fiksi, Fantasi)
- Penyimpanan data buku dalam array
- Penampilan informasi lengkap buku sesuai jenisnya
- Demonstrasi konsep OOP: Class, Object, Encapsulation, Inheritance, dan Array

## 🧠 Konsep OOP yang Digunakan

### 1. Class & Object
Setiap jenis buku direpresentasikan dengan class `Buku`, `BukuFiksi`, dan `BukuFiksiFantasi`. Objek dibuat berdasarkan input pengguna.

### 2. Encapsulation
Atribut pada masing-masing class disembunyikan dengan `private`, dan diakses melalui getter.

### 3. Inheritance
- `BukuFiksi` mewarisi `Buku`
- `BukuFiksiFantasi` mewarisi `BukuFiksi`  
Menunjukkan dua tingkat pewarisan (sub-child class).

### 4. Array
Semua objek buku disimpan dalam array `Buku[] koleksi`, yang kemudian ditampilkan satu per satu.

## 📁 Struktur File

├── Buku.java // Class dasar buku
├── BukuFiksi.java // Turunan dari Buku (dengan genre)
├── BukuFiksiFantasi.java // Turunan dari BukuFiksi (dengan dunia fiksi)
├── Perpustakaan.java // Class utama (main) untuk menjalankan program

## ▶️ Cara Menjalankan
1. Pastikan Anda memiliki Java terinstal.
2. Compile seluruh file:
   ```bash
   javac *.java
   java Perpustakaan

