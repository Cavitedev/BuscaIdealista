package com.cavitedet.buscaidealista.infrastructura;

import androidx.test.ext.junit.runners.AndroidJUnit4;

import com.cavitedet.buscaidealista.BuildConfig;

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(AndroidJUnit4.class)
public class KeysTest {


    @Test
    public void getAuth(){
        String key = BuildConfig.IDEALISTA_AUTH;
        assertNotEquals(key, "null");
    }




}
