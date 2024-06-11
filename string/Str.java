package string;

public class Str {

    public int lengthOfLongestSubstring(String s) {
        System.out.println(s.length());

        String longestSubstring = "";
        String newStr ="";
        for (String sa : s.split("") ){
          
            if(newStr.contains(sa) ){
                System.out.println(newStr);
                if(newStr.length()>longestSubstring.length()){
                        longestSubstring= newStr;
                    }
                newStr=sa;
            }
            else{
                newStr +=sa;
            }
        }
        if(longestSubstring.length()==0){
            longestSubstring=newStr;
        }
        System.out.println(longestSubstring);
        System.out.println(longestSubstring.length());
        return longestSubstring.length();
        
    }

    public static void main(String[] args) {

    //     String s= "Dipu";
        
    // //   StringBuffer sa = new StringBuffer("Dipu");
    // //     System.out.println(sa.hashCode());
    // //     String[] st= s.split("");
    // //    for(String ss:st){
    // //     System.out.println(ss);
    // //    }

    //    StringBuilder sa = new StringBuilder(s);
    //    sa.reverse();
    //    s =new String(sa);
    //    System.out.println(s);

    Str s = new Str();
    s.lengthOfLongestSubstring("a");

    }
}