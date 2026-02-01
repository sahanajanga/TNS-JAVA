package com.tnsif.jdbcapplication;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class Jdbc {

        @Test
		void test() {
			System.out.println("Test implemented");
		}
        @ParameterizedTest
        @ValueSource(strings = {"sana","shana"})
        void endsWitha(String str) {
        	assertTrue(str.endsWith("a"));
        }
          @BeforeEach
        void display() {
        	System.out.println("before each implemented");
        }
          @BeforeAll
         static void display1() {
          	System.out.println("before all implemented");
          }
        @AfterEach
        void display2() {
        	System.out.println("after each implemented");
        }
       
        @AfterAll
       static void display3() {
        	System.out.println("after all implemented");
        }
}
