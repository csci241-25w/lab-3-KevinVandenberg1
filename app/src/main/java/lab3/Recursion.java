package lab3;
import java.util.ArrayList;

/** Lab 3, Part 1: Practice problems for developing recursive methods */
public class Recursion {
  /** Implicit precondition of all String parameters: they are not null. */

  /** = the length of s --without using function s.length.
   * hint: you can use the equals and substring methods
   * Recursive definition:
   *   len(s) = 0 if the string is empty
   *   len(s) = 1 + len(s[1..] otherwise */
  public static int len(String s) {
    // If s is an empty string, return 0
    if (s == "") {
      return 0;
    }
    return 1 + len(s.substring(1));
  }

  /** = number of 'e's in s
   * recursive definition:
   *   countE("") = 0
   *   countE(s) =
   *        1 + countE(s[1:] if s[0] is e
   *        countE(s[1:] otherwise
   */
  public static int countE(String s)  {
    // Base case: If its empty, return 0
    if (s == "") {return 0;}
    
    if (s.charAt(0) == 'e') {
	return 1 + countE(s.substring(1));
    } else {
	return countE(s.substring(1));
    }
  }


  /** = sum of  digits in the decimal representation of n.
    e.g. sum(0) = 0, sum(3) = 3
    sum(34) = 7.
    sum(1356) = 15.     6  + sum of the digits in 135
    Precondition: n >= 0. 
    
    Recursive Definition: 
    	sumDigs(0) = 0
	sumDigs(n) = sumDigs(n/10) + n%10
    */
  public static int sumDigs(int n) {
      if (n == 0) {
          return 0;
      }
      int s = n % 10;

      // TODO: replace 0 with the correct recursive call:
      return s + sumDigs(n/10);
  }

  /** = the reverse of s
   * e.g. reverse("alp") => "pla"
   *      reverse("order") => "redro" 
   * Recursive Definition:
   * 	reverse("") = ""
   * 	reverse(s) = reverse(s.substring(1)) + s[0]
   *      */
  public static String reverse(String s) {
     // Base case: If its empty, return an empty string
     if (s == "") {return "";}

     return reverse(s.substring(1)) + s.charAt(0);
  }

  ////////////////////////////////////////////////
  // The following bonus problems are not required
  // for Lab 3, but are good practice!
  ////////////////////////////////////////////////

  /** = s with every char duplicated.
   * e.g. dup("abc") => "aabbcc" */
  public static String dup(String s) {
      return "";
  }

  /** = s with adjacent duplicates removed.
    Example: dedup("abbcccdeaaa") => "abcdea". */
  public static String dedup(String s) {
    return "";
  }

  /* Challenge round! This is a tricky one.*/
  /** = the permutations of s.
    e.g. the permutations of "abc" are
    "abc", "acb", "bac", "bca", "cab", "cba"
    Precondition: the chars of s are all different.
    Hint: can you define the permutations of abc in terms
        of the permuatations of some smaller string(s)? */
  public static ArrayList<String> perms(String s) {
    ArrayList<String> perms = new ArrayList<String>();
    return perms;
  }

}
