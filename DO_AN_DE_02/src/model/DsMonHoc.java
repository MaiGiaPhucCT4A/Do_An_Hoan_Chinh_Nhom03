package model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import javax.annotation.processing.Generated;

@Generated("jsonschema2pojo")
public class DsMonHoc {

    @SerializedName("tenMonHoc")
    @Expose
    private String tenMonHoc;
    @SerializedName("soTC")
    @Expose
    private int soTC;
    @SerializedName("diemMH")
    @Expose
    private double diemMH;

    /**
     * No args constructor for use in serialization
     *
     */
    public DsMonHoc() {
    }

    /**
     *
     * @param diemMH
     * @param tenMonHoc
     * @param soTC
     */
    public DsMonHoc(String tenMonHoc, int soTC, double diemMH) {
        super();
        this.tenMonHoc = tenMonHoc;
        this.soTC = soTC;
        this.diemMH = diemMH;
    }

    public String getTenMonHoc() {
        return tenMonHoc;
    }

    public void setTenMonHoc(String tenMonHoc) {
        this.tenMonHoc = tenMonHoc;
    }

    public int getSoTC() {
        return soTC;
    }

    public void setSoTC(int soTC) {
        this.soTC = soTC;
    }

    public double getDiemMH() {
        return diemMH;
    }

    public void setDiemMH(double diemMH) {
        this.diemMH = diemMH;
    }

}
