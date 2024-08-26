public class Array_To_String {
    public static void main(String[] args) {
        String[] arr = new String[]{
          "my name is", "Harsh kumar", "and" ,"i am study in the", "AVIT college" ,"chennai "
        };
        StringBuilder sb = new StringBuilder();
        for (String string : arr) {
         sb.append(string).append(" ");
        }
        System.out.println(sb);
      }
}




