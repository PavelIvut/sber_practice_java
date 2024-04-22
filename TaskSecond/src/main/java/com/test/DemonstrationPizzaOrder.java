package com.test;

public class DemonstrationPizzaOrder {
        public static void main(String[] args) {
            PizzaOrder order = new PizzaOrder("Аль-Капчоне", PizzaOrder.Size.BIG, true, "Ярославская 101");
            order.order();
            order.cancel();
            order.order();
        }
}