package com.company;

/** StringBuilder delete(int start, int end) - removes characterd from staet to end
 *  StringBuilder deletrCharAt(int index) */
public class DeleteDeleteCharAtMeth {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("abcdef");
        sb.delete(1, 3); // adef
        sb.deleteCharAt(3); // ade
        System.out.println(sb);
    }
}
