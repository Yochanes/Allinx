package com.airbnb.lottie;

import android.graphics.Rect;
import androidx.collection.ArraySet;
import androidx.collection.LongSparseArray;
import androidx.collection.SparseArrayCompat;
import com.airbnb.lottie.model.Marker;
import com.airbnb.lottie.model.layer.Layer;
import com.airbnb.lottie.utils.Logger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public class LottieComposition {

    /* JADX INFO: renamed from: a */
    public final PerformanceTracker f34039a;

    /* JADX INFO: renamed from: b */
    public final HashSet f34040b;

    /* JADX INFO: renamed from: c */
    public HashMap f34041c;

    /* JADX INFO: renamed from: d */
    public HashMap f34042d;

    /* JADX INFO: renamed from: e */
    public HashMap f34043e;

    /* JADX INFO: renamed from: f */
    public ArrayList f34044f;

    /* JADX INFO: renamed from: g */
    public SparseArrayCompat f34045g;

    /* JADX INFO: renamed from: h */
    public LongSparseArray f34046h;

    /* JADX INFO: renamed from: i */
    public ArrayList f34047i;

    /* JADX INFO: renamed from: j */
    public Rect f34048j;

    /* JADX INFO: renamed from: k */
    public float f34049k;

    /* JADX INFO: renamed from: l */
    public float f34050l;

    /* JADX INFO: renamed from: m */
    public float f34051m;

    /* JADX INFO: renamed from: n */
    public boolean f34052n;

    /* JADX INFO: renamed from: o */
    public int f34053o;

    /* JADX INFO: compiled from: Proguard */
    @Deprecated
    public static class Factory {

        /* JADX INFO: compiled from: Proguard */
        public static final class ListenerAdapter implements LottieListener<LottieComposition>, Cancellable {
            @Override // com.airbnb.lottie.LottieListener
            public final void onResult(Object obj) {
                throw null;
            }
        }
    }

    public LottieComposition() {
        PerformanceTracker performanceTracker = new PerformanceTracker();
        new ArraySet(0);
        new HashMap();
        this.f34039a = performanceTracker;
        this.f34040b = new HashSet();
        this.f34053o = 0;
    }

    /* JADX INFO: renamed from: a */
    public final void m12554a(String str) {
        Logger.m12736b(str);
        this.f34040b.add(str);
    }

    /* JADX INFO: renamed from: b */
    public final float m12555b() {
        return (long) (((this.f34050l - this.f34049k) / this.f34051m) * 1000.0f);
    }

    /* JADX INFO: renamed from: c */
    public final Marker m12556c() {
        int size = this.f34044f.size();
        for (int i = 0; i < size; i++) {
            Marker marker = (Marker) this.f34044f.get(i);
            String str = marker.f34509a;
            if (str.equalsIgnoreCase(null) || (str.endsWith("\r") && str.substring(0, str.length() - 1).equalsIgnoreCase(null))) {
                return marker;
            }
        }
        return null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LottieComposition:\n");
        Iterator it = this.f34047i.iterator();
        while (it.hasNext()) {
            sb.append(((Layer) it.next()).m12666a("\t"));
        }
        return sb.toString();
    }
}
