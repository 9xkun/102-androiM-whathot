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
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class MenuActivity extends Activity implements AdapterView.OnItemClickListener {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_menu);

    //init menu
    ListView lstMenu = (ListView) findViewById(R.id.menuList);

    //get menu item from array in xml
    String[] menus = getResources().getStringArray(R.array.menu_items);

    //build adapter
    ArrayAdapter<String> menuAdapter = new ArrayAdapter<String>(this, R.layout.layout_menu_item, R.id.txtMenu, menus);
    lstMenu.setAdapter(menuAdapter);
    lstMenu.setOnItemClickListener(this);
  }

  @Override
  public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
    //get item menu name
    TextView txtMenuItem = (TextView) view.findViewById(R.id.txtMenu);
    String txtMenuName = txtMenuItem.getText().toString();

    //go to corresponding activity based on activity name
    //get name, should use dynamic
    //example: if item_name=SimpleBindingWithPlain -> go SimpleBindingWithPlainActivity
    try {
      String packageName = getApplicationContext().getPackageName();
      Class<?> menuClass = Class.forName(packageName + "." + txtMenuName +"Activity");
      Intent i = new Intent(this, menuClass);
      startActivity(i);
    } catch (ClassNotFoundException e) {
      e.printStackTrace();
    }
  }
}
