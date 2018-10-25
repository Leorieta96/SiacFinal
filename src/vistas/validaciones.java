/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author leori
 */
public class validaciones {

    public static boolean isNumber(String n) {
        if (!isEmpty(n)) {
            try {
                Long.parseLong(n);
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
       Pattern pattern = Pattern.compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@" + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");

        Matcher mather = pattern.matcher(n);

        return mather.find();
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
                || n.contains("*") || n.contains("/") || n.contains("=")
                || n.contains("?") || n.contains("¡")) && !isNumber(n)) {
            return true;
        } else {
            return false;
        }
    }
}