public class ComplexNumber {
  double real, img;

  ComplexNumber(double r, double i) {
    this.real = r;
    this.img = i;
  }

  ComplexNumber() {}

  ComplexNumber sum(ComplexNumber c1, ComplexNumber c2) {
    ComplexNumber temp = new ComplexNumber();
    temp.real = c1.real + c2.real;
    temp.img = c1.img + c2.img;
    return temp;
  }

  public static void main(String[] ar) {
    ComplexNumber c1 = new ComplexNumber(2.5, 5.2);
    ComplexNumber c2 = new ComplexNumber(3.2, 3.5);
    ComplexNumber temp1 = new ComplexNumber();

    temp1 = temp1.sum(c1, c2);
    System.out.println("sum is " + temp1.real + "+i" + temp1.img);
  }
}
