package com.ghedu;

import com.ghedu.proxy.staticproxy.DataQuery;
import com.ghedu.proxy.staticproxy.UserDataQueryProxy;
import org.junit.Test;

/**
 * Hello world!
 *
 */
public class TestMode {
    @Test
    public void testStaticProxy() {
        DataQuery userDataQueryProxy = new UserDataQueryProxy();
        userDataQueryProxy.query("one query");
        userDataQueryProxy.query("one query");
        userDataQueryProxy.query("two query");
    }
}
