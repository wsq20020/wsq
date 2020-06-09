package work;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("����������A:");
            String strNumberA = scanner.nextLine();
            System.err.println("���������������(+,-,*,/):");
            String strOperate = scanner.nextLine();
            System.out.println("����������B:");
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
                    strResult = "��������Ϊ0";
                }
                break;
            default:
                break;
            }
            System.out.println("�����: " + strResult);
            scanner.close();

        } catch (Exception e) {
            System.out.println("���������д�: " + e);
        }
    }
}