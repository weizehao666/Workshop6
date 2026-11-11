public class Exercise4 {
    public static void main(String[] args) {
        String coded = "G tgsl Qefe.";
        // example mapping: you can modify this char array for different decode rule
        char[] decodeKey = new char[256];
        // sample simple shift decode example (customise as per your table)
        decodeKey['G'] = 'I';
        decodeKey['t'] = 'r';
        decodeKey['g'] = 'i';
        decodeKey['s'] = 'd';
        decodeKey['l'] = 'k';
        decodeKey['Q'] = 'S';
        decodeKey['e'] = 'c';
        decodeKey['f'] = 'd';

        StringBuilder decoded = new StringBuilder();
        for(int i=0; i<coded.length();i++){
            char ch = coded.charAt(i);
            if(decodeKey[ch] != 0){
                decoded.append(decodeKey[ch]);
            }else{
                decoded.append(ch);
            }
        }
        System.out.println(decoded);
    }
}

