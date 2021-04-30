/*
题目描述
写出一个程序，接受一个十六进制的数，输出该数值的十进制表示。

输入描述:
输入一个十六进制的数值字符串。注意：一个用例会同时有多组输入数据，请参考帖子https://www.nowcoder.com/discuss/276处理多组输入的问题。

输出描述:
输出该数值的十进制字符串。不同组的测试用例用\n隔开。

示例1
输入
复制
0xA
0xAA
输出
复制
10
170
*/

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Solution {
    private final int BASE = 16;
    private Map<Character, Integer> map;

    public Solution() {
        map = new HashMap<>(16);
        map.put('0', 0);
        map.put('1', 1);
        map.put('2', 2);
        map.put('3', 3);
        map.put('4', 4);
        map.put('5', 5);
        map.put('6', 6);
        map.put('7', 7);
        map.put('8', 8);
        map.put('9', 9);
        map.put('A', 10);
        map.put('B', 11);
        map.put('C', 12);
        map.put('D', 13);
        map.put('E', 14);
        map.put('F', 15);
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String hex = scanner.nextLine();
            int res = solution.getDecimal(hex.substring(2));
            System.out.println(res);
        }
    }

    public int getDecimal(String num) {
        char[] arr = num.toCharArray();
        int res = 0;
        for (int i = 0; i < arr.length; i++) {
            res = res * BASE + map.get(arr[i]);
        }
        return res;
    }
}
