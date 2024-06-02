package com.example.android_client;

public class User {
    private int id;
    private String name;
    private String email;
    private String alamat;
    private String kelas;
    public User(String name, String email, String alamat, String kelas) {
        this.name = name;
        this.email = email;
        this.alamat = alamat;
        this.kelas = kelas;
         }
    public int getId() { return id; }
    public String getName() { return name; }
    public String getEmail() { return email; }
    public String getAlamat() { return alamat; }
    public String getKelas() { return kelas; }
}
