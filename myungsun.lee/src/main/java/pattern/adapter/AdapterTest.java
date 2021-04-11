package pattern.adapter;

/**
 * 이미 제공되어 있는것과 필요한 것 사이의 차이를 없애주는 디자인 패턴
 * 기존의 클래스를 전혀 수정하지 않고 목적한 인터페이스에 맞추려는것
 * 이미 제공되어 있는 것을 그대로 사용할 수 없을때 필요한 형태로 교환하고 사용하는 일이 자주 발생
 *
 * 클래스에 의한 Adapter(상속을 사용한 Adapter패턴)
 * 인스턴스에 의한 Adapter(위임을 사용한 Adapter패턴)
 *
 */
public class AdapterTest {

  public static void main(String[] args) {
    MediaPlayer player = new MP3();
    player.play("file MP3");

    player = new FormatAdapter(new MP4());
    player.play("file MP4");

    player = new FormatAdapter(new MKV());
    player.play("file MKV");
  }
}
