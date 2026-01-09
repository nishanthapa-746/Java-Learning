//1st practice. and operation 
public class bits {

    public static void main(String args[]) {

        int n = 5;
        int pos = 2;
        int bitMask = 1<< pos;

        if ((bitMask & n) == 0) {
            System.out.print("Bit is zero");
        } else {
            System.out.print("Bit is not zero");
        }
    }
}
