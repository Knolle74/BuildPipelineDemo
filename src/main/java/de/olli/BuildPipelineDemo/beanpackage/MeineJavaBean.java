package beanpackage;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MeineJavaBean
{
  public String getDateString()
  {
    return (new SimpleDateFormat("yyyy-MM-dd, HH:mm:ss")).format(new Date()) + " h";
  }
}