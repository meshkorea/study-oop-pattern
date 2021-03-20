package application.transcoder;

import java.io.File;

public interface Transcoder {
  String transcode(File source, File target);

}
