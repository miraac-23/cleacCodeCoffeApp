package org.example;

/**
 * Uygulamanın giriş noktası
 * Sadece uygulamayı başlatmaktan sorumludur.
 */
public class Main {
    public static void main(String[] args) {
        OrderService orderService = new OrderService();
        orderService.processOrder();
    }
}
