public class Vowels
{
      public static boolean isVowel(char ch){
          switch(ch){
            case 'A': case 'E': case 'I': case 'O': case 'U':
            case 'a': case 'e': case 'i': case 'o': case 'u':
                return true;
            default:
                return false;           
          }
      }
       
      public static void main(String args[]){
          String text="Hello World!";
          String text1="";
          char ch;
           
          System.out.println("String before removing vowels: " + text);
           
          for(int loop=0; loop<text.length(); loop++){
              ch=text.charAt(loop);
              if(!isVowel(ch)){
                  text1+=ch;
              }
          }           
          System.out.println("String after removing vowels: " + text1);
      }
}
