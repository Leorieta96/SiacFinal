/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

/**
 *
 * @author leori
 */
public class validaciones {

    public static boolean isNumber(String n) {
        if (!isEmpty(n)) {
            try {
                Integer.parseInt(n);
                return true;
            } catch (NumberFormatException nfe) {
                return false;
            }
        } else {
            return false;
        }
    }

    public static boolean isFloat(String n) {
        if (!isEmpty(n)) {
            try {
                Float.parseFloat(n);
                return true;
            } catch (NumberFormatException nfe) {
                return false;
            }
        } else {
            return false;
        }
    }

    public static boolean isEmail(String n) {
        if (!isEmpty(n)) {
            char c1 = n.charAt(0);
            int pos1 = 0;
            int pos2 = 0;
            int a1 = 0;
            int a2 = 0;
            int a3 = 0;
            int x = 0;
            String cadena1 = "";
            String cadena2 = "";
            String cadena3 = "";
            if (c1 != '@' && c1 != '.') {

                for (int i = 1; i < n.length(); i++) {
                    if (n.charAt(i) == '@') {
                        pos1 = i;
                    }
                }
                for (int i = 1; i < n.length(); i++) {
                    if (n.charAt(i) == '.') {
                        pos2 = i;
                    }
                }
                cadena1 = n.substring(0, pos1);
                cadena2 = n.substring(pos1 + 1, pos2);
                cadena3 = n.substring(pos2 + 1, n.length());

                for (int i = 0; i < cadena1.length(); i++) {
                    System.out.println("carcater " + cadena1);
                    a1 = cadena1.codePointAt(i);//
                    if ((a1 > 47 && a1 < 58) || (a1 > 64 && a1 < 91)
                            || (a1 > 96 && a1 < 123) || a1 == 46) {
                        x++;
                    }
                }
                System.out.println("1 " + cadena2);
                for (int i = 0; i < cadena2.length(); i++) {
                    a2 = cadena2.codePointAt(i);
                    System.out.println("carcater " + a2);
                    if ((a2 > 47 && a2 < 58) || (a2 > 64 && a2 < 91)
                            || (a2 > 96 && a2 < 123)) {
                        x++;
                    }
                }
                for (int i = 0; i < cadena3.length(); i++) {
                    a3 = cadena3.codePointAt(i);
                    if ((a3 > 47 && a3 < 58) || (a3 > 64 && a3 < 91)
                            || (a3 > 96 && a3 < 123)) {
                        x++;
                    }
                }
                System.out.println("xxx " + x + "    " + (n.length() - 2));
                if (x == n.length() - 2) {
                    if (pos1 != 0 && pos2 != 0 && (pos1 + 2) < pos2) {
                        if (n.length() - 1 >= (pos2 + 2)) {
                            return true;
                        } else {
                            return false;
                        }
                    } else {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    public static boolean isEmpty(String n) {
        if (n.length() == 0 || n.equals(" ")) {
            return true;
        } else {
            return false;
        }
    }

    static boolean isString(String n) {
        if (!isEmpty(n) && !(n.contains("!") || n.contains("#")
                || n.contains("$") || n.contains("%") || n.contains("&")
                || n.contains("#") || n.contains("/") || n.contains("=")
                || n.contains("?") || n.contains("¡"))) {
            return true;
        } else {
            return false;
        }
    }
}