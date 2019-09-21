import java.util.Scanner;

class Book {
    private String BookName;
    private String AuthorName;
    private String Isbn;

    public Book(String BookName , String AuthorName , String Isbn){
        this.BookName = BookName;
        this.AuthorName = AuthorName;
        this.Isbn = Isbn;
    }
    @Override
    public String toString(){
        return "------------------"+"\n"+"Book Name  : \t"+BookName+"\n"+"Author Name :\t"+AuthorName+"\n"+"isbn:\t"+Isbn+"\n"+"---------------------------";

    }
}

public class Main{
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        Book arr[]=new Book[n];
        if (n==0){
            System.out.println("enter a valid value ");

        }
        else {
            inp.nextLine().trim();
            for(int i=0;i<n;i++){
                String BookName = inp.nextLine().trim();
                String AuthorName = inp.nextLine().trim();
                String Isbn = inp.nextLine().trim();
                arr[i] = new Book(BookName , AuthorName , Isbn );
            }
            for (int i=0;i<arr.length;i++){
                System.out.println(arr[i]);
            }
        }
    }
}
