package Code.Blue;

public abstract class Attachment {
    /*
     * @brief variables that are used
     * @note specifies the name of the author
     * @note uniquely identify the attachment
     */
    String author;
    int uniqueID;

    /*
     * @brief Creating an output statment to display both the author and uniqueID
     * @note
     */
    public /*void*/ String preview(){
        return String.format("Attachment: ", author + " : " + uniqueID);
    }
}
