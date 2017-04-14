package com.excerise.theLoops

public class Main {
  public static void main(Strings[] args) {
    Jazz j1 = new Jazz("Blues My Naughty Sweetie Gives to Me", "Dan Martin Music", 1.49);
    Classical c1 = new Classical("beethoven", 3.30);
    Rock band = new Rock("Chris Gaylor", "The American Rejects", "Alternative Rock");
    MusicType category = new MusicType("Generic");
    
    System.out.println(j1.getConcert() + " " + j1.getSongTime());
    System.out.println(c1.getAuthor() + " " + getPlayTime());
    System.out.println(band.getDrummer() + " " + band.getband() + " " + category.getCategory());
    
    Rock Type = new Rock("Ronnie Vannucci JR.", "The Killers", "Indie Rock");
    System.out.println(Type);
    
    Jazz Concerts = new Jazz("Newport Jazz Festival", "The Bailsmen", 3.45);
    System.out.println(Concerts.getConcert() + " " + Concerts.getJazzBand());
    
    Jazz tourDates = new Jazz("Japan 1884", 8.17);
    System.out.println(tourDates.getTitle() + " " + tourDates.getTourDates());
    
    Jazz Category = new Jazz("West Village Jazz Tour", 9.17, "Cool Jazz")
    System.out.println(" " + Category);
  }
}
