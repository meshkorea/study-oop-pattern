public class ZipOut extends Decorator {
    public ZipOut(FileOut delegate) {
        super(delegate);
    }

    @Override
    public void write(String data) {
        String bufferedData = zip(data);
        super.doDelegate(bufferedData);
    }

    private String zip(String data){
        return "Zipped " + data;
    }
}
