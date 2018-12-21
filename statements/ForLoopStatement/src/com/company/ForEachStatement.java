package com.company;

public class ForEachStatement {
    public static void main(String[] args) {
        final String[] names = new String[3];
        names[0] = "Lisa";
        names[1] = "Kevin";
        names[2] = "Roger";
        for(String name : names) {
            System.out.print(name + ", ");
        }
    }

}
/** equal to:
 * for(int i =0; i < names.length; i++) {
 *     String name = names[i];
 *     System.out.print(name + ", ");
 * }
 */
