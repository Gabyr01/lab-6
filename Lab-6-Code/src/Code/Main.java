package Code;

import Code.Green.NotificationCollection; //Notification Collection object, and for number 1
import Code.Blue.Attachment; //for number 2
import Code.Blue.FileAttachment; //for attach files feature
import Code.Blue.MediaAttachment; //for media files feature

public class Main {
    public static void main(String[] args) {
        NotificationCollection nc = new NotificationCollection();
        NotificationBar nb = new NotificationBar(nc);

        //1. create Notifications and add them to nc
            //nc.addItem("string?");
        nc.addItem(null);
        nc.addItem("");
        //nc.printNotifications();
        //2. create attachments and link them to notifications in nc
            //nc.getItem(index).attach(name of attachment);
        //FileAttachment("name of txt file/author?", (uniqueID), (size_Byte))
        Attachment text1 = new FileAttachment("Fan_Syllabus.txt", 001, 100);
        Attachment text2 = new FileAttachment("Zheng_Syllabus.txt", 002, 200);
        
        nc.setAttachment(text1, 0);
        nc.setAttachment(text2, 2);

        nb.printNotifications();
    }
}
