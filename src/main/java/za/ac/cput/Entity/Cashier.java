/*  Cashier.java
    This is an entity of a cashier within the operation of the staff in the clinic.
    Author: Khanya Gibisela (217205135)
 */
package za.ac.cput.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class Cashier  {

    private Cashier() {
    }

    private String itemID ;
    private String item;
    private int qty;
    private double unitPrice ;
    private double discount ;
    private double subtotal ;
    private double total ;

    public Cashier(Builder builder) {
        this.itemID = builder.itemID;
        this.item = builder.item;
        this.qty = builder.qty;
        this.unitPrice = builder.unitPrice;
        this.discount = builder.discount;
        this.subtotal = builder.subtotal;
        this.total= builder.total;
    }



    @Override
    public String toString() {
        return "Cashier{" +
                "itemID='" + itemID + '\'' +
                ", item='" + item + '\'' +
                ", qty=" + qty +
                ", unitPrice=" + unitPrice +
                ", subtotal=" + subtotal +
                ", discount=" + discount +
                ", total=" + total +
                '}';
    }
    @JsonIgnore
    public String getItemID() {

        return itemID;
    }

    public String getItem() {
        return item;
    }

    public int getQty() {
        return qty;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public double getDiscount() {
        return discount;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public double getTotal() {
        return total;
    }

    protected Cashier(String itemID, String item, int qty, double unitPrice, double discount, double subtotal , double total) {
        this.itemID = itemID;
        this.item = item;
        this.qty = qty;
        this.unitPrice = unitPrice;
        this.discount = discount;
        this.subtotal = subtotal;
        this.total = total;
    }

    public static class Builder{
        private String itemID;
        private String item;
        private int qty;
        private double unitPrice;
        private double discount;
        private double subtotal;
        private double total;

        public Builder setItemID(String itemID) {
            this.itemID=itemID;
            return this;
        }

        public Builder setItem(String item) {
            this.item = item;
            return this;
        }

        public Builder setQty(int qty) {
            this.qty = qty;
            return this;
        }

        public Builder setUnitPrice(double unitPrice) {
            this.unitPrice = unitPrice;
            return this;
        }

        public Builder setDiscount(double discount) {
            this.discount = discount;
            return this;
        }

        public Builder setSubtotal(double subtotal) {
            this.subtotal = subtotal;
            return this;
        }

        public Builder setTotal(double total) {
            this.total = total;
            return this;
        }

        public Cashier build() {

            return new Cashier (itemID,item,qty,unitPrice,discount,subtotal,total);
        }

        public Builder copy (Cashier cashier) {
            this.itemID = cashier.itemID;
            this.item = cashier.item;
            this.qty = cashier.qty;
            this.unitPrice = cashier.unitPrice;
            this.discount = cashier.discount;
            this.subtotal = cashier.subtotal;
            this.total= cashier.total;
            return this;
        }


    }
}

