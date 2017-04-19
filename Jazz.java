package com.excerise.theLoops;
/*
 * Create by Mbrown
 */
public class Jazz extends MusicType {
  private String concert;
  private String jazzBand;
  private double songTime;
  private String title;
  private Date tourDates;
  private String manager;
  
  public Jazz() 
  {
    super("Jazz");
  }
  
  public Jazz(String concert, int day, int month, year) 
  {
     super("Jazz");
     this.concert = concert;
     tourDates = new Date(day, month, year);
  }
  
  public Jazz(String title, String jazzBand, double songTime) 
  {
    this.title = title;
    this.jazzBand = jazzBand;
    this.songTime = songTime;
  }
  public Jazz(String title, int day, int month, int year, String categoryMusic)
  {
    super(categoryMusic);
    this.title = title;
    tourDates = new Date(day, month, year);
  }
  
  
  public String getConcert()
  {
    return this.concert;
  }
  public String getJazzBand() 
  {
    return this.jazzBand;
  }
  public double getSongTime()
  {
    return this.songTime;
  }
  public String getTitle() 
  {
    return this.title;
  }
  public Date tourDates 
  {
    return this.TourDates;
  }
  public String getManager() 
  {
    return this.manager;
  }
  public String toString()
  {
    String jazzString = super.toString() + "" + this.title + " " + this.tourDates;
    return jazzString;
  }
}
