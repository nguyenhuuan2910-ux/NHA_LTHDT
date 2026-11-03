import java.util.Scanner;
import java.util.ArrayList;

public class BaiTapTuan6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Khai báo các ArrayList song song để lưu thông tin sách thay cho hướng đối tượng
        ArrayList<String> dsMaSach = new ArrayList<>();
        ArrayList<String> dsTenSach = new ArrayList<>();
        ArrayList<String> dsTacGia = new ArrayList<>();
        ArrayList<Integer> dsNamXB = new ArrayList<>();
        ArrayList<Double> dsDonGia = new ArrayList<>();
        ArrayList<Integer> dsSoLuong = new ArrayList<>();
        ArrayList<Double> dsTongTien = new ArrayList<>();

        int choice;

        // Xây dựng menu hoàn chỉnh 8 chức năng
        do {
            System.out.println("\n=== MENU QUẢN LÝ THƯ VIỆN - TUẦN 6 ===");
            System.out.println("1. Thêm sách");
            System.out.println("2. Hiển thị danh sách sách");
            System.out.println("3. Tìm sách theo mã");
            System.out.println("4. Xóa sách theo mã");
            System.out.println("5. Sửa thông tin sách theo mã");
            System.out.println("6. Tính tổng số lượng sách");
            System.out.println("7. Tính tổng giá trị sách");
            System.out.println("8. Thoát chương trình");
            System.out.print("Chọn chức năng (1-8): ");

            try {
                choice = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                choice = 0; // Xử lý lỗi nếu nhập ký tự chữ
            }

            switch (choice) {
                case 1:
                    // 1. Thêm sách vào các ArrayList
                    System.out.print("Nhập số lượng sách cần thêm: ");
                    int n = Integer.parseInt(sc.nextLine());
                    for (int i = 0; i < n; i++) {
                        System.out.println("\n--- Nhập thông tin cuốn sách thứ " + (i + 1) + " ---");

                        System.out.print("Nhập mã sách: ");
                        dsMaSach.add(sc.nextLine());

                        System.out.print("Nhập tên sách: ");
                        dsTenSach.add(sc.nextLine());

                        System.out.print("Nhập tên tác giả: ");
                        dsTacGia.add(sc.nextLine());

                        System.out.print("Nhập năm xuất bản: ");
                        dsNamXB.add(Integer.parseInt(sc.nextLine()));

                        System.out.print("Nhập đơn giá: ");
                        double dg = Double.parseDouble(sc.nextLine());
                        dsDonGia.add(dg);

                        System.out.print("Nhập số lượng: ");
                        int sl = Integer.parseInt(sc.nextLine());
                        dsSoLuong.add(sl);

                        // Tính tổng tiền nhập = (đơn giá * số lượng) + 5% phí vận chuyển
                        double thanhTien = dg * sl;
                        double tongTien = thanhTien + (thanhTien * 0.05);
                        dsTongTien.add(tongTien);
                    }
                    System.out.println("=> Thêm sách vào danh sách thành công!");
                    break;

                case 2:
                    // 2. Hiển thị danh sách sách
                    if (dsMaSach.isEmpty()) {
                        System.out.println("=> Thư viện hiện đang trống!");
                        break;
                    }
                    System.out.println("\n=== DANH SÁCH THƯ VIỆN ===");
                    for (int i = 0; i < dsMaSach.size(); i++) {
                        System.out.println("Sách số " + (i + 1) + ":");
                        System.out.println(" - Mã sách     : " + dsMaSach.get(i));
                        System.out.println(" - Tên sách    : " + dsTenSach.get(i));
                        System.out.println(" - Tác giả     : " + dsTacGia.get(i));
                        System.out.println(" - Năm XB      : " + dsNamXB.get(i));
                        System.out.println(" - Đơn giá     : " + dsDonGia.get(i));
                        System.out.println(" - Số lượng    : " + dsSoLuong.get(i));
                        System.out.println(" - Tổng tiền   : " + dsTongTien.get(i));
                    }
                    break;

                case 3:
                    // 3. Tìm sách theo mã
                    if (dsMaSach.isEmpty()) {
                        System.out.println("=> Thư viện hiện đang trống!");
                        break;
                    }
                    System.out.print("Nhập mã sách cần tìm: ");
                    String maTim = sc.nextLine();
                    boolean found = false;
                    for (int i = 0; i < dsMaSach.size(); i++) {
                        if (dsMaSach.get(i).equalsIgnoreCase(maTim)) {
                            System.out.println("\n=> ĐÃ TÌM THẤY SÁCH:");
                            System.out.println(" - Mã sách     : " + dsMaSach.get(i));
                            System.out.println(" - Tên sách    : " + dsTenSach.get(i));
                            System.out.println(" - Tác giả     : " + dsTacGia.get(i));
                            System.out.println(" - Năm XB      : " + dsNamXB.get(i));
                            System.out.println(" - Đơn giá     : " + dsDonGia.get(i));
                            System.out.println(" - Số lượng    : " + dsSoLuong.get(i));
                            System.out.println(" - Tổng tiền   : " + dsTongTien.get(i));
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("=> Không tìm thấy sách có mã: " + maTim);
                    }
                    break;

                case 4:
                    // 4. Xóa sách theo mã (xóa ở tất cả các ArrayList theo cùng index i)
                    if (dsMaSach.isEmpty()) {
                        System.out.println("=> Thư viện hiện đang trống!");
                        break;
                    }
                    System.out.print("Nhập mã sách cần xóa: ");
                    String maXoa = sc.nextLine();
                    boolean removed = false;
                    for (int i = 0; i < dsMaSach.size(); i++) {
                        if (dsMaSach.get(i).equalsIgnoreCase(maXoa)) {
                            dsMaSach.remove(i);
                            dsTenSach.remove(i);
                            dsTacGia.remove(i);
                            dsNamXB.remove(i);
                            dsDonGia.remove(i);
                            dsSoLuong.remove(i);
                            dsTongTien.remove(i);

                            System.out.println("=> Đã xóa thành công sách có mã: " + maXoa);
                            removed = true;
                            break;
                        }
                    }
                    if (!removed) {
                        System.out.println("=> Không tìm thấy sách có mã để xóa: " + maXoa);
                    }
                    break;

                case 5:
                    // 5. Sửa thông tin sách theo mã
                    if (dsMaSach.isEmpty()) {
                        System.out.println("=> Thư viện hiện đang trống!");
                        break;
                    }
                    System.out.print("Nhập mã sách cần sửa: ");
                    String maSua = sc.nextLine();
                    boolean edited = false;
                    for (int i = 0; i < dsMaSach.size(); i++) {
                        if (dsMaSach.get(i).equalsIgnoreCase(maSua)) {
                            System.out.println("=> Nhập thông tin mới cho sách (" + maSua + "):");

                            System.out.print("Nhập tên sách mới: ");
                            dsTenSach.set(i, sc.nextLine());

                            System.out.print("Nhập tên tác giả mới: ");
                            dsTacGia.set(i, sc.nextLine());

                            System.out.print("Nhập năm xuất bản mới: ");
                            dsNamXB.set(i, Integer.parseInt(sc.nextLine()));

                            System.out.print("Nhập đơn giá mới: ");
                            double dgMoi = Double.parseDouble(sc.nextLine());
                            dsDonGia.set(i, dgMoi);

                            System.out.print("Nhập số lượng mới: ");
                            int slMoi = Integer.parseInt(sc.nextLine());
                            dsSoLuong.set(i, slMoi);

                            // Tính lại tổng tiền
                            double thanhTienMoi = dgMoi * slMoi;
                            double tongTienMoi = thanhTienMoi + (thanhTienMoi * 0.05);
                            dsTongTien.set(i, tongTienMoi);

                            System.out.println("=> Cập nhật thông tin sách thành công!");
                            edited = true;
                            break;
                        }
                    }
                    if (!edited) {
                        System.out.println("=> Không tìm thấy sách có mã để sửa: " + maSua);
                    }
                    break;

                case 6:
                    // 6. Tính tổng số lượng sách
                    if (dsMaSach.isEmpty()) {
                        System.out.println("=> Thư viện hiện đang trống!");
                        break;
                    }
                    int tongSoLuong = 0;
                    for (int sl : dsSoLuong) {
                        tongSoLuong += sl;
                    }
                    System.out.println("\n=> Tổng số lượng sách trong kho: " + tongSoLuong);
                    break;

                case 7:
                    // 7. Tính tổng giá trị sách
                    if (dsMaSach.isEmpty()) {
                        System.out.println("=> Thư viện hiện đang trống!");
                        break;
                    }
                    double tongGiaTri = 0;
                    for (double tt : dsTongTien) {
                        tongGiaTri += tt;
                    }
                    System.out.println("\n=> Tổng giá trị nhập sách trong kho: " + tongGiaTri);
                    break;

                case 8:
                    System.out.println("=> Đã thoát chương trình. Tạm biệt!");
                    break;

                default:
                    System.out.println("=> Lựa chọn không hợp lệ! Vui lòng chọn từ 1 đến 8.");
            }
        } while (choice != 8);

        sc.close();
    }
}