public class PrimitiveDataTypes {
    public static void main(String[] args){
        boolean flag = true;
        byte range = 124; //within [-128, 127].8-bit
        short temperature =-32768; //within [-32768, 32767].16-bit
        int speed = -4250000; //within [-231 to 231-1] (32-bit signed)
        int hexNumber = 0x2F; //0x represents hexadecimal
        int binNumber = 0b10010; //0b represents binary
        long exceed =  -42332200000L; // within [-263 to 263-1] (64-bit signed)
        float float_number = -42.31f; //single-precision 32-bit floating point.
        double number = -42.3; // double-precision 64-bit floating point
        double myDoubleScientific = 3.445e2; // 3.445*10^2
        char letter = '\u0051'; //Q
        char letter_two = 'P';
        String myString = "Programming is awesome!";
        System.out.println(flag);
        System.out.println(range);
        System.out.println("temperature:" + temperature);
        System.out.println("Hex number: " + hexNumber+"\nBin number: " + binNumber);
        System.out.println("float:" + float_number);
        System.out.println("myDoubleScientific: "+myDoubleScientific);
        System.out.println("char:"+letter+letter_two);
        System.out.println(myString);
        System.out.println("Java 8");
    }
}
