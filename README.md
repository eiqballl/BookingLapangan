# Sistem Booking Lapangan Badminton

- Nama: Iqbal Nurriz Ramadhan
- NIM: 2509116067

## Deskripsi

Sistem Booking Lapangan Badminton merupakan aplikasi berbasis console terminal yang dibuat untuk mengelola pemesanan lapangan badminton.
Program ini memiliki beberapa fitur, seperti mendaftarkan customer, melihat daftar lapangan, membuat booking, dan melihat riwayat booking.

## Studi Kasus

Studi kasus yang digunakan adalah pemesanan lapangan badminton.
Lapangan dalam program ini dibagi menjadi dua jenis:

1. Standard
2. VIP

Contoh lapangan Standard yang digunakan adalah Lapangan A dan Lapangan B. Sedangkan untuk lapangan VIP contohnya adalah Lapangan VIP 1 dan Lapangan VIP 2.
Setiap lapangan memiliki ID, nama, dan harga per jam. Selain itu, setiap jenis lapangan memiliki atribut tambahan masing-masing.

## Struktur Class
Program ini memiliki 1 class main dan beberapa class pada package model, yaitu `Customer`,`Booking`,`Lapangan`, `LapanganStandard`, dan `LapanganVIP`.

```text
Customer
Booking
Lapangan (SuperClass)
├── LapanganStandard (SubClass)
└── LapanganVIP (SubClass)
```

Class `Lapangan` menyimpan data umum seperti ID lapangan, nama lapangan, dan harga per jam. Class `LapanganStandard` dan `LapanganVIP` merupakan turunan dari class `Lapangan`.

Class `LapanganStandard` memiliki atribut tambahan berupa `fasilitas`, sedangkan class `LapanganVIP` memiliki atribut `fasilitas` dan `includeCoach`.

Selain itu, terdapat class `Customer` untuk menyimpan data pelanggan dan class `Booking` untuk menyimpan data transaksi pemesanan.

## Inheritance

Inheritance digunakan pada class `LapanganStandard` dan `LapanganVIP` yang merupakan turunan dari class `Lapangan`.

Pada class `LapanganStandard`, atribut yang ditambahkan adalah `fasilitas`. Sedangkan pada class `LapanganVIP`, atribut yang ditambahkan adalah `fasilitas` dan `includeCoach`.

Dengan inheritance, kedua class tersebut tetap dapat menggunakan data dan method yang ada pada class `Lapangan`.

```java
public class LapanganStandard extends Lapangan {
    private String fasilitas;

    public LapanganStandard(String idLapangan, String namaLapangan, int hargaPerJam, String fasilitas) {
        super(idLapangan, namaLapangan, hargaPerJam);
        this.fasilitas = fasilitas;
    }

    @Override
    public String getJenis() { return "Standard"; }
}
```

```java
public class LapanganVIP extends Lapangan {
    private String fasilitas;
    private boolean includeCoach;

    public LapanganVIP(String idLapangan, String namaLapangan, int hargaPerJam, String fasilitas, boolean includeCoach) {
        super(idLapangan, namaLapangan, hargaPerJam);
        this.fasilitas = fasilitas;
        this.includeCoach = includeCoach;
    }

    @Override
    public String getJenis() { return "VIP"; }
}
```

## Encapsulation

Encapsulation diterapkan dengan menggunakan access modifier `private` pada atribut yang ada di dalam class.

Contohnya pada class `Lapangan`, atribut seperti `idLapangan`, `namaLapangan`, dan `hargaPerJam` dibuat `private`.

Untuk mengakses atribut tersebut, program menggunakan getter dan setter yang sudah disediakan di dalam class.

## Fitur Program

Program memiliki beberapa menu yang dapat digunakan untuk mengelola booking lapangan.

### 1. Tambah Customer

Menu ini digunakan untuk mendaftarkan pelanggan baru. Pengguna memasukkan nama dan nomor telepon, kemudian ID customer akan digenerate otomatis secara berurutan (C001, C002, dst.).

### 2. Tampilkan Semua Customer

Menu ini digunakan untuk melihat semua customer yang telah terdaftar. Informasi yang ditampilkan meliputi ID, nama, dan nomor telepon.

### 3. Tampilkan Semua Lapangan

Menu ini digunakan untuk melihat semua lapangan yang tersedia. Informasi yang ditampilkan meliputi ID, nama, harga per jam, jenis lapangan, dan fasilitas.

### 4. Buat Booking

Menu ini digunakan untuk membuat pemesanan lapangan. Pengguna memilih customer dan lapangan berdasarkan ID, kemudian memasukkan tanggal, jam mulai, dan jam selesai. Total biaya dihitung otomatis menggunakan rumus:

```
Total Bayar = (Jam Selesai - Jam Mulai) × Harga Per Jam
```

### 5. Tampilkan Semua Booking

Menu ini digunakan untuk melihat riwayat semua pemesanan yang telah dibuat, lengkap dengan informasi customer, lapangan, waktu, dan total biaya.

### 6. Keluar

Menu ini digunakan untuk mengakhiri program.

## Collection

Program menggunakan `ArrayList` untuk menyimpan daftar customer, lapangan, dan booking.

```java
ArrayList<Customer> customers = new ArrayList<>();
ArrayList<Lapangan> lapangans = new ArrayList<>();
ArrayList<Booking> bookings = new ArrayList<>();
```

Dengan `ArrayList`, data yang baru ditambahkan dapat langsung dimasukkan ke dalam daftar tanpa menentukan jumlah data dari awal.

## Screenshot Program

Berikut adalah screenshot saat program dijalankan.

### 1. Menu Utama

Tampilan Menu Utama ketika program pertamakali dijalankan, pada menu terdapat 6 fitur yang dapat dipilih oleh admin lapangan.

<img width="334" height="158" alt="image" src="https://github.com/user-attachments/assets/a88f58f5-2f56-485e-bfc6-54029c33ad15" />


### 2. Tambah Customer

Menampilkan proses pendaftaran customer baru beserta ID yang digenerate otomatis.

<img width="279" height="135" alt="image" src="https://github.com/user-attachments/assets/775f1394-3eec-40c4-a51e-f4f7520f4a8b" />


### 3. Tampilkan Semua Customer

Menampilkan Semua daftar customer yang telah ditambahkan, seperti id customer, nama, dan nomor telepon.

<img width="343" height="108" alt="image" src="https://github.com/user-attachments/assets/4a2fa6b6-4a37-41c2-b428-e82ca4ab820d" />


### 4. Tampilkan Semua Lapangan

Menampilkan Semua daftar lapangan yang tersedia beserta kategori, harga sewa perjam, dan fasilitas yang tersedia.

<img width="921" height="129" alt="image" src="https://github.com/user-attachments/assets/8cbb0482-7242-4dfe-9cb6-01518fae20b9" />


### 5. Buat Booking

Menambhkan data booking baru dengan meminta admin menginput id customer, lalu memilih id lapangan, serta jam main. setelah itu data booking akan tersimpan beserta tarif biaya sewanya.

<img width="921" height="539" alt="image" src="https://github.com/user-attachments/assets/825f5749-bb78-410e-83da-1f6aec5ee611" />

### 6. Tampilkan Semua Booking

Menampilkan semua daftar booking yang sudah ditambahkan.

<img width="240" height="179" alt="image" src="https://github.com/user-attachments/assets/ee40509d-1022-4315-ace9-e253297f4519" />

### 7. Keluar

Keluar dari sistem/program saat ini.

<img width="536" height="147" alt="image" src="https://github.com/user-attachments/assets/b88601e1-9b64-4ed5-a4a1-dca62c4b9e6f" />
