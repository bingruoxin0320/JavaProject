package FileDirectoryText;

import java.io.File;
import java.io.IOException;
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
        String path = "E:\\ProjectFile\\JavaProject\\p1\\src";
        for (int i = 1; i <= 10; i++) {
            File folder = new File(path + "\\" + i);
            if (!folder.exists()) {
                folder.mkdir();
            }
        }
    }
}