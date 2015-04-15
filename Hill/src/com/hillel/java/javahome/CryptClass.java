package com.hillel.java.javahome;

import javax.swing.*;
import java.util.Random;

/**
 * Created by KRAB on 14.04.2015.
 */
public class CryptClass {

    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Input string ");
        char[] cryptkeys = makeCryptkeys(input.length());
        String input1 = crypt(input, cryptkeys);
        JOptionPane.showMessageDialog(null, "Coding string: " + input1);
        JOptionPane.showMessageDialog(null, "Decoding string: " + crypt(input1, cryptkeys));
        System.out.println();
    }

    public static char[] makeCryptkeys(int length) {
        Random random = new Random();
        char[] a = new char[length];
        for (int j = 0;
             j <= length - 1; j++) {
            a[j] = (char) random.nextInt();
        }
        return a;
    }

    public static String crypt(String message, char[] key) {
        String str = message;
        char[] chars = str.toCharArray();
        for (int j = 0;
             j <= str.length() - 1; j++) {
            chars[j] ^= key[j];
        }
        return str.copyValueOf(chars);
    }
}