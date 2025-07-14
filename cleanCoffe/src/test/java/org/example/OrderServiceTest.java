package org.example;



import org.example.coffe.Coffee;
import org.example.coffe.CoffeeFactory;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.MockedStatic;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import static org.mockito.Mockito.*;


/**
 * OrderService sınıfının JUnit ve Mockito ile test edilmesi.
 * Test sırasında Scanner'dan veri alma ve kahve üretimi sahte (mock) ile simüle edilmiştir.
 */
public class OrderServiceTest {

    private final InputStream systemInBackup = System.in;

    @BeforeEach
    public void restoreSystemIn() {
        System.setIn(systemInBackup);
    }

    @DisplayName("Geçerli seçimle espresso siparişi işlenmeli")
    @Test
    public void testOrderWithValidSelection() {
        String input = "1\n"; // Espresso seçimi
        ByteArrayInputStream testIn = new ByteArrayInputStream(input.getBytes());
        System.setIn(testIn);

        Coffee mockCoffee = mock(Coffee.class);
        when(mockCoffee.getName()).thenReturn("Espresso");
        when(mockCoffee.getPrice()).thenReturn(7);
        when(mockCoffee.getRecipe()).thenReturn("1x Espresso");

        try (MockedStatic<CoffeeFactory> mockedFactory = mockStatic(CoffeeFactory.class)) {
            mockedFactory.when(() -> CoffeeFactory.createCoffee(1)).thenReturn(mockCoffee);
            mockedFactory.when(CoffeeFactory::listCoffees).thenCallRealMethod();

            OrderService orderService = new OrderService();
            orderService.processOrder();
        }
    }

    @DisplayName("Hatalı girişten sonra geçerli seçimle double espresso siparişi işlenmeli")
    @Test
    public void testInvalidInputFollowedByValid() {
        String input = "abc\n9\n2\n"; // Hatalı → Hatalı → Double Espresso
        ByteArrayInputStream testIn = new ByteArrayInputStream(input.getBytes());
        System.setIn(testIn);

        Coffee mockCoffee = mock(Coffee.class);
        when(mockCoffee.getName()).thenReturn("Double Espresso");
        when(mockCoffee.getPrice()).thenReturn(12);
        when(mockCoffee.getRecipe()).thenReturn("2x Espresso");

        try (MockedStatic<CoffeeFactory> mockedFactory = mockStatic(CoffeeFactory.class)) {
            mockedFactory.when(() -> CoffeeFactory.createCoffee(2)).thenReturn(mockCoffee);
            mockedFactory.when(CoffeeFactory::listCoffees).thenCallRealMethod();

            OrderService orderService = new OrderService();
            orderService.processOrder();
        }
    }
}