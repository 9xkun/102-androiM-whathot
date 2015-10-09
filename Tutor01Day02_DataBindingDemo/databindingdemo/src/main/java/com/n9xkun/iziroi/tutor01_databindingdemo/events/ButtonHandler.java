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
package com.n9xkun.iziroi.tutor01_databindingdemo.events;

import android.view.View;
import android.widget.Toast;

/**
 * @handler event
 * @author hoangpt
 */
public class ButtonHandler {

  /**
   * handler for click button Show me
   * @author hoangpt
   *
   * @param v
   */
  public void onClickFriend(View v){
    Toast.makeText(v.getContext(), "I am friendly", Toast.LENGTH_SHORT).show();
  }

  /**
   * handler for long click
   * @author hoangpt
   *
   * @param v
   * @return boolean
   */
  public boolean onClickEnemy(View v){
    Toast.makeText(v.getContext(), "I am not friendly", Toast.LENGTH_SHORT).show();

    return true;
  }
}
