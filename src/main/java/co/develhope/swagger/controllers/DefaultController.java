package co.develhope.swagger.controllers;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class DefaultController {

    @GetMapping(value = "")
    @ResponseStatus(HttpStatus.OK)
    @ApiOperation(value = "Survey", notes = "Welcome message")
    @ApiResponses({
            @ApiResponse(code = 400, message = "Bad input data"),
            @ApiResponse(code = 500, message = "Internal error", response = String.class)
    })

    public String saySurvey(){
        return "Welcome, you are visiting host 1234";
    }
}