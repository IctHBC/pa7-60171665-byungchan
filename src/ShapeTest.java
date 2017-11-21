/* �̸�:�Ѻ���
 * �й�:60171665
 * ���α׷� ����: abstract class��  Shape Ŭ������ �̿��Ͽ� Drawable�� �����ϸ� Shape�� ���� Ŭ������ Rectangle,Circle�� Shape�� ��ӽ��Ѽ�  
 * Rectangle,Circle�� ��ǥ,����,���̸� ����ϰ� ����ϴ� ���α׷��̴�. 
 */
public class ShapeTest {

	public static void main(String[] args) {
		Shape[] shapes = new Shape[3];
		shapes[0] = new Rectangle(10,20,30,40);
		shapes[1] = new Rectangle(30,30,10,10);
		shapes[2] = new Circle(50,20,30);
		shapes[0].measure();
		shapes[1].measure();
		shapes[2].measure();
		System.out.println(((Rectangle)shapes[0]).showRectangle()+"-"+ shapes[0].showRectangle1());
		System.out.println(((Rectangle)shapes[1]).showRectangle()+"-"+ shapes[1].showRectangle1());
		System.out.println(((Circle)shapes[2]).showCircle()+"-"+ "radius"+((Circle)shapes[2]).getRadius());
		
		Drawable[] drawables = new Drawable[4];
		for(int i = 0; i<shapes.length; i++) {
			drawables[i] = (Drawable)shapes[i];
		}
		drawables[3] = new Text("Sample Text");
		for(Drawable d: drawables) {
			d.draw();
		}
		System.out.println("Sample Text");
	}
}

	 