public class CreateAccount extends Customer {

    public CreateAccount(String name, String address, String phone) {
        super(name, address, phone);
    }
    
    public String generateAccNumber(){
        int min = 8;
        int max = 12;
        int sizeAcc = (int) Math.floor(Math.random() * (max-min+1)+min);
        String result = "";
        while (sizeAcc > 0){
            int temp = (int) Math.floor(Math.random() * 10);
            result += String.valueOf(temp);
            sizeAcc--;
        }
        return result;
    }


}
