package com.yaazhtech.training.data;

import java.util.Arrays;
import java.util.stream.IntStream;

public class DataType {
    // primitive type byte-1bytes,short-2bytes,int-4byte,long-8byte  // float-4byte,double-8byte // boolean-1bit //char-2bytes,
    // [primitive does not have class,functions] [it also has ref,value]
    byte abc=01;// 1byte
    short ght=32767;
    int aadhar=1234567891;// 4byte
    long phoneNo=345; // 12 digit 8byte
    float amount=1.0f;
    char charVariable='4';// Acii value [0 to 256] // alphabets (a 97.b 98.z) alphabets (A 65. B66.Z) // number (0..9) // specialChara
    /*=====================================yaazhtech==================================*/
    int [] intArray=new int[39]; // 0 to 38
    char [] charArray=new char[10];// words 11 char? ArrayIndexOutOfBoundException [runTime?]

    // continous memory allocation
    // index based // 0 to 9
// wrapper object - Java,C++,Golang,Phython
    Byte byteObject=12; // objectClass
    Short shortObject=455;
    Integer integerObject=2343434; // 4byte // objectClass
    Long longObject=2423423432L; // 8byte
    Float floatObject=3324.0f;
    Double doubleObject=243243.0d;
    Character characterObject='c'; // Acii value [0 to 256] // alphabets (a 97.b 98.z) alphabets (A 65. B66.Z) // number (0..9) // specialChara
    String strABc=new String("abc");
// 1.8 fucntional programming , stream
    // wrapper stream

    IntStream intStream= IntStream.of(100,10,100,500,78,29,30,30); // divide subset odd, even// 5GB interMetiate (filter,predicate), terminal (collect,foreach)

   // for()// n th time
    //autoboxing unboxing -
    // what are all the inbuild immutable classes in java?

    private void constructArrayOfAttributes(){
        intStream.distinct();

        // primitive to wrapper or vice versa
        for(int i=0;i<12;i++){
            Integer count=+intArray[i]; // i is primitive, count is wrapper // this will create autoboxing unboxing issue
          intArray[i]=i; //
        }
    }

    // why?


//Divya
    //Arrays // index
    // primitive array
    //declaration
    int arr[];
    //allocating memory
    int arr1[]=new int[]{1,3,4,4}; // how to iterate the elemnet, using forloop
    // wrapper array
    Integer arrWrapper[];
    Integer arrWrapperWithMemory[]=new Integer[]{1,3,4,4};

//================inBuild object/primitive is done=============================


    // user-defined object


    //collection of wrapper object
    // collection of user-defined object

}
