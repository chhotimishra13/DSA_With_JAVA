public class StringObject{
    public static void main(String[] args){
        //object literals
        String str =  "Star";
        System.out.println(str);

        //object objects
        String str1 = new String("I love Niet");
        System.out.println(str1);

        //find length
        int ln = str1.length();
        System.out.println(ln);

        //string trim
        System.out.println(str.trim()+str1.trim());

        System.out.println(str1.charAt(5));
        System.out.println(str1.substring(1,6));
        System.out.println(str.concat(str1));
        System.out.println(str1.toLowerCase());
        System.out.println(str1.toUpperCase());
        System.out.println(str.replace('a', 'h'));
        System.out.println(str1.contains("0"));
    }
}