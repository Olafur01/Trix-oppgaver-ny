class CDAlbum implements Comparable<CDAlbum>{
    private String artistnavn;
    private String albumnavn;
    private String utgivelsesaar;

    CDAlbum(String artist, String album, String aar){
        artistnavn = artist;
        albumnavn = album;
        utgivelsesaar = aar;
    }

    public String getArtist(){
        return artistnavn;
    }

    public String toString(){
        return artistnavn + ", " + albumnavn + ", " + utgivelsesaar;
    }

    public int compareTo(CDAlbum cdAlbum) {
        return cdAlbum.artistnavn.compareTo(getArtist());
    }
}