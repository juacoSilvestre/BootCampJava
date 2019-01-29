package com.BootChamp;

import org.junit.Test;

import static org.junit.Assert.*;

public class PrincipalTest {

    @Test
    public void getInput() throws Exception{
        Principal pr1 = new Principal();
        System.out.println("hasta aca bien");
        String per1= pr1.getInput();
        String per2= pr1.getInput();
        System.out.println("hasta aca bien too");

        assertEquals(per1,per2);
    }
}
