

package vd2;


public class Book extends Officer{
    
    private String author;
    private double numberPages;

    public Book(String author, double numberPages, String documentCode, String publishName, double releaseNumber) {
        super(documentCode, publishName, releaseNumber);
        this.author = author;
        this.numberPages = numberPages;
    }



    public void setAuthor(String author) {
        this.author = author;
    }

    public void setNumberPages(double numberPages) {
        this.numberPages = numberPages;
    }

    
    public String getAuthor() {
        return author;
    }

    public double getNumberPages() {
        return numberPages;
    }

    @Override
    public String toString(){
        return "Book:\r\n" + "DocumentCode\t:" + documentCode + "\r\nPublishName\t:" + publishName 
                + "\r\nReleaseNumber:\t" + releaseNumber + "\r\tAuthor\t:" + author + "\r\tNumberPage\t:" + numberPages;
        
    

    }
    
    
}
