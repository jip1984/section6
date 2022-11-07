public class ArraysLoops {
    public static void main(String[] args) {
        String[] kingdoms = {"Mercia","Wessex","Northumbria", "EA"};

        System.out.println(kingdoms.length);

        for (int i = 0; i < kingdoms.length; i++){
            System.out.println("The element at " + i + " is " + kingdoms[i]);
        }
    }
}
