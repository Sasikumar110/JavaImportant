package AdapterPattern;

public class AudioPlayer  implements MediaPlayer{
	
	MediaAdapter media;


	public void play(String auidType, String fileName) {
        
		if(auidType.equalsIgnoreCase("mp3"))
		{
			System.out.println("playing mp3 file :" +fileName);
		}
		else if(auidType.equalsIgnoreCase("vlc")||auidType.equalsIgnoreCase("mp4"))
		{
			media=new MediaAdapter(auidType);
			media.play(auidType, fileName);
		}
		else
		{
			System.out.println("invaid media :"+auidType);
		}
		
	}
	

}
