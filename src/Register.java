import java.util.ArrayList;

public class Register {
	private String OpCode;
	private String size;

	public Register() {
		OpCode = "00";
		size = "0000000000000000";

	}

	public Register(String opCode, String size) {
		this.OpCode = opCode;
		this.size = size;

	}

	public String getOpCode() {
		return OpCode;
	}

	public void setOpCode(String opCode) {
		if (OpCode.length() == 2) {
			this.OpCode = opCode;
		} else {
			System.err.println("Wrong value");
		}
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public static ArrayList<Register> Registers = new ArrayList<>();

	public static Register getReg(String r) {
		try {
			for (int i = 0; i < Registers.size(); i++) {
				if (Registers.get(i).getOpCode().equals(r)) {
					return Registers.get(i);
				}
			}
		} catch (NullPointerException e) {
			System.out.println("Get Reg");
		}
		return null;
	}

	@Override
	public String toString() {
		return "Register [OpCode=" + OpCode + ", size=" + size + "]";
	}

}
