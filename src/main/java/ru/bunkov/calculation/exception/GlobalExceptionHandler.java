package ru.bunkov.calculation.exception;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
@Slf4j
public class GlobalExceptionHandler {

    @ExceptionHandler
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public MessageError catchNotFoundException(NotFoundException e) {
        log.error(e.getErrorMessage(), e);
        return new MessageError(e.getErrorMessage());
    }
//
//    @ExceptionHandler
//    @ResponseStatus(HttpStatus.BAD_REQUEST)
//    public NotEnoughMoneyErrorMessage catchNotEnoughMoneyException(NotEnoughMoneyException e) {
//        log.error(e.getErrorMessage(), e);
//        return e.getInfo();
//    }

}