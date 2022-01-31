import java.util.Scanner;

public class Book {
    int bookid;
    String bookname;
    int pages;
    int price;
    Book(){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the book id ");
        bookid = s.nextInt();
        System.out.println("Enter the name of the book");
        bookname = s.next();
        System.out.println("Enter the no. of pagers of the book");
        pages = s.nextInt();
        System.out.println("Enter the price of the book");
        price = s.nextInt();
    }

    public void showDetails(){
        System.out.println("Book id is "+ bookid);
        System.out.println("Bookname is " + bookname);
        System.out.println("The book has " + pages + "number of pages");
        System.out.println("the price of the book is " + price);
    }

    public static int maxPriceIndex(Book[] a){
        int max =a[0].price;
        int index =0;
        for (int i = 0; i < a.length; i++) {
            if(a[i].price>max){
                max = a[i].price;
                index =i+1;
            }
        }
        return index;
    }

    public static int minPriceIndex(Book[] a){
        int min = a[0].price;
        int index =0;
        for (int i = 0; i < a.length; i++) {
            if(a[i].price<min){
                min = a[i].price;
                index = i+1;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        Book []arr = new Book[10];
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("Enter the details of the book number %d",i+1);
            arr[i]= new Book();
            System.out.println();
        }
        int maxIndex = maxPriceIndex(arr);
        int minIndex = minPriceIndex(arr);
        System.out.println("Difference between max and min price is " + (arr[maxIndex].price-arr[minIndex].price));
        arr[maxIndex].showDetails();
        arr[minIndex].showDetails();

    }
}