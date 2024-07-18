package AdapterPattern;

public class MediaAdapter implements MediaPlayer{
	
	AdvanceMediaPlayer ans;

	public MediaAdapter(String audioType)
	{
		if(audioType.equalsIgnoreCase("vlc"))
		{
			ans=new VlcPlayer();
		}
		else if(audioType.equalsIgnoreCase("mp4"))
		{
			ans= new Mp4Player();
		}
	}

	public void play(String auidType, String fileName) {
		if(auidType.equalsIgnoreCase("vlc"))
		{
			ans.playVlc(fileName);
		}
		else if(auidType.equalsIgnoreCase("mp4")) {
			ans.playMp4(fileName);
		}
	}
	
	

}
