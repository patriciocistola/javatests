package com.platzi.javatest.util;

import com.sun.media.jfxmedia.control.MediaPlayerOverlay;

public class Passwordutil {

    public enum SecurityLevel{
        Alto, Medio, Bajo,
    }

    public static SecurityLevel comprobar( String passw){

        SecurityLevel result;

        if (passw.length()<8){
            result = SecurityLevel.Bajo;
            }
        else {
            result = SecurityLevel.Medio;
        }

        return result;
    }

}
