package com.exerise.theLoops;
/**
  * Created by MBROWN
  */
public class MusicType {
  private String categoryMusic;
  
  public MusicType(String categoryMusic)
  {
    this.categoryMusic = categoryMusic;
  }
  public String getCategoryMusic() { return this.categoryMusic; }
  
  public void setCategoryMusic = categoryMusic;
  }

@Override
public String toString() {
  return "MusicType{" + 
          "categoryMusic='" + categoryMusic + "'\n";

  }
}
