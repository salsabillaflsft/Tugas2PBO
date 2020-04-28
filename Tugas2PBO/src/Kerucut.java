public class Kerucut extends Lingkaran {

    float volume_k, lp_kerucut;
    private float t;
    private float r;

    @Override
    public String Cetak2() {
        return "Volume kerucut : ";
    }

    void VolumeKerucut(float r,float t) {
        this.r = r;
        this.t = t;
        volume_k = getLuasLingkaran(r) * t / 3;
    }
    //phi * r * (r + sqrt(r^2 + t^2))
    void LuasPermukaanKerucut(float r, float t) {
        //this.r = r;
        //this.t = t;
        lp_kerucut = (float) (3.14 * r * (r + Math.sqrt(Math.pow(r,2)+Math.pow(t,2))));
    }
    public float NilaiVolumeKerucut() {
        return volume_k;
    }

    public float NilaiLuasPermukaanKerucut() {
        return lp_kerucut;
    }

    public float get_r() {
        return r;
    }

    public float get_t() {
        return t;
    }

}
