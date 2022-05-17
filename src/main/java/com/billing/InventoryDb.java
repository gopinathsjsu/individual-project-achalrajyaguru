package com.billing;


import java.util.*;
import java.util.ArrayList;
import java.util.HashMap;

public class InventoryDb{

    public HashMap<String,Categories> stockDb(){
        HashMap<String,Categories> Items = new HashMap<>();
        Items.put("Clothes",new Categories("Essential","100","20"));
        Items.put("Soap",new Categories("Essential","200","5"));
        Items.put("Shampoo",new Categories("Essential","200","10"));
        Items.put("Milk",new Categories("Essential","100","20"));
        Items.put("Perfume",new Categories("Luxury","50","50"));
        Items.put("Chocolates",new Categories("Luxury","300","3"));
        Items.put("Handbag",new Categories("Luxury","75","150"));
        Items.put("Wallet",new Categories("Luxury","100","100"));
        Items.put("Bedsheet",new Categories("Misc","150","75"));
        Items.put("Footware",new Categories("Misc","200","25"));
        Items.put("HomeDecorPiece",new Categories("Misc","100","40"));
        Items.put("pen",new Categories("Misc","400","3"));
        Items.put("pencil",new Categories("Misc","400","3"));
        

        return  Items;
    }

}
