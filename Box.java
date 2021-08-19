
public class Box {
	
	private double width;
	private double height;
	private double depth;
	private String color; //blue, green, black, etc.
	private String material; //(can be plastic, paper, etc), 
	private boolean isReusabe;
	
	public Box(double width, double height, double depth, String color, String material, boolean isReusabe) {
		super();
		this.width = width;
		this.height = height;
		this.depth = depth;
		this.color = color;
		this.material = material;
		this.isReusabe = isReusabe;
	}

	public Box(double width, double height, double depth) {
		super();
		this.width = width;
		this.height = height;
		this.depth = depth;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getDepth() {
		return depth;
	}

	public void setDepth(double depth) {
		this.depth = depth;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public boolean isReusabe() {
		return isReusabe;
	}

	public void setReusabe(boolean isReusabe) {
		this.isReusabe = isReusabe;
	}

	public double calculateVolume() {
		return width*depth*height;
	}
	
	@Override
	public String toString() {
		return "Box [width=" + width + ", height=" + height + ", depth=" + depth + ", color=" + color + ", material="
				+ material + ", isReusabe=" + isReusabe + "]";
	}
	
	
	

}
