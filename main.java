import java.util.Scanner;

public class FAQ {

    public static void main(String[] args) {
        // إنشاء كائن Scanner لقراءة المدخلات من المستخدم
        Scanner scanner = new Scanner(System.in);

        // عرض العنوان "الأسئلة الشائعة"
        System.out.println("Welcome to the FAQ section!");
        System.out.println("Please select a question by typing the corresponding number:");

        // عرض الأسئلة
        System.out.println("1. What is an electronic library?");
        System.out.println("2. How can I access the electronic library?");
        System.out.println("3. Do I need to register to use the library?");
        System.out.println("4. Can I download books from the library?");
        System.out.println("5. How can I search for books in the library?");
        System.out.println("6. Is the library accessible on mobile devices?");
        System.out.println("7. What types of books are available in the library?");
        System.out.println("8. Is there a limit to the number of books I can borrow?");
        
        // قراءة الرقم المدخل من المستخدم
        int choice = scanner.nextInt();

        // عرض الجواب المناسب بناءً على الرقم المدخل
        switch (choice) {
            case 1:
                System.out.println("Answer: An electronic library is a digital platform that provides a collection of books and resources accessible over the internet.");
                break;
            case 2:
                System.out.println("Answer: You can access the electronic library by visiting its website or using the library’s app on your smartphone or tablet.");
                break;
            case 3:
                System.out.println("Answer: Yes, registration is usually required to access many of the library’s resources, especially for borrowing books or saving your reading progress.");
                break;
            case 4:
                System.out.println("Answer: It depends on the library's terms of use. Some libraries allow downloading books, while others only allow online reading.");
                break;
            case 5:
                System.out.println("Answer: You can search for books using the library's search bar, where you can search by title, author, or keywords.");
                break;
            case 6:
                System.out.println("Answer: Yes, most electronic libraries are accessible on mobile devices through their apps or mobile-friendly websites.");
                break;
            case 7:
                System.out.println("Answer: The library typically offers books in many categories such as fiction, non-fiction, academic texts, and reference materials.");
                break;
            case 8:
                System.out.println("Answer: Some libraries may set limits on how many books you can borrow at once, while others may allow unlimited borrowing.");
                break;
            default:
                System.out.println("Invalid choice. Please select a valid number between 1 and 8.");
        }

        // إغلاق الكائن Scanner
        scanner.close();
    }
}
