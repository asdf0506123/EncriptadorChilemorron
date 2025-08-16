/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programa;

/**
 *
 * @author Usuario
 */
public class Encriptador {
        String texto2;
    public Encriptador(String texto){
        abecedarioNatural(texto);
    }
    public Encriptador(){
    }
    private String abecedarioNatural(String texto){
        char letras[] = texto.toCharArray();
        texto2 = "";
        for (int i=0; i<letras.length; i++){
            switch(letras[i]){
                case 'a': letras[i] = '~'; break;
                case 'b': letras[i] = '}'; break;
                case 'c': letras[i] = '|'; break;
                case 'd': letras[i] = '{'; break;
                case 'e': letras[i] = '`'; break;
                case 'f': letras[i] = '_'; break;
                case 'g': letras[i] = '^'; break;
                case 'h': letras[i] = ']'; break;
                case 'i': letras[i] = '\\'; break;
                case 'j': letras[i] = '['; break;
                case 'k': letras[i] = '@'; break;
                case 'l': letras[i] = '¿'; break;
                case 'm': letras[i] = '?'; break;
                case 'n': letras[i] = '>'; break;
                case 'ñ': letras[i] = '='; break;
                case 'o': letras[i] = '<'; break;
                case 'p': letras[i] = ';'; break;
                case 'q': letras[i] = ':'; break;
                case 'r': letras[i] = '/'; break;
                case 's': letras[i] = '.'; break;
                case 't': letras[i] = '-'; break;
                case 'u': letras[i] = ','; break;
                case 'v': letras[i] = '+'; break;
                case 'w': letras[i] = '*'; break;
                case 'x': letras[i] = ')'; break;
                case 'y': letras[i] = '('; break;
                case 'z': letras[i] = '‘'; break;
                case 'A': letras[i] = '&'; break;
                case 'B': letras[i] = '%'; break;
                case 'C': letras[i] = '$'; break;
                case 'D': letras[i] = '#'; break;
                case 'E': letras[i] = '"'; break;
                case 'F': letras[i] = '¡'; break;
                case 'G': letras[i] = '!'; break;
                case 'H': letras[i] = '9'; break;
                case 'I': letras[i] = '8'; break;
                case 'J': letras[i] = '7'; break;
                case 'K': letras[i] = '6'; break;
                case 'L': letras[i] = '5'; break;
                case 'M': letras[i] = '4'; break;
                case 'N': letras[i] = '3'; break;
                case 'Ñ': letras[i] = '2'; break;
                case 'O': letras[i] = '1'; break;
                case 'P': letras[i] = '0'; break;
                case 'Q': letras[i] = 'ü'; break;
                case 'R': letras[i] = 'Ü'; break;
                case 'S': letras[i] = 'ö'; break;
                case 'T': letras[i] = 'Ö'; break;
                case 'U': letras[i] = 'ë'; break;
                case 'V': letras[i] = 'Ë'; break;
                case 'W': letras[i] = 'ç'; break;
                case 'X': letras[i] = 'Ç'; break;
                case 'Y': letras[i] = 'Ú'; break;
                case 'Z': letras[i] = 'Ó'; break;
                case 'á': letras[i] = 'Í'; break;
                case 'é': letras[i] = 'É'; break;
                case 'í': letras[i] = 'Á'; break;
                case 'ó': letras[i] = 'ú'; break;
                case 'ú': letras[i] = 'ó'; break;
                case 'Á': letras[i] = 'í'; break;
                case 'É': letras[i] = 'é'; break;
                case 'Í': letras[i] = 'á'; break;
                case 'Ó': letras[i] = 'Z'; break;
                case 'Ú': letras[i] = 'Y'; break;
                case 'Ç': letras[i] = 'X'; break;
                case 'ç': letras[i] = 'W'; break;
                case 'Ë': letras[i] = 'V'; break;
                case 'ë': letras[i] = 'U'; break;
                case 'Ö': letras[i] = 'T'; break;
                case 'ö': letras[i] = 'S'; break;
                case 'Ü': letras[i] = 'R'; break;
                case 'ü': letras[i] = 'Q'; break;
                case '0': letras[i] = 'P'; break;
                case '1': letras[i] = 'O'; break;
                case '2': letras[i] = 'Ñ'; break;
                case '3': letras[i] = 'N'; break;
                case '4': letras[i] = 'M'; break;
                case '5': letras[i] = 'L'; break;
                case '6': letras[i] = 'K'; break;
                case '7': letras[i] = 'J'; break;
                case '8': letras[i] = 'I'; break;
                case '9': letras[i] = 'H'; break;
                case '!': letras[i] = 'G'; break;
                case '¡': letras[i] = 'F'; break;
                case '"': letras[i] = 'E'; break;
                case '#': letras[i] = 'D'; break;
                case '$': letras[i] = 'C'; break;
                case '%': letras[i] = 'B'; break;
                case '&': letras[i] = 'A'; break;
                case '‘': letras[i] = 'z'; break;
                case '(': letras[i] = 'y'; break;
                case ')': letras[i] = 'x'; break;
                case '*': letras[i] = 'w'; break;
                case '+': letras[i] = 'v'; break;
                case ',': letras[i] = 'u'; break;
                case '-': letras[i] = 't'; break;
                case '.': letras[i] = 's'; break;
                case '/': letras[i] = 'r'; break;
                case ':': letras[i] = 'q'; break;
                case ';': letras[i] = 'p'; break;
                case '<': letras[i] = 'o'; break;
                case '=': letras[i] = 'ñ'; break;
                case '>': letras[i] = 'n'; break;
                case '?': letras[i] = 'm'; break;
                case '¿': letras[i] = 'l'; break;
                case '@': letras[i] = 'k'; break;
                case '[': letras[i] = 'j'; break;
                case '\\': letras[i] = 'i'; break;
                case ']': letras[i] = 'h'; break;
                case '^': letras[i] = 'g'; break;
                case '_': letras[i] = 'f'; break;
                case '`': letras[i] = 'e'; break;
                case '{': letras[i] = 'd'; break;
                case '|': letras[i] = 'c'; break;
                case '}': letras[i] = 'b'; break;
                case '~': letras[i] = 'a'; break;
            }
            texto2 += letras[i];
        }
        return texto2;
    }
    
