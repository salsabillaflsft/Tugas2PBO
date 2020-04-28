public class Busur extends Juring2D {
    //float pb_juring,sudutsisi;

    void panjangBusurJuring(float r) {
        pb_juring = getSudutSisi(r) * getKelilingLingkaran(r);
    }
    //public float getNilaiPanjangBusur(float r) {
     //   return pb_juring;
    //}
    public float getSudutSisi(float r) {
        return sudutsisi;
    }
}
