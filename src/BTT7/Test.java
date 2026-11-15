package BTT7;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        // Yêu cầu 4: Tạo danh sách quản lý sách bằng ArrayList
        ArrayList<Sach> danhSachSach = new ArrayList<>();

        // Yêu cầu 3: Tạo các đối tượng sách từ lớp Sach
        Sach sach1 = new Sach("S01", "Lập trình Java", "Nguyễn Văn A", 2024, 12);
        Sach sach2 = new Sach("S02", "Cấu trúc dữ liệu", "Trần Văn B", 2023, 8);
        Sach sach3 = new Sach("S03", "Cơ sở dữ liệu", "Lê Thị C", 2022, 15);

        // Thêm các đối tượng sách vào ArrayList
        danhSachSach.add(sach1);
        danhSachSach.add(sach2);
        danhSachSach.add(sach3);

        // Duyệt danh sách và gọi phương thức hiển thị thông tin
        System.out.println("=== DANH SÁCH THÔNG TIN SÁCH TRONG THƯ VIỆN ===");
        for (Sach s : danhSachSach) {
            s.hienThiThongTin();
        }
    }
}