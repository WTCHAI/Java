public class App {
    public void main(String[] args) {
        Sandwich sandwich1 = new Sandwich();
        System.out.println("Hello hei");

        sandwich1.CreatingSandwhich("White bread", "Black bread", "Tomato source", 300);
        sandwich1.LogsSandwich();
    }
}

// public class App {
//     public static void main(String[] args) {
//         Sandwich sandwich1 = new Sandwich();
//         System.out.println("Hello, World!");
//         sandwich1.createSandwich("White bread", "Black bread", "Tomato sauce", 300);
//         sandwich1.logSandwich();
//     }
// }