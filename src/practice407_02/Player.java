package practice407_02;

public class Player {

	public void play(MusicCD cd) {
		cd.display();
		System.out.println("　を聞いています。");

	}

	public void play(GameCD cd) {
		cd.display();
		System.out.println("　で遊んでいます。");

	}
}
