/*

题目描述
输入一个int型整数，按照从右向左的阅读顺序，返回一个不含重复数字的新的整数。
保证输入的整数最后一位不是0。
输入描述:
输入一个int型整数

输出描述:
按照从右向左的阅读顺序，返回一个不含重复数字的新的整数

示例1
输入
复制
9876673
输出
复制
37689
*/

import java.util.Scanner;

public class 提取不重复的整数 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int num = scanner.nextInt();
            char[] arr = String.valueOf(num).toCharArray();
            StringBuilder res = new StringBuilder();
            for (int i = arr.length - 1; i >= 0; i--) {
                if (!res.toString().contains(String.valueOf(arr[i]))) {
                    res.append(arr[i]);
                }
            }
            System.out.println(res);
        }
    }
}
