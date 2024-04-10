import java.sql.SQLOutput;

public class Variables {
    public static void main(String[] args) {

        // type variableName = value;

        String firstName = "Jake";
        String lastName = "Test";
        String fullName = firstName + lastName;
        System.out.println(fullName);


//        System.out.println("Hello " + name);

        int myNum = 15;
        myNum = 20; // myNum is now 20
        System.out.println(myNum);

        final int myNumUnchangeable = 16;
        myNumUnchangeable = 30; // will generate an error


        /*
        int x = 5;
        int y = 6;
        int z = 50;
        */

        int x = 5, y = 6, z = 50;
        System.out.println(x + y + z);


    }
}