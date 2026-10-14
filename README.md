# 🎓 Mini Project: Program Data Mahasiswa

Program sederhana berbasis Java untuk mengelola data mahasiswa melalui terminal. Project ini dibuat sebagai latihan dasar pemrograman Java dengan menerapkan konsep **Object-Oriented Programming (OOP)**.

Program memungkinkan pengguna memasukkan data mahasiswa, menampilkan seluruh data, dan memeriksa status kelulusan berdasarkan nilai yang diperoleh.

## 📌 Fitur Utama

- 📝 Input data mahasiswa berupa nama, NIM, dan nilai.
- 👥 Mengelola minimal 3 objek mahasiswa.
- 📋 Menampilkan seluruh data mahasiswa.
- ✅ Memeriksa status kelulusan secara otomatis.
- 🔄 Menggunakan perulangan untuk input dan output data.
- 🧩 Menerapkan konsep dasar OOP dalam Java.

## 🛠️ Teknologi yang Digunakan

- **Bahasa Pemrograman:** Java
- **Input:** Java `Scanner`
- **Konsep:** Object-Oriented Programming (OOP)
- **Tools:** JDK dan text editor atau IDE Java.

## 📚 Materi yang Diterapkan

Project ini mengimplementasikan materi dasar pemrograman Java berikut:

| Materi | Implementasi |
|---|---|
| Variable | `nama`, `NIM`, `nilai` |
| Data Type | `String`, `double`, `int` |
| Scanner | Membaca input pengguna |
| If / Else | Menentukan status kelulusan |
| Loop | Perulangan `for` |
| Class | `Mahasiswa` dan `Main` |
| Object | Membuat objek mahasiswa |
| Method | `tampilkanData()` dan `cekKelulusan()` |
| Constructor | Menginisialisasi data mahasiswa |
| Array | Menyimpan kumpulan objek mahasiswa |

## 📂 Struktur Project

```text
Program-Data-Mahasiswa/
├── Main.java
└── README.md
```

Keterangan:

- `Main.java` — berisi class `Mahasiswa`, class `Main`, dan logika utama program.
- `README.md` — dokumentasi project.

## ⚙️ Persyaratan

Pastikan perangkat sudah memiliki:

- Java Development Kit (JDK).
- Terminal atau Command Prompt.
- Editor kode seperti Visual Studio Code, IntelliJ IDEA, atau NetBeans (opsional).

Periksa instalasi Java dengan perintah:

```bash
java -version
javac -version
```

## 🚀 Cara Menjalankan Program

**1. Clone repository**

Jika project sudah diunggah ke GitHub:

```bash
git clone <URL-REPOSITORY>
```

**2. Masuk ke direktori project**

```bash
cd Program-Data-Mahasiswa
```

**3. Compile program**

```bash
javac Main.java
```

**4. Jalankan program**

```bash
java Main
```

## 💻 Contoh Penggunaan

Contoh input dari pengguna:

```text
=== PROGRAM DATA MAHASISWA ===

Data Mahasiswa ke-1
Masukkan nama: Andi
Masukkan NIM: 23001
Masukkan nilai: 85

Data Mahasiswa ke-2
Masukkan nama: Budi
Masukkan NIM: 23002
Masukkan nilai: 55

Data Mahasiswa ke-3
Masukkan nama: Siti
Masukkan NIM: 23003
Masukkan nilai: 90
```

Contoh output:

```text
=== DAFTAR DATA MAHASISWA ===

Mahasiswa ke-1
Nama  : Andi
NIM   : 23001
Nilai : 85.0
Status: LULUS
-------------------------

Mahasiswa ke-2
Nama  : Budi
NIM   : 23002
Nilai : 55.0
Status: TIDAK LULUS
-------------------------

Mahasiswa ke-3
Nama  : Siti
NIM   : 23003
Nilai : 90.0
Status: LULUS
-------------------------
```

## 📏 Aturan Kelulusan

Status kelulusan ditentukan berdasarkan nilai mahasiswa:

| Rentang Nilai | Status |
|---|---|
| 60–100 | LULUS |
| 0–59.99 | TIDAK LULUS |

**Catatan:** Pada implementasi saat ini, program menggunakan kondisi `nilai >= 60` untuk menentukan kelulusan. Validasi agar nilai hanya berada pada rentang 0–100 dapat ditambahkan sebagai pengembangan berikutnya.

## 🎯 Tujuan Project

Project ini bertujuan untuk:

1. Memahami dasar sintaks Java.
2. Mempraktikkan penggunaan class, object, dan constructor.
3. Memahami penggunaan method untuk memisahkan fungsi program.
4. Menggunakan percabangan dan perulangan.
5. Mengolah input pengguna menggunakan `Scanner`.
6. Membangun program sederhana berbasis OOP.

## 🔮 Pengembangan Selanjutnya

Beberapa fitur yang dapat ditambahkan:

- 🔍 Pencarian mahasiswa berdasarkan NIM.
- ✏️ Mengubah data mahasiswa.
- 🗑️ Menghapus data mahasiswa.
- 📊 Menghitung nilai rata-rata seluruh mahasiswa.
- 💾 Menyimpan data ke file agar tetap tersedia setelah program ditutup.
- 🛡️ Validasi input untuk mencegah nilai di luar rentang 0–100.

## 👨‍💻 Kontributor

**Nama:** [Nama Kamu]  
**NIM:** [NIM Kamu]  
**Mata Kuliah:** Pemrograman Java

---

Dibuat sebagai bagian dari mini project pembelajaran pemrograman Java.

⭐ Jika project ini bermanfaat, jangan ragu untuk memberikan star pada repository!
