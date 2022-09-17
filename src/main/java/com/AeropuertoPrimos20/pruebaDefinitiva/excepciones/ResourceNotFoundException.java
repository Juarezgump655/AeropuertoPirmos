package com.AeropuertoPrimos20.pruebaDefinitiva.excepciones;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;
//Es una Clase  de exepciones personalizada donde se evaluara cuando no se encuentre un objeto
@ResponseStatus (value= HttpStatus.NOT_FOUND)
public class ResourceNotFoundException  extends RuntimeException{
       //ID para esta clase
        private static final long serialVersionID =1L;

        public ResourceNotFoundException(String mensaje){
            super(mensaje);
        }
}
