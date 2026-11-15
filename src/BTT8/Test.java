package BTT8;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        // Tạo danh sách quản lý sách bằng ArrayList
        ArrayList<Sach> danhSachSach = new ArrayList<>();

        // Tạo các đối tượng sách bằng constructor đầy đủ tham số (yêu cầu 4)
        Sach sach1 = new Sach("S01", "Lập trình Java", "Nguyễn Văn A", 2024, 12);
        Sach sach2 = new Sach("S02", "Cấu trúc dữ liệu", "Trần Văn B", 2023, 8);
        Sach sach3 = new Sach("S03", "Cơ sở dữ liệu", "Lê Thị C", 2022, 15);

        danhSachSach.add(sach1);
        danhSachSach.add(sach2);
        danhSachSach.add(sach3);

        System.out.println("=== DANH SÁCH THÔNG TIN SÁCH TRONG THƯ VIỆN ===");
        for (Sach s : danhSachSach) {
            s.hienThiThongTin();
        }

        // Kiểm tra yêu cầu 3: setter có kiểm tra dữ liệu
        System.out.println("\n=== KIỂM TRA DỮ LIỆU KHÔNG HỢP LỆ ===");
        sach1.setNamXuatBan(3000);   // lớn hơn năm hiện tại -> bị từ chối
        sach1.setNamXuatBan(-5);     // nhỏ hơn hoặc bằng 0 -> bị từ chối
        sach2.setSoLuong(-10);       // số lượng âm -> bị từ chối

        // Tạo sách với dữ liệu sai ngay từ constructor
        Sach sach4 = new Sach("S04", "Mạng máy tính", "Phạm Văn D", 2100, -3);

        // Kiểm tra dữ liệu hợp lệ vẫn được cập nhật
        sach3.setSoLuong(20);
        sach3.setNamXuatBan(2025);
        danhSachSach.add(sach4);

        System.out.println("\n=== DANH SÁCH SAU KHI CẬP NHẬT ===");
        for (Sach s : danhSachSach) {
            s.hienThiThongTin();
        }
    }
}