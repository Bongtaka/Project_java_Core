package buoi15.baitaplon;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Addressbook addressbook = new Addressbook();
        boolean grab = true;
        do {
            System.out.println(" mời bạn nhập MENU (1) (2) (3) (4) (5) (6) ");
            System.out.println("1: mời bạn nhấn chức năng thêm mới liên hệ");
            System.out.println("2: mời bạn nhấn chức năng ti kiếm nhanh liên hệ");
            System.out.println("3: mời bạn nhấn chức năng xóa số điện thoại liên hệ");
            System.out.println("4: mời bạn nhấn chức năng hiển thị thông tin trong danh sách");
            System.out.println("5: mời bạn nhấn chức năng cập nhập ssoo điện thoại");
            System.out.println("6: kết Thúc");
            int xContact = new Scanner(System.in).nextInt();
            switch (xContact){
                case 1:
                    addressbook.themMoi();
                    break;
                case 2:
                    break;
                case 3:
                    addressbook.xoaThongTin();
                    break;
                case 4:
                    addressbook.hienThiThongTin();
                    break;
                case 5:
                    addressbook.capNhapSDT();
                    break;
                case 6:
                    System.out.println("kết thúc chương trình");
                    grab = false;
                    break;
                default:
                    System.out.println("bạn nhập chương trình của hệ thống không hợp lệ !");
                    break;
            }
        }while (grab);
    }
}
