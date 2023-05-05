package com.github.ztan_watering;

public interface HttpRequestCallback {
    void onSuccess(String result);
    void onError(Exception e);
}
