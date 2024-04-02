package ch30;

public class Req<T>{

    private Header header;
    private T reqBody;



    public static class Header{

        private String responseCode;

        public String getResponseCode(){
            return responseCode;
        }

        public void setResponseCode(String responseCode){
            this.responseCode = responseCode;
        }

    }

    public Header getHeader() {
        return header;
    }

    public void setHeader(Header header) {
        this.header = header;
    }

    public T getReqBody() {
        return reqBody;
    }

    public void setReqBody(T reqBody) {
        this.reqBody = reqBody;
    }
}


class User {
    private String name;

}

class Main_{
    public static void main(String[] args) {
        var req = new Req<User>();
        var header = new Req.Header();
        header.setResponseCode("200.ok");
        req.setHeader(header);
        req.setReqBody(new User());
    }
}
