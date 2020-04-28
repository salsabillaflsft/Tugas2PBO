public class Lingkaran {
    float luas_lingkaran, r;

    public String Cetak2() {
        return "Luas Lingkaran : ";
    }

    public void NilaiLingkaran(float r){
        if(r>=0){
            this.r = r;
            luas_lingkaran = (float) (3.14 * Math.pow(r, 2));
        }
        else{
            throw new IllegalArgumentException("Nilai jari dari lingkaran tidak boleh negatif");
        }
    }

    private float HitungKeliling(float r){
        return (float) (3.14 * 2 * r);
    }

    private float HitungLuas(float r) {
        return (float) (3.14 * Math.pow(r,2));
    }


    public float getLuasLingkaran(float r) {
        return HitungLuas(r);
    }

    public float getKelilingLingkaran(float r) {
        return HitungKeliling(r);
    }
}