        public String abecedarioEncrip(String texto){
        char letras[] = texto.toCharArray();
        String decifrar = "";
        for (int i=0; i<letras.length; i++){
            switch(letras[i]){
            case '~': letras[i] = 'a'; break;
            case '}': letras[i] = 'b'; break;
            case '|': letras[i] = 'c'; break;
            case '{': letras[i] = 'd'; break;
            case '`': letras[i] = 'e'; break;
            case '_': letras[i] = 'f'; break;
            case '^': letras[i] = 'g'; break;
            case ']': letras[i] = 'h'; break;
            case '\\': letras[i] = 'i'; break;
            case '[': letras[i] = 'j'; break;
            case '@': letras[i] = 'k'; break;
            case '¿': letras[i] = 'l'; break;
            case '?': letras[i] = 'm'; break;
            case '>': letras[i] = 'n'; break;
            case '=': letras[i] = 'ñ'; break;
            case '<': letras[i] = 'o'; break;
            case ';': letras[i] = 'p'; break;
            case ':': letras[i] = 'q'; break;
            case '/': letras[i] = 'r'; break;
            case '.': letras[i] = 's'; break;
            case '-': letras[i] = 't'; break;
            case ',': letras[i] = 'u'; break;
            case '+': letras[i] = 'v'; break;
            case '*': letras[i] = 'w'; break;
            case ')': letras[i] = 'x'; break;
            case '(': letras[i] = 'y'; break;
            case '‘': letras[i] = 'z'; break;
            case '&': letras[i] = 'A'; break;
            case '%': letras[i] = 'B'; break;
            case '$': letras[i] = 'C'; break;
            case '#': letras[i] = 'D'; break;
            case '"': letras[i] = 'E'; break;
            case '¡': letras[i] = 'F'; break;
            case '!': letras[i] = 'G'; break;
            case '9': letras[i] = 'H'; break;
            case '8': letras[i] = 'I'; break;
            case '7': letras[i] = 'J'; break;
            case '6': letras[i] = 'K'; break;
            case '5': letras[i] = 'L'; break;
            case '4': letras[i] = 'M'; break;
            case '3': letras[i] = 'N'; break;
            case '2': letras[i] = 'Ñ'; break;
            case '1': letras[i] = 'O'; break;
            case '0': letras[i] = 'P'; break;
            case 'ü': letras[i] = 'Q'; break;
            case 'Ü': letras[i] = 'R'; break;
            case 'ö': letras[i] = 'S'; break;
            case 'Ö': letras[i] = 'T'; break;
            case 'ë': letras[i] = 'U'; break;
            case 'Ë': letras[i] = 'V'; break;
            case 'ç': letras[i] = 'W'; break;
            case 'Ç': letras[i] = 'X'; break;
            case 'Ú': letras[i] = 'Y'; break;
            case 'Ó': letras[i] = 'Z'; break;
            case 'Í': letras[i] = 'á'; break;
            case 'É': letras[i] = 'é'; break;
            case 'Á': letras[i] = 'í'; break;
            case 'ú': letras[i] = 'ó'; break;
            case 'ó': letras[i] = 'ú'; break;
            case 'í': letras[i] = 'Á'; break;
            case 'é': letras[i] = 'É'; break;
            case 'á': letras[i] = 'Í'; break;
            case 'Z': letras[i] = 'Ó'; break;
            case 'Y': letras[i] = 'Ú'; break;
            case 'X': letras[i] = 'Ç'; break;
            case 'W': letras[i] = 'ç'; break;
            case 'V': letras[i] = 'Ë'; break;
            case 'U': letras[i] = 'ë'; break;
            case 'T': letras[i] = 'Ö'; break;
            case 'S': letras[i] = 'ö'; break;
            case 'R': letras[i] = 'Ü'; break;
            case 'Q': letras[i] = 'ü'; break;
            case 'P': letras[i] = '0'; break;
            case 'O': letras[i] = '1'; break;
            case 'Ñ': letras[i] = '2'; break;
            case 'N': letras[i] = '3'; break;
            case 'M': letras[i] = '4'; break;
            case 'L': letras[i] = '5'; break;
            case 'K': letras[i] = '6'; break;
            case 'J': letras[i] = '7'; break;
            case 'I': letras[i] = '8'; break;
            case 'H': letras[i] = '9'; break;
            case 'G': letras[i] = '!'; break;
            case 'F': letras[i] = '¡'; break;
            case 'E': letras[i] = '"'; break;
            case 'D': letras[i] = '#'; break;
            case 'C': letras[i] = '$'; break;
            case 'B': letras[i] = '%'; break;
            case 'A': letras[i] = '&'; break;
            case 'z': letras[i] = '‘'; break;
            case 'y': letras[i] = '('; break;
            case 'x': letras[i] = ')'; break;
            case 'w': letras[i] = '*'; break;
            case 'v': letras[i] = '+'; break;
            case 'u': letras[i] = ','; break;
            case 't': letras[i] = '-'; break;
            case 's': letras[i] = '.'; break;
            case 'r': letras[i] = '/'; break;
            case 'q': letras[i] = ':'; break;
            case 'p': letras[i] = ';'; break;
            case 'o': letras[i] = '<'; break;
            case 'ñ': letras[i] = '='; break;
            case 'n': letras[i] = '>'; break;
            case 'm': letras[i] = '?'; break;
            case 'l': letras[i] = '¿'; break;
            case 'k': letras[i] = '@'; break;
            case 'j': letras[i] = '['; break;
            case 'i': letras[i] = '\\'; break;
            case 'h': letras[i] = ']'; break;
            case 'g': letras[i] = '^'; break;
            case 'f': letras[i] = '_'; break;
            case 'e': letras[i] = '`'; break;
            case 'd': letras[i] = '{'; break;
            case 'c': letras[i] = '|'; break;
            case 'b': letras[i] = '}'; break;
            case 'a': letras[i] = '~'; break;
            }
            decifrar += letras[i];
        }
        return decifrar;
    }
}
