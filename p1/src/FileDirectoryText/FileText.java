package FileDirectoryText;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;


public class FileText {
    public static void main(String[] args) {
        TestFile tf = new TestFile();
        tf.testFile();
        FolderTest folderTest = new FolderTest();
        folderTest.directoryTest();
    }
}

class TestFile {
    public void testFile() {
        File file = new File("text.txt");
        if (!file.exists()) {
            System.out.println("文件不存在，开始创建文件");
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("文件已存在");
            if (file.isFile() && file.canRead()) {
                System.out.println("文件可读，读取文件内容");
                String fileName = file.getName();
                String filePath = file.getAbsolutePath();
                boolean hidden = file.isHidden();
                long len = file.length();
                long tempTime = file.lastModified();
                // 创建 simpleDateFormat
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
                Date date = new Date(tempTime);
                String time = sdf.format(date);
                System.out.println(time);

            }
        }
    }
}
class FolderTest {
    protected void directoryTest(){
        File file = new File("word.txt");
        try {
            FileOutputStream out = new FileOutputStream(file);
            String content = "你见过洛杉矶凌晨4点的样子吗？";
            byte[] buy = content.getBytes();
            out.write(buy);
            out.close();
        } catch (IOException e){
            e.printStackTrace();
        }
        try {
            FileInputStream in = new FileInputStream(file);
            byte[] byt = new byte[1024];
            int len = in.read(byt);
            System.out.println(new String(byt,0,len));
            in.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    protected void bufferedStreamTest() {
        String[] content = {"千呼万唤始出来","犹抱琵琶半遮面","嘈嘈切切错杂弹","大珠小珠落玉盘"};
        File file = new File("workLookLook.txt");
        FileOutputStream fos = null;
        BufferedOutputStream bos = null;
        FileInputStream fis = null;
        BufferedInputStream bis = null;
        try {
            fos = new FileOutputStream(file);
            bos = new BufferedOutputStream(fos);
            byte[] bContent = new byte[1024];
            for (int k = 0;k<content.length;k++){
                bContent = content[k].getBytes();
                bos.write(bContent);
            }
            System.out.println("写入成功");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bos.close();
                fos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        try {
            fis = new FileInputStream(file);
            bis = new BufferedInputStream(fis);
            byte[] bContent = new byte[1024];
            int len = bis.read(bContent);
            System.out.println(new String(bContent,0,len));
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bis.close();
                fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}