package dynamic_beat_14;

public class Track {

	private String titleImage; // ??ëª? ë¶?ë¶? ?´ë?¸ì?
	private String startImage; // ê²??? ???? ì°? ??ì§? ?´ë?¸ì?
	private String gameImage; // ?´ë?? ê³¡ì?? ?¤í?????? ?? ??ì§? ?´ë?¸ì?
	private String startMusic; // ê²??? ???? ì°? ????
	private String gameMusic; // ?´ë?? ê³¡ì?? ?¤í?????? ?? ????
	private String titleName; // ê³? ??ëª?
	
	public String getTitleImage() {
		return titleImage;
	}
	public void setTitleImage(String titleImage) {
		this.titleImage = titleImage;
	}
	public String getStartImage() {
		return startImage;
	}
	public void setStartImage(String startImage) {
		this.startImage = startImage;
	}
	public String getGameImage() {
		return gameImage;
	}
	public void setGameImage(String gameImage) {
		this.gameImage = gameImage;
	}
	public String getStartMusic() {
		return startMusic;
	}
	public void setStartMusic(String startMusic) {
		this.startMusic = startMusic;
	}
	public String getGameMusic() {
		return gameMusic;
	}
	public void setGameMusic(String gameMusic) {
		this.gameMusic = gameMusic;
	}
	
	public String getTitleName() {
		return titleName;
	}
	public void setTitlName(String titleName) {
		this.titleName = titleName;
	}
	
	public Track(String titleImage, String startImage, String gameImage, String startMusic, String gameMusic,String titleName) {
		super();
		this.titleName = titleName;
		this.titleImage = titleImage;
		this.startImage = startImage;
		this.gameImage = gameImage;
		this.startMusic = startMusic;
		this.gameMusic = gameMusic;
	}
	
}
