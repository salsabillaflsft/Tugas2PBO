
public class KerucutTerpancung extends Kerucut {
    float volume_kp, A, luaspermukaan_kp;


    void VolumeKerucutTerpancung(float r,float t) {
        volume_kp = (float) (3.14*get_t()/3*(Math.pow(get_r(),2)*(get_r()*r)*(Math.pow(r,2))));
    }

    void  LuasPermukaanKerucutTerpancung(float r, float t) {
        A = (float) (Math.sqrt(Math.pow(get_t(),2) + Math.pow((get_r()-r),2)));
        luaspermukaan_kp = (float) ((3.14*A*(get_r() + r)) + (3.14*(Math.pow(get_r(),2)+Math.pow(r,2))));
    }

    public float NilaiVolumeKerucutTerpancung() {
        return volume_kp;
    }

    public float NilaiLuasPermukaanKerucutTerpancung() {
        return luaspermukaan_kp;
    }
}
