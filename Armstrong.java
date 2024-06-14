// import java.lang.Math;

//                                          ARMSTRONG NUMBER 
//                                           GEEKSFORGEEKS 
                      



class Solution {
  static Boolean armstrongNumber(int n) {
      // code here
      int result=0;
      String s = Integer.toString(n);
      // "153"        int a = Integer.parseInt(String.valueOf(ch));
      for(int i=0;i<s.length();i++){
          int a = Integer.parseInt(String.valueOf(s.charAt(i)));
          result += Math.pow(a,3);
      }
      if(result==n) return true;
      else return false;
  }
}