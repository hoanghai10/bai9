import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ThucHien thucHien = new ThucHien();
        BienLai bienLai = new BienLai();

        while (true) {
            System.out.println("Application Manager Document");
            System.out.println("Enter 1: To addKH");
            System.out.println("Enter 2: To deleteKH: ");
            System.out.println("Enter 3: To showKH ");
            System.out.println("Enter 4: To show so tien dien ");
            String line = sc.nextLine();
            switch (line){
                case "1":
                    System.out.print("Enter HoTen: ");
                    String HoTen = sc.nextLine();
                    System.out.print("Enter SoNha:");
                    int SoNha = sc.nextInt();
                    System.out.print("Enter MSD: ");
                    int Msd = sc.nextInt();
                    System.out.print("Enter SDM: ");
                    int SDC = sc.nextInt();
                    System.out.print("Enter SDC: ");
                    int SDM = sc.nextInt();
                    KhachHang khachHang = new KhachHang(SDM,SDC,HoTen, SoNha, Msd);
                    thucHien.addKhachhang(khachHang);
                    System.out.println(khachHang.toString());
                    break;

                case "2":
                    System.out.print("Enter HoTen to remove: ");
                    String HoTen1 = sc.nextLine();
                    System.out.println(thucHien.delete(HoTen1) ? "Success" : "Fail");

                case "3":
                    thucHien.showKh();
                    break;

                case "4":
                    System.out.print("Hoten muon xem so tien dien: ");
                    String HoTen2 = sc.nextLine();
                    System.out.print("So tien dien cua " + HoTen2 + ":"  + thucHien.sum(HoTen2));

            }
        }
    }
}
