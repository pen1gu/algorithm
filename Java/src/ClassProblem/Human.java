package ClassProblem;

public class Human {
	private String name;
	private int height;
	private int weight;
	
	public Human(String name, int height, int weight) {
		this.name = name;
		this.height = height;
		this.weight = weight;
	}
	
	public void weightGain(int weight) {
		this.weight += weight;
		System.out.println("체중이 "+weight+"만큼 증가하였습니다.");
	}
	
	public void weightLose(int weight) {
		this.weight -= weight;
		System.out.println("체중이 "+weight+"만큼 감소하였습니다.");
	}
	
	public void getInfo() {
		System.out.println(name+"님의 현재 신장은 "+height+"이며 현재 체중은 "+weight+"kg 입니다.");
	}
}