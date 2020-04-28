public class Bola extends Lingkaran {

    float volume_b,vol_tembereng,vol_bola_kecil,lp_tembereng;

    @Override
    public String Cetak2() {
        return "Volume bola : ";
    }

    void VolumeBola(float r) {

        volume_b = getLuasLingkaran(r)*r*4/3;
    }
    void VolumeBolaKecil(float r, float t) {

        vol_bola_kecil = (float) (3.14*(Math.pow(t,2))*((3*r)-t)/3);
    }
    void VolumeTembereng3D() {
        vol_tembereng = (NilaiVolumeBola() - getVolBolaKecil());
    }
    void  LuasPermukaanTembereng3D(float r, float t) {
    }

    public float NilaiVolumeBola() {

        return volume_b;
    }
    public float NilaiVolumeTembereng3D() {
        return vol_tembereng;
    }
    public float getVolBolaKecil() {
        return vol_bola_kecil;
    }
    public float NilaiLuasPermukaanTembereng3D() {

        return lp_tembereng;
    }
    public float getR() {
        return r;
    }


}
