/*3) Выведите на экран «песочные часы» максимальная ширина которых
считывается с клавиатуры (число нечетное). В примере ширина равна 5.
*****
 ***
  *
 ***
*****   */
package com.gmail.dimaku1998;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter width = ");
        byte width = sc.nextByte();
        byte left = 0;
        byte right = (byte)(width-1);
        boolean count = false;
        for (int i = 0; i < width; ) {
            for (int j = 0; j < width; j++) {
                if (j >= left && j <= right) {
                    System.out.print("*");
                }else
                    System.out.print(" ");
            }
            if (left == right || count == true) {
                left--;
                right++;
                i--;
                count = true;
            } else if (left != right && count == false) {
                left++;
                right--;
                i++;
            }
            System.out.println();
        }

    }
}

