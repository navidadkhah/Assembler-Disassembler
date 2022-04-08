public class Assembler {
    public static void assembler(String assemble) {
        String[] parts = assemble.split(" ");
        boolean is_check = false;
        boolean isR_type = false;
        boolean isI_type = false;
        boolean isJ_type = false;
        String Rfunc = "";
        String Iop = "";
        String Jop = "";
        String op = "";
        String rs = "";
        String rt = "";
        String rd = "";
        String shamt = "";
        String imm = "";
        int size;

        for (int i = 0; i < Maps.R_types.size(); i++) {
            if (Maps.R_types.containsKey(parts[0])) {
                isR_type = true;
                Rfunc = Maps.R_types.get(parts[0]);
                break;
            }
        }  // Check if it's a R_Type Done

        for (int i = 0; i < Maps.I_types.size(); i++) {
            if (Maps.I_types.containsKey(parts[0])) {
                isI_type = true;
                Iop = Maps.I_types.get(parts[0]);
                break;
            }
        }  // Check if it's a I_Type Done

        for (int i = 0; i < Maps.J_types.size(); i++) {
            if (Maps.J_types.containsKey(parts[0])) {
                isJ_type = true;
                Jop = Maps.J_types.get(parts[0]);
                break;
            }
        }  // Check if it's a J_Type Done

        if (isR_type) {
            if (parts[0].equals("syscall")) {
                is_check=true;
                String num = "000000" + "00000" + "00000" + "00000" + "00000" + "001100";
                String hex = Convert.BintoHex(num);
                System.out.println("0x" + hex);
                Prints.printR("R-Type", "000000", "00000", "00000", "00000", "00000", "001100");
            } else if (parts[0].equals("break")) {
                is_check = true;
                String num = "000000" + "00000" + "00000" + "00000" + "00000" + "001101";
                String hex = Convert.BintoHex(num);
                System.out.println("0x" + hex);
                Prints.printR("R-Type", "000000", "00000", "00000", "00000", "00000", "001101");
            }

            if (parts[0].equals("add")) {
                rd = Find.find_dolar(parts[1]);
                rs = Find.find_dolar(parts[2]);
                rt = Find.find_dolar(parts[3]);
                shamt = "00000";
            }
            else if (parts[0].equals("addu")) {
                rd = Find.find_dolar(parts[1]);
                rs = Find.find_dolar(parts[2]);
                rt = Find.find_dolar(parts[3]);
                shamt = "00000";
            } else if (parts[0].equals("and")) {
                rd = Find.find_dolar(parts[1]);
                rs = Find.find_dolar(parts[2]);
                rt = Find.find_dolar(parts[3]);
                shamt = "00000";
            } else if (parts[0].equals("div")) {
                rd = "00000";
                rs = Find.find_dolar(parts[1]);
                rt = Find.find_dolar(parts[2]);
                shamt = "00000";
            } else if (parts[0].equals("divu")) {
                rd = "00000";
                rs = Find.find_dolar(parts[1]);
                rt = Find.find_dolar(parts[2]);
                shamt = "00000";
            } else if (parts[0].equals("jalr")) {
                rd = Find.find_dolar(parts[1]);
                rs = Find.find_dolar(parts[2]);
                rt = "00000";
                shamt = "00000";
            } else if (parts[0].equals("jr")) {
                rs = Find.find_dolar(parts[1]);
                rd = "00000";
                rt = "00000";
                shamt = "00000";
            } else if (parts[0].equals("mfhi")) {
                rd = Find.find_dolar(parts[1]);
                rs = "00000";
                rt = "00000";
                shamt = "00000";
            } else if (parts[0].equals("mflo")) {
                rd = Find.find_dolar(parts[1]);
                rs = "00000";
                rt = "00000";
                shamt = "00000";
            } else if (parts[0].equals("mthi")) {
                rs = Find.find_dolar(parts[1]);
                rd = "00000";
                rt = "00000";
                shamt = "00000";
            } else if (parts[0].equals("mtlo")) {
                rs = Find.find_dolar(parts[1]);
                rd = "00000";
                rt = "00000";
                shamt = "00000";
            } else if (parts[0].equals("mult")) {
                rs = Find.find_dolar(parts[1]);
                rt = Find.find_dolar(parts[2]);
                rd = "00000";
                shamt = "00000";
            } else if (parts[0].equals("multu")) {
                rs = Find.find_dolar(parts[1]);
                rt = Find.find_dolar(parts[2]);
                rd = "00000";
                shamt = "00000";
            } else if (parts[0].equals("nor")) {
                rd = Find.find_dolar(parts[1]);
                rs = Find.find_dolar(parts[2]);
                rt = Find.find_dolar(parts[3]);
                shamt = "00000";
            } else if (parts[0].equals("or")) {
                rd = Find.find_dolar(parts[1]);
                rs = Find.find_dolar(parts[2]);
                rt = Find.find_dolar(parts[3]);
                shamt = "00000";
            } else if (parts[0].equals("sll")) {
                rd = Find.find_dolar(parts[1]);
                rt = Find.find_dolar(parts[2]);
                rs = "00000";
                String bin = Integer.toBinaryString(Integer.parseInt(parts[3]));
                size = bin.length();
                int lenght = 5 - size;
                for (int i = 0; i < lenght; i++) {
                    bin = "0" + bin;
                }
                shamt = bin;
            } else if (parts[0].equals("sllv")) {
                rd = Find.find_dolar(parts[1]);
                rt = Find.find_dolar(parts[2]);
                rs = Find.find_dolar(parts[3]);
                shamt = "00000";
            } else if (parts[0].equals("slt")) {
                rd = Find.find_dolar(parts[1]);
                rs = Find.find_dolar(parts[2]);
                rt = Find.find_dolar(parts[3]);
                shamt = "00000";
            } else if (parts[0].equals("sltu")) {
                rd = Find.find_dolar(parts[1]);
                rs = Find.find_dolar(parts[2]);
                rt = Find.find_dolar(parts[3]);
                shamt = "00000";
            } else if (parts[0].equals("sra")) {
                rd = Find.find_dolar(parts[1]);
                rt = Find.find_dolar(parts[2]);
                rs = "00000";
                String bin = Integer.toBinaryString(Integer.parseInt(parts[3]));
                size = bin.length();
                int lenght = 5 - size;
                for (int i = 0; i < lenght; i++) {
                    bin = "0" + bin;
                }
                shamt = bin;
            } else if (parts[0].equals("srav")) {
                rd = Find.find_dolar(parts[1]);
                rt = Find.find_dolar(parts[2]);
                rs = Find.find_dolar(parts[3]);
                shamt = "00000";
            } else if (parts[0].equals("srl")) {
                rd = Find.find_dolar(parts[1]);
                rt = Find.find_dolar(parts[2]);
                rs = "00000";
                String bin = Integer.toBinaryString(Integer.parseInt(parts[3]));
                size = bin.length();
                int lenght = 5 - size;
                for (int i = 0; i < lenght; i++) {
                    bin = "0" + bin;
                }
                shamt = bin;
            } else if (parts[0].equals("srlv")) {
                rd = Find.find_dolar(parts[1]);
                rt = Find.find_dolar(parts[2]);
                rs = Find.find_dolar(parts[3]);
                shamt = "00000";
            } else if (parts[0].equals("sub")) {
                rd = Find.find_dolar(parts[1]);
                rs = Find.find_dolar(parts[2]);
                rt = Find.find_dolar(parts[3]);
                shamt = "00000";
            } else if (parts[0].equals("subu")) {
                rd = Find.find_dolar(parts[1]);
                rs = Find.find_dolar(parts[2]);
                rt = Find.find_dolar(parts[3]);
                shamt = "00000";
            } else if (parts[0].equals("xor")) {
                rd = Find.find_dolar(parts[1]);
                rs = Find.find_dolar(parts[2]);
                rt = Find.find_dolar(parts[3]);
                shamt = "00000";
            }
            op = "000000";

            if (!is_check){
                String num = op + rs + rt + rd + shamt + Rfunc;
                String hex = Convert.BintoHex(num);
                System.out.println("0x" + hex);
                Prints.printR("R-Type", op, rs, rt, rd, shamt, Rfunc);
            }

        } // R_Type Done

        else if (isI_type) {
            if (parts[0].equals("addi")) {
                rt = Find.find_dolar(parts[1]);
                rs = Find.find_dolar(parts[2]);
                if (parts[3].substring(0, 2).equals("0x")) {
                    imm = Convert.HexToBin(parts[3].substring(2));
                    size = imm.length();
                    int lenght = 16 - size;
                    for (int i = 0; i < lenght; i++) {
                        imm = "0" + imm;
                    }
                } else {
                    imm = Integer.toBinaryString(Integer.parseInt(parts[3]));
                    size = imm.length();
                    int lenght = 16 - size;
                    for (int i = 0; i < lenght; i++) {
                        imm = "0" + imm;
                    }
                }
            } else if (parts[0].equals("addiu")) {
                rt = Find.find_dolar(parts[1]);
                rs = Find.find_dolar(parts[2]);
                if (parts[3].substring(0, 2).equals("0x")) {
                    imm = Convert.HexToBin(parts[3].substring(2));
                    size = imm.length();
                    int lenght = 16 - size;
                    for (int i = 0; i < lenght; i++) {
                        imm = "0" + imm;
                    }
                } else {
                    imm = Integer.toBinaryString(Integer.parseInt(parts[3]));
                    size = imm.length();
                    int lenght = 16 - size;
                    for (int i = 0; i < lenght; i++) {
                        imm = "0" + imm;
                    }
                }
            } else if (parts[0].equals("andi")) {
                rt = Find.find_dolar(parts[1]);
                rs = Find.find_dolar(parts[2]);
                if (parts[3].substring(0, 2).equals("0x")) {
                    imm = Convert.HexToBin(parts[3].substring(2));
                    size = imm.length();
                    int lenght = 16 - size;
                    for (int i = 0; i < lenght; i++) {
                        imm = "0" + imm;
                    }
                } else {
                    imm = Integer.toBinaryString(Integer.parseInt(parts[3]));
                    size = imm.length();
                    int lenght = 16 - size;
                    for (int i = 0; i < lenght; i++) {
                        imm = "0" + imm;
                    }
                }
            } else if (parts[0].equals("beq")) {
                rs = Find.find_dolar(parts[1]);
                rt = Find.find_dolar(parts[2]);
                if (parts[3].substring(0, 2).equals("0x")) {
                    imm = Convert.HexToBin(parts[3].substring(2));
                    size = imm.length();
                    int lenght = 16 - size;
                    for (int i = 0; i < lenght; i++) {
                        imm = "0" + imm;
                    }
                } else {
                    imm = Integer.toBinaryString(Integer.parseInt(parts[3]));
                    size = imm.length();
                    int lenght = 16 - size;
                    for (int i = 0; i < lenght; i++) {
                        imm = "0" + imm;
                    }
                }
            } else if (parts[0].equals("bgez")) {
                rs = Find.find_dolar(parts[1]);
                rt = "00001";
                if (parts[2].substring(0, 2).equals("0x")) {
                    imm = Convert.HexToBin(parts[2].substring(2));
                    size = imm.length();
                    int lenght = 16 - size;
                    for (int i = 0; i < lenght; i++) {
                        imm = "0" + imm;
                    }
                } else {
                    imm = Integer.toBinaryString(Integer.parseInt(parts[2]));
                    size = imm.length();
                    int lenght = 16 - size;
                    for (int i = 0; i < lenght; i++) {
                        imm = "0" + imm;
                    }
                }
            } else if (parts[0].equals("bgtz")) {
                rs = Find.find_dolar(parts[1]);
                rt = "00000";
                if (parts[2].substring(0, 2).equals("0x")) {
                    imm = Convert.HexToBin(parts[2].substring(2));
                    size = imm.length();
                    int lenght = 16 - size;
                    for (int i = 0; i < lenght; i++) {
                        imm = "0" + imm;
                    }
                } else {
                    imm = Integer.toBinaryString(Integer.parseInt(parts[2]));
                    size = imm.length();
                    int lenght = 16 - size;
                    for (int i = 0; i < lenght; i++) {
                        imm = "0" + imm;
                    }
                }
            } else if (parts[0].equals("blez")) {
                rs = Find.find_dolar(parts[1]);
                rt = "00000";
                if (parts[2].substring(0, 2).equals("0x")) {
                    imm = Convert.HexToBin(parts[2].substring(2));
                    size = imm.length();
                    int lenght = 16 - size;
                    for (int i = 0; i < lenght; i++) {
                        imm = "0" + imm;
                    }
                } else {
                    imm = Integer.toBinaryString(Integer.parseInt(parts[2]));
                    size = imm.length();
                    int lenght = 16 - size;
                    for (int i = 0; i < lenght; i++) {
                        imm = "0" + imm;
                    }
                }
            } else if (parts[0].equals("bltz")) {
                rs = Find.find_dolar(parts[1]);
                rt = "00000";
                if (parts[2].substring(0, 2).equals("0x")) {
                    imm = Convert.HexToBin(parts[2].substring(2));
                    size = imm.length();
                    int lenght = 16 - size;
                    for (int i = 0; i < lenght; i++) {
                        imm = "0" + imm;
                    }
                } else {
                    imm = Integer.toBinaryString(Integer.parseInt(parts[2]));
                    size = imm.length();
                    int lenght = 16 - size;
                    for (int i = 0; i < lenght; i++) {
                        imm = "0" + imm;
                    }
                }
            } else if (parts[0].equals("bne")) {
                rs = Find.find_dolar(parts[1]);
                rt = Find.find_dolar(parts[2]);
                if (parts[3].substring(0, 2).equals("0x")) {
                    imm = Convert.HexToBin(parts[3].substring(2));
                    size = imm.length();
                    int lenght = 16 - size;
                    for (int i = 0; i < lenght; i++) {
                        imm = "0" + imm;
                    }
                } else {
                    imm = Integer.toBinaryString(Integer.parseInt(parts[3]));
                    size = imm.length();
                    int lenght = 16 - size;
                    for (int i = 0; i < lenght; i++) {
                        imm = "0" + imm;
                    }
                }
            } else if (parts[0].equals("lb")) {
                rt = Find.find_dolar(parts[1]);
                if (parts[2].substring(0, 2).equals("0x")) {
                    imm = Convert.HexToBin(parts[2].substring(2));
                    size = imm.length();
                    int lenght = 16 - size;
                    for (int i = 0; i < lenght; i++) {
                        imm = "0" + imm;
                    }
                } else {
                    imm = Integer.toBinaryString(Integer.parseInt(parts[2]));
                    size = imm.length();
                    int lenght = 16 - size;
                    for (int i = 0; i < lenght; i++) {
                        imm = "0" + imm;
                    }
                }
                if (parts.length > 3) {
                    rs = Find.find_dolar(parts[3]);
                }
            } else if (parts[0].equals("lbu")) {
                rt = Find.find_dolar(parts[1]);
                if (parts[2].substring(0, 2).equals("0x")) {
                    imm = Convert.HexToBin(parts[2].substring(2));
                    size = imm.length();
                    int lenght = 16 - size;
                    for (int i = 0; i < lenght; i++) {
                        imm = "0" + imm;
                    }
                } else {
                    imm = Integer.toBinaryString(Integer.parseInt(parts[2]));
                    size = imm.length();
                    int lenght = 16 - size;
                    for (int i = 0; i < lenght; i++) {
                        imm = "0" + imm;
                    }
                }
                if (parts.length > 3) {
                    rs = Find.find_dolar(parts[3]);
                }
            } else if (parts[0].equals("lh")) {
                rt = Find.find_dolar(parts[1]);
                if (parts[2].substring(0, 2).equals("0x")) {
                    imm = Convert.HexToBin(parts[2].substring(2));
                    size = imm.length();
                    int lenght = 16 - size;
                    for (int i = 0; i < lenght; i++) {
                        imm = "0" + imm;
                    }
                } else {
                    imm = Integer.toBinaryString(Integer.parseInt(parts[2]));
                    size = imm.length();
                    int lenght = 16 - size;
                    for (int i = 0; i < lenght; i++) {
                        imm = "0" + imm;
                    }
                }
                if (parts.length > 3) {
                    rs = Find.find_dolar(parts[3]);
                }
            } else if (parts[0].equals("lhu")) {
                rt = Find.find_dolar(parts[1]);
                if (parts[2].substring(0, 2).equals("0x")) {
                    imm = Convert.HexToBin(parts[2].substring(2));
                    size = imm.length();
                    int lenght = 16 - size;
                    for (int i = 0; i < lenght; i++) {
                        imm = "0" + imm;
                    }
                } else {
                    imm = Integer.toBinaryString(Integer.parseInt(parts[2]));
                    size = imm.length();
                    int lenght = 16 - size;
                    for (int i = 0; i < lenght; i++) {
                        imm = "0" + imm;
                    }
                }
                if (parts.length > 3) {
                    rs = Find.find_dolar(parts[3]);
                }
            } else if (parts[0].equals("lui")) {
                rt = Find.find_dolar(parts[1]);
                if (parts[2].substring(0, 2).equals("0x")) {
                    imm = Convert.HexToBin(parts[2].substring(2));
                    size = imm.length();
                    int lenght = 16 - size;
                    for (int i = 0; i < lenght; i++) {
                        imm = "0" + imm;
                    }
                } else {
                    imm = Integer.toBinaryString(Integer.parseInt(parts[2]));
                    size = imm.length();
                    int lenght = 16 - size;
                    for (int i = 0; i < lenght; i++) {
                        imm = "0" + imm;
                    }
                }
            } else if (parts[0].equals("lw")) {
                rt = Find.find_dolar(parts[1]);
                if (parts[2].substring(0, 2).equals("0x")) {
                    imm = Convert.HexToBin(parts[2].substring(2));
                    size = imm.length();
                    int lenght = 16 - size;
                    for (int i = 0; i < lenght; i++) {
                        imm = "0" + imm;
                    }
                } else {
                    imm = Integer.toBinaryString(Integer.parseInt(parts[2]));
                    size = imm.length();
                    int lenght = 16 - size;
                    for (int i = 0; i < lenght; i++) {
                        imm = "0" + imm;
                    }
                }
                if (parts.length > 3) {
                    rs = Find.find_dolar(parts[3]);
                }
            } else if (parts[0].equals("lwcl")) {
                rt = Find.find_dolar(parts[1]);
                if (parts[2].substring(0, 2).equals("0x")) {
                    imm = Convert.HexToBin(parts[2].substring(2));
                    size = imm.length();
                    int lenght = 16 - size;
                    for (int i = 0; i < lenght; i++) {
                        imm = "0" + imm;
                    }
                } else {
                    imm = Integer.toBinaryString(Integer.parseInt(parts[2]));
                    size = imm.length();
                    int lenght = 16 - size;
                    for (int i = 0; i < lenght; i++) {
                        imm = "0" + imm;
                    }
                }
                if (parts.length > 3) {
                    rs = Find.find_dolar(parts[3]);
                }
            } else if (parts[0].equals("ori")) {
                rt = Find.find_dolar(parts[1]);
                rs = Find.find_dolar(parts[2]);
                if (parts[3].substring(0, 2).equals("0x")) {
                    imm = Convert.HexToBin(parts[3].substring(2));
                    size = imm.length();
                    int lenght = 16 - size;
                    for (int i = 0; i < lenght; i++) {
                        imm = "0" + imm;
                    }
                } else {
                    imm = Integer.toBinaryString(Integer.parseInt(parts[3]));
                    size = imm.length();
                    int lenght = 16 - size;
                    for (int i = 0; i < lenght; i++) {
                        imm = "0" + imm;
                    }
                }
            } else if (parts[0].equals("sb")) {
                rt = Find.find_dolar(parts[1]);
                if (parts[2].substring(0, 2).equals("0x")) {
                    imm = Convert.HexToBin(parts[2].substring(2));
                    size = imm.length();
                    int lenght = 16 - size;
                    for (int i = 0; i < lenght; i++) {
                        imm = "0" + imm;
                    }
                } else {
                    imm = Integer.toBinaryString(Integer.parseInt(parts[2]));
                    size = imm.length();
                    int lenght = 16 - size;
                    for (int i = 0; i < lenght; i++) {
                        imm = "0" + imm;
                    }
                }
                if (parts.length > 3) {
                    rs = Find.find_dolar(parts[3]);
                }
            } else if (parts[0].equals("slti")) {
                rt = Find.find_dolar(parts[1]);
                rs = Find.find_dolar(parts[2]);
                if (parts[3].substring(0, 2).equals("0x")) {
                    imm = Convert.HexToBin(parts[3].substring(2));
                    size = imm.length();
                    int lenght = 16 - size;
                    for (int i = 0; i < lenght; i++) {
                        imm = "0" + imm;
                    }
                } else {
                    imm = Integer.toBinaryString(Integer.parseInt(parts[3]));
                    size = imm.length();
                    int lenght = 16 - size;
                    for (int i = 0; i < lenght; i++) {
                        imm = "0" + imm;
                    }
                }
            } else if (parts[0].equals("sltiu")) {
                rt = Find.find_dolar(parts[1]);
                rs = Find.find_dolar(parts[2]);
                if (parts[3].substring(0, 2).equals("0x")) {
                    imm = Convert.HexToBin(parts[3].substring(2));
                    size = imm.length();
                    int lenght = 16 - size;
                    for (int i = 0; i < lenght; i++) {
                        imm = "0" + imm;
                    }
                } else {
                    imm = Integer.toBinaryString(Integer.parseInt(parts[3]));
                    size = imm.length();
                    int lenght = 16 - size;
                    for (int i = 0; i < lenght; i++) {
                        imm = "0" + imm;
                    }
                }
            } else if (parts[0].equals("sh")) {
                rt = Find.find_dolar(parts[1]);
                if (parts[2].substring(0, 2).equals("0x")) {
                    imm = Convert.HexToBin(parts[2].substring(2));
                    size = imm.length();
                    int lenght = 16 - size;
                    for (int i = 0; i < lenght; i++) {
                        imm = "0" + imm;
                    }
                } else {
                    imm = Integer.toBinaryString(Integer.parseInt(parts[2]));
                    size = imm.length();
                    int lenght = 16 - size;
                    for (int i = 0; i < lenght; i++) {
                        imm = "0" + imm;
                    }
                }
                if (parts.length > 3) {
                    rs = Find.find_dolar(parts[3]);
                }
            } else if (parts[0].equals("sw")) {
                rt = Find.find_dolar(parts[1]);
                if (parts[2].substring(0, 2).equals("0x")) {
                    imm = Convert.HexToBin(parts[2].substring(2));
                    size = imm.length();
                    int lenght = 16 - size;
                    for (int i = 0; i < lenght; i++) {
                        imm = "0" + imm;
                    }
                } else {
                    imm = Integer.toBinaryString(Integer.parseInt(parts[2]));
                    size = imm.length();
                    int lenght = 16 - size;
                    for (int i = 0; i < lenght; i++) {
                        imm = "0" + imm;
                    }
                }
                if (parts.length > 3) {
                    rs = Find.find_dolar(parts[3]);
                }
            } else if (parts[0].equals("swcl")) {
                rt = Find.find_dolar(parts[1]);
                if (parts[2].substring(0, 2).equals("0x")) {
                    imm = Convert.HexToBin(parts[2].substring(2));
                    size = imm.length();
                    int lenght = 16 - size;
                    for (int i = 0; i < lenght; i++) {
                        imm = "0" + imm;
                    }
                } else {
                    imm = Integer.toBinaryString(Integer.parseInt(parts[2]));
                    size = imm.length();
                    int lenght = 16 - size;
                    for (int i = 0; i < lenght; i++) {
                        imm = "0" + imm;
                    }
                }
                if (parts.length > 3) {
                    rs = Find.find_dolar(parts[3]);
                }
            } else if (parts[0].equals("xori")) {
                rt = Find.find_dolar(parts[1]);
                rs = Find.find_dolar(parts[2]);
                if (parts[3].substring(0, 2).equals("0x")) {
                    imm = Convert.HexToBin(parts[3].substring(2));
                    size = imm.length();
                    int lenght = 16 - size;
                    for (int i = 0; i < lenght; i++) {
                        imm = "0" + imm;
                    }
                } else {
                    imm = Integer.toBinaryString(Integer.parseInt(parts[3]));
                    size = imm.length();
                    int lenght = 16 - size;
                    for (int i = 0; i < lenght; i++) {
                        imm = "0" + imm;
                    }
                }
            }

            String num = Iop + rs + rt + imm;
            String hex = Convert.BintoHex(num);
            System.out.println("0x" + hex);
            Prints.printI("I-Type", Iop, rs, rt, imm);

        } // I_Type Done

        else if (isJ_type) {
            parts[1] = parts[1].substring(2, parts[1].length());
            String zeroz = "";
            size = Convert.HexToBin(parts[1]).length();
            if (size != 26) {
                int least = 26 - size;
                for (int i = 0; i < least; i++) {
                    zeroz += "0";
                }
            }
            String num = Jop + zeroz + Convert.HexToBin(parts[1]);
            String hexa = Convert.BintoHex(num);
            System.out.println("0x" + hexa);
            System.out.println("J-Type");
            System.out.println("op: " + Jop);
            System.out.println("address: " + zeroz + Convert.HexToBin(parts[1]));
        }    // J_Type Done

    } // Done

}
