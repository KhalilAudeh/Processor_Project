
public class PC {
	private Register pc;

	public PC() {
		pc = new Register("10", "0000000000000000");
		Register.Registers.add(pc);
	}

	public void Increment() {
		try {
			String g = "0000000000001000";
			int i = Integer.parseInt(pc.getSize(), 2) + Integer.parseInt(g, 2);
			String s = Integer.toBinaryString(0x10000 | i).substring(1);
			pc.setSize(s);
		} catch (NumberFormatException e) {
			System.out.println("PC Error.");
		}
	}

	public Register getPc() {
		return pc;
	}

	public void setPc(Register pc) {
		this.pc = pc;
	}

}
