package androidx.compose.material.ripple;

import android.content.Context;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/material/ripple/RippleContainer;", "Landroid/view/ViewGroup;", "material-ripple_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
@SourceDebugExtension
public final class RippleContainer extends ViewGroup {

    /* JADX INFO: renamed from: a */
    public final int f11887a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f11888b;

    /* JADX INFO: renamed from: c */
    public final ArrayList f11889c;

    /* JADX INFO: renamed from: d */
    public final RippleHostMap f11890d;

    /* JADX INFO: renamed from: f */
    public int f11891f;

    public RippleContainer(Context context) {
        super(context);
        this.f11887a = 5;
        ArrayList arrayList = new ArrayList();
        this.f11888b = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.f11889c = arrayList2;
        this.f11890d = new RippleHostMap();
        setClipChildren(false);
        RippleHostView rippleHostView = new RippleHostView(context);
        addView(rippleHostView);
        arrayList.add(rippleHostView);
        arrayList2.add(rippleHostView);
        this.f11891f = 1;
        setTag(com.exchange.allin.R.id.hide_in_inspector_tag, Boolean.TRUE);
    }

    /* JADX INFO: renamed from: a */
    public final RippleHostView m3835a(RippleHostKey rippleHostKey) {
        RippleHostMap rippleHostMap = this.f11890d;
        RippleHostView rippleHostView = (RippleHostView) rippleHostMap.f11892a.get(rippleHostKey);
        if (rippleHostView != null) {
            return rippleHostView;
        }
        ArrayList arrayList = this.f11889c;
        Intrinsics.m18599g(arrayList, "<this>");
        RippleHostView rippleHostView2 = (RippleHostView) (arrayList.isEmpty() ? null : arrayList.remove(0));
        LinkedHashMap linkedHashMap = rippleHostMap.f11892a;
        LinkedHashMap linkedHashMap2 = rippleHostMap.f11893b;
        if (rippleHostView2 == null) {
            int i = this.f11891f;
            ArrayList arrayList2 = this.f11888b;
            if (i > CollectionsKt.m18405F(arrayList2)) {
                rippleHostView2 = new RippleHostView(getContext());
                addView(rippleHostView2);
                arrayList2.add(rippleHostView2);
            } else {
                rippleHostView2 = (RippleHostView) arrayList2.get(this.f11891f);
                RippleHostKey rippleHostKey2 = (RippleHostKey) linkedHashMap2.get(rippleHostView2);
                if (rippleHostKey2 != null) {
                    rippleHostKey2.mo3824F0();
                    RippleHostView rippleHostView3 = (RippleHostView) linkedHashMap.get(rippleHostKey2);
                    if (rippleHostView3 != null) {
                    }
                    linkedHashMap.remove(rippleHostKey2);
                    rippleHostView2.m3838c();
                }
            }
            int i2 = this.f11891f;
            if (i2 < this.f11887a - 1) {
                this.f11891f = i2 + 1;
            } else {
                this.f11891f = 0;
            }
        }
        linkedHashMap.put(rippleHostKey, rippleHostView2);
        linkedHashMap2.put(rippleHostView2, rippleHostKey);
        return rippleHostView2;
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i, int i2, int i3, int i4) {
    }
}
