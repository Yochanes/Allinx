package me.jessyan.retrofiturlmanager;

import okhttp3.HttpUrl;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public interface onUrlChangeListener {
    void onUrlChangeBefore(HttpUrl httpUrl, String str);

    void onUrlChanged(HttpUrl httpUrl, HttpUrl httpUrl2);
}
