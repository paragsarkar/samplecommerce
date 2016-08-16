package com.abinfosoft.whites.interfaces;

import com.abinfosoft.whites.entities.cart.CartDiscountItem;
import com.abinfosoft.whites.entities.cart.CartProductItem;

public interface CartRecyclerInterface {

    void onProductUpdate(CartProductItem cartProductItem);

    void onProductDelete(CartProductItem cartProductItem);

    void onDiscountDelete(CartDiscountItem cartDiscountItem);

    void onProductSelect(long productId);

}
