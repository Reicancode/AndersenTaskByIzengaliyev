package andersen;

public class Main {
    public static void main(String[] args) {
        System.out.println("\n\n\n");
        System.out.println("\nHello, welcome to Andersen task solution by Izengaliyev Danat\n");

        TaskMethods.enterNum();
        TaskMethods.enterName();
        TaskMethods.enterArr();

        /* [((())()(())]] is incorrect because there is 2 closing ]] and 1 [ .
           also the first ( don't have closing one. in sequence, we need symmetric from both sides.
           so the correct answer is [(())()(())] or [[((())()(()))]] .
        */
    }
}
