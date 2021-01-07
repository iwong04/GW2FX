package sample;


import javafx.beans.property.SimpleStringProperty;

public class Info {
private SimpleStringProperty id , buy , sell , supply ,demand;

    public Info(String id, String buy, String sell, String supply, String demand) {
        this.id = new SimpleStringProperty(id) ;
        this.buy = new SimpleStringProperty(buy);
        this.sell = new SimpleStringProperty(sell);
        this.supply = new SimpleStringProperty(supply);
        this.demand = new SimpleStringProperty(demand);
    }

    public String getId() {
        return id.get();
    }

    public SimpleStringProperty idProperty() {
        return id;
    }

    public void setId(String id) {
        this.id.set(id);
    }

    public String getBuy() {
        return buy.get();
    }

    public SimpleStringProperty buyProperty() {
        return buy;
    }

    public void setBuy(String buy) {
        this.buy.set(buy);
    }

    public String getSell() {
        return sell.get();
    }

    public SimpleStringProperty sellProperty() {
        return sell;
    }

    public void setSell(String sell) {
        this.sell.set(sell);
    }

    public String getSupply() {
        return supply.get();
    }

    public SimpleStringProperty supplyProperty() {
        return supply;
    }

    public void setSupply(String supply) {
        this.supply.set(supply);
    }

    public String getDemand() {
        return demand.get();
    }

    public SimpleStringProperty demandProperty() {
        return demand;
    }

    public void setDemand(String demand) {
        this.demand.set(demand);
    }
}
