package com.volohov;

/**
 * Класс реализации интерфейса function.java
 */

public class functionImpl implements function {

    public boolean function1st(boolean a, boolean b, boolean c, boolean d) {
        return (!(a ^ c) & (d | ((((d & ((c & a) | (((c & b) & (d | b)) & d))) | b) & c))));
    }

    public boolean function2nd(boolean a, boolean b, boolean c, boolean d) {
        return ((b | d) | ((c & (a | ((b & !(a | d)) & c))) & ((d & (d ^ c)) & c)));
    }

    public boolean intToBoolean(int newInt) {
        if (newInt == 1) {
            return true;
        } else {
            return false;
        }
    }

    public boolean checkImplication(boolean functionOne, boolean functionTwo) {
        return !functionOne | functionTwo;
    }

}
