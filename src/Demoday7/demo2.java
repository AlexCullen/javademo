package Demoday7;

import java.io.*;

/**
 * @Author: cpzh
 * @Date: 2018/3/6 21:14
 * TODO:
 */
public class demo2 {
    public static void main(String[] args) throws IOException {
        File file = new File("E:\\java");
        File copyFile = new File("E:\\copyTest");
        copyFile(file, copyFile);
    }
    public static void copyFile(File file, File newFile) throws IOException {
        if(!file.exists()){
            System.out.println("目标文件不存在");
            return;
        }
        File newCopy = new File(newFile,file.getName());
        if(file.isFile()){
            writeFile(file, newCopy);
        }else{
            if(!newCopy.exists()){
                newCopy.mkdirs();
            }
            for(File child: file.listFiles()){
                copyFile(child, newCopy);
            }
        }
    }

    public static void writeFile(File file, File copyFile) throws IOException {
        FileInputStream fis = new FileInputStream(file);

        FileOutputStream fos = new FileOutputStream(copyFile);

        try {
            int len = 0;
            byte[] bytes = new byte[1024];
            while((len = fis.read(bytes) )!= -1){
                fos.write(bytes, 0, len);
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            fis.close();
            fos.close();
        }
    }
}
