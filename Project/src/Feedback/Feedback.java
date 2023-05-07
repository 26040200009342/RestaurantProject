package Feedback;

public abstract class Feedback {

    private int rating;
    private String comment;

    public Feedback(int rating, String comment) {
        //จะมีตัวที่รับชื่อ User **
        this.rating = rating;
        this.comment = comment;
        /*    ฟอร์ม input ค่าใน เมน :: 
                ** How would you rate us?
                rating = input
                ---------------------------
                ** Comment : 
                comment = input
        */
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public void displayFeedback() {
        System.out.println(" //ชือผู้ให้ feedback : "
                +"--------------------------------------------"
                +"Score : " + getRating()
                +"--------------------------------------------"
                +" Comment : " + getComment() );
    }
}