public class Vars {
    public static void main(String args[]){
        int x=150;
        double y=2.0;
        float z=20f;
        byte b=10;
        short c=14;
        y=c;
        System.out.println("y=" + y);
    }
}

/* Comms:
* Compile and run the code, works, shows 150
* Experiment with converting one variable type to another, similar to the instruction
y = x. Note your observations: 1)Tried to set a different way of display using "System.out.println("y=" + y);" to show the result in a fancier way
2) No matter who we changes the y with, it will take the newly assigned value
* If we change double to Double the code crashes, caps sensitive, tries to use a class Double instead of double value
*/