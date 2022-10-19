 class Task6 {
  
    public static void main(String[] args) {
        String s1 = "Rachel";
        String s2 = "Rachel";
        String s3 = new String("Rachel");
        String s4 = new String("Rachel");
  
        System.out.println(s1 == s2);
        System.out.println(s1 == s3); 
        System.out.println(s3 == s4); 

    }
}