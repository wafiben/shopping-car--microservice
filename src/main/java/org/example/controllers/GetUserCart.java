package org.example.controllers;


import org.example.Paths;
import org.example.dtos.Cart;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class GetUserCart {

    @GetMapping(Paths.GET_CART)
    public Cart getCart(@PathVariable String userId) {
        return null;
    }
}
