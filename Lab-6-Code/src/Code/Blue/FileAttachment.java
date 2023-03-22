package Code.Blue;

import java.io.File; //file optimization
import java.util.Scanner;
import java.io.IOException;

/*
 * @brief FileAttachment class 
 *  
 * @note FileAttachment extends Attachment since the relationship is an open arrow
 * @note size_Byte
 */
public class FileAttachment extends Attachment{
    private int size_Byte;
    /*
     * @brief constructor
     * @param 'a' for author initializations
     * @param 'ID' for uniqueID intializations
     */
    public FileAttachment(String s1, int id, int size){
        this.author = s1;
        this.uniqueID = id;
        this.size_Byte = size;
    }

    /*
     * @brief reads the file that will be generated
     * @return string of the file
     */
    public String toString(){
        StringBuilder snipFile = new StringBuilder();
        try {
            String s;
            Scanner scanFile = new Scanner(new File("Code/FileAttachmentFolder/" + author));
            uniqueID = 0;
            size_Byte = 10;
            while (scanFile.hasNext() && uniqueID++ < size_Byte) {
                s = scanFile.nextLine();
                snipFile.append(s + " ");
            }
            snipFile.append("<Finished reading files>");
            scanFile.close();
        } catch (IOException e) {
            // TODO: handle exception
            snipFile.append("[File cannot be detected]");
        }
        return String.format("File Attachment: ", author + " : " + uniqueID, "Size of byte: " + size_Byte, snipFile.toString());
    }
}
