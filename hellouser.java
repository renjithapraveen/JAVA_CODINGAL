import java.util.Scanner;
class hellouser{
    public static void main(String[] args) {
        Scanner scn= new Scanner(System.in);
        System.out.println("Enter a name");
        String str =scn.nextLine();
        System.out.println("The string is :"+str);
        System.out.println("Enter an integer");
        int num =scn.nextInt();
        System.out.println("Number is " +num);
        System.out.println("Enter float number");
        float fnum=scn.nextFloat();
        System.out.println("The floating number is "+fnum);
        scn.close();
    }
}