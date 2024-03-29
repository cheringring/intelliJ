package Card;


import javax.xml.crypto.Data;
import java.util.*;
public class OriginallyCard{


        }
 class SinhanCard extends OriginallyCard {
     private static SinhanCard INSTANCE;
     private Map<User, List<Chargeable>> users;
     private static Long userIdx;


     private SinhanCard() {
         users = new HashMap<>();
         userIdx = 1L;
     }

     public static synchronized SinhanCard getInstance() {
         if (INSTANCE == null) INSTANCE = new SinhanCard();
         return INSTANCE;
     }

     public void createUser(String email) {
         users.put(new User(userIdx++, email), new ArrayList<Chargeable>());
     }

     public void createCard(Long idx, CardType cardType) {

         var user = findUser(idx);

         switch (cardType) {
             case CRDIT -> users.get(user).add(new CreditCard("111-111", "2024-03-15"));

             case CASH -> users.get(user).add(new CashCard("222-222", "2025-04-04", "3333-12-906-3665"));
         }
     }


     private User findUser(Long idx) {
         for (var user : users.keySet()) {
             if (Objects.equals(user.getIdx(), idx)) return user;
         }
         return null;
     }

     public List<Chargeable> findMyCard(Long idx) {
         return users.get(findUser(idx));
     }
 }
class Chargeable {
    protected CardType cardType;
    protected List<TransactionData> datas;

    protected Chargeable(CardType cardType) {
        this.cardType = cardType;
        datas = new ArrayList<>();

    }

    protected void payment(double price) {
        datas.add(new TransactionData(new Date(), price));
    }

    protected void cardPaymentHistories() {
        System.out.println(cardType);
        System.out.println("======================");
        System.out.println(datas);
    }

}

    class Card extends Chargeable {
        protected String cardNumber;
        protected String expireDate;

        protected Card(CardType cardType) {
            super(cardType);
        }

    }

    class CashCard extends Card {
        private String accountNumber;

        public CashCard(String cardNumber, String expireDate, String accountNumber) {
            super(CardType.CASH);
            this.cardNumber = cardNumber;
            this.expireDate = expireDate;
            this.accountNumber = accountNumber;
        }

        public String getAccountNumber() {
            return accountNumber;
        }

        public void setAccountNumber(String accountNumber) {
            this.accountNumber = accountNumber;
        }

        protected void CashFee(double price) {
            double totalFee = price * CardType.CASH.getFee();
            double totalPrice = price + totalFee;

            datas.add(new TransactionData(new Date(), totalPrice));
        }
        @Override
        public String toString() {
            return "CashCard{" +
                    "accountNumber='" + accountNumber + '\'' +
                    '}';
        }
    }

    class CreditCard extends Card {

        public CreditCard(String cardNumber, String expireDate) {
            super(CardType.CRDIT);
            this.cardNumber = cardNumber;
            this.expireDate = expireDate;
        }

        protected void CreditFee(double price) {
            double totalFee = price * CardType.CRDIT.getFee();
            double totalPrice = price + totalFee;

            datas.add(new TransactionData(new Date(), totalPrice));
        }

        public void CreditTax(double price) {
            double totalTax = price * CardType.CRDIT.getTax();

            datas.add(new TransactionData(new Date(), totalTax));
        }
    }



    class Main_ {
        public static void main(String[] args) {
            SinhanCard.getInstance().createUser("hayoung202@naver.com");
            SinhanCard.getInstance().createCard(1L, CardType.CRDIT);
            List<Chargeable> hayoung = SinhanCard.getInstance().findMyCard(1L);

            Chargeable creditCard = null;
            for (var card : hayoung) {
                if (card instanceof CreditCard) {
                    creditCard = card;

                    break;
                }
            }
            creditCard.payment(20000);
            creditCard.payment(5000);
            System.out.println("=======credit card pay history======");
            creditCard.cardPaymentHistories();

            System.out.println("=============================");

            double CrditFee = CardType.CRDIT.crditFee(30000);
            System.out.print("fee: "+CrditFee);

            double CrditTax = CardType.CRDIT.creditTax(303250);
            System.out.print("\ntax: "+CrditTax);

            System.out.println("\n");


            System.out.println("++++++++++++++++++++++++++++++");

            SinhanCard.getInstance().createUser("jinsu93@gmail.com");
            SinhanCard.getInstance().createCard(1L, CardType.CASH);
            List<Chargeable> jinsu = SinhanCard.getInstance().findMyCard(1L);


            Chargeable cashCard = null;

            for (var card : hayoung) {
                if (card instanceof CashCard) {
                    cashCard = card;

                    break;
                }
            }

            System.out.println("======= cash card pay history =======");
            cashCard.payment(3900);
            cashCard.cardPaymentHistories();
            System.out.println("========== cash fee ===========");
            double cashFee = CardType.CASH.cashFee(14403000);
            System.out.print("fee: "+cashFee);
        }
    }


