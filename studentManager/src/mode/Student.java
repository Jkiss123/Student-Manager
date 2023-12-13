/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mode;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author Cloudy
 */
public class Student implements Serializable {
        private int maThiSinh;
	private String tenThiSinh;
	private Tinh queQuan;
	private Date ngaySinh;
	private boolean gioiTinh;
	private float diemMon1, diemMon2, diemMon3;

    public Student(int maThiSinh, String tenThiSinh, Tinh queQuan, Date ngaySinh, boolean gioiTinh, float diemMon1, float diemMon2, float diemMon3) {
        this.maThiSinh = maThiSinh;
        this.tenThiSinh = tenThiSinh;
        this.queQuan = queQuan;
        this.ngaySinh = ngaySinh;
        this.gioiTinh = gioiTinh;
        this.diemMon1 = diemMon1;
        this.diemMon2 = diemMon2;
        this.diemMon3 = diemMon3;
    }

    public Student() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public int getMaThiSinh() {
        return maThiSinh;
    }

    public void setMaThiSinh(int maThiSinh) {
        this.maThiSinh = maThiSinh;
    }

    public String getTenThiSinh() {
        return tenThiSinh;
    }

    public void setTenThiSinh(String tenThiSinh) {
        this.tenThiSinh = tenThiSinh;
    }

    public Tinh getQueQuan() {
        return queQuan;
    }

    public void setQueQuan(Tinh queQuan) {
        this.queQuan = queQuan;
    }

    public Date getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public boolean isGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(boolean gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public float getDiemMon1() {
        return diemMon1;
    }

    public void setDiemMon1(float diemMon1) {
        this.diemMon1 = diemMon1;
    }

    public float getDiemMon2() {
        return diemMon2;
    }

    public void setDiemMon2(float diemMon2) {
        this.diemMon2 = diemMon2;
    }

    public float getDiemMon3() {
        return diemMon3;
    }

    public void setDiemMon3(float diemMon3) {
        this.diemMon3 = diemMon3;
    }

    @Override
    public String toString() {
        return "Student{" + "maThiSinh=" + maThiSinh + ", tenThiSinh=" + tenThiSinh + ", queQuan=" + queQuan + ", ngaySinh=" + ngaySinh + ", gioiTinh=" + (gioiTinh?"Nam":"Nu") + ", diemMon1=" + diemMon1 + ", diemMon2=" + diemMon2 + ", diemMon3=" + diemMon3 + '}';
    }

        
        
}
