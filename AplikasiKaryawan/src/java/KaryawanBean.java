/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.Serializable;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;

/**
 *
 * @author master
 */
@Named(value = "karyawanBean")
@SessionScoped
public class KaryawanBean implements Serializable {

    String nik;
    String nama;
    String tglLahir;
    String alamat;
    String kota;
    String email;
    String kodePos;
    String gender;
    String aset;
    String aktif;
    String alasan;

    public KaryawanBean() {
    }

    public String getAlasan() {
        return alasan;
    }

    public void setAlasan(String alasan) {
        this.alasan = alasan;
    }

    public String getNik() {
        return nik;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAset() {
        return aset;
    }

    public void setAset(String aset) {
        this.aset = aset;
    }

    public String getAktif() {
        return aktif;
    }

    public void setAktif(String aktif) {
        this.aktif = aktif;
    }

    public void setNik(String nik) {
        this.nik = nik;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getTglLahir() {
        return tglLahir;
    }

    public void setTglLahir(String tglLahir) {
        this.tglLahir = tglLahir;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getKota() {
        return kota;
    }

    public void setKota(String kota) {
        this.kota = kota;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getKodePos() {
        return kodePos;
    }

    public void setKodePos(String kodePos) {
        this.kodePos = kodePos;
    }

    public String cekAktif() {
        String cek = "tidak";
        if (aktif.equalsIgnoreCase(cek)) {
            return "OutputAlasan";
        }
        return "Output";
    }

    public String kembali() {
        return "Index";
    }

    public String reset() {

        setNik("");
        setAktif("");
        setAlamat("");
        setAlasan("");
        setAset("");
        setEmail("");
        setGender("");
        setKodePos("");
        setKota("");
        setNama("");
        setTglLahir("");

        return "index";
    }
}
