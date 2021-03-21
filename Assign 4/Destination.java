/***********************************************************
*                                                          *
*  CSCI 470/680      Assignment 4            Summer 2018   *
*                                                          *
*  Programmer: Yiannis Poulos                              *
*              Shaniel Omar Rivas Verdejo                  *
*                                                          *
*                                                          *
*                                                          *
*  Date Due:   07/16/2018                                  *
*                                                          *
*  Purpose:    Checking for valid characters               *
*                                                          *
*                                                          *
***********************************************************/
import java.io.*;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class Destination
{
  private String city;
  private int normalMiles;
  private int cheapMiles;
  private int upgradeMiles;
  private int startMonth;
  private int endMonth;
  
  public Destination(String city, String normalMiles, String cheapMiles, String upgradeMiles, String startMonth, String endMonth)
  {
    this.city = city;
    this.normalMiles = Integer.parseInt(normalMiles);
    this.cheapMiles = Integer.parseInt(cheapMiles);
    this.upgradeMiles = Integer.parseInt(upgradeMiles);
    this.startMonth = Integer.parseInt(startMonth);
    this.endMonth = Integer.parseInt(endMonth);
  }
  
  public String getCity()
  {
    return city;
  }
  
}