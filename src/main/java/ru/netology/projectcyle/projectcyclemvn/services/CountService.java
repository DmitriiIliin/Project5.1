

package ru.netology.projectcyle.projectcyclemvn.services;
public class CountService {
    public int calculate ( int threshold, int income, int expences) {
        int actual = 0;// начальное количество месяцев
        int money = 0;// начальное количество денег на счету

        for (int months = 0; months < 12; months++) {
            if (money > threshold) {
                actual++ ;
                money = (money - expences) / 3;
            } else {
                money = money + income - expences;
            }
        }

        return actual;

    }
}
