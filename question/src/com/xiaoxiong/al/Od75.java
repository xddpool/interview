package com.xiaoxiong.al;

import java.util.Scanner;

public class Od75 {
     /*
  输入一串字符串
  字符串长度不超过100
  查找字符串中相同字符连续出现的最大次数

  输入描述
    输入只有一行，包含一个长度不超过100的字符串

  输出描述
    输出只有一行，输出相同字符串连续出现的最大次数

   说明：
     输出

   示例1：
     输入
       hello
     输出
       2

    示例2：
      输入
       word
      输出
       1

     示例3：
      输入
       aaabbc
       输出
       3

    字符串区分大小写
   */

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        in.close();

        char[] chars = str.toCharArray();

        int maxLen = 0;

        for (int i = 0; i < chars.length; i++) {

            int index = i;
            //在循环内部建立变量可以让变量在每次循环重置,就可以重新计数
            int len = 1;
            while (index + 1 < chars.length && chars[index + 1] == chars[index]) {
                len++;
                index++;
            }
            // 通过大小判断, 得到最大的长度
            if (len > maxLen) {
                maxLen = len;
            }
        }

        System.out.println(maxLen);

    }
}
