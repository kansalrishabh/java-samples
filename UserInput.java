import java.io.DataInputStream;
import java.io.IOException;

public class UserInput {
	public static void main(String[] args) throws IOException {
		DataInputStream dis = new DataInputStream(System.in);
		int num = dis.readInt();
		System.out.println(num);
	}
}