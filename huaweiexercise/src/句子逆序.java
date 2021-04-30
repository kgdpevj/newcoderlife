/*
题目描述
将一个英文语句以单词为单位逆序排放。例如“I am a boy”，逆序排放后为“boy a am I”
所有单词之间用一个空格隔开，语句中除了英文字母外，不再包含其他字符

输入描述:
输入一个英文语句，每个单词用空格隔开。保证输入只包含空格和字母。

输出描述:
得到逆序的句子

示例1
输入
复制
I am a boy
输出
复制
boy a am I
* */


import java.util.Scanner;

public class 句子逆序 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String src = scanner.nextLine();
            String[] words = src.split(" ");
            for (int i = words.length - 1; i >= 0; i--) {
                System.out.print(words[i]);
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
