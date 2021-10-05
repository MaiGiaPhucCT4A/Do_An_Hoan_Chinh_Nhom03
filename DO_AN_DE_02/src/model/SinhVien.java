package model;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.time.LocalDate;
import java.util.Date;
import javax.annotation.processing.Generated;

@Generated("jsonschema2pojo")
public class SinhVien {

    @SerializedName("maSV")
    @Expose
    private String maSV;
    @SerializedName("hoTen")
    @Expose
    private String hoTen;
    @SerializedName("tenLopNC")
    @Expose
    private String tenLopNC;
    @SerializedName("ngaySinh")
    @Expose
    private String ngaySinh;
    @SerializedName("queQuan")
    @Expose
    private String queQuan;
    @SerializedName("dsMonHoc")
    @Expose
    private List<DsMonHoc> dsMonHoc = null;

    /**
     * No args constructor for use in serialization
     *
     */
    public SinhVien() {
    }

    /**
     *
     * @param tenLopNC
     * @param maSV
     * @param ngaySinh
     * @param dsMonHoc
     * @param hoTen
     * @param queQuan
     */
    public SinhVien(String maSV, String hoTen, String tenLopNC, String ngaySinh, String queQuan, List<DsMonHoc> dsMonHoc) {
        super();
        this.maSV = maSV;
        this.hoTen = hoTen;
        this.tenLopNC = tenLopNC;
        this.ngaySinh = this.ngaySinh;
        this.queQuan = queQuan;
        this.dsMonHoc = dsMonHoc;
    }

    public SinhVien(String maSV, String hoTen, String tenLopNC, String ngaySinh, String queQuan) {
        super();
        this.maSV = maSV;
        this.hoTen = hoTen;
        this.tenLopNC = tenLopNC;
        this.ngaySinh = this.ngaySinh;
        this.queQuan = queQuan;
    }

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getTenLopNC() {
        return tenLopNC;
    }

    public void setTenLopNC(String tenLopNC) {
        this.tenLopNC = tenLopNC;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getQueQuan() {
        return queQuan;
    }

    public void setQueQuan(String queQuan) {
        this.queQuan = queQuan;
    }

    public List<DsMonHoc> getDsMonHoc() {
        return dsMonHoc;
    }

    public void setDsMonHoc(List<DsMonHoc> dsMonHoc) {
        this.dsMonHoc = dsMonHoc;
    }

    public double getDTB() {
        double diem = 0;
        int tc = 0;
        for (DsMonHoc a : dsMonHoc) {
            diem += a.getDiemMH() * a.getSoTC();
            tc += a.getSoTC();
        }
        return (diem / tc);
    }
}
