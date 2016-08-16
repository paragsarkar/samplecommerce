package com.abinfosoft.whites.interfaces;

import android.view.View;

import com.abinfosoft.whites.entities.drawerMenu.DrawerItemCategory;
import com.abinfosoft.whites.entities.drawerMenu.DrawerItemPage;

public interface DrawerRecyclerInterface {

    void onCategorySelected(View v, DrawerItemCategory drawerItemCategory);

    void onPageSelected(View v, DrawerItemPage drawerItemPage);

    void onHeaderSelected();
}
