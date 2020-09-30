/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Logan
 */
public class Item {     //Should not be a public class***
    
    private String m_sProductName = "";
    private String m_sProductDescription = "";
    private double m_dUnitPrice = -1.0;
    private int m_nUnits = -1;
    
    public void setProductName(String newProductName) {
        m_sProductName = newProductName;
    }
    
    public String getPrductName() {
        return m_sProductName;
    }
    
    public void setProductDescription(String newDescription) {
        m_sProductDescription = newDescription;
    }
    
    public String getProductDescription() {
        return m_sProductDescription;
    }
    
    public void setUnitPrice(double newUnitPrice) {
        m_dUnitPrice = newUnitPrice;
    }
    
    public double getUnitPrice() {
        return m_dUnitPrice;
    }
    
    public void setUnits(int newUnits) {
        m_nUnits = newUnits;
    }
    
    public int getUnits() {
        return m_nUnits;
    }
    
    public Item() {
        
    }
    
    public Item(String newProductName,String newDescription, double newUnitPrice, int newUnits) {
        m_sProductName = newProductName;
        m_sProductDescription = newDescription;
        m_dUnitPrice = newUnitPrice;
        m_nUnits = newUnits;
    }
    
    public double calculateUnitTotal() {
        return m_dUnitPrice * m_nUnits;
    }
    
    public String ToString() {
        String itemInfo = m_sProductName + "\n -" + m_sProductDescription + "\n$" + Double.toString(m_dUnitPrice) + " per unit\n -" + Integer.toString(m_nUnits) + " units\n";
        return itemInfo;
    }

    
    public static void main(String[] args) {
       
    }
}
