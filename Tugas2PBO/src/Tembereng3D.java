public class Tembereng3D extends Bola {
    float vol_bola_kecil,vol_tembereng,lp_tembereng;

    //1/3 * phi * t^2 (3*r - t)
    void VolumeBolaKecil(float r, float t) {
        vol_bola_kecil = (float) (3.14*(Math.pow(t,2))*((3*r)-t)/3);
    }

    void VolumeTembereng3D() {
        vol_tembereng = (NilaiVolumeBola() - getVolBolaKecil());
    }

    void LuasPermukaanTembereng3D(float r, float t) {
        lp_tembereng = (float) (2*3.14*r*t);
    }

    public float getVolBolaKecil() {
        return vol_bola_kecil;
    }

    public float NilaiVolumeTembereng3D() {
        return vol_tembereng;
    }

    public float NilaiLuasPermukaanTembereng3D() {

        return lp_tembereng;
    }
}
