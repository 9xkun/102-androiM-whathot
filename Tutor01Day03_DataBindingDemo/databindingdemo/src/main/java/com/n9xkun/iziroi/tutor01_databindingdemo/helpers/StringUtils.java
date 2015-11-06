/**
 * http://iziroi.9xkun.com
 *
 * LICENSE
 *
 * This source file is belong to iziroi.9xkun.com. Please come to this site and
 * get more source code. If you have any question, please send email to me at:
 * phantichhoang@gmail.com
 *
 * @copyright Copyright (c) 2013-2014 iziroi
 * @author hoangpt
 * @version $Id$
 * @since
 */
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
