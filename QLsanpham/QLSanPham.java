package buoi14.baitap.bai4;

import java.util.HashMap;
import java.util.Map;

// Bài 4) Tạo một Map để lưu trữ thông tin về các sản phẩm (tên, giá, số lượng).
//         Tính tổng giá trị của tất cả các sản phẩm.
//         In ra tên sản phẩm có giá cao nhất.
public class QLSanPham {
    public Map<String,SanPham> DSSP;

    public QLSanPham() {
        this.DSSP = new HashMap<>();
    }
    public void themSP(){
       SanPham sanPham = new SanPham();
        sanPham.nhapThongTin();
        DSSP.put(sanPham.getTenSP(), sanPham);
    }

    public void TongGiaSP(){
        double totalValue = 0;

        for (SanPham sanPham : DSSP.values()) {
            totalValue += sanPham.getGia() * sanPham.getSoLuong();
        }
        System.out.println("Tổng giá trị của tất cả các sản phẩm: " + totalValue);
    }

    public String timSPCoGiaTriCaoNhat() {
        double maxGia = Double.MIN_VALUE;
        String tenSP = null;

        // Tìm tên sản phẩm có giá cao nhất
        for (Map.Entry<String, SanPham> entry : DSSP.entrySet()) {
            SanPham sanPham = entry.getValue();
            if (sanPham.getGia() > maxGia) {
                maxGia = sanPham.getGia();
                tenSP = sanPham.getTenSP();
            }
        }

        return tenSP;
    }

    public void SPCoGiaTriCaoNhat() {
        // In ra tên sản phẩm có giá cao nhất
        String  tenSPgiaCaoNhat= timSPCoGiaTriCaoNhat();
        System.out.println("Tên sản phẩm có giá cao nhất: " + tenSPgiaCaoNhat);
    }


}
