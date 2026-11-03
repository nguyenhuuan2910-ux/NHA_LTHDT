import java.util.Scanner;

public class BaiTapTuan5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Khai báo mảng tĩnh lưu trữ thông tin tối đa 100 cuốn sách
        int maxBooks = 100;
        String[] dsMa = new String[maxBooks];
        String[] dsTen = new String[maxBooks];
        int[] dsSoLuong = new int[maxBooks];
        double[] dsTongTien = new double[maxBooks];
        int soLuongSachHienCo = 0; // Biến đếm số sách thực tế đã nhập

        int menuChoice;

        // BÀI 3: Menu lặp liên tục cho đến khi chọn Thoát (dùng vòng lặp do-while)
        do {
            System.out.println("\n========== MENU QUẢN LÝ THƯ VIỆN - TUẦN 5 ==========");
            System.out.println("1. Nhập n sách bằng vòng lặp (Bài 1)");
            System.out.println("2. Tính tổng số lượng và tổng giá trị sách (Bài 2)");
            System.out.println("3. Tìm sách theo mã (Bài 4)");
            System.out.println("4. Thoát chương trình");
            System.out.print("Chọn chức năng (1-4): ");

            try {
                menuChoice = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                menuChoice = 0; // Xử lý lỗi nếu người dùng nhập ký tự chữ
            }

            switch (menuChoice) {
                case 1:
                    // BÀI 1: Nhập n sách bằng vòng lặp for
                    System.out.print("Nhập số lượng sách cần thêm (n): ");
                    int n = Integer.parseInt(sc.nextLine());

                    for (int i = 0; i < n; i++) {
                        if (soLuongSachHienCo >= maxBooks) {
                            System.out.println("=> Kho sách đã đầy, không thể nhập thêm!");
                            break;
                        }

                        System.out.println("\n--- Nhập thông tin cuốn sách thứ " + (soLuongSachHienCo + 1) + " ---");
                        System.out.print("Nhập mã sách: ");
                        dsMa[soLuongSachHienCo] = sc.nextLine();

                        System.out.print("Nhập tên sách: ");
                        dsTen[soLuongSachHienCo] = sc.nextLine();

                        System.out.print("Nhập đơn giá: ");
                        double donGia = Double.parseDouble(sc.nextLine());

                        System.out.print("Nhập số lượng: ");
                        int soLuong = Integer.parseInt(sc.nextLine());
                        dsSoLuong[soLuongSachHienCo] = soLuong;

                        // Tính thành tiền và tổng tiền nhập (bao gồm 5% phí vận chuyển)
                        double thanhTien = donGia * soLuong;
                        double phiVanChuyen = thanhTien * 0.05;
                        dsTongTien[soLuongSachHienCo] = thanhTien + phiVanChuyen;

                        soLuongSachHienCo++; // Tăng biến đếm số lượng sách thực tế
                    }
                    System.out.println("=> Đã nhập thành công " + n + " cuốn sách vào hệ thống!");
                    break;

                case 2:
                    // BÀI 2: Tính tổng số lượng và tổng giá trị sách (dùng vòng lặp for)
                    if (soLuongSachHienCo == 0) {
                        System.out.println("=> Danh sách thư viện hiện đang trống!");
                        break;
                    }

                    int tongSoLuong = 0;
                    double tongGiaTri = 0;

                    for (int i = 0; i < soLuongSachHienCo; i++) {
                        tongSoLuong += dsSoLuong[i];
                        tongGiaTri += dsTongTien[i];
                    }

                    System.out.println("\n================ KẾT QUẢ THỐNG KÊ (BÀI 2) ================");
                    System.out.println("Tổng số lượng sách trong kho : " + tongSoLuong);
                    System.out.println("Tổng giá trị nhập sách       : " + tongGiaTri);
                break;

                case 3:
                    // BÀI 4: Tìm sách theo mã (dùng vòng lặp for kết hợp điều kiện)
                    if (soLuongSachHienCo == 0) {
                        System.out.println("=> Danh sách thư viện hiện đang trống!");
                        break;
                    }

                    System.out.print("Nhập mã sách cần tìm kiếm: ");
                    String maTim = sc.nextLine();
                    boolean found = false;

                    for (int i = 0; i < soLuongSachHienCo; i++) {
                        if (dsMa[i].equalsIgnoreCase(maTim)) {
                            System.out.println("\n=> ĐÃ TÌM THẤY SÁCH:");
                            System.out.println("Mã sách         : " + dsMa[i]);
                            System.out.println("Tên sách        : " + dsTen[i]);
                            System.out.println("Số lượng        : " + dsSoLuong[i]);
                            System.out.println("Tổng tiền nhập  : " + dsTongTien[i]);
                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("=> Không tìm thấy sách có mã: " + maTim);
                    }
                    break;

                case 4:
                    System.out.println("=> Đã thoát chương trình. Tạm biệt!");
                    break;

                default:
                    System.out.println("=> Lựa chọn không hợp lệ! Vui lòng chọn từ 1 đến 4.");
            }
        } while (menuChoice != 4);

        sc.close();
    }
}