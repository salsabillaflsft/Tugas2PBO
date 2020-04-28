public class Juring3D extends Bola {
    float volume_juring, lp_juring;
    private float h;
    private float r;

    void VolumeJuring(float h) {
        //2/3 phi R 2 h
        volume_juring = (float) (2*3.14*getR()*2*h)/3;
    }

    void LuasPermukaanJuring(float r, float h) {
        //2 phi R t + phi R r
        lp_juring = (float) ((2 * 3.14 * getR() * h) + (3.14 * getR() * r));
    }

    public float NilaiVolumeJuring() {
        return volume_juring;
    }

    public float NilaiLuasPermukaanJuring() {
        return lp_juring;
    }

}
