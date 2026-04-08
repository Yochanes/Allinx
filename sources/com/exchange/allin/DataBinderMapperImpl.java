package com.exchange.allin;

import android.util.SparseArray;
import android.util.SparseIntArray;
import androidx.compose.animation.AbstractC0455a;
import androidx.databinding.DataBinderMapper;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public class DataBinderMapperImpl extends DataBinderMapper {

    /* JADX INFO: compiled from: Proguard */
    public static class InnerBrLookup {
        static {
            new SparseArray(1).put(0, "_all");
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static class InnerLayoutIdLookup {
        static {
            HashMap map = new HashMap(3);
            AbstractC0455a.m2222A(R.layout.activtiy_qrcode_scan, map, "layout/activtiy_qrcode_scan_0", R.layout.layout_recycler, "layout/layout_recycler_0");
            map.put("layout/widget_toast_temp_0", Integer.valueOf(R.layout.widget_toast_temp));
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray(3);
        sparseIntArray.put(R.layout.activtiy_qrcode_scan, 1);
        sparseIntArray.put(R.layout.layout_recycler, 2);
        sparseIntArray.put(R.layout.widget_toast_temp, 3);
    }

    @Override // androidx.databinding.DataBinderMapper
    /* JADX INFO: renamed from: a */
    public final List mo8237a() {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
        return arrayList;
    }
}
