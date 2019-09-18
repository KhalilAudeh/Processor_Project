public class ALU {

	public static String operation(Register e, Register a, ControlUnit t) {
		String s = "";
		String sixteen = "0000000000000000";
		try {
			if (t.getFunction().equals("00")) {
				int i = Integer.parseInt(e.getSize(), 2) + Integer.parseInt(a.getSize(), 2);
				s = Integer.toBinaryString(i);
				int len = s.length();
				if (len < 16) {
					s = sixteen.substring(0, 16 - len).concat(s);
				} else {
					s = s.substring(len - 16);
				}
				return s;
			} else if (t.getFunction().equals("01")) {
				int i = Integer.parseInt(e.getSize(), 2) - Integer.parseInt(a.getSize(), 2);
				s = Integer.toBinaryString(i);
				int len = s.length();
				if (len < 16) {
					s = sixteen.substring(0, 16 - len).concat(s);
				} else {
					s = s.substring(len - 16);
				}
				return s;
			} else if (t.getFunction().equals("10")) {
				int i = Integer.parseInt(e.getSize(), 2) / Integer.parseInt(a.getSize(), 2);
				s = Integer.toBinaryString(i);
				int len = s.length();
				if (len < 16) {
					s = sixteen.substring(0, 16 - len).concat(s);
				} else {
					s = s.substring(len - 16);
				}
				return s;
			} else if (t.getFunction().equals("11")) {
				int i = Integer.parseInt(e.getSize(), 2) * Integer.parseInt(a.getSize(), 2);
				s = Integer.toBinaryString(i);
				int len = s.length();
				if (len < 16) {
					s = sixteen.substring(0, 16 - len).concat(s);
				} else {
					s = s.substring(len - 16);
				}
				return s;
			}
		} catch (ArithmeticException m) {
			System.err.println("Error");
		}
		return s;
	}
}
