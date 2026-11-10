package BTT7;

public class Main {
    public static void main(String[] args) {
        // Khai báo cú pháp
        SACH Toan = new SACH("Toán cao cấp", "S01", 10);
        SACH Hoa = new SACH("Hóa đại cương", "S02", 5);
        SACH Li = new SACH("Vật lý đại cương", "S03", 8);

        // In thử thông tin sách ra màn hình
        System.out.println("Tên sách: " + Toan.tensach + " - Số lượng: " + Toan.soluong);
        System.out.println("Tên sách: " + Hoa.tensach + " - Số lượng: " + Hoa.soluong);
        System.out.println("Tên sách: " + Li.tensach + " - Số lượng: " + Li.soluong);

    }
}