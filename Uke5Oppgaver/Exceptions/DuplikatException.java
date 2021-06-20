package Exceptions;

class DuplikatException extends Exception {
    
    public DuplikatException(String boktittel){
        super("Denne boken " + boktittel + " eksisterer allerede i bokhyllen");
    }
}
