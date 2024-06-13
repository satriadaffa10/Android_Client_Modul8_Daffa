package com.example.android_client;
import com.google.gson.annotations.SerializedName;

public class User {
    @SerializedName("id")
    private int id;

    @SerializedName("name")
    private String name;

    @SerializedName("email")
    private String email;
    @SerializedName("alamat")
    private String alamat;
    @SerializedName("kelas")
    private String kelas;


    // Konstruktor untuk membuat objek User baru
    public User(int id, String name, String email, String alamat, String kelas ) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.alamat = alamat;
        this.kelas = kelas;

    }

    // Konstruktor untuk membuat objek User tanpa id (misalnya, untuk menambahkan user baru)
    public User(String name, String email, String alamat, String kelas) {
        this.name = name;
        this.email = email;
        this.alamat = alamat;
        this.kelas = kelas;

    }

    // Getter untuk mendapatkan id user
    public int getId() {
        return id;
    }

    // Setter untuk mengatur id user
    public void setId(int id) {
        this.id = id;
    }

    // Getter untuk mendapatkan nama user
    public String getName() {
        return name;
    }

    // Setter untuk mengatur nama user
    public void setName(String name) {
        this.name = name;
    }

    // Getter untuk mendapatkan email user

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public String getAlamat() {
        return alamat;
    }
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getKelas() {
        return kelas;
    }
    public void setKelas(String kelas) {
        this.kelas = kelas;
    }
}