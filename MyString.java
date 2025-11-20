public class MyString {
    public static void main(String[] args) {
        System.out.println("Testing lowercase:");
        System.out.println("UnHappy : " + lowerCase("UnHappy"));
        System.out.println("This costs 15 Sheksls : " + lowerCase("This costs 15 Sheksls"));
        System.out.println("TLV : " + lowerCase("TLV"));
        System.out.println("lowercase : " + lowerCase("lowercase"));

        System.out.println("Testing contains:");
        System.out.println(contains("unhappy", "happy")); // true
        System.out.println(contains("happy", "unhappy")); // false
        System.out.println(contains("historical", "story")); // false
        System.out.println(contains("psychology", "psycho")); // true
        System.out.println(contains("personality", "son")); // true
        System.out.println(contains("personality", "dad")); // false
        System.out.println(contains("resignation", "sign")); // true
    }

    /** Returns the lowercase version of the given string. */
    public static String lowerCase(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++)
            {
                char ch = str.charAt(i);
                if (ch >= 'A' && ch <= 'Z') { // if the letter batween A to Z
                    ch = (char)(ch + 32 ); // adding 32 make it lower
                }
                result = result + ch;
              }

          return result;
    }

    /** If str1 contains str2, returns true; otherwise returns false. */
    public static boolean contains(String str1, String str2) {
    if (str2.length() == 0)   // if empty is included
        return true;

    if (str2.length() > str1.length()) // if its bigger it cant countain it
        return false;
    
    for (int i = 0; i <= str1.length() - str2.length(); i++) // lookint all ovef str 1
     {
        boolean equal = true;
        for (int j = 0; j < str2.length(); j++) // looking each char
        { 
            if (str1.charAt(i + j) != str2.charAt(j)) {
                equal = false;
                break; // if onr is not equal we can alredy stop
            }
        }

        if (equal)
            return true;  
    }

    return false;  // לא מצאנו בשום מקום
}
}