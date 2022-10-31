
package vd2;


public class Officer {
    protected String documentCode;
    protected String publishName;
    protected double releaseNumber;

    public Officer(String documentCode, String publishName, double releaseNumber) {
        this.documentCode = documentCode;
        this.publishName = publishName;
        this.releaseNumber = releaseNumber;
    }

    public void setDocumentCode(String documentCode) {
        this.documentCode = documentCode;
    }

    public void setPublishName(String publishName) {
        this.publishName = publishName;
    }

    public void setReleaseNumber(double releaseNumber) {
        this.releaseNumber = releaseNumber;
    }

    public String getDocumentCode() {
        return documentCode;
    }

    public String getPublishName() {
        return publishName;
    }

    public double getReleaseNumber() {
        return releaseNumber;
    }
    
        
}
