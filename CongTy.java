package TranQuangHuy20204757;

public class CongTy {
    private String tenCongTy;
    private NhanVien[] nhanViens = new NhanVien[1000];

    private int soNhanVien() {
        return nhanViens.length;
    }

    public static final int SO_NV_MAX = 1000;
    public static double loiNhuan;

    public boolean themNV(NhanVien nhanVien) {
        if(this.soNhanVien() == SO_NV_MAX) {
            return false;
        }
        else {
            nhanViens[nhanViens.length] = nhanVien;
            return true;
        }
    }

    public void inThongTin() {
        System.out.println("=> Cong ty: " + this.getTenCongTy());
        System.out.println("- So nhan vien: " + this.getSoNhanVien());
        System.out.println("- Thong tin toan bo nhan vien: ");
        for(int i = 0; i < this.nhanViens.length; i++) {
            System.out.println(this.nhanViens[i].inThongTin());
        }
    }

    public double tinhTongLuong() {
        double sum = 0;
        for(NhanVien nv: nhanViens) {
            sum += nv.tinhLuong();
        }
        return sum;
    }

    /**
     * @return String return the tenCongTy
     */
    public String getTenCongTy() {
        return tenCongTy;
    }

    /**
     * @param tenCongTy the tenCongTy to set
     */
    public void setTenCongTy(String tenCongTy) {
        this.tenCongTy = tenCongTy;
    }

    /**
     * @return NhanVien[] return the nhanViens
     */
    public NhanVien[] getNhanViens() {
        return nhanViens;
    }

    /**
     * @param nhanViens the nhanViens to set
     */
    public void setNhanViens(NhanVien[] nhanViens) {
        this.nhanViens = nhanViens;
    }

    public int getSoNhanVien() {
        return this.soNhanVien();
    }

    public void changeLuongCoBan()

}