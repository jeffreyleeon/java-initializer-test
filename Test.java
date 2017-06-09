class Test {
    static {
        System.out.println("This is a static initializer");
    }

    {
        System.out.println("This is a non-static initializer");
    }

    public static void main(String[] args) {
        System.out.println("This is the main function");
        Test t = new Test();
    }
}