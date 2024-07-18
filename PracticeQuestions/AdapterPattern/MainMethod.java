package AdapterPattern;

public class MainMethod {
	
	public static void main(String[] args) {
		AudioPlayer audi= new AudioPlayer();
		audi.play("vlc", "haradeva.vlc");
		audi.play("mp4", "raja.mp4");
		audi.play("mp3", "aliya.mp3");
	}

}
