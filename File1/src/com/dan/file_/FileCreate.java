package com.dan.file_;

import org.junit.Test;

import java.io.File;
import java.io.IOException;

public class FileCreate {
    public static void main(String[] args) {

    }
@Test
    public void create01() {
        String filePath = "d:\\news1.txt";
        File file = new File(filePath);
        try {
            file.createNewFile();
            System.out.println("文件创建成功");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    @Test
    public void create02(){
        File file1 = new File("d:\\");
        String file="news2.txt";
        File file2 = new File(file1, file);
        try {
            file2.createNewFile();
            System.out.println("文件创建成功");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    @Test
    public void filecreate03(){
        String partenfile="d:/";
        String childfile="news3.txt";
        File file = new File(partenfile, childfile);
        try {
            file.createNewFile();
            System.out.println("文件创建成功");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    @Test
    public void info(){
        File file = new File(("e:\\news1.txt"));
        System.out.println(file.getAbsoluteFile());
        System.out.println(file.getName());
        System.out.println(file.getParent());
    }
}