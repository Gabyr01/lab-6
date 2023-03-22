package Code.Blue;

public class Notification {
    /*
     * @brief variables used for optimization
     * @note set an attachment variable for attachments
     * @note set a message variable to set notifications
     */
    public Attachment attachment;
    public String message;

    /*
     * @brief constructor
     */
    public Notification(String m){
        this.message = m;
    }

    /*
     * @brief get preview of the content of the attachment
     * @return whole line of string
     * 
     * @note tried using ternary but then the preview() was void
     * @note ended up doing if statement to show the process
     */
    public String getContent(){
        
        /*if(attachment == null){
            message = "{Attachment Unavailable} :(";
            return message;
        }
        attachment.preview();
        return message;*/ //not sure if it fetches anything

        return message + "\n" + ((attachment == null) ? "[Attachment Unavailable]" : attachment.preview());*/
    }

    /*
     * @brief set the attachment with passed parameter
     * @param 'a' variable of Attachment object
     */
    public void setAttachment(Attachment a){
        attachment = a;
    }
}
