/*
题目描述
写出一个程序，接受一个由字母、数字和空格组成的字符串，和一个字母，然后输出输入字符串中该字母的出现次数。不区分大小写，字符串长度小于500。

输入描述:
第一行输入一个由字母和数字以及空格组成的字符串，第二行输入一个字母。

输出描述:
输出输入字符串中含有该字符的个数。

示例1
输入
复制
ABCabc
A
输出
复制
2
*/

import java.io.IOException;
import java.util.Scanner;

public class 计算某字母出现次数 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String src = scanner.nextLine();
        String one = scanner.nextLine();
        int count = 0;
        char[] charArray = src.toCharArray();

        for (int i = 0; i < charArray.length; i++) {
            if (one.equalsIgnoreCase(String.valueOf(charArray[i]))) {
                count++;
            }
        }
        System.out.println(count);

    }
}
