package com.example.cubochallenge.exception;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class Exceptions {
   @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity error400(MethodArgumentNotValidException e){
       var error = e.getFieldErrors();
        return ResponseEntity.badRequest().body(error.stream().map(DataErrorValidation::new).toList());
   }
}
