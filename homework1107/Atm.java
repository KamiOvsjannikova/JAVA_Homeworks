package org.example.homework1107;
/* У вас на банковском счету N долларов.
Вы хотите снять все, но банк разрешает снять только сумму, которая является делителем текущей суммы на счету и меньше текущей суммы.
Если вы снимаете максимально возможную сумму каждый день, сколько дней вам понадобится, чтобы забрать все свои деньги из банка?
Примечание: если оставшаяся сумма равна 1, вы можете снять ее.


Ввод:  N = 21
Выход:  7
Объяснение:  N = 21
Снято 7, осталось = 14
Снято 7, осталось = 7
Снято 1, осталось = 6
Снято 3, осталось = 3
Снято 1, осталось = 2
Снято 1, Осталось = 1
Снято 1, осталось = 0

*/
import java.util.Scanner;

public class Atm {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your balance");
        int cardBalance = scanner.nextInt();
        System.out.println("Withdraw all cash - "+cardBalance);
    }
}
