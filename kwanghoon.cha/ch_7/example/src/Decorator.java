public abstract class Decorator implements FileOut{
    private FileOut delegate;

    public Decorator(FileOut delegate){
        this.delegate = delegate;   // 위임 대상
    }

    protected void doDelegate(String data){
        delegate.write(data);   //   delegate에 쓰기 위임
    }

}
