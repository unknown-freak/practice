package gitlabprac;

import gitlabprac.red;

public class red {
	String color;
	red(String color)
	{
		this.color=color;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		red greenApple = new red("green");
		String color = greenApple.getColor();
		System.out.println("color of apple is "+ color);

	}

}
