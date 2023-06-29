package ru.netology.services;

public class BudgetService {

    public int calculate(int income, int expense, int threshold) {
        int money = 0; //текущее состояние бюджета
        int count = 0; // счётчик месяцев отдыха
        for (int month = 0; month < 12; month++) {
            if (money >= threshold) { // если денег меньше threshold
                money = money - expense; // то деньги уменьшаются на expense
                money = money / 3; // и уменьшаются ещё в три раза.
                count++; // плюсуем месяцы отдыха
            } else { // если денег больше threshold
                money = money + income; // деньги увеличиваются на income
                money = money - expense; // и уменьшаются на expense
            }
        }
        return count;
    }
}
