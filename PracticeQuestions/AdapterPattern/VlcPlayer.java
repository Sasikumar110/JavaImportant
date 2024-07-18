package AdapterPattern;

public class VlcPlayer implements AdvanceMediaPlayer{

    @Override
	public void playVlc(String filename) {
	
		System.out.println("play the vlc player :"+filename);
		
	}

    @Override
	public void playMp4(String filename) {
	
		
	}
	
	

}
