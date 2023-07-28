import java.util.Scanner;

public class BeanTest {

    private static final Scanner scan = new Scanner(System.in);
    private static long id = 0;

    public static void main(String[] args) {
        Albums myAlbum = createAlbum(id);

        System.out.printf("Artist: %s%nName: %s%nDate: %d%nSales: $%.2f%nGenre: %s%n",
                myAlbum.getArtist(), myAlbum.getName(), myAlbum.getReleaseDate(), myAlbum.getSales(), myAlbum.getGenre());

        Albums newAlbum = createAlbum();

        System.out.printf("Artist: %s%nName: %s%nDate: %d%nSales: $%.2f%nGenre: %s%n",
                newAlbum.getArtist(), newAlbum.getName(), newAlbum.getReleaseDate(), newAlbum.getSales(), newAlbum.getGenre());

        Quote myQuote = createQuote(id);

        System.out.printf("Author: %s&nFirstname: %s%nLastname: %s%nContent",
               myQuote.getAuthor_first_name(),myQuote.getAuthor_last_name(),myQuote.getContent());

        Quote newQuote = createQuote();

        System.out.printf("Author: %s&nFirstname: %s%nLastname: %s%nContent",
                newQuote.getAuthor_first_name(),newQuote.getAuthor_last_name(),newQuote.getContent());

    }


    public static Albums createAlbum(long id){
        System.out.println("Enter Album Artist");
        String artist = scan.nextLine();
        System.out.println("Enter Album Name");
        String name = scan.nextLine();
        System.out.println("Enter Album Release Date(YYYY)");
        int date = Integer.parseInt(scan.nextLine());
        System.out.println("Enter Album Sales");
        double sales = Double.parseDouble(scan.nextLine());
        System.out.println("Enter Album Genre");
        String genre = scan.nextLine();

        return new Albums(id, artist, name, date, sales, genre);
    }

    public static Albums createAlbum(){
        System.out.println("Enter Album Artist");
        String artist = scan.nextLine();
        System.out.println("Enter Album Name");
        String name = scan.nextLine();
        System.out.println("Enter Album Release Date(YYYY)");
        int date = Integer.parseInt(scan.nextLine());
        System.out.println("Enter Album Sales");
        double sales = Double.parseDouble(scan.nextLine());
        System.out.println("Enter Album Genre");
        String genre = scan.nextLine();

        return new Albums(artist, name, date, sales, genre);
    }

    public static Quote createQuote(long id){
        System.out.println("Enter Author First Name");
        String firstName = scan.nextLine();
        System.out.println("Enter Author Last Name");
        String lastName = scan.nextLine();
        System.out.println("Enter Content");
        String content = scan.nextLine();
        return new Quote(id, firstName, lastName, content);
    }
    public static Quote createQuote(){
        System.out.println("Enter Author First Name");
        String firstName = scan.nextLine();
        System.out.println("Enter Author Last Name");
        String lastName = scan.nextLine();
        System.out.println("Enter Content");
        String content = scan.nextLine();
        return new Quote(firstName, lastName, content);
    }

}