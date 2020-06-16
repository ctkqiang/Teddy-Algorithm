package com.johnmelodyme.security.Algorithm.teddy.encryption.Helper;

import java.util.concurrent.ThreadLocalRandom;
import java.util.Random;

public class Algorithm {
    private static int MAX = 0x7ffffff8;
    private static int MIN = 0x12d687;

    /**
     * @param secret
     * @param RII    :: Raise in integer
     */

    public static String randomSecretKey(String secret, int RII) {
        char[] _secret;
        int _rii;
        Random random = new Random();

        _rii = (int) RII * 0x17 / 0x64;

        _secret = secret.toCharArray();

        String output = Integer.toString(_rii) + String.valueOf(_secret);

        return output;
    }

}
