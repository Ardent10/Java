package com.Zakariya;
// public: Access Modifiers
// static: We do not need to create an object of this class to access it
// void: return type
// String[] args: command line arguments which are passed after
// compiling the program and then pass the parameters
// eg: javac demo
//     java demo "Zaky"
// O/p: Zaky

public class Terms {
    public static void main(String[] args) {
        System.out.println(args[1]);
    }
}
