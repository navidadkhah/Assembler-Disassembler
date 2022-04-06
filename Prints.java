public class Prints {
    public static void printR(String types, String op, String rs, String rt, String rd, String shamt, String funct) {
        System.out.println(types);
        System.out.println("op: " + op);
        System.out.println("rs: " + rs);
        System.out.println("rt: " + rt);
        System.out.println("rd: " + rd);
        System.out.println("shamt: " + shamt);
        System.out.println("funct: " + funct);
        System.out.println("--------------------");
    } // Print R_type after assemble

    public static void printI(String types, String op, String rs, String rt, String imm) {
        System.out.println(types);
        System.out.println("op: " + op);
        System.out.println("rs: " + rs);
        System.out.println("rt: " + rt);
        System.out.println("Constant or Address: " + imm);
        System.out.println("--------------------");
    } // Print I_type after assemble

}
