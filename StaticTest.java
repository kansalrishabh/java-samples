public class StaticTest {
	public static void main(String[] args) {
		KansalCycles jp = new KansalCycles();
		KansalCycles ap = new KansalCycles();
		KansalCycles mp = new KansalCycles();

		jp.serialNum = "001";

		System.out.println(jp.tag +", "+ jp.modelNum + ", " + jp.serialNum);
		System.out.println(ap.tag +", "+ ap.modelNum + ", " + ap.serialNum);
		System.out.println(mp.tag +", "+ mp.modelNum + ", " + mp.serialNum);
	}
}