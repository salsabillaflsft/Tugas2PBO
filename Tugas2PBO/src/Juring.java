
public class Juring extends Lingkaran {

    float luas_juring, pb_juring, keliling_juring, sudutsisi;

    void nilaiSudut(float sudut) {
        sudutsisi = sudut/360;
    }

    void panjangBusurJuring(float r) {
        pb_juring = getSudutSisi() * getKelilingLingkaran(r);
    }

    void KelilingJuring(float r) {
        keliling_juring = ( getSudutSisi() * getKelilingLingkaran(r) ) + (2 * r);
    }

    void LuasJuring(float r) {
        luas_juring = getSudutSisi() * getLuasLingkaran(r);
    }


    public float getSudutSisi() {
        return sudutsisi;
    }

    public float getNilaiPanjangBusur() {
        return pb_juring;
    }

    public float getKelilingJuring() {
        return keliling_juring;
    }

    public float getLuasJuring() {
        return luas_juring;
    }
}
