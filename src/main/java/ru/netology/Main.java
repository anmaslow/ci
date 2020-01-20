package ru.netology;

public class Main {
    public static void main(String[] args) {

        CashbackHackService service = new CashbackHackService();
        {
            System.out.println("Should return 100");
            int result = service.remain(900);
            System.out.println(100 == result);
        }
        {
            System.out.println("Should return 0");
            int result = service.remain(1000);
            System.out.println(0 == result);
        }

    }
}
