package epam;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Transaction {
    int id;
    LocalDate date;
    int amount;
    String category;

    public Transaction(int id, LocalDate date, int amount, String category) {
        this.id = id;
        this.date = date;
        this.amount = amount;
        this.category = category;
    }

    public int getId() {
        return id;
    }

    public LocalDate getDate() {
        return date;
    }

    public int getAmount() {
        return amount;
    }

    public String getCategory() {
        return category;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public static void main(String[] args) {
        List<Transaction> transactions = new ArrayList<>();
        transactions.add(new Transaction(1, LocalDate.of(2025, 11, 13), 100, "milk"));
        transactions.add(new Transaction(2, LocalDate.of(2025, 11, 14), 100, "newspaper"));
        transactions.add(new Transaction(3, LocalDate.of(2025, 11, 13), 100, "milk"));
        transactions.add(new Transaction(4, LocalDate.of(2025, 11, 14), 100, "vegetables"));

        Map<LocalDate, Map<String, Integer>> map = transactions.stream().collect(Collectors.groupingBy(t -> t.date,
                Collectors.groupingBy(t -> t.category,
                        Collectors.summingInt(Transaction :: getAmount))));
        System.out.println(map);
    }
}
