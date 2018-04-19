public class InterfaceDemo {
	public static void main(String[] args) {
		Cycle kc = new KansalCycle();
		kc.jump();
		kc.udo();
		
		GenericCycle gc = new SelfDrivingCycle();
		gc.jump();
		gc.udo();
		gc.swim();
	}
}