package teruelfj.model;


import java.util.Arrays;
import java.util.List;
//Try 23
public class Validator {
    private static final List<Character> NUM_VALIDOS = Arrays.asList('T','R','W','A','G','M','Y','F','P','D','X','B','N',
            'J','Z','S','Q','V','H','L','C','K','E');

    private static final int NUM_LETRAS = 23;

    public static boolean dniValidator(String dni){
        if(dni.length() != 9  || dni.charAt(8) !=  NUM_VALIDOS.get(getResto(dni))) return false;
        return true;
    }

    private static int getResto(String dni){
        return (int) (getLongOfDni(dni)%NUM_LETRAS);
    }

    private static long getLongOfDni(String dni){
        return Long.decode(dni.substring(0,8));
    }

}
