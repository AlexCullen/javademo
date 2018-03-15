package Demoday7;

import java.io.File;

/**
 * @Author: cpzh
 * @Date: 2018/3/6 20:54
 * TODO:
 */
public class demo1 {
    public static void main(String[] args) {
        File file = new File("E:\\java");
        printDir(file);

    }

    public static void printDir(File file){
        if(!file.exists()){
            System.out.println("文件不存在");
            return;
        }
        if(file.isFile()){
            System.out.println(file);
            return;
        }
        File[] files = file.listFiles();
        for(File file1 : files){
            if(file1.isFile()){
                System.out.println(file1.getName());
            }else{
                printDir(file1);
            }
        }
    }
}
