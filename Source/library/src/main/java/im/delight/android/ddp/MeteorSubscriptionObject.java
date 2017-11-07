package im.delight.android.ddp;

/**
 * Created by v.frico on 2/11/17.
 */

public class MeteorSubscriptionObject {
    private String subscriptionName;
    private Object[] params;
    private SubscribeListener listener;

	public String getSubscriptionID() {
		return subscriptionID;
	}

	public void setSubscriptionID(String subscriptionID) {
		this.subscriptionID = subscriptionID;
	}

	private String subscriptionID;

    public MeteorSubscriptionObject(String subscriptionName, Object[] params, SubscribeListener listener, String subscriptionID) {
        this.subscriptionName = subscriptionName;
        this.params = params;
        this.listener = listener;
    }

    public String getSubscriptionName() {
        return subscriptionName;
    }

    public void setSubscriptionName(String subscriptionName) {
        this.subscriptionName = subscriptionName;
    }

    public Object[] getParams() {
        return params;
    }

    public void setParams(Object[] params) {
        this.params = params;
    }

    public SubscribeListener getListener() {
        return listener;
    }

    public void setListener(SubscribeListener listener) {
        this.listener = listener;
    }

}
