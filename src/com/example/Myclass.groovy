package com.example
class Myclass{
    String message
    Myclass(String message){
        this.message  = message
    }

    void printmessage(){
        echo "Entered message is ${message}"
    }
    static String greeting(String name){
        return "Hello ! How are you ${name}"
    }
}