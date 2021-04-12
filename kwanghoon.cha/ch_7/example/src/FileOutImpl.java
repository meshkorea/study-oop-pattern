/*
*   실제 파일 출력 기능의 구현체
* */
public class FileOutImpl implements FileOut {

    @Override
    public void write(String data) {
        System.out.println("Write '" + data + "'");
    }
}
