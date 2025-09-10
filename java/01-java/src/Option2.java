public class Option2 {
    public static void main(String[] args) {
        for (int i=1; i<=100;i++){
            String y = "";

            if(i%3==0) y+="fizz";
            if (i%5==0) y+="buzz";

            if (y.isEmpty()){
                y = String.valueOf(i);
            }

            System.out.println(y);
        }
    }
}
