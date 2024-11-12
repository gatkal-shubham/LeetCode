public class ReverseWordsInString {
    public static void main(String[] args) {

        String s="the sky is blue";
        System.out.println(reverseWords(s));;
    }
    static String reverseWords(String s) {
        String[] strArray=s.split(" +");
        StringBuilder sb=new StringBuilder();
        for(int i=strArray.length-1;i>=0;i--){
            sb.append(strArray[i]);
            sb.append(" ");
        }
        return sb.toString().trim();
    }
}

