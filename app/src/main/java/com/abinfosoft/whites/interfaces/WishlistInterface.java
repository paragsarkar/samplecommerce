package com.abinfosoft.whites.interfaces;

import android.view.View;

import com.abinfosoft.whites.entities.wishlist.WishlistItem;

public interface WishlistInterface {

    void onWishlistItemSelected(View view, WishlistItem wishlistItem);

    void onRemoveItemFromWishList(View caller, WishlistItem wishlistItem, int adapterPosition);
}
