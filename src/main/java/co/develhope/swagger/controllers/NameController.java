package co.develhope.swagger.controllers;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/name")
public class NameController {

    @GetMapping(value = "/name")
    @ApiOperation(value = "User access", notes = "Make the user who accesses feel welcome")
    @ResponseStatus(HttpStatus.OK)
    @ApiResponses({
            @ApiResponse(code = 400, message = "Bad request"),
            @ApiResponse(code = 500, message = "Internal error", response = String.class)
    })

    public String name(){
        return "Welcome user";
    }

    @GetMapping(value = "/name/{userName}")
    @ResponseStatus(HttpStatus.OK)
    @ApiOperation(value = "User access", notes = "Make the user who accesses feel welcome")
    @ApiResponses({
            @ApiResponse(code = 400, message = "Bad request"),
            @ApiResponse(code = 500, message = "Internal error", response = String.class)
    })
    public String pUser (@ApiParam(value = "userName")@RequestParam String userName){
        return "Dear " + userName;
    }

}