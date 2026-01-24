package staticKeyword.staticDemo;

class HDFC{
    private String custName;
    private String accountNo;
    private static String bankName="HDFC";
    static String IFSC;

    public HDFC(String custName, String accountNo) {
        this.custName = custName;
        this.accountNo = accountNo;
    }

    public HDFC() {
    }

    // non-static method
    public void demoStatic(){
        accountNo=custName;
        IFSC=bankName;


    }

    // static method
    public static String getBankName(){
        IFSC = bankName;
        return bankName;
    }

    public void display(){
        System.out.println("Account Holder name : "+custName);
        System.out.println("Account no : "+accountNo);
        System.out.println("Bank name : "+bankName);
        System.out.println("==========================================");
    }
}
