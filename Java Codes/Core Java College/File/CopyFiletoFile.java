import java.io.*;

public class CopyFiletoFile {
    public static void main(String args[]) throws IOException
    {
        FileInputStream fread = new FileInputStream("readfile.txt");
        FileOutputStream fwrite = new FileOutputStream("readfile1.txt");
        System.out.println("Content of File is copied");
        int c;
        while((c=fread.read())!=-1)
            fwrite.write((char)c);
        fread.close();
        fwrite.close();
    }
}
