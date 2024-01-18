package buoi15.baitaplon;

import java.util.HashSet;
import java.util.Objects;
import java.util.Scanner;
import java.util.Set;

public class Contact {

    private String name;
    private String phone;
    private Set<String> Setemail;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contact contact = (Contact) o;
        return Objects.equals(phone, contact.phone);
    }
    @Override
    public int hashCode() {
        return Objects.hash(phone);
    }
  public  void nhapThongTin(){
      Scanner sc = new Scanner(System.in);
      System.out.println("Nhập tên ");
      this.name=sc.nextLine();
      System.out.println("Nhập số điện thoại");
      this.phone= sc.nextLine();
      System.out.println("Nhâp email");
      System.out.println("Nhập vào số lượng email");
      int n = sc.nextInt();
            sc.nextLine();
            for (int i=0;i<n;i++){
                System.out.println("nhập email thứ"+(i+1));
                System.out.println(Setemail.add(sc.nextLine()));
            }
  }

    public Contact() {

        this.Setemail = new HashSet<>();
    }

    @Override
    public String toString() {
        return "Contact{" +
                "name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", Setemail=" + String.join(",",Setemail)+
                '}';
    }

    public void hienThiThongTin(){
      System.out.println(this.toString());
  }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Set<String> getSetemail() {
        return Setemail;
    }

    public void setSetemail(Set<String> setemail) {
        Setemail = setemail;
    }
}
