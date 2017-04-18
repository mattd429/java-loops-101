package com.excerise.theLoops
/*
 *Create by MBrown
 *
 */
 
 public class HipHop {
        private String tours;
        Private double trackTime;
        private double venuePrice;
        private String promotorName;
        private String manager;
        private String artist;
        private String recordLabel;
        private double numberOfSales;
        private int numberOfSongs;
        private Date releaseDate;
        
        HipHop(String tours, String manager, int day, int month, int year)
        {
          //had a super here but removed since it is not an inheritance
          releaseDate = new Date(day, month, year);
          this.tours = tours;
          this.manager = manager;
          
        }
        HipHop(double trackTime, double venuePrice, string artist, string manager) 
        {
          this.trackTime = trackTime;
          this.venuePrice = venuePrice;
          this.artist = artist;
          this.manager = manager;
        }
        HipHop(String tours, double venuePrice, double trackTime) 
        {
         this.tours = tours;
         this.venuePrice = venuePrice;
         this.trackTime = trackTime;
        }
        Hiphop()
        {
        }
        
 }
 
