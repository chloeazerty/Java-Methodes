
public class Decipherer {

        public static String decryptMessage(String codedMessage){
            //length
            int keyNumber = codedMessage.length() / 2;

            //substring
            codedMessage = codedMessage.substring(6);

            //replace
            codedMessage =  codedMessage.replace("@#?", " ");

            //reversed
            codedMessage = new StringBuilder(codedMessage).reverse().toString();

            return codedMessage;
        }

    public static void main(String[] args) {
        String firstMessage = "0@sn9sirppa@#?ia'jgtvryko1";
        String secondMessage = "q8e?wsellecif@#?sel@#?setuotpazdsy0*b9+mw@x1vj";
        String thirdMessage = "aopi?sedohtém@#?sedhtmg+p9l!";

        String[] hiddenMessages = new String[]
                {firstMessage,
                 secondMessage,
                 thirdMessage
                };
        for (int i = 0; i < hiddenMessages.length; i++) {
            System.out.println(decryptMessage(hiddenMessages[i]));
        }
    }
}

// codedMessage = j'ai appri toutes les ficelles des méthodes