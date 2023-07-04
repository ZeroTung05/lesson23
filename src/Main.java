public class Main {
    public static void main(String[] args)  {
        StringBuilder sb = new StringBuilder("Hello");
        System.out.println(sb.toString());
        sb.append(" my").append(" friend");
        System.out.println(sb.toString());
        System.out.printf("String %10d \n",512);
        System.out.printf("String %10d \n",12331222);
        System.out.printf("String %10d \n",51231212);
        System.out.printf("String %10d \n",511232112);
        System.out.printf("String %.2f \n",51.1232112);
    }
}