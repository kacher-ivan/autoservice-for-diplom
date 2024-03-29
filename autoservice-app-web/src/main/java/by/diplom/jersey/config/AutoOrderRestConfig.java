package by.diplom.jersey.config;

import java.text.SimpleDateFormat;

public class AutoOrderRestConfig {

    private AutoOrderRestConfig() {
    }

    public static final String AUTOORDER_SERVICE_PATH = "http://localhost:8061/autoorderApi/api/autoOrders/";
    public static final String CREATE_NEW_PATH = "/";
    public static final String ORDER_ID_TEMPLATE = "orderId";
    public static final String ORDER_ID_PATH = "{orderId}";

    public static final SimpleDateFormat SIMPLE_DATE_FORMAT = new SimpleDateFormat("dd-MM-yyyy hh:mm:ss a zz");
}
