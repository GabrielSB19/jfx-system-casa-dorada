package model;

import java.io.Serializable;
import java.util.ArrayList;

public class Product implements Serializable {
    
    private static final long serialVersionUID = 1;

    private int prCode;
    private String prName;
    private String prSize;
    private double prPrice;
    private boolean prState;
    private int prNumOrder;
    private Admin cpAdmin;
    private Admin mpAdmin;

    private ArrayList<Ingredient> ingredients;
    private ArrayList<TypeProduct> typeProducts;

    public Product(int prCode, String prName, String prSize, double prPrice, boolean prState, int prNumOrder, Admin cpAdmin, Admin mpAdmin) {
        this.prCode = prCode;
        this.prName = prName;
        this.prSize = prSize;
        this.prPrice = prPrice;
        this.prState = prState;
        this.prNumOrder = prNumOrder;
        this.cpAdmin = cpAdmin;
        this.mpAdmin = mpAdmin;
        ingredients = new ArrayList<>();
        typeProducts = new ArrayList<>();

    }

    public int getPrCode() {
        return prCode;
    }

    public void setPrCode(int prCode) {
        this.prCode = prCode;
    }

    public String getPrName() {
        return prName;
    }

    public void setpName(String prName) {
        this.prName = prName;
    }

    public String getPrSize() {
        return prSize;
    }

    public void setPrSize(String prSize) {
        this.prSize = prSize;
    }

    public double getPrPrice() {
        return prPrice;
    }

    public void setpPrPrice(double prPrice) {
        this.prPrice = prPrice;
    }

    public boolean getPrState() {
        return prState;
    }

    public void setPrState(boolean prState) {
        this.prState = prState;
    }

    public int getPrNumOrder() {
        return prNumOrder;
    }

    public void setPrNumOrder(int prNumOrder) {
        this.prNumOrder = prNumOrder;
    }

    public Admin getCpAdmin() {
        return cpAdmin;
    }

    public void setCpAdmin(Admin cpAdmin) {
        this.cpAdmin = cpAdmin;
    }

    public Admin getMpAdmin() {
        return mpAdmin;
    }

    public void setMpAdmin(Admin mpAdmin) {
        this.mpAdmin = mpAdmin;
    } 
    
    public void addIngredientInProduct(Ingredient newIngredient){
        ingredients.add(newIngredient);
    }
    
    public void addTypeProductInProduct(TypeProduct newTypeProduct){
        typeProducts.add(newTypeProduct);
    }
    
    public ArrayList<Ingredient> getIngredientInProduct(){
        return ingredients;
    }
    
    public void setIngredientInProduct(ArrayList<Ingredient> ingredients){
        this.ingredients = ingredients;
    }
    
    public ArrayList<TypeProduct> getTypeProductInProduct(){
        return typeProducts;
    }
}
