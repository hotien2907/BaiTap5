package BaiTap;

public class BT2 {
    public static void main(String[] args) {
        String str1 = "hao";
        String str2 = "hao";
        String str3 = "hong";

        if(areStringEqual(str1,str2)){
            System.out.println("str1 và str2 giống nhau");
        }else  {
            System.out.println("str1 và str2 Khác nhau");
        }

        if(areStringEqual(str1,str3)){
            System.out.println("str1 và str3 giống nhau");
        }else  {
            System.out.println("str1 và str3 Khác nhau");
        }
    }
    public static boolean areStringEqual(String str1 ,String str2) {
        return str1.equals(str2);
    }
}
