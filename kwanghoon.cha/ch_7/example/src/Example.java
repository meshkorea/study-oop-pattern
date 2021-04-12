public class Example {
    public static void main(String [] args){
        FileOut delegate = new FileOutImpl();

        FileOut fileOut1 = new EncryptionOut(new BufferedOut(new ZipOut(delegate)));
        fileOut1.write("plain text");

        FileOut fileOut2 = new ZipOut(new EncryptionOut(new BufferedOut(delegate)));
        fileOut2.write("plain text");
    }
}
