public class Tabung extends Lingkaran {

    float volume_s, lp_silinder;

    @Override
    public String Cetak2() {
        return "Volume silinder : ";
    }

    void VolumeSilinder(float r,float t) {

        volume_s = getLuasLingkaran(r) * t;
    }

    public float NilaiVolumeSilinder() {

        return volume_s;
    }

    void LuasPermukaanSilinder(float r, float t) {
        lp_silinder = (getLuasLingkaran(r) * 2) + (r*t);
    }

    public float NilaiLuasPermukaanSilinder() {

        return lp_silinder;
    }

}
