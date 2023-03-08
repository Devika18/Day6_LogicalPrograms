public class ReverseElement {
    public static void main(String[] args) {
        System.out.println("Original array: ");
        int [] b = new int [] {1,2,3,4,5,6};
        for(int j=0;j<b.length;j++)
        {
            System.out.print(b[j] + " ");
        }
        System.out.println();
        System.out.println("Elements of an array in reverse order: ");

        //Using reverse logic in for loop to get expected result
        for(int i=b.length-1; i>=0; i--)
        {
            System.out.print(b[i] + " ");

        }
    }
}
