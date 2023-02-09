package week11;

public class Point3D extends Point2D{
	private float z = 0.0f;
	
	
	
	public Point3D() {
		super();
		this.z = 0;
	}
	public Point3D(float x,float y, float z) {
		super(x,y);
		this.z = z;
	}
	public float getZ() {
		return z;
	}
	public void setZ(float z) {
		this.z = z;
	}
	public void setXYZ(float x,float y, float z) {
		super.setX(x);
		super.setY(y);
		this.z = z;

	}
	public float[] getXYZ() {
		float [] result = new float[3];
		result[0] = super.getX();
		result[1] = super.getY();
		result[2] = this.z;
		return result;

		
	}
	@Override
	public String toString() {
		return super.toString()+", and "+getZ();
	}
			
			
			
}
