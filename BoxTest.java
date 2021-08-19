
public class BoxTest {

	public static void main(String[] args) {
 
		Box b1 = new Box(10, 1.2, 5.5);
		b1.setMaterial("plastic");
		Box b2 = new Box(50, 2, 5.5);
		b2.setMaterial("paper");
		Box b3 = new Box(20, 12, 5.5, "blue", "wood", true);
		Box b4 = new Box(20, 10, 5.5, "red", "plastic", true);

		System.out.println(b1);
		System.out.println(b1.toString());
        System.out.println(b1.calculateVolume());
        
        int [] numbers = {6, 7, 8, 1, 77};
        
        Box [] boxes = {b1, b2, b3, b4};
        System.out.println();
        // for-each loop
        for (Box b: boxes) {
        	System.out.println(b);
            System.out.println(b.calculateVolume());
            System.out.println(b.getMaterial());	
        	
        }
         //how many plastic boxes
        int count = 0;
        for (Box b: boxes) {
        	if (b.getMaterial().equals("plastic"))
        	   count ++;
        	
        }
		System.out.println("There are " + count + " plastic boxes");
	}

}
