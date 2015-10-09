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
package com.n9xkun.iziroi.tutor01_databindingdemo;

import android.app.Activity;
import android.databinding.DataBindingUtil;
import android.os.Bundle;

import com.n9xkun.iziroi.tutor01_databindingdemo.databinding.ActivityBindingWithExpressionBinding;
import com.n9xkun.iziroi.tutor01_databindingdemo.events.ButtonHandler;
import com.n9xkun.iziroi.tutor01_databindingdemo.model.UserBean;

/**
 * controller for layout activity_binding_with_expression
 * @author hoangpt
 */
public class BindingWithExpressionActivity extends Activity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);

    //init binber
    ActivityBindingWithExpressionBinding binder =
      (ActivityBindingWithExpressionBinding) DataBindingUtil.setContentView(this,
        R.layout.activity_binding_with_expression);

    //bind user
    UserBean user = new UserBean("Tao la", "Mot monster", 20);
    binder.setUser(user);

    //bind event
    ButtonHandler handler = new ButtonHandler();
    binder.setButtonhandler(handler);
  }
}
