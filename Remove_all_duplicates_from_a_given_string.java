// import java.util.ArrayList;
import java.util.LinkedHashSet;

public class Remove_all_duplicates_from_a_given_string {
  




    String removeDuplicates(String str) {
        
        LinkedHashSet<Character> st = new LinkedHashSet<>();
        
        for(char c:str.toCharArray())
        {
            st.add(c);
        }
        
        
        
        StringBuilder ans = new StringBuilder();

        for(char c:st)
         ans.append(c);
         
         
         return ans.toString();

    }









    // String removeDuplicates(String str) {
    //   ArrayList<Character> list = new ArrayList<>();
    //   for(int i=0;i<str.length();i++){
    //       char ch=str.charAt(i);
    //       if(!list.contains(ch))
    //       list.add(ch);
    //   }
    //   String s="";
    //   for(var i:list)
    //   s=s+i;
      
    //   return s;

    // }










  

}
