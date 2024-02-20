package lk.ijse.dep11.app.advisor;

import lk.ijse.dep11.app.exception.NotFoundException;
import lk.ijse.dep11.app.util.ErrorResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class AppWideExceptionHandler {

    @ExceptionHandler(NotFoundException.class)
    public ResponseEntity<ErrorResponse> handleNotFoundException(NotFoundException notFoundException) {
        ResponseEntity<ErrorResponse> response = new ResponseEntity<>(new ErrorResponse(404,
                "Error",
                notFoundException.getMessage()), HttpStatus.NOT_FOUND);
        return response;
    }
}
