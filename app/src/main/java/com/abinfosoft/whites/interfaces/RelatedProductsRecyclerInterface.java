package com.abinfosoft.whites.interfaces;

import android.view.View;

import com.abinfosoft.whites.entities.product.Product;

public interface RelatedProductsRecyclerInterface {

    void onRelatedProductSelected(View v, int position, Product product);
}
