package drawableItems;

public class Structure implements IStructure {

	String name;

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.print("Base Structure draw method. \n");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
