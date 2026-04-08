package com.airbnb.lottie.model.animatable;

import com.airbnb.lottie.value.Keyframe;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public abstract class BaseAnimatableValue<V, O> implements AnimatableValue<V, O> {

    /* JADX INFO: renamed from: a */
    public final List f34530a;

    public BaseAnimatableValue(List list) {
        this.f34530a = list;
    }

    @Override // com.airbnb.lottie.model.animatable.AnimatableValue
    /* JADX INFO: renamed from: i */
    public boolean mo12650i() {
        List list = this.f34530a;
        return list.isEmpty() || (list.size() == 1 && ((Keyframe) list.get(0)).m12786c());
    }

    @Override // com.airbnb.lottie.model.animatable.AnimatableValue
    /* JADX INFO: renamed from: k */
    public List mo12649k() {
        return this.f34530a;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        List list = this.f34530a;
        if (!list.isEmpty()) {
            sb.append("values=");
            sb.append(Arrays.toString(list.toArray()));
        }
        return sb.toString();
    }
}
