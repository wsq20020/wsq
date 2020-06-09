package work;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("请输入数字A:");
            String strNumberA = scanner.nextLine();
            System.err.println("请输输入运算符号(+,-,*,/):");
            String strOperate = scanner.nextLine();
            System.out.println("请输入数字B:");
            String strNumberB = scanner.nextLine();
            String strResult = "";

            switch (strOperate) {
            case "+":
                strResult = Double.toString(Double.valueOf(strNumberA) + Double.valueOf(strNumberB));
                break;
            case "-":
                strResult = Double.toString(Double.valueOf(strNumberA) - Double.valueOf(strNumberB));
                break;
            case "*":
                strResult = Double.toString(Double.valueOf(strNumberA) * Double.valueOf(strNumberB));
                break;
            case "/":
                if (!strNumberB.equals("0")) {
                    strResult = Double.toString(Double.valueOf(strNumberA) / Double.valueOf(strNumberB));
                } else {
                    strResult = "除数不能为0";
                }
                break;
            default:
                break;
            }
            System.out.println("结果是: " + strResult);
            scanner.close();

        } catch (Exception e) {
            System.out.println("您的输入有错: " + e);
        }
    }
}