package lab7;

import java.util.*;

public class Product {
    private String name;
    private double totalRating;
    private int ratingCount;

    public Product(String name) {
        this.name = name;
        this.totalRating = 0;
        this.ratingCount = 0;
    }

    public synchronized void addRating(int rating) {
        if (rating < 1 || rating > 5) {
            System.out.println("Invalid rating. Rating should be between 1 and 5.");
            return;
        }
        totalRating += rating;
        ratingCount++;
    }

    public synchronized double getAverageRating() {
        if (ratingCount == 0) {
            return 0;
        }
        return totalRating / ratingCount;
    }

    public String getName() {
        return name;
    }
}
