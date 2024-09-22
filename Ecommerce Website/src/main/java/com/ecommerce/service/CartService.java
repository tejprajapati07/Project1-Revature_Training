package com.ecommerce.service;

import java.util.List;

import com.ecommerce.model.Cart;

public interface CartService {

	public Cart saveCart(Integer productId, Integer userId);

	public List<Cart> getCartsByUser(Integer userId);
	
	public Integer getCountCart(Integer userId);

	public void updateQuantity(String sy, Integer cid);
	
	  void updateQuantity(Integer cartId, Integer newQuantity);
	  Cart saveCart(Integer productId, Integer userId, Integer quantity);
	  void removeFromCart(int cartId); 
	  

}
