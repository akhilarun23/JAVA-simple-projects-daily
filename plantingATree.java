public class Tree {
    public static void main(String[] args) throws InterruptedException {
   
        System.out.println("Hey there, I'm Akhil and I'm learning to code in Java!");
        System.out.println("We are going to plant a tree today...\n");

     
        plantTree();
    }


    public static void plantTree() throws InterruptedException {
        String[] tree = {
            "   *   ",
            "  ***  ",
            " ***** ",
            "*******",
            "   *   ",
            "   *   ",
            "   *   "
        };

        
        for (String line : tree) {
            System.out.println(line);
            Thread.sleep(500);
        }
    }
}
