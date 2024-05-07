package code1_1;

public class Hero {
	//カプセル化　直接外から触れないように
	private String name;
	private int hp,mp;
	
	public String toString() {
		return "勇者(名前=" + this.name + "/HP=" + this.hp + "/MP=" + this.mp + ")";
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setHp(int hp) {
		this.hp = hp;
	}
	
	public void setMp(int mp) {
		this.mp = mp;
	}
}
