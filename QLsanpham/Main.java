package buoi14.baitap.bai4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        QLSanPham qlsp = new QLSanPham();
        Boolean grab = true;
        do {
            System.out.println("mời nhập tính năng trong MENU của thư Viện Sách  (1)  (2)  (3)  (4)");
            System.out.println("1: mời bạn nhập thêm sản Phẩm vào hệ thống");
            System.out.println("2: Tính tổng tất cả các sản phẩm");
            System.out.println("3: Tìm tên Sản phẩm có giá cao nhất");
            System.out.println("4: mời bạn nhập thoát chương trình ! ");
            int seach = new Scanner(System.in).nextInt();

            switch (seach){
                case 1:
                    qlsp.themSP();
                    break;
                case 2:
                    qlsp.TongGiaSP();
                    break;
                case 3:
                    qlsp.SPCoGiaTriCaoNhat();
                    break;
                case 4:
                    System.out.println("hẹn gặp bạn lần sau !");
                    grab = false;
                    break;
                default:
                    System.out.println("bạn nhập không đúng hợp lệ !");
                    break;
            }
        }while (grab);
    }

}
