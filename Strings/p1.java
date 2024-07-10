public class p1 {
    public static void main(String[] args) {
        String str1 = "This is exercise 1";
        String str2 = "This is exercise 1";

        int res = str1.compareTo(str2);

        //it will give direct output in the form of boolean...........
        // System.out.println(str1.equalsIgnoreCase(str2));

        if(res == 0){
            System.out.println("\"" +str1 + "\""+" is equal to " + "\"" + str2 +"\"");
        }
        
    }
}
