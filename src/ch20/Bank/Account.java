package ch20.Bank;

public class Account {

   static int ownMoney;
   static int inputMoney;
   static int outMoney;

   public Account(int ownMoney){

   }

   public void InputAccount(int ownMoney,int inputMoney){

   }

   public void outAccout(int ownMoney,int outMoney){

   }

    public static int getOwnMoney() {
        return ownMoney;
    }

    public static void setOwnMoney(int ownMoney) {
        Account.ownMoney = ownMoney;
    }

    public static int getInputMoney() {
        return inputMoney;
    }

    public static int getOutMoney() {
        return outMoney;
    }

    public static void setOutMoney(int outMoney) {
        Account.outMoney = outMoney;
    }

    public static void setInputMoney(int inputMoney) {
        Account.inputMoney = inputMoney;
    }

    public int inputAcount(int ownMoney,int inputMoney) {
       return ownMoney-inputMoney;


    }
}
