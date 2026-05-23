public class TransactionHistory {
    String history = " ";

    public  void addTransaction(String transaction){
        history = history + transaction + "\n";
    }

    public void showHistory(){
        if (history.isEmpty()){
            System.out.println("No Transactions Yet");
        }else {
            System.out.println("===== Transaction History ====");
            System.out.println(history);
        }
    }

}
