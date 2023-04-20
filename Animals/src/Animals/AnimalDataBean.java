package Animals;

public class AnimalDataBean {
	
	//フィールド変数
	private String animalName;
	private double height;
	private int speed;
	private String scientificName;
	
	//動物名
	public void setAnimalName(String animalName) {
		this.animalName = animalName;
	}
	public String getAnimalName() {
		return this.animalName;
	}
	
	//体長
	public void setHeight(double height) {
		this.height = height;
	}
	public double getHeight() {
		return this.height;
	}
	
	//速度
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public int getSpeed() {
		return this.speed;
	}
	
	//学名
	public void setScienticName(String scienticName) {
		this.scientificName = scientificName;
	}
	public String getScienticName() {
		return this.scientificName;
	}
}
