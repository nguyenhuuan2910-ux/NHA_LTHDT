package BTT7;

public class Sach {
    // Thuộc tính đóng gói (private)
    private String maSach;
    private String tieuDe;
    private String tacGia;
    private int namXuatBan;
    private int soLuong;

    // Constructor không tham số
    public Sach() {
    }

    // Constructor có tham số để khởi tạo nhanh
    public Sach(String maSach, String tieuDe, String tacGia, int namXuatBan, int soLuong) {
        this.maSach = maSach;
        this.tieuDe = tieuDe;
        this.tacGia = tacGia;
        this.namXuatBan = namXuatBan;
        this.soLuong = soLuong;
    }

    // Các phương thức Getter và Setter
    public String getMaSach() { return maSach; }
    public void setMaSach(String maSach) { this.maSach = maSach; }

    public String getTieuDe() { return tieuDe; }
    public void setTieuDe(String tieuDe) { this.tieuDe = tieuDe; }

    public String getTacGia() { return tacGia; }
    public void setTacGia(String tacGia) { this.tacGia = tacGia; }

    public int getNamXuatBan() { return namXuatBan; }
    public void setNamXuatBan(int namXuatBan) { this.namXuatBan = namXuatBan; }

    public int getSoLuong() { return soLuong; }
    public void setSoLuong(int soLuong) { this.soLuong = soLuong; }

    // Yêu cầu 2: Phương thức hiển thị thông tin sách
    public void hienThiThongTin() {
        System.out.println("Mã sách: " + maSach +
                " | Tiêu đề: " + tieuDe +
                " | Tác giả: " + tacGia +
                " | Năm XB: " + namXuatBan +
                " | Số lượng: " + soLuong);
    }
}