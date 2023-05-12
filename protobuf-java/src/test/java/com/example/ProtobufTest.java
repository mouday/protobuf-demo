package com.example;

import com.example.protos.AddressBook;
import com.example.protos.Person;
import com.google.protobuf.InvalidProtocolBufferException;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ProtobufTest {
    @Test
    public void testBuildProtobuf() throws IOException {
        //  构建
        AddressBook addressBook = AddressBook
                .newBuilder()
                .addPeople(Person.newBuilder()
                        .setId(2)
                        .setName("小明")
                        .setEmail("yyds@126.com")
                        .addPhones(Person.PhoneNumber.newBuilder()
                                .setNumber("18388888888")
                                .setType(Person.PhoneType.HOME)
                        )
                )
                .build();
        System.out.println(addressBook);

        // 序列化到文件
        addressBook.writeTo(new FileOutputStream("AddressBook.txt"));
        // 读取文件反序列化
        AddressBook addressBook3 = AddressBook.parseFrom(new FileInputStream("AddressBook.txt"));
        System.out.println("文件读取反序列化：");
        System.out.println(addressBook3);
    }
}
