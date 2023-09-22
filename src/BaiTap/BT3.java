package BaiTap;

public class BT3 {
    public static void main(String[] args) {
        String str =" Chuc Mung Nam Moi";
       String reStr= reverseString(str);
        System.out.println("chuỗi trc khi đảo ngược là: " + str);
        System.out.println("chuỗi sau khi đảo ngược là: " + reStr);
    }
    public static  String reverseString(String input){
        StringBuffer str2 = new StringBuffer(input);

        str2.reverse();
        return str2.toString();
    }
}
