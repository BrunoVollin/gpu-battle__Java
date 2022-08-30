/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exceptions;

/**
 *
 * @author bruno
 */
public class LoginException extends RuntimeException {

    String msg;
    
    public LoginException(String message) {
        super(message);
        this.msg = message; 
    }

    public String getMsg() {
        return msg;
    }
    
    
}
