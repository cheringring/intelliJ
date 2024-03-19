package ch20.Bank;

import java.util.Objects;

public class KoreaBank {

    private static KoreaBank INSTANCE;

    private String name;
    private String accountNumber;
    private KoreaBank(){}

    public static synchronized KoreaBank getINSTANCE(){
        if (INSTANCE == null) INSTANCE = new KoreaBank();
        return INSTANCE;
    }

    public KoreaBank creatAcount(String name,String accountNumber){
        this.name=name;
        this.accountNumber=accountNumber;
        return creatAcount(name,accountNumber);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    // 중복방지
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        KoreaBank koreaBank = (KoreaBank) o;
        return Objects.equals(accountNumber, koreaBank.accountNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountNumber);
    }

}
