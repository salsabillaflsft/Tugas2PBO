public class Busur extends Lingkaran {
    float pb_juring,sudutsisi;
    void nilaiSudut(float sudut) {
        sudutsisi = sudut/360;
    }

    void panjangBusurJuring(float r) {
        pb_juring = getSudutSisi(r) * getKelilingLingkaran(r);
    }

    public float getSudutSisi(float r) {
        return sudutsisi;
    }
    public float getPanjangBusurJuring(){
        return pb_juring;
    }
}
