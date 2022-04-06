import java.util.Map;

public class Find {
    public static String find_dolar(String op) {
        String result = "";

        switch (op) {
            case "$zero" -> result = "00000";
            case "$at" -> result = "00001";
            case "$v0" -> result = "00010";
            case "$v1" -> result = "00011";
            case "$a0" -> result = "00100";
            case "$a1" -> result = "00101";
            case "$a2" -> result = "00110";
            case "$a3" -> result = "00111";
            case "$t0" -> result = "01000";
            case "$t1" -> result = "01001";
            case "$t2" -> result = "01010";
            case "$t3" -> result = "01011";
            case "$t4" -> result = "01100";
            case "$t5" -> result = "01101";
            case "$t6" -> result = "01110";
            case "$t7" -> result = "01111";
            case "$s0" -> result = "10000";
            case "$s1" -> result = "10001";
            case "$s2" -> result = "10010";
            case "$s3" -> result = "10011";
            case "$s4" -> result = "10100";
            case "$s5" -> result = "10101";
            case "$s6" -> result = "10110";
            case "$s7" -> result = "10111";
            case "$t8" -> result = "11000";
            case "$t9" -> result = "11001";
            case "$k0" -> result = "11010";
            case "$k1" -> result = "11011";
            case "$gp" -> result = "11100";
            case "$sp" -> result = "11101";
            case "$fp" -> result = "11110";
            case "$ra" -> result = "11111";
        }
        return result;
    }  // find op in $ to binary

    public static String find_binary(String op) {
        String result = "";

        switch (op) {
            case "00000" -> result = "$zero";
            case "00001" -> result = "$at";
            case "00010" -> result = "$v0";
            case "00011" -> result = "$v1";
            case "00100" -> result = "$a0";
            case "00101" -> result = "$a1" ;
            case "00110" -> result = "$a2" ;
            case "00111" -> result = "$a3";
            case "01000" -> result = "$t0" ;
            case "01001" -> result = "$t1" ;
            case "01010" -> result = "$t2" ;
            case "01011" -> result = "$t3" ;
            case "01100" -> result = "$t4";
            case "01101" -> result = "$t5";
            case "01110" -> result = "$t6";
            case "01111" -> result = "$t7";
            case "10000" -> result = "$s0";
            case "10001" -> result = "$s1";
            case "10010" -> result = "$s2";
            case "10011" -> result = "$s3";
            case "10100" -> result = "$s4";
            case "10101" -> result = "$s5";
            case "10110" -> result = "$s6";
            case "10111" -> result = "$s7";
            case "11000" -> result = "$t8";
            case "11001" -> result = "$t9";
            case "11010" -> result = "$k0";
            case "11011" -> result = "$k1";
            case "11100" -> result = "$gp" ;
            case "11101" -> result = "$sp";
            case "11110" -> result = "$fp";
            case "11111" -> result = "$ra";
        }
        return result;
    }  // find op in binary to $

    public static <K, V> K getKey(Map<K, V> map, V value) {
        for (Map.Entry<K, V> entry: map.entrySet())
        {
            if (value.equals(entry.getValue())) {
                return entry.getKey();
            }
        }
        return null;
    } // find the operator

}
