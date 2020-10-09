/**
 * Created by t00036478 on 02/02/2018.
 */
import java.util.Date;

public class Hobby {
    private int trade_id = 0;
    private String  security = null;
    private int  quantity = 0;

    public Hobby(){
        setTrade_id("");
        setSecurity("");
        setQuantity("");
    }
    public Hobby(int trade_id, String security, int quantity){
        setTrade_id(trade_id);
        setSecurity(security);
        setQuantity(quantity);
    }

    public void setTrade_id(int trade_id) {
        this.trade_id = trade_id;
    }
    public String getTrade_id() {
        return trade_id;
    }
    public void setSecurity(String security) {
        this.security = security;
    }
    public String getSecurity() {
        return security;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

}