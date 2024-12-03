package lab7;

public class RatingSystem {
    public static void main(String[] args) {
        Product product = new Product("Smartphone");

        User user1 = new User(product, 5);
        User user2 = new User(product, 4);
        User user3 = new User(product, 3);
        User user4 = new User(product, 5);
        User user5 = new User(product, 2);

        user1.start();
        user2.start();
        user3.start();
        user4.start();
        user5.start();

        try {
            user1.join();
            user2.join();
            user3.join();
            user4.join();
            user5.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Average rating for " + product.getName() + ": " + product.getAverageRating() + " stars");
    }
}
