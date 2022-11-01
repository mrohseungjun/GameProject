package dynamic_beat_14;

public class Track {

	private String titleImage; // ??�? �?�? ?��?��?
	private String startImage; // �??? ???? �? ??�? ?��?��?
	private String gameImage; // ?��?? 곡�?? ?��?????? ?? ??�? ?��?��?
	private String startMusic; // �??? ???? �? ????
	private String gameMusic; // ?��?? 곡�?? ?��?????? ?? ????
	private String titleName; // �? ??�?
	
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
