package buoi14.baitap.bai4;

import java.util.Scanner;

public class SanPham {
    private String tenSP;
    private Double gia;
    private  int soLuong;

    @Override
    public String toString() {
        return "SanPham{" +
                "tenSP='" + tenSP + '\'' +
                ", gia='" + gia + '\'' +
                ", soLuong=" + soLuong +
                '}';
    }
    public void hienThiSP(){
        System.out.println(this.toString());
    }
    public void nhapThongTin() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập tên sản phẩm");
        this.tenSP = sc.nextLine();
        System.out.println("Nhập giá");
        this.gia = sc.nextDouble();
        System.out.println("Nhập Số Lượng Sản phẩm");
        this.soLuong = sc.nextInt();
    }
    public SanPham(String tenSP, Double gia, int soLuong) {
        this.tenSP = tenSP;
        this.gia = gia;
        this.soLuong = soLuong;
    }

    public SanPham() {
    }

    public String getTenSP() {
        return tenSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public Double getGia() {
        return gia;
    }

    public void setGia(Double gia) {
        this.gia = gia;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }
}
