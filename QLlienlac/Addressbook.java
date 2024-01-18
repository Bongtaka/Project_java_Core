package buoi15.baitaplon;

import java.util.*;

public class Addressbook {
    private Set<Contact> contacts;
    Map<String,Contact> mapContact;

    public Addressbook() {
        this.contacts = new HashSet<>();
        this.mapContact = new HashMap<>();
    }
    public void themMoi(){
        System.out.println("Nhập thông tin liên hệ mới");
        Contact newcontact = new Contact();
        newcontact.nhapThongTin();
        boolean invalidPhone = false;
       for (Contact contact1: contacts){
           if (contact1.getPhone().equals(newcontact.getPhone())){
               invalidPhone=true;
               System.out.println("số đã có trong danh  sách");
           }else {
               contacts.add(newcontact);
               mapContact.put(newcontact.getPhone(),newcontact);
           }
       }
    }
    public void hienThiThongTin(){
        for (Contact contact: contacts) {
            contact.hienThiThongTin();
        }
    }
    public void xoaThongTin(){
        System.out.println("nhập số điện thoại cần xóa");
        String xoaSDT = new Scanner(System.in).nextLine();
        contacts.remove(xoaSDT);
        mapContact.remove(xoaSDT);
    }
    public void capNhapSDT(){
        System.out.println("Nhập số điện thoại cập nhập");
        String capNhapSDT = new Scanner(System.in).nextLine();
        Contact lienHeCanSua = null;
        for (Contact oldContact:contacts) {
            if (oldContact.getPhone().equals(capNhapSDT)){
                lienHeCanSua = oldContact;
            }
        }

        if (lienHeCanSua != null){
            Contact newContact = new Contact();
            System.out.println("Đã tìm thấy liên hệ cần sửa");
            lienHeCanSua.hienThiThongTin();
            System.out.println("Nhập vào các thông tin liên hệ mới: ");
            newContact.nhapThongTin();
            System.out.println("Thông tin đã được cập nhật:");
            lienHeCanSua.hienThiThongTin();
        }else {
            System.out.println("không tìm thấy số liên hệ bạn cần tìm");
        }
    }
    public void xoaLienHe() {
        System.out.println("nhập số điện thoại cần xóa");
        String soDienThoai = new Scanner(System.in).nextLine();
        Contact lienHeCanXoa = mapContact.get(soDienThoai);
        if (lienHeCanXoa != null) {
            contacts.remove(lienHeCanXoa);
            mapContact.remove(soDienThoai);
            System.out.println("bạn xóa thành công trong Danh Bạ!");
        } else {
            System.out.println("bạn xóa không thành công vì số này không có trong Danh Bạ!");
        }

    }
    public void timKiemNhanh(){
        System.out.println("nhập vào số điện thoại tìm kiếm");
        String sdtTimKiem= new Scanner(System.in).nextLine();
        Contact lienLacTK = mapContact.get(sdtTimKiem);
        if (sdtTimKiem !=null){
            System.out.println("liên hệ cần tìm là");
            lienLacTK.hienThiThongTin();
        }else {
            System.out.println("liên hệ ko có trong danh sách");
        }
    }
}
