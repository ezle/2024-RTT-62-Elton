package Slides303_3_3;

public class StringExample {
    public static void main(String[] args) {
        String str = "Whatever you want to type in this string is okay.";

        System.out.println("The length of the string = " + str.length());

        String str2 = str.toUpperCase();

        System.out.println(str);
        System.out.println(str2);

        //                  0123456789
        //  string in second part of substring will come back with A
        //  Difference between string is mutable and string buffer


        String filename = "Hello.java";

        System.out.println("The file name is " + filename + " and the length is " + filename.length());

        System.out.println("The period is at index " + filename.indexOf('.'));

        System.out.println("The file extension is " + filename.substring( filename.indexOf('.') + 1));
        System.out.println("The name of the file is " + filename.substring(0, filename.lastIndexOf('.')));
    }
}
