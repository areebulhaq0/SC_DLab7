package lab7;

import java.util.*;

public class User extends Thread {
    private Product product;
    private int rating;

    public User(Product product, int rating) {
        this.product = product;
        this.rating = rating;
    }

    @Override
    public void run() {
        product.addRating(rating);
        System.out.println(Thread.currentThread().getName() + " rated " + rating + " stars for " + product.getName());
    }
}
