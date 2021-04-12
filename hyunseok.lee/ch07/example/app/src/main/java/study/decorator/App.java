package study.decorator;

public class App {
    public static void main(String[] args) {
        FileOut delegate = new FileOutImpl();
        FileOut fileOut = new EncryptionOut(delegate);
        fileOut.write(data);
    }
}
