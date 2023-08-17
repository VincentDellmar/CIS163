public class Vector3 extends Main
{
    // instance variables - replace the example below with your own
    public double x;
    public double y;
    public double z;

    /**
     * Constructor for objects of class Vector3
     */
    public Vector3(double _x, double _y, double _z)
    {
        x = _x;
        y = _y;
        z = _z;
    }
    // Mul Methods
    public Vector3 Mul(Vector3 vec3) {
        return new Vector3(this.x * vec3.x, this.y * vec3.y, this.z * vec3.z);
    };
    public Vector3 Mul(double v) {
        return new Vector3(this.x * v, this.y * v, this.z * v);
    };
    // Div Methods
    public Vector3 Div(Vector3 vec3) {
        return new Vector3(this.x / vec3.x, this.y / vec3.y, this.z / vec3.z);
    };
    public Vector3 Div(double v) {
        return new Vector3(this.x / v, this.y / v, this.z / v);
    };
    // Add Method
    public Vector3 Add(Vector3 vec3) {
        return new Vector3(this.x + vec3.x, this.y + vec3.y, this.z + vec3.z);
    };
    // Sub Method
    public Vector3 Sub(Vector3 vec3) {
        return new Vector3(this.x - vec3.x, this.y - vec3.y, this.z - vec3.z);
    };
    // Avg Method
    public double Avg() {
        return (this.x + this.y + this.z) / 3.0;
    };
    
}
