public class Complex {
	private double real;
	private double imag;

	public Complex(double real, double imag) {
		this.real = real;
		this.imag = imag;
	}

	public Complex add(Complex c) {
		double re = this.real + c.real;
		double im = this.imag + c.imag;

		Complex res = new Complex(re, im);

		return res;
	}

	/**
	 * substract a complex number from another.
	 */
	sub

	public String toString() {
		return "" + real + " + " + imag + "i";
	}
}