public class Diassembler {
    public static void disassembler(String disassemble) {
        String rs = "";
        String rt = "";
        String rd = "";
        String shamt = "";
        String funct = "";
        String imm ="";
        String binary = Convert.HexToBin(disassemble.substring(2));
        String op =binary.substring(0, 6);

        if (op.equals("000000")){
            funct = binary.substring(26);
            String operator = Find.getKey(Maps.R_types, funct);

            if (operator.equals("syscall")) {
                System.out.println(operator);
                Prints.printR("R-Type", "000000", "00000", "00000", "00000", "00000", "001100");
            } else if (operator.equals("break")) {
                System.out.println(operator);
                Prints.printR("R-Type", "000000", "00000", "00000", "00000", "00000", "001101");
            }
            if (operator.equals("add")) {
                rd = Find.find_binary(binary.substring(16,21));
                rs = Find.find_binary(binary.substring(6,11));
                rt = Find.find_binary(binary.substring(11,16));
                System.out.println(operator + " " + rd + " " + rs + " " + rt);
            }
            else if (operator.equals("addu")) {
                rd = Find.find_binary(binary.substring(16,21));
                rs = Find.find_binary(binary.substring(6,11));
                rt = Find.find_binary(binary.substring(11,16));
                System.out.println(operator + " " + rd + " " + rs + " " + rt);
            } else if (operator.equals("and")) {
                rd = Find.find_binary(binary.substring(16,21));
                rs = Find.find_binary(binary.substring(6,11));
                rt = Find.find_binary(binary.substring(11,16));
                System.out.println(operator + " " + rd + " " + rs + " " + rt);
            } else if (operator.equals("div")) {
                rs = Find.find_binary(binary.substring(6,11));
                rt = Find.find_binary(binary.substring(11,16));
                System.out.println(operator + " " + rs + " " + rt);
            } else if (operator.equals("divu")) {
                rs = Find.find_binary(binary.substring(6,11));
                rt = Find.find_binary(binary.substring(11,16));
                System.out.println(operator + " " + rs + " " + rt);
            } else if (operator.equals("jalr")) {
                rd = Find.find_binary(binary.substring(6,11));
                rs = Find.find_binary(binary.substring(11,16));
                System.out.println(operator + " " + rd + " " + rs );
            } else if (operator.equals("jr")) {
                rs = Find.find_binary(binary.substring(6,11));
                System.out.println(operator + " " + rs );
            } else if (operator.equals("mfhi")) {
                rd = Find.find_binary(binary.substring(16,21));
                System.out.println(operator + " " + rd );
            } else if (operator.equals("mflo")) {
                rd = Find.find_binary(binary.substring(16,21));
                System.out.println(operator + " " + rd );
            } else if (operator.equals("mthi")) {
                rs = Find.find_binary(binary.substring(6,11));
                System.out.println(operator + " " + rs );
            } else if (operator.equals("mtlo")) {
                rs = Find.find_binary(binary.substring(6,11));
                System.out.println(operator + " " + rs );
            } else if (operator.equals("mult")) {
                rs = Find.find_binary(binary.substring(6,11));
                rt = Find.find_binary(binary.substring(11,16));
                System.out.println(operator + " " + rs + " " + rt);
            } else if (operator.equals("multu")) {
                rs = Find.find_binary(binary.substring(6,11));
                rt = Find.find_binary(binary.substring(11,16));
                System.out.println(operator + " " + rs + " " + rt);
            } else if (operator.equals("nor")) {
                rd = Find.find_binary(binary.substring(16,21));
                rs = Find.find_binary(binary.substring(6,11));
                rt = Find.find_binary(binary.substring(11,16));
                System.out.println(operator + " " + rd + " " + rs + " " + rt);
            } else if (operator.equals("or")) {
                rd = Find.find_binary(binary.substring(16,21));
                rs = Find.find_binary(binary.substring(6,11));
                rt = Find.find_binary(binary.substring(11,16));
                System.out.println(operator + " " + rd + " " + rs + " " + rt);
            } else if (operator.equals("sll")) {
                rd = Find.find_binary(binary.substring(16,21));
                rt = Find.find_binary(binary.substring(11,16));
                shamt =String.valueOf(Integer.parseInt(binary.substring(21,26),2));
                System.out.println(operator + " " + rd + " " + rt + " " + shamt);
            } else if (operator.equals("sllv")) {
                rd = Find.find_binary(binary.substring(16,21));
                rt = Find.find_binary(binary.substring(11,16));
                rs = Find.find_binary(binary.substring(6,11));
                System.out.println(operator + " " + rd + " " + rt + " " + rs);
            } else if (operator.equals("slt")) {
                rd = Find.find_binary(binary.substring(16,21));
                rs = Find.find_binary(binary.substring(6,11));
                rt = Find.find_binary(binary.substring(11,16));
                System.out.println(operator + " " + rd + " " + rs + " " + rt);
            } else if (operator.equals("sltu")) {
                rd = Find.find_binary(binary.substring(16,21));
                rs = Find.find_binary(binary.substring(6,11));
                rt = Find.find_binary(binary.substring(11,16));
                System.out.println(operator + " " + rd + " " + rs + " " + rt);
            } else if (operator.equals("sra")) {
                rd = Find.find_binary(binary.substring(16,21));
                rt = Find.find_binary(binary.substring(11,16));
                shamt =String.valueOf(Integer.parseInt(binary.substring(21,26),2));
                System.out.println(operator + " " + rd + " " + rt + " " + shamt);
            } else if (operator.equals("srav")) {
                rd = Find.find_binary(binary.substring(16,21));
                rt = Find.find_binary(binary.substring(11,16));
                rs = Find.find_binary(binary.substring(6,11));
                System.out.println(operator + " " + rd + " " + rt + " " + rs);
            } else if (operator.equals("srl")) {
                rd = Find.find_binary(binary.substring(16,21));
                rt = Find.find_binary(binary.substring(11,16));
                shamt =String.valueOf(Integer.parseInt(binary.substring(21,26),2));
                System.out.println(operator + " " + rd + " " + rt + " " + shamt);
            } else if (operator.equals("srlv")) {
                rd = Find.find_binary(binary.substring(16,21));
                rt = Find.find_binary(binary.substring(11,16));
                rs = Find.find_binary(binary.substring(6,111));
                System.out.println(operator + " " + rd + " " + rt + " " + rs);
            } else if (operator.equals("sub")) {
                rd = Find.find_binary(binary.substring(16,21));
                rs = Find.find_binary(binary.substring(6,11));
                rt = Find.find_binary(binary.substring(11,16));
                System.out.println(operator + " " + rd + " " + rs + " " + rt);
            } else if (operator.equals("subu")) {
                rd = Find.find_binary(binary.substring(16,21));
                rs = Find.find_binary(binary.substring(6,11));
                rt = Find.find_binary(binary.substring(11,16));
                System.out.println(operator + " " + rd + " " + rs + " " + rt);
            } else if (operator.equals("xor")) {
                rd = Find.find_binary(binary.substring(16,21));
                rs = Find.find_binary(binary.substring(6,11));
                rt = Find.find_binary(binary.substring(11,16));
                System.out.println(operator + " " + rd + " " + rs + " " + rt);
            }
            Prints.printR("R-Type",op,binary.substring(6,11),binary.substring(11,16),binary.substring(16,21),binary.substring(21,26),binary.substring(26));
        } // it's R-type

        else {
            boolean is_rt = false;
            funct = binary.substring(0,6);
            String operator = Find.getKey(Maps.J_types, funct);

            if (operator==null){
                operator = Find.getKey(Maps.I_types, funct);
                if (operator.equals("addi")){
                    rt = Find.find_binary(binary.substring(11,16));
                    rs = Find.find_binary(binary.substring(6,11));
                    imm = Convert.BintoHex(binary.substring(16));
                    System.out.println(operator + " " + rt + " " + rs + " 0x" + imm );
                }else if (operator.equals("addiu")){
                    rt = Find.find_binary(binary.substring(11,16));
                    rs = Find.find_binary(binary.substring(6,11));
                    imm = Convert.BintoHex(binary.substring(16));
                    System.out.println(operator + " " + rt + " " + rs + " 0x" + imm );
                }else if (operator.equals("andi")){
                    rt = Find.find_binary(binary.substring(11,16));
                    rs = Find.find_binary(binary.substring(6,11));
                    imm = Convert.BintoHex(binary.substring(16));
                    System.out.println(operator + " " + rt + " " + rs + " 0x" + imm );
                }else if (operator.equals("beq")){
                    rt = Find.find_binary(binary.substring(11,16));
                    rs = Find.find_binary(binary.substring(6,11));
                    imm = Convert.BintoHex(binary.substring(16));
                    System.out.println(operator + " " + rs + " " + rt + " 0x" + imm );
                }else if (operator.equals("bgez")){
                    is_rt =true;
                    rs = Find.find_binary(binary.substring(6,11));
                    imm = Convert.BintoHex(binary.substring(16));
                    System.out.println(operator + " " + rs + " 0x" + imm );
                }else if (operator.equals("bgtz")){
                    is_rt =true;
                    rs = Find.find_binary(binary.substring(6,11));
                    imm = Convert.BintoHex(binary.substring(16));
                    System.out.println(operator + " " + rs + " 0x" + imm );
                }else if (operator.equals("blez")){
                    is_rt =true;
                    rs = Find.find_binary(binary.substring(6,11));
                    imm = Convert.BintoHex(binary.substring(16));
                    System.out.println(operator + " " + rs + " 0x" + imm );
                }else if (operator.equals("bltz")){
                    is_rt =true;
                    rs = Find.find_binary(binary.substring(6,11));
                    imm = Convert.BintoHex(binary.substring(16));
                    System.out.println(operator + " " + rs + " 0x" + imm );
                }else if (operator.equals("bne")){
                    rt = Find.find_binary(binary.substring(11,16));
                    rs = Find.find_binary(binary.substring(6,11));
                    imm = Convert.BintoHex(binary.substring(16));
                    System.out.println(operator + " " + rs + " " + rt + " 0x" + imm );
                }else if (operator.equals("lb")){
                    rs = Find.find_binary(binary.substring(6,11));
                    rt = Find.find_binary(binary.substring(11,16));
                    imm = Convert.BintoHex(binary.substring(16));
                    System.out.println(operator + " " + rt + " 0x" + imm + " " + rs );
                }else if (operator.equals("lbu")){
                    rs = Find.find_binary(binary.substring(6,11));
                    rt = Find.find_binary(binary.substring(11,16));
                    imm = Convert.BintoHex(binary.substring(16));
                    System.out.println(operator + " " + rt + " 0x" + imm + " " + rs );
                }else if (operator.equals("lh")){
                    rs = Find.find_binary(binary.substring(6,11));
                    rt = Find.find_binary(binary.substring(11,16));
                    imm = Convert.BintoHex(binary.substring(16));
                    System.out.println(operator + " " + rt + " 0x" + imm + " " + rs );
                }else if (operator.equals("lhu")){
                    rs = Find.find_binary(binary.substring(6,11));
                    rt = Find.find_binary(binary.substring(11,16));
                    imm = Convert.BintoHex(binary.substring(16));
                    System.out.println(operator + " " + rt + " 0x" + imm + " " + rs );
                }else if (operator.equals("lui")){
                    rt = Find.find_binary(binary.substring(11,16));
                    imm = Convert.BintoHex(binary.substring(16));
                    System.out.println(operator + " " + rt + " 0x" + imm  );
                }else if (operator.equals("lw")){
                    rt = Find.find_binary(binary.substring(11,16)) ;
                    imm = Convert.BintoHex(binary.substring(16));
                    rs = Find.find_binary(binary.substring(6,11)) ;
                    System.out.println(operator + " " + rt + " 0x" + imm + " " + rs );
                }else if (operator.equals("lwcl")){
                    rt = Find.find_binary(binary.substring(11,16)) ;
                    imm = Convert.BintoHex(binary.substring(16));
                    rs = Find.find_binary(binary.substring(6,11)) ;
                    System.out.println(operator + " " + rt + " 0x" + imm + " " + rs );
                }else if (operator.equals("ori")){
                    rt = Find.find_binary(binary.substring(11,16));
                    rs = Find.find_binary(binary.substring(6,11));
                    imm = Convert.BintoHex(binary.substring(16));
                    System.out.println(operator + " " + rt + " " + rs + " 0x" + imm );
                }else if (operator.equals("sb")){
                    rt = Find.find_binary(binary.substring(11,16)) ;
                    imm = Convert.BintoHex(binary.substring(16));
                    rs = Find.find_binary(binary.substring(6,11)) ;
                    System.out.println(operator + " " + rt + " 0x" + imm + " " + rs );
                }else if (operator.equals("slti")){
                    rt = Find.find_binary(binary.substring(11,16));
                    rs = Find.find_binary(binary.substring(6,11));
                    imm = Convert.BintoHex(binary.substring(16));
                    System.out.println(operator + " " + rt + " " + rs + " 0x" + imm );
                }
                else if (operator.equals("sltiu")){
                    rt = Find.find_binary(binary.substring(11,16));
                    rs = Find.find_binary(binary.substring(6,11));
                    imm = Convert.BintoHex(binary.substring(16));
                    System.out.println(operator + " " + rt + " " + rs + " 0x" + imm );
                }
                else if (operator.equals("sh")){
                    rt = Find.find_binary(binary.substring(11,16)) ;
                    imm = Convert.BintoHex(binary.substring(16));
                    rs = Find.find_binary(binary.substring(6,11)) ;
                    System.out.println(operator + " " + rt + " 0x" + imm + " " + rs );
                }
                else if (operator.equals("sw")){
                    rt = Find.find_binary(binary.substring(11,16)) ;
                    imm = Convert.BintoHex(binary.substring(16));
                    rs = Find.find_binary(binary.substring(6,11)) ;
                    System.out.println(operator + " " + rt + " 0x" + imm + " " + rs );
                }
                else if (operator.equals("swcl")){
                    rt = Find.find_binary(binary.substring(11,16)) ;
                    imm = Convert.BintoHex(binary.substring(16));
                    rs = Find.find_binary(binary.substring(6,11)) ;
                    System.out.println(operator + " " + rt + " 0x" + imm + " " + rs );
                }
                else if (operator.equals("xori")){
                    rt = Find.find_binary(binary.substring(11,16)) ;
                    imm = Convert.BintoHex(binary.substring(16));
                    rs = Find.find_binary(binary.substring(6,11)) ;
                    System.out.println(operator + " " + rt + " " + rs + " 0x" + imm );
                }

                if (is_rt){
                    if (operator.equals("bgez")){
                        Prints.printI("I-Type",funct,binary.substring(6,11),"00001",binary.substring(16));
                    }else {
                        Prints.printI("I-Type",funct,binary.substring(6,11),"00000",binary.substring(16));
                    }
                }else {
                    Prints.printI("I-Type",funct,binary.substring(6,11),binary.substring(11,16),binary.substring(16));
                }

            } // it's I-Type

            else {
                if (operator.equals("j")){
                    System.out.println(operator + " 0x" + Convert.BintoHex(binary.substring(6)));
                    System.out.println("J-Type");
                    System.out.println("op: " + binary.substring(0,6));
                    System.out.println("address: " + binary.substring(6));
                    System.out.println("--------------------");
                }else if (operator.equals("jal")){
                    System.out.println(operator + " 0x" + Convert.BintoHex(binary.substring(6)));
                    System.out.println("J-Type");
                    System.out.println("op: " + binary.substring(0,6));
                    System.out.println("address: " + binary.substring(6));
                    System.out.println("--------------------");
                }
            } // it's J-Type

        } // I-Type and J-Type

    }

}
