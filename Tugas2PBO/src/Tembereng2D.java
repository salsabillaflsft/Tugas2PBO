public class Tembereng2D extends Juring2D{
    float l_segitiga, luas_tembereng, keliling_tembereng, pbt_tembereng, keliling_t;
    private float  ti, a;

    public String Cetak2() {
        return "keliling tembereng : ";
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

}
