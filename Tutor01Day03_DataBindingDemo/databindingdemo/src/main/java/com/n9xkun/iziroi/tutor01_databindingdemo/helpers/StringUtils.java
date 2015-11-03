package com.n9xkun.iziroi.tutor01_databindingdemo.helpers;

/**
 * Helper deal with all String function
 * @author hoangpt
 */
public class StringUtils {
  /**
   * capitalize word
   * @author hoangpt
   *
   * @param word
   * @return
   */
  public static String capitalize(String word){
    if(word.length() > 0){
      return word.toUpperCase();
    }

    return word;
  }
}
