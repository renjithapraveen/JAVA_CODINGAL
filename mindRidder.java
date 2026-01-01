class mindRidder{
    public static void main (String[] args) {
        int a=10;
        int b=5;
        System.out.println("a = "+ a + "Unary opertor a:" + a++);
        System.out.println("b = " + b +"Unary opertor b:" + ++b);
        int increment = a++ + ++b;
        System.out.println("Expression a++ + ++ b =" + increment);
    }
}