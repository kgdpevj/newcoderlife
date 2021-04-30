/*
题目描述
计算字符串最后一个单词的长度，单词以空格隔开，字符串长度小于5000。

输入描述:
输入一行，代表要计算的字符串，非空，长度小于5000。

输出描述:
输出一个整数，表示输入字符串最后一个单词的长度。

示例1
输入
hello nowcoder
输出
8
说明
最后一个单词为nowcoder，长度为8
*/

import java.io.IOException;
import java.io.InputStream;

public class 字符串最后一个单词的长度 {
    public static void main(String[] args) throws IOException {
        InputStream in = System.in;
        int length = 0;
        char ch = (char) in.read();
        while (ch != '\n') {
            if (ch == ' ') {
                length = 0;
            } else {
                length++;
            }
            ch = (char) in.read();
        }
        System.out.println(length);
    }
}
