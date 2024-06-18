class Testone {
    public static void main(String[] args) {
        System.out.println(10/2);
        try {
            System.out.println(10/0);
        } catch (ArithmeticException e) {
            System.out.println(e);// This will catch the exception and print it
            System.out.println(10/1);
        }
        System.out.println(10/5);
    }
}
