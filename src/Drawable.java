/* �̸�:�Ѻ���
 * �й�:60171665
 * ���α׷� ����: abstract class��  Shape Ŭ������ �̿��Ͽ� Drawable�� �����ϸ� Shape�� ���� Ŭ������ Rectangle,Circle�� Shape�� ��ӽ��Ѽ�  
 * Rectangle,Circle�� ��ǥ,����,���̸� ����ϰ� ����ϴ� ���α׷��̴�. 
 */
public interface Drawable{
	void draw();
}
abstract class Shape {
	abstract void area(); 
	abstract void length();
	
	void measure() {
		area();
		length();
		System.out.println();
	}
	public String showRectangle1() {
		return null;
	}
	}

class Rectangle extends Shape implements Drawable {
	double side;
	double height;
	double x;
	double y;
	
	Rectangle(double x, double y, double s, double h) {
		this.x = x;
        this.y = y;
		side = s;
		height =h;
	}
	void area() {
		System.out.println("Area:" + (side*height));
	}
	void length() {
		System.out.println("Length:" + 2*(side + height));
	}
	 
	public String showRectangle() {
		return "Rectangle"+"("+this.x+","+ this.y +")";
	}
	public String showRectangle1() {
		return "("+((int)this.x + side)+","+((int)this.y+height)+")";	
	}
	
	public void draw() {		 	 	
	}
}

class Circle extends Shape implements Drawable {
	final double pi = 3.1415;
	double radius;
	double x;
	double y;
	
	Circle(double x, double y, double r){
		this.x = x;
        this.y = y;
		radius = r;
	}
	void area() {
		System.out.println("Area:"+Math.round((radius*radius*pi)*10)/10.0);
	}
	void length() {
		System.out.println("length:"+Math.round((2*radius*pi)*10)/10.0);
	}
	public String showCircle() {
		return "Circle center"+"("+this.x+","+ this.y +")";
	}
	public String getRadius() {
		return "("+radius+")";
	}
	public void draw() {
		 
	}
}
class Text implements Drawable {
	public Text(String string) {	
	}
	public void draw() {
	}

}

 