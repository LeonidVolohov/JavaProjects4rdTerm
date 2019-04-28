package com.volohov;

/**
 * Простой интерфейс для решения данной задачи
 */

public interface function {

    /**
     * Первая функция
     */
    boolean function1st(boolean a, boolean b, boolean c, boolean d);

    /**
     * Вторая функция
     */
    boolean function2nd(boolean a, boolean b, boolean c, boolean d);

    /**
     * Функция, преобразовывающая int в boolean
     */
    boolean intToBoolean(int newInt);

    /**
     * Функция проверки на ИСКЛЮЧАЮЩЕЕ ИЛИ
     */
    boolean checkImplication(boolean functionOne, boolean functionTwo);

}
