package Day2;

class VowelConsonant {
    public void checkChar(char c){
        switch (c){
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
                System.out.println(c + " is vowel");
                break;
            default:
                System.out.println(c + " is consonant");
        }
    }
}
