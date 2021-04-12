public class BufferedOut extends Decorator {

    public BufferedOut(FileOut delegate) {
        super(delegate);
    }

    @Override
    public void write(String data) {
        String bufferedData = buffer(data);
        super.doDelegate(bufferedData);
    }

    private String buffer(String data){
        return "Buffered " + data;
    }
}
