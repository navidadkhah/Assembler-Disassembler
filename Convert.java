public class Convert {

    public static String HexToBin(String hexdec) {
        String binary = "";
        for (int j = 0; j < hexdec.length(); j++) {
            switch (hexdec.charAt(j)) {
                case '0' -> binary += "0000";
                case '1' -> binary += "0001";
                case '2' -> binary += "0010";
                case '3' -> binary += "0011";
                case '4' -> binary += "0100";
                case '5' -> binary += "0101";
                case '6' -> binary += "0110";
                case '7' -> binary += "0111";
                case '8' -> binary += "1000";
                case '9' -> binary += "1001";
                case 'A', 'a' -> binary += "1010";
                case 'B', 'b' -> binary += "1011";
                case 'C', 'c' -> binary += "1100";
                case 'D', 'd' -> binary += "1101";
                case 'E', 'e' -> binary += "1110";
                case 'F', 'f' -> binary += "1111";
            }
        }
        return binary;
    }  // Hex number to Binary number Done

    public static String BintoHex(String Bin) {
        if (Bin.length()==32){
            String[] four_hex = new String[8];
            int k = 0;
            String hex = "";
            for (int i = 0; i < 32; i += 4) {
                four_hex[k] = Bin.substring(i, i + 4);
                k++;
            }
            int temp = 0;
            for (int i = 0; i < four_hex.length; i++) {
                if (four_hex[i].charAt(0) == '1') {
                    temp += 8;
                }
                if (four_hex[i].charAt(1) == '1') {
                    temp += 4;
                }
                if (four_hex[i].charAt(2) == '1') {
                    temp += 2;
                }
                if (four_hex[i].charAt(3) == '1') {
                    temp += 1;
                }

                if (temp == 10) {
                    hex = hex + "A";
                    temp = 0;
                } else if (temp == 11) {
                    hex = hex + "B";
                    temp = 0;
                } else if (temp == 12) {
                    hex = hex + "C";
                    temp = 0;
                } else if (temp == 13) {
                    hex = hex + "D";
                    temp = 0;
                } else if (temp == 14) {
                    hex = hex + "E";
                    temp = 0;
                } else if (temp == 15) {
                    hex = hex + "F";
                    temp = 0;
                } else {
                    hex = hex + temp;
                    temp = 0;
                }
            }
            return hex;
        }
        else if (Bin.length() == 26){
            String[] four_hex = new String[6];
            int k = 0;
            String hex = "";
            for (int i = Bin.length()- 1; i >2; i -= 4) {
                four_hex[k] = Bin.substring(i-3, i+1 );
                k++;
            }
            int temp = 0;
            for (int i = 0; i < four_hex.length; i++) {
                if (four_hex[i].charAt(0) == '1') {
                    temp += 8;
                }
                if (four_hex[i].charAt(1) == '1') {
                    temp += 4;
                }
                if (four_hex[i].charAt(2) == '1') {
                    temp += 2;
                }
                if (four_hex[i].charAt(3) == '1') {
                    temp += 1;
                }

                if (temp == 10) {
                    hex = "A" + hex;
                    temp = 0;
                } else if (temp == 11) {
                    hex = "B" + hex;
                    temp = 0;
                } else if (temp == 12) {
                    hex = "C" + hex;
                    temp = 0;
                } else if (temp == 13) {
                    hex = "D" + hex;
                    temp = 0;
                } else if (temp == 14) {
                    hex = "E" + hex;
                    temp = 0;
                } else if (temp == 15) {
                    hex = "F" + hex;
                    temp = 0;
                } else {
                    hex = temp + hex;
                    temp = 0;
                }
            }
            return hex;
        }
        else if (Bin.length() == 16){
            String[] four_hex = new String[4];
            int k = 0;
            String hex = "";
            for (int i = 0; i < 16; i += 4) {
                four_hex[k] = Bin.substring(i, i + 4);
                k++;
            }
            int temp = 0;
            for (int i = 0; i < four_hex.length; i++) {
                if (four_hex[i].charAt(0) == '1') {
                    temp += 8;
                }
                if (four_hex[i].charAt(1) == '1') {
                    temp += 4;
                }
                if (four_hex[i].charAt(2) == '1') {
                    temp += 2;
                }
                if (four_hex[i].charAt(3) == '1') {
                    temp += 1;
                }

                if (temp == 10) {
                    hex = hex + "A";
                    temp = 0;
                } else if (temp == 11) {
                    hex = hex + "B";
                    temp = 0;
                } else if (temp == 12) {
                    hex = hex + "C";
                    temp = 0;
                } else if (temp == 13) {
                    hex = hex + "D";
                    temp = 0;
                } else if (temp == 14) {
                    hex = hex + "E";
                    temp = 0;
                } else if (temp == 15) {
                    hex = hex + "F";
                    temp = 0;
                } else {
                    hex = hex + temp;
                    temp = 0;
                }
            }
            return hex;
        }
        else {
            return null;
        }

    } // Binary num to Hex

}
