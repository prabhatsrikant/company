package com.company.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.CONFLICT , reason = "User already exists")
public class EmployeeAlreadyExistException extends Exception{

}
