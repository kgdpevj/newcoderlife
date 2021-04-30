/*
题目描述
•连续输入字符串，请按长度为8拆分每个字符串后输出到新的字符串数组；
•长度不是8整数倍的字符串请在后面补数字0，空字符串不处理。

输入描述:
连续输入字符串(输入多次,每个字符串长度小于100)

输出描述:
输出到长度为8的新字符串数组

示例1
输入
abc
123456789
输出
abc00000
12345678
90000000
*/

import java.util.Scanner;

public class 字符串分隔 {
    private static final int lineSize = 8;

    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        while (scanner.hasNext()) {
//            String line = scanner.nextLine();
//            dealLine(line);
//        }
//    }
//
//    public static void dealLine(String line) {
//        int lineCount = line.length() / lineSize;
//        int lastCount = line.length() % lineSize;
//        for (int i = 0; i < lineCount; i++) {
//            printLine(line.substring(i * lineSize, (i + 1) * lineSize));
//        }
//        if (lastCount > 0) {
//            if (lastCount == line.length()) {
//                printLine(line);
//            } else {
//                printLine(line.substring(line.length() - lastCount));
//            }
//        }
//    }
//
//    public static void printLine(String line) {
//        System.out.print(line);
//        int count = lineSize - line.length();
//        for (int i = 0; i < count; i++) {
//            System.out.print("0");
//        }
//        System.out.println();



        Scanner sc = new Scanner(System.in);

        while(sc.hasNext()){
            String str = sc.nextLine();
            StringBuilder sb = new StringBuilder();//牢记字符串缓冲区的建立语法
            sb.append(str);//字符串缓冲区的加入
            int size = str.length();
            int addZero = 8 - size%8;//addzero的可能值包括8
            while((addZero > 0)&&(addZero<8)){//注意边界调节，避免addzero=8
                sb.append("0");//使用‘’或“”都可
                addZero--;
            }
            String str1 = sb.toString();
            while(str1.length()>0){
                System.out.println(str1.substring(0,8));
                str1 = str1.substring(8);
            }

        }
    }
}
