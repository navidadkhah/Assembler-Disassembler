import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to this program");
        System.out.println("Please enter your cmd (Assembler/Diassembler) :");
        String op = scanner.nextLine();
        if (op.equals("Assembler")) {
            while (scanner.hasNext()) {
                String assemble = scanner.nextLine();
               Assembler.assembler(assemble);
            }
        } else {
            while (scanner.hasNext()) {
                String disassemble = scanner.nextLine();
                Diassembler.disassembler(disassemble);
            }
        }


    } //Done
}