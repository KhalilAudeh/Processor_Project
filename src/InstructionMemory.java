import java.util.NoSuchElementException;

public class InstructionMemory {
	public static void readInstruction(String instruction) {
		try {
			ControlUnit e = new ControlUnit(instruction.substring(0, 2));
			Register source1 = Register.getReg(instruction.substring(4, 6));
			Register source2 = Register.getReg(instruction.substring(6, 8));
			String result = ALU.operation(source1, source2, e);
			if (Register.getReg(instruction.substring(2, 4)) != null) {
				Register.getReg(instruction.substring(2, 4)).setSize(result);

			}
		} catch (NoSuchElementException e) {
			System.err.println("Wrong format of Register.");
		}
	}
}
