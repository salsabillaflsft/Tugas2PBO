public class KerucutTerpancung extends Kerucut {
    float volume_kp, A, luaspermukaan_kp;

    //1/3 * phi * t * (R^2 + (R*r) + r^2)
    void VolumeKerucutTerpancung(float R, float r, float t) {
        volume_kp = (float) ((3.14*t*(Math.pow(R,2)+(R*r)+(Math.pow(r,2))))/3);
    }

    void  LuasPermukaanKerucutTerpancung(float R, float r, float t) {
        A = (float) (Math.sqrt(Math.pow(t,2) + Math.pow((R-r),2)));
        luaspermukaan_kp = (float) ((3.14*A*(R + r)) + (3.14*(Math.pow(R,2)+Math.pow(r,2))));
    }

    public float NilaiVolumeKerucutTerpancung() {
        return volume_kp;
    }

    public float NilaiLuasPermukaanKerucutTerpancung() {
        return luaspermukaan_kp;
    }
}
