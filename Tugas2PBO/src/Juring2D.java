
public class Juring2D extends Lingkaran {

    float luas_juring, pb_juring, keliling_juring, sudutsisi;
    float l_segitiga, luas_tembereng, keliling_tembereng, pbt_tembereng, keliling_t;
    private float  ti, a;

    public String Cetak2() {
        return "Luas juring : ";
    }


    void nilaiSudut(float sudut) {
        sudutsisi = sudut/360;
    }

    void panjangBusurJuring(float r) {
        pb_juring = getSudutSisi(r) * getKelilingLingkaran(r);
    }

    void KelilingJuring(float r) {
        keliling_juring = ( getSudutSisi(r) * getKelilingLingkaran(r) ) + (2 * r);
    }

    void LuasJuring(float r) {
        luas_juring = getSudutSisi(r) * getLuasLingkaran(r);
    }

    void LuasSegitiga(float a, float ti) {
        this.a = a;
        this.ti = ti;
        l_segitiga = (float) (0.5 * a * ti);
    }

    void LuasTembereng() {
        luas_tembereng = (float) (getLuasJuring() - getNilaiLuasSegitiga());
    }

    void PanjangTaliBusur(float r) {
        pbt_tembereng = getSudutSisi(r) * getKelilingLingkaran(r);
    }

    void KelilingTembereng(float r, float sudut){

        if (sudut == 60)
        {
            keliling_tembereng = (float) (r * getNilaiPanjangBusur(r) );
        }
        else if (sudut == 90)
        {
            keliling_tembereng = (float) (getNilaiPanjangBusur(r) + ( Math.sqrt(2*Math.pow(r,2))));
        }
        else
        {
            keliling_tembereng = ((getNilaiPanjangTaliBusur() * getNilaiPanjangBusur(r)));
        }
    }

    public float getSudutSisi(float r) {
        return sudutsisi;
    }

    public float getNilaiPanjangBusur(float r) {
        return pb_juring;
    }

    public float getKelilingJuring() {
        return keliling_juring;
    }

    public float getLuasJuring() {
        return luas_juring;
    }

    public float getNilaiPanjangTaliBusur() {
        return pbt_tembereng;
    }

    public float getNilaiLuasSegitiga() {
        return l_segitiga;
    }

    public float getKelilingTembereng() {
        return keliling_tembereng;
    }

    public float getLuasTembereng() {
        return luas_tembereng;
    }

    public float get_a() {
        return a;
    }

    public float get_ti() {
        return ti;
    }
}
