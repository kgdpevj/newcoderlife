/*
题目描述
输入一个int型的正整数，计算出该int型数据在内存中存储时1的个数。

输入描述:
 输入一个整数（int类型）

输出描述:
 这个数转换成2进制后，输出1的个数

示例1
输入
复制
5
输出
复制
2
* */

import java.util.Scanner;

public class 求int型正整数在内存中存储时1的个数 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int num = scanner.nextInt();
            int count = 0;
            while (num > 0) {
                if (num % 2 > 0) {
                    System.out.print(1);
                    count++;
                } else {
                    System.out.print(0);
                }
                num >>= 1;
            }
            System.out.println();
            System.out.println(count);
        }
    }
}
