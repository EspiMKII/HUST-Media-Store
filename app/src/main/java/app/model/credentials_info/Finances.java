package app.model.credentials_info;

public class Finances {
    private int id;
    private String date;
    private double revenue;
    private double expenses;
    private double profit;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public double getRevenue() {
        return revenue;
    }

    public void setRevenue(double revenue) {
        this.revenue = revenue;
    }

    public double getExpenses() {
        return expenses;
    }

    public void setExpenses(double expenses) {
        this.expenses = expenses;
    }

    public double getProfit() {
        return profit;
    }

    public void setProfit(double profit) {
        this.profit = profit;
    }

    public Finances(String date, double revenue, double expenses, double profit) {
        this.date = date;
        this.revenue = revenue;
        this.expenses = expenses;
        this.profit = profit;
    }
}
