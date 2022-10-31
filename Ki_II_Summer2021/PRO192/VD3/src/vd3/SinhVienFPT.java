
package vd3;

public class SinhVienFPT implements InterfaceSinhVien{
    private String hoTen;
    private String nganh;

    public String getHoTen() {
        return hoTen;
    }

    public String getNganh() {
        return nganh;
    }

    public void setHoTen(String HoTen) {
        this.hoTen = HoTen;
    }

    public void setNganh(String nganh) {
        this.nganh = nganh;
    }

    @Override
    public double getDiemTB() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void xuat() {
        System.out.println("SinhVienFPT: HoTen: %s; Nganh: %s; Hoc Luc: %s",
            this.hoTen, this.nganh, this.getHocLuc());
    }

    public String getHocLuc {
        String xepLoai = "";
        return xepLoai;
}
    @Override
    public void nhap() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    

    
}
