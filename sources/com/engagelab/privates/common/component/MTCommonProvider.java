package com.engagelab.privates.common.component;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import com.engagelab.privates.common.MTCommon;
import com.engagelab.privates.common.business.lifecycle.MTLifecycleBusiness;
import com.engagelab.privates.common.business.network.MTNetworkBusiness;
import com.engagelab.privates.common.observer.MTObservable;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public class MTCommonProvider extends ContentProvider {
    @Override // android.content.ContentProvider
    public int delete(Uri uri, String str, String[] strArr) {
        return 0;
    }

    @Override // android.content.ContentProvider
    public String getType(Uri uri) {
        return null;
    }

    @Override // android.content.ContentProvider
    public Uri insert(Uri uri, ContentValues contentValues) {
        return null;
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        MTObservable.getInstance().observer(getContext().getApplicationContext(), new MTCommon());
        MTLifecycleBusiness.getInstance().init(getContext().getApplicationContext());
        MTNetworkBusiness.getInstance().init(getContext().getApplicationContext());
        return true;
    }

    @Override // android.content.ContentProvider
    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        return null;
    }

    @Override // android.content.ContentProvider
    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }
}
