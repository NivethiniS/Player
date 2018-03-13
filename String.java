public class String {
static Scanner inputofUser = new Scanner(System.in);    
static Object userInput;
static Object classofInput;
public static void main(String[] args){
    try{
    System.out.print("Enter an integer, only an integer: ");
    userInput = inputofUser.nextInt();

    classofInput = userInput.getClass();
    System.out.println(classofInput);
    } catch(InputMismatchException e) {
        System.out.println("Not an integer, crashing down");

    }

 }
