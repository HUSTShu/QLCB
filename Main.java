package TranQuangHuy20204757;

import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    static CongTy congTy = new CongTy();
    public static void main(String[] args) {
        while(true) {
            System.out.println("==> QUAN LY NHAN VIEN <==");
            System.out.println("1. Nhap/Thay doi ten cong ty");
            System.out.println("2. Nhap/Thay doi thong so co ban");
            System.out.println("3. Them nhan vien");
            System.out.println("4. Tang he so luong cua can bo co huu");
            System.out.println("5. Hien thi thong tin cong ty");
            System.out.println("0. Thoat");
            String choose = scanner.nextLine();
            switch(choose) {

                case "1": {
                    System.out.println("-> Nhap ten cong ty: ");
                    String tenCongTy = scanner.nextLine();
                    congTy.setTenCongTy(tenCongTy);
                    System.out.println("=> Ten cong ty sau khi nhap: " + congTy.getTenCongTy());
                    break;
                }

                case "2": {
                    System.out.println(" a. Nhap/Thay doi loi nhuan cong ty");
                    System.out.println(" b. Nhap/Thay doi luong co ban can bo co huu");
                    String type = scanner.nextLine();
                    switch(type) {
                        case "a": {
                            System.out.println("-> Nhap loi nhuan cong ty: ");
                            double loiNhuan = scanner.nextDouble();
                            congTy.loiNhuan = loiNhuan;
                            System.out.println("=> Loi nhuan cong ty sau khi nhap: " + congTy.loiNhuan);
                            break;
                        }
                        case "b": {
                            System.out.println("-> Nhap luong co ban cua can bo co huu: ");
                            double luongCoBan = scanner.nextDouble();
                            
                            break;
                        }
                        default: {
                            System.out.println("Sai cu phap!");
                            continue;
                        }
                    }
                    break;
                }

                case "3": {
                    break;
                }

                case "4": {
                    break;
                }

                case "5": {
                    break;
                }

                case "0": {
                    System.out.println("Cam on quy khach da su dung dich vu!");
                    break;
                }

                default: {
                    System.out.println("Cu phap khong hop le!");
                    continue;
                }
            }
        }
    }
}