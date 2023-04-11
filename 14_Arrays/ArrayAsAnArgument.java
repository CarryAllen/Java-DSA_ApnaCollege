//this program is to know how to pass an array as an argument

//which is pass by value and paas by reference

public class ArrayAsAnArgument {

    public static void update (int marks[], int nonChangable) {
        nonChangable = 10;
        for (int i=0; i<marks.length; i++) {
            marks[i] = marks[i] + 1;
        }
    }
    public static void main(String[] args) {
        int marks[] = {97,98,99};
        int nonChangable = 5;
        update(marks, nonChangable);
        System.out.println(nonChangable);

        //print
        for (int i=0; i<marks.length; i++) {
            System.out.print(marks[i]+" ");
        }
        System.out.println();
    }
}
