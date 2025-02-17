package org.example.bookingrest.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.ws.soap.client.SoapFaultClientException;

@ControllerAdvice
public class SoapExceptionHandler {
    String UNPROCESSABLE_ENTITY = "Ошибка валидации данных";
    String BAD_REQUEST = "Некорректные данные";
    String INTERNAL_SERVER_ERROR = "Внутренняя ошибка сервера";
    String NOT_FOUND = "Объект не найден";
    String SERVICE_UNAVAILABLE = "Сервис временно не доступен";

    @ExceptionHandler(SoapFaultClientException.class)
    public ResponseEntity<ErrorResponse> handleSoapFaultException(SoapFaultClientException ex) {
        String status = ex.getSoapFault().getFaultCode().toString();
        String errorMessage = ex.getMessage();

        if (status.contains("404")) {
            ErrorResponse error = new ErrorResponse(
                    NOT_FOUND,
                    "По вашему запросу мероприятие не найдено."
            );
            return new ResponseEntity<>(error, HttpStatus.NOT_FOUND);
        } else if (status.contains("400")) {
            ErrorResponse error = new ErrorResponse(
                    BAD_REQUEST,
                    errorMessage
            );
            return new ResponseEntity<>(error, HttpStatus.BAD_REQUEST);
        } else if (status.contains("422")) {
            ErrorResponse error = new ErrorResponse(
                    UNPROCESSABLE_ENTITY,
                    errorMessage
            );
            return new ResponseEntity<>(error, HttpStatus.UNPROCESSABLE_ENTITY);
        } else if (status.contains("503")) {
            ErrorResponse error = new ErrorResponse(
                    SERVICE_UNAVAILABLE,
                    errorMessage
            );
            return new ResponseEntity<>(error, HttpStatus.SERVICE_UNAVAILABLE);
        }

        ErrorResponse error = new ErrorResponse(
                INTERNAL_SERVER_ERROR,
                "Произошла ошибка при обработке запроса."
        );
        return new ResponseEntity<>(error, HttpStatus.INTERNAL_SERVER_ERROR);
    }

    public static class ErrorResponse {
        private String status;
        private String message;

        public ErrorResponse(String status, String message) {
            this.status = status;
            this.message = message;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public String getMessage() {
            return message;
        }

        public void setMessage(String message) {
            this.message = message;
        }
    }
}