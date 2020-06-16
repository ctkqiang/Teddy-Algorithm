package com.johnmelodyme.security.Algorithm.teddy.encryption;

import com.johnmelodyme.security.Algorithm.teddy.encryption.Helper.Algorithm;

public class Main extends Algorithm {

    public static void main(String[] args) {
        randomSecretKey("asd", 2);
        System.out.println(randomSecretKey("qwerty", 12));

    }
}
