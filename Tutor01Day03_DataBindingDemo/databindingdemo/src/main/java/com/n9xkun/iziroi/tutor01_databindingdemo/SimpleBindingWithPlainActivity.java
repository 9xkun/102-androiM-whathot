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
import android.databinding.ViewDataBinding;
import android.os.Bundle;

import com.n9xkun.iziroi.tutor01_databindingdemo.databinding.ActivitySimpleBindingWithPlainBinding;
import com.n9xkun.iziroi.tutor01_databindingdemo.model.UserPlain;

/**
 * controller for layout activity_simple_binding_with_plain
 * @author hoangpt
 */
public class SimpleBindingWithPlainActivity extends Activity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);

    //init binder
    //setContentView(R.layout.activity_simple_binding_with_plain);
    ViewDataBinding ou = DataBindingUtil.setContentView(this, R.layout.activity_simple_binding_with_plain);
    ActivitySimpleBindingWithPlainBinding binder = (ActivitySimpleBindingWithPlainBinding) ou;

    //bind user to binder
    UserPlain user = new UserPlain("Thuy", "Tran");
    binder.setUser(user);
  }
}
