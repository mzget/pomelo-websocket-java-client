package com.mzget.pomelo_ws.websocket;

import org.json.JSONObject;

/**
 * Created with IntelliJ IDEA.
 * User: jiangzm
 * Date: 13-8-11
 * Time: 上午12:02
 * To change this template use File | Settings | File Templates.
 */
public interface OnDataHandler {
    public void onData(JSONObject message);
}
