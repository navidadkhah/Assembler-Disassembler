import java.util.HashMap;

public class Maps {

    public static HashMap<String, String> R_types = new HashMap<String, String>() {{
        put("add", "100000");
        put("addu", "100001");
        put("and", "100100");
        put("break", "001101");
        put("div", "011010");
        put("divu", "011011");
        put("jalr", "001001");
        put("jr", "001000");
        put("mfhi", "010000");
        put("mflo", "010010");
        put("mthi", "010001");
        put("mtlo", "010011");
        put("mult", "011000");
        put("multu", "011001");
        put("nor", "100111");
        put("or", "100101");
        put("sll", "000000");
        put("sllv", "000100");
        put("slt", "101010");
        put("sltu", "101011");
        put("sra", "000011");
        put("srav", "000111");
        put("srl", "000010");
        put("srlv", "000110");
        put("sub", "100010");
        put("subu", "100011");
        put("syscall", "001100");
        put("xor", "100110");
    }};  // R_types Done

    public static HashMap<String, String> I_types = new HashMap<String, String>() {{
        put("addi", "001000");
        put("addiu", "001001");
        put("andi", "001100");
        put("beq", "000100");
        put("bgez", "000001");
        put("bgtz", "000111");
        put("blez", "000110");
        put("bltz", "000001");
        put("bne", "000101");
        put("lb", "100000");
        put("lbu", "100100");
        put("lh", "100001");
        put("lhu", "100101");
        put("lui", "001111");
        put("lw", "100011");
        put("lwc1", "110001");
        put("ori", "001101");
        put("sb", "101000");
        put("slti", "001010");
        put("sltiu", "001011");
        put("sh", "101001");
        put("sw", "101011");
        put("swc1", "111001");
        put("xori", "001110");
    }};  // I_types Done

    public static HashMap<String, String> J_types = new HashMap<String, String>() {{
        put("j", "000010");
        put("jal", "000011");
    }};  // J_types Done

}
