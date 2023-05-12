# -*- coding: utf-8 -*-
"""
@File    : demo.py
@Date    : 2023-05-12
"""
import addressbook_pb2

if __name__ == '__main__':
    # 反序列化
    with open('AddressBook.txt', 'rb') as f:
        addressBook = addressbook_pb2.AddressBook()
        addressBook.ParseFromString(f.read())
        for person in addressBook.people:
            print(person.name)
            # 小明
