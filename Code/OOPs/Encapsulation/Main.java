/*Q3: Write a Java program that demonstrates encapsulation by creating a class Book
with private fields title, author, and price. Implement getter and setter methods for
these fields and write a method applyDiscount(double discount) that applies a
discount to the book price. Display the updated price after applying the discount.*/


class Books {
    private String title;
    private String author;
    private double price;

    public String getName() {
        return title;
    }

    public String getAuthor() {
        return author;
    }  
    public double getPrice() {
        return price;
        }


    public void setter(String author, double price , String title) {
        this.author = author;
        this.price = price;
        this.title = title;
        }
        public void applyDiscount(double discount) {
            price -= price * discount;
            }

        }
        public class Main {
            public static void main(String[] args) {
                Books book = new Books();
                book.setter("GOtam", 25.0, "Grey Matter and Adventures");
                System.out.println("Title: " + book.getName());
                System.out.println("Author: " + book.getAuthor());
                System.out.println("Price: $" + book.getPrice());
                book.applyDiscount(0.2);
                System.out.println("Discounted Price: $" + book.getPrice());
                }
    }

