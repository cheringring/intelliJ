package ch03;

public class ConstantTest {
    public static void main(String[] args) {
        final int STDENT_NUM = 23;
        // 한번 초기화된 상태에서 재할당이 불가능 하다.

        int cost = 100;
        int totalCost = STDENT_NUM *cost;
    }
}
