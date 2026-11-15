package BTT8;

import java.time.Year;

public class Sach {
    // Yêu cầu 1: Thuộc tính đóng gói (private)
    private String maSach;
    private String tieuDe;
    private String tacGia;
    private int namXuatBan;
    private int soLuong;

    // Constructor không tham số
    public Sach() {
    }

    // Yêu cầu 4: Constructor đầy đủ tham số
    // Gọi setter để dữ liệu truyền vào cũng được kiểm tra hợp lệ
    public Sach(String maSach, String tieuDe, String tacGia, int namXuatBan, int soLuong) {
        this.maSach = maSach;
        this.tieuDe = tieuDe;
        this.tacGia = tacGia;
        setNamXuatBan(namXuatBan);
        setSoLuong(soLuong);
    }

    // Yêu cầu 2: Các phương thức Getter và Setter
    public String getMaSach() { return maSach; }
    public void setMaSach(String maSach) { this.maSach = maSach; }

    public String getTieuDe() { return tieuDe; }
    public void setTieuDe(String tieuDe) { this.tieuDe = tieuDe; }

    public String getTacGia() { return tacGia; }
    public void setTacGia(String tacGia) { this.tacGia = tacGia; }

    public int getNamXuatBan() { return namXuatBan; }

    // Yêu cầu 3: namXuatBan phải > 0 và không lớn hơn năm hiện tại
    public void setNamXuatBan(int namXuatBan) {
        int currentYear = Year.now().getValue();
        if (namXuatBan > 0 && namXuatBan <= currentYear) {
            this.namXuatBan = namXuatBan;
        } else {
            System.out.println("Năm xuất bản không hợp lệ: " + namXuatBan
                    + " (phải từ 1 đến " + currentYear + ")");
        }
    }

    public int getSoLuong() { return soLuong; }

    // Yêu cầu 3: soLuong không được âm
    public void setSoLuong(int soLuong) {
        if (soLuong >= 0) {
            this.soLuong = soLuong;
        } else {
            System.out.println("Số lượng không hợp lệ: " + soLuong + " (không được âm)");
        }
    }

    // Phương thức hiển thị thông tin sách
    public void hienThiThongTin() {
        System.out.println("Mã sách: " + maSach +
                " | Tiêu đề: " + tieuDe +
                " | Tác giả: " + tacGia +
                " | Năm XB: " + namXuatBan +
                " | Số lượng: " + soLuong);
    }
}