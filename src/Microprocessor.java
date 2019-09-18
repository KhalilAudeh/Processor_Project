import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Microprocessor {

	public static void main(String[] args) {
		Random generator = new Random();
		Scanner scan = null;
		int i = generator.nextInt();
		int j = generator.nextInt();
		String s = Integer.toBinaryString(i);
		String t = Integer.toBinaryString(j);
		PC pc = new PC();
		int v,b,n;
		Register source1 = new Register("01", s.substring(0, 16));
		Register source2 = new Register("11", t.substring(0, 16));
		Register Destination = new Register();
		v = Integer.parseInt(source1.getSize(),2);
		b = Integer.parseInt(source2.getSize(),2);
		n = Integer.parseInt(Destination.getSize(),2);
		Register.Registers.add(source1);
		Register.Registers.add(source2);
		Register.Registers.add(Destination);
		for (int y = 0; y < Register.Registers.size(); y++) {
			if (Register.Registers.get(y).getOpCode().equals("10")) {
				System.out.println("The PC is: ");
			}
			if (Register.Registers.get(y).getOpCode().equals("00")) {
				System.out.println("The Destination Register is: ");
			} else if (!Register.Registers.get(y).getOpCode().equals("00")
					&& !Register.Registers.get(y).getOpCode().equals("10")) {
				System.out.println("Source Register: ");
			}
			System.out.print(Register.Registers.get(y) + "\n\n");
		}
		System.out.println();
		System.out.println("Decimal value for the First source: ");
		System.out.print(v + "\n");
		System.out.println();
		System.out.println("Decimal value for the Second source: ");
		System.out.print(b + "\n");
		System.out.println();
		System.out.println("Decimal value for the Destination: ");
		System.out.print(n + "\n");
		System.out.println();
		try {
			scan = new Scanner(new File("Questions.txt"));

		} catch (FileNotFoundException e) {
			System.err.println("File not found.");
		}
		String FirstQ = scan.next();
		String SecondQ = scan.next();
		String ThirdQ = scan.next();
		String FourthQ = scan.next();
		System.out.println("The original address of PC: ");
		System.out.println(pc.getPc().getSize());
		System.out.println();
		InstructionMemory.readInstruction(FirstQ);
		pc.Increment();
		System.out.println("After loading the First instruction:");
		System.out.println(pc.getPc().getSize());
		System.out.println();
		System.out.println("First Output: ");
		System.out.println(Destination.getSize());
		System.out.println();
		int p = Integer.parseInt(Destination.getSize(),2);
		System.out.println(p + " is the decimal value");
		System.out.println();
		InstructionMemory.readInstruction(SecondQ);
		pc.Increment();
		System.out.println("After loading the Second instruction: ");
		System.out.println(pc.getPc().getSize());
		System.out.println();
		System.out.println("Second Output: ");
		System.out.println(Destination.getSize());
		System.out.println();
		int fg = Integer.parseInt(Destination.getSize(), 2);
		System.out.println(fg + " is the decimal value");
		System.out.println();
		InstructionMemory.readInstruction(ThirdQ);
		pc.Increment();
		System.out.println("After loading the Third instruction: ");
		System.out.println(pc.getPc().getSize());
		System.out.println();
		System.out.println("Third Output: ");
		System.out.println(Destination.getSize());
		System.out.println();
		int jk = Integer.parseInt(Destination.getSize(), 2);
		System.out.println(jk + " is the decimal value");
		System.out.println();
		InstructionMemory.readInstruction(FourthQ);
		pc.Increment();
		System.out.println("After loading the Fourth instruction: ");
		System.out.println(pc.getPc().getSize());
		System.out.println();
		System.out.println("Last output: ");
		System.out.println(Destination.getSize());
		System.out.println();
		int jh = Integer.parseInt(Destination.getSize(), 2);
		System.out.println(jh + " is the decimal value");
	}
}
