package com.airbnb.lottie.animation.keyframe;

import com.airbnb.lottie.model.content.Mask;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public class MaskKeyframeAnimation {

    /* JADX INFO: renamed from: a */
    public final ArrayList f34265a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f34266b;

    /* JADX INFO: renamed from: c */
    public final List f34267c;

    public MaskKeyframeAnimation(List list) {
        this.f34267c = list;
        this.f34265a = new ArrayList(list.size());
        this.f34266b = new ArrayList(list.size());
        for (int i = 0; i < list.size(); i++) {
            this.f34265a.add(((Mask) list.get(i)).f34564b.m12651a());
            this.f34266b.add(((Mask) list.get(i)).f34565c.mo12648j());
        }
    }
}
