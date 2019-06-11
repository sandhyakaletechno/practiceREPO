import java.util.Arrays;
import java.util.List;

public class StringToArrayList {

	public static void main(String[] args) {
		String msg = "this is sandhya";
		String[] a= msg.split(",");
		List<String> list= Arrays.asList(a);
		System.out.println(list);
	}

}
