public class MyClass {
    public static void main(String args[]) {

    /*
    Hey patel here is my solution for the Palindrome Programming
    */

    String name = "anna";
    int val = name.length();
    int count = 0;


    // Compare Values through a for loop with length
    for(int i = 0; i< name.length(); i++) {
    // see if name is equal to the end if it is incr count++
   if(name.charAt(i) == name.charAt(val-i-1)){
       count++;
        }
    }

    // After Loop should equal the string Length if not its not a Palindrome
    if (count == val) {
        System.out.println("It is a Palindrome");
        return;
    }else{
       System.out.println("It is a Not Palindrome");
        return;
    }




    }
}
