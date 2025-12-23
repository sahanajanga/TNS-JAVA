package com.tnsif.demo;

public class SriIndu {
		    public static void main(String[] args) {

		        CSE cse = new CSE();
		        cse.studentName = "Sahana";
		        cse.studentId =29;
		        cse.dbms();

		        EEE eee = new EEE();
		        eee.studentName = "sravani";
		        eee.studentId = 63;
		        eee.dbms();

		        ECE ece = new ECE();
		        ece.studentName = "gopi";
		        ece.studentId = 97;
		        ece.dbms();
		    }
		}
        class CSE extends SriIndu {
		    String studentName;
		    int studentId;
		    public void dbms() {
		        System.out.println("CSE Student Name: " + studentName);
		        System.out.println("CSE Student ID: " + studentId);
		    }
		}
		class EEE extends SriIndu {
		    String studentName;
		    int studentId;
		    public void dbms() {
		        System.out.println("EEE Student Name: " + studentName);
		        System.out.println("EEE Student ID: " + studentId);
		    }
		}
		class ECE extends SriIndu {
		    String studentName;
		    int studentId;
		    public void dbms() {
		        System.out.println("ECE Student Name: " + studentName);
		        System.out.println("ECE Student ID: " + studentId);
		    }
		}


	
