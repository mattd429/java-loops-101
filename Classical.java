package com.excerise.theLoops
/*
 *Create by MBrown 
 */
 public class Classical extends MusicType{
     private String author;
     private double playTime;
 
     public(String author, double playTime) 
     {
          super("Classical")
          this.author = author;
          this.playTime = playTime;
     
     }
     public String getAuthor() 
     {
     return this.author;
     }
     public double getPlayTime() 
     {
     return this.playTime;
     }
     public String toString() 
     {
     return this.author + " " + this.playTime;
     }
 }
