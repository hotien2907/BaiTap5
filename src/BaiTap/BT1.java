package BaiTap;

public class BT1 {
    public static void main(String[] args) {
        String str1 = "";
        String str2 = "Chúc Mừng Năm mới !!";

        if (isEmptyString(str1)) {
            System.out.println("Chuỗi str1 là rỗng.");
        } else {
            System.out.println("Chuỗi str1 không rỗng.");
        }

        if (isEmptyString(str2)) {
            System.out.println("Chuỗi str2 là rỗng.");
        } else {
            System.out.println("Chuỗi str2 không rỗng.");
        }
    }

    // Phương thức kiểm tra chuỗi rỗng
    public static boolean isEmptyString(String str) {
        return str.isEmpty();
    }
}
