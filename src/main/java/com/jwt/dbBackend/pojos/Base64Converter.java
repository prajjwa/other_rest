package com.jwt.dbBackend.pojos;

import java.util.Base64;

public class Base64Converter {

    public String encrypt(String originalInput)
    {
        return Base64.getEncoder().encodeToString(originalInput.getBytes());
    }

    public String decrypt(String encodedString)
    {
        byte[] decodedBytes = Base64.getDecoder().decode(encodedString);
        String decodedString = new String(decodedBytes);
        return  decodedString;
    }

}
